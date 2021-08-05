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
    
    var request: AxiosInterceptorManager[AxiosRequestConfig]
    
    var response: AxiosInterceptorManager[AxiosResponse[js.Any]]
  }
  object Request {
    
    inline def apply(
      request: AxiosInterceptorManager[AxiosRequestConfig],
      response: AxiosInterceptorManager[AxiosResponse[js.Any]]
    ): Request = {
      val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setRequest(value: AxiosInterceptorManager[AxiosRequestConfig]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: AxiosInterceptorManager[AxiosResponse[js.Any]]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
