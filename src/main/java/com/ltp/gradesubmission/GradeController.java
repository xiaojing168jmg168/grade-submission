package com.ltp.gradesubmission;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GradeController {
    List<Grade> studentGrades = Arrays.asList(
        new Grade("Harry", "Potions", "C-"),
        new Grade("Hermione", "Arithamcy", "A+"),
        new Grade("Neville", "Charms", "A-")
    );

    @GetMapping("/")
    public String gradeForm(Model model){
        model.addAttribute("grade", new Grade());
        return "form";
    }

    @GetMapping("/grades")
    public String getGrades(Model model){
        model.addAttribute("grades", studentGrades);
        return "grades";
    }
    
    

}
