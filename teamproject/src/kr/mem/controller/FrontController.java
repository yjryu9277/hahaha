package kr.mem.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("*.do")
public class FrontController extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 류윤정이 수정한 코드
		String reqUrl = request.getRequestURI();

		// �븳湲��옒�굹���쑀

		System.out.println("OK");

		

		//源�洹쒖꽦
	}

}
