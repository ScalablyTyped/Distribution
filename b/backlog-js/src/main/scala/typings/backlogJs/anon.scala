package typings.backlogJs

import typings.backlogJs.mod.Error.BacklogErrorMessage
import typings.backlogJs.mod.Params
import typings.std.FormData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessToken extends StObject {
    
    var accessToken: js.UndefOr[String] = js.undefined
    
    var apiKey: js.UndefOr[String] = js.undefined
    
    var host: String
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object AccessToken {
    
    @scala.inline
    def apply(host: String): AccessToken = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessToken]
    }
    
    @scala.inline
    implicit class AccessTokenMutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      @scala.inline
      def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiKeyUndefined: Self = StObject.set(x, "apiKey", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Code extends StObject {
    
    var code: String
    
    var host: String
    
    var redirectUri: js.UndefOr[String] = js.undefined
  }
  object Code {
    
    @scala.inline
    def apply(code: String, host: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit class CodeMutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
    }
  }
  
  trait Errors extends StObject {
    
    var errors: js.Array[BacklogErrorMessage]
  }
  object Errors {
    
    @scala.inline
    def apply(errors: js.Array[BacklogErrorMessage]): Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.asInstanceOf[Errors]
    }
    
    @scala.inline
    implicit class ErrorsMutableBuilder[Self <: Errors] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrors(value: js.Array[BacklogErrorMessage]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: BacklogErrorMessage*): Self = StObject.set(x, "errors", js.Array(value :_*))
    }
  }
  
  trait Host extends StObject {
    
    var host: String
    
    var redirectUri: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
  }
  object Host {
    
    @scala.inline
    def apply(host: String): Host = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[Host]
    }
    
    @scala.inline
    implicit class HostMutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUri(value: String): Self = StObject.set(x, "redirectUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUriUndefined: Self = StObject.set(x, "redirectUri", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    }
  }
  
  trait Method extends StObject {
    
    var method: String
    
    var params: js.UndefOr[Params | FormData] = js.undefined
    
    var path: String
  }
  object Method {
    
    @scala.inline
    def apply(method: String, path: String): Method = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Method]
    }
    
    @scala.inline
    implicit class MethodMutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: Params | FormData): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait RefreshToken extends StObject {
    
    var host: String
    
    var refreshToken: String
  }
  object RefreshToken {
    
    @scala.inline
    def apply(host: String, refreshToken: String): RefreshToken = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[RefreshToken]
    }
    
    @scala.inline
    implicit class RefreshTokenMutableBuilder[Self <: RefreshToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
    }
  }
}
