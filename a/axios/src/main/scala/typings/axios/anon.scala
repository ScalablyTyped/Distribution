package typings.axios

import typings.axios.mod.AxiosInterceptorManager
import typings.axios.mod.AxiosRequestConfig
import typings.axios.mod.AxiosResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Password extends StObject {
    
    var password: String
    
    var username: String
  }
  object Password {
    
    @scala.inline
    def apply(password: String, username: String): Password = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Password]
    }
    
    @scala.inline
    implicit class PasswordMutableBuilder[Self <: Password] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait Request extends StObject {
    
    var request: AxiosInterceptorManager[AxiosRequestConfig]
    
    var response: AxiosInterceptorManager[AxiosResponse[js.Any]]
  }
  object Request {
    
    @scala.inline
    def apply(
      request: AxiosInterceptorManager[AxiosRequestConfig],
      response: AxiosInterceptorManager[AxiosResponse[js.Any]]
    ): Request = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    @scala.inline
    implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequest(value: AxiosInterceptorManager[AxiosRequestConfig]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: AxiosInterceptorManager[AxiosResponse[js.Any]]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
