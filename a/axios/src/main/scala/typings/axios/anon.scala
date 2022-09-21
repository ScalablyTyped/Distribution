package typings.axios

import org.scalablytyped.runtime.Instantiable1
import typings.axios.mod.AxiosInterceptorManager
import typings.axios.mod.AxiosRequestConfig
import typings.axios.mod.AxiosResponse
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait FormData extends StObject {
    
    var FormData: js.UndefOr[Instantiable1[/* args (repeated) */ Any, js.Object]] = js.undefined
  }
  object FormData {
    
    inline def apply(): FormData = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormData]
    }
    
    extension [Self <: FormData](x: Self) {
      
      inline def setFormData(value: Instantiable1[/* args (repeated) */ Any, js.Object]): Self = StObject.set(x, "FormData", value.asInstanceOf[js.Any])
      
      inline def setFormDataUndefined: Self = StObject.set(x, "FormData", js.undefined)
    }
  }
  
  trait Headers extends StObject {
    
    var headers: Record[String, String]
  }
  object Headers {
    
    inline def apply(headers: Record[String, String]): Headers = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Headers]
    }
    
    extension [Self <: Headers](x: Self) {
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  trait Password extends StObject {
    
    var password: String
    
    var username: String
  }
  object Password {
    
    inline def apply(password: String, username: String): Password = {
      val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Password]
    }
    
    extension [Self <: Password](x: Self) {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  trait Request extends StObject {
    
    var request: AxiosInterceptorManager[AxiosRequestConfig[Any]]
    
    var response: AxiosInterceptorManager[AxiosResponse[Any, Any]]
  }
  object Request {
    
    inline def apply(
      request: AxiosInterceptorManager[AxiosRequestConfig[Any]],
      response: AxiosInterceptorManager[AxiosResponse[Any, Any]]
    ): Request = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setRequest(value: AxiosInterceptorManager[AxiosRequestConfig[Any]]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: AxiosInterceptorManager[AxiosResponse[Any, Any]]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  trait Setcookie extends StObject {
    
    var `set-cookie`: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Setcookie {
    
    inline def apply(): Setcookie = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Setcookie]
    }
    
    extension [Self <: Setcookie](x: Self) {
      
      inline def `setSet-cookie`(value: js.Array[String]): Self = StObject.set(x, "set-cookie", value.asInstanceOf[js.Any])
      
      inline def `setSet-cookieUndefined`: Self = StObject.set(x, "set-cookie", js.undefined)
      
      inline def `setSet-cookieVarargs`(value: String*): Self = StObject.set(x, "set-cookie", js.Array(value*))
    }
  }
}
