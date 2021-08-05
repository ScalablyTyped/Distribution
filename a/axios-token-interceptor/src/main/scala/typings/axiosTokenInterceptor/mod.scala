package typings.axiosTokenInterceptor

import typings.axios.mod.AxiosRequestConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // Module
  inline def apply(Options: InterceptorOptions): TokenProvider = ^.asInstanceOf[js.Dynamic].apply(Options.asInstanceOf[js.Any]).asInstanceOf[TokenProvider]
  
  @JSImport("axios-token-interceptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def tokenCache(getToken: js.Function0[js.Promise[String]], options: TokenCacheOptions): TokenCache_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenCache")(getToken.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TokenCache_]
  
  // Interfaces
  trait InterceptorOptions extends StObject {
    
    var getToken: js.UndefOr[js.Function0[String | js.Promise[String]]] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var headerFormatter: js.UndefOr[js.Function1[/* token */ String, String]] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
  }
  object InterceptorOptions {
    
    inline def apply(): InterceptorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InterceptorOptions]
    }
    
    extension [Self <: InterceptorOptions](x: Self) {
      
      inline def setGetToken(value: () => String | js.Promise[String]): Self = StObject.set(x, "getToken", js.Any.fromFunction0(value))
      
      inline def setGetTokenUndefined: Self = StObject.set(x, "getToken", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderFormatter(value: /* token */ String => String): Self = StObject.set(x, "headerFormatter", js.Any.fromFunction1(value))
      
      inline def setHeaderFormatterUndefined: Self = StObject.set(x, "headerFormatter", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  trait TokenCacheOptions extends StObject {
    
    var getMaxAge: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
  }
  object TokenCacheOptions {
    
    inline def apply(): TokenCacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenCacheOptions]
    }
    
    extension [Self <: TokenCacheOptions](x: Self) {
      
      inline def setGetMaxAge(value: () => Double): Self = StObject.set(x, "getMaxAge", js.Any.fromFunction0(value))
      
      inline def setGetMaxAgeUndefined: Self = StObject.set(x, "getMaxAge", js.undefined)
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    }
  }
  
  @js.native
  trait TokenCache_ extends StObject {
    
    def apply(): js.Promise[String] = js.native
    
    def reset(): Unit = js.native
  }
  
  type TokenProvider = js.Function1[/* config */ AxiosRequestConfig, js.Promise[AxiosRequestConfig]]
}
