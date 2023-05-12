package typings.axiosTokenInterceptor

import typings.axios.mod.AxiosRequestConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // Module
  inline def apply(Options: InterceptorOptions[Any]): TokenProvider = ^.asInstanceOf[js.Dynamic].apply(Options.asInstanceOf[js.Any]).asInstanceOf[TokenProvider]
  
  @JSImport("axios-token-interceptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tokenCache[T](getToken: js.Function0[js.Promise[T]], options: TokenCacheOptions[T]): TokenCache_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenCache")(getToken.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TokenCache_[T]]
  
  // Interfaces
  trait InterceptorOptions[T] extends StObject {
    
    var getToken: js.UndefOr[js.Function0[T | js.Promise[T]]] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var headerFormatter: js.UndefOr[js.Function1[/* token */ T, String]] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
  }
  object InterceptorOptions {
    
    inline def apply[T](): InterceptorOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InterceptorOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InterceptorOptions[?], T] (val x: Self & InterceptorOptions[T]) extends AnyVal {
      
      inline def setGetToken(value: () => T | js.Promise[T]): Self = StObject.set(x, "getToken", js.Any.fromFunction0(value))
      
      inline def setGetTokenUndefined: Self = StObject.set(x, "getToken", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderFormatter(value: /* token */ T => String): Self = StObject.set(x, "headerFormatter", js.Any.fromFunction1(value))
      
      inline def setHeaderFormatterUndefined: Self = StObject.set(x, "headerFormatter", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  trait Token extends StObject {
    
    var access_token: String
    
    var expires_in: Double
  }
  object Token {
    
    inline def apply(access_token: String, expires_in: Double): Token = {
      val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any], expires_in = expires_in.asInstanceOf[js.Any])
      __obj.asInstanceOf[Token]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
      
      inline def setAccess_token(value: String): Self = StObject.set(x, "access_token", value.asInstanceOf[js.Any])
      
      inline def setExpires_in(value: Double): Self = StObject.set(x, "expires_in", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenCacheOptions[T] extends StObject {
    
    var getMaxAge: js.UndefOr[js.Function0[Double] | (js.Function1[/* el */ T, Double])] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
  }
  object TokenCacheOptions {
    
    inline def apply[T](): TokenCacheOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenCacheOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TokenCacheOptions[?], T] (val x: Self & TokenCacheOptions[T]) extends AnyVal {
      
      inline def setGetMaxAge(value: js.Function0[Double] | (js.Function1[/* el */ T, Double])): Self = StObject.set(x, "getMaxAge", value.asInstanceOf[js.Any])
      
      inline def setGetMaxAgeFunction0(value: () => Double): Self = StObject.set(x, "getMaxAge", js.Any.fromFunction0(value))
      
      inline def setGetMaxAgeFunction1(value: /* el */ T => Double): Self = StObject.set(x, "getMaxAge", js.Any.fromFunction1(value))
      
      inline def setGetMaxAgeUndefined: Self = StObject.set(x, "getMaxAge", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    }
  }
  
  @js.native
  trait TokenCache_[T] extends StObject {
    
    def apply(): js.Promise[T] = js.native
    
    def reset(): Unit = js.native
  }
  
  type TokenProvider = js.Function1[/* config */ AxiosRequestConfig[Any], js.Promise[AxiosRequestConfig[Any]]]
}
