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
  
  inline def tokenCache[T](getToken: js.Function0[js.Promise[T]], options: TokenCacheOptions[T]): TokenCache_ = (^.asInstanceOf[js.Dynamic].applyDynamic("tokenCache")(getToken.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TokenCache_]
  
  // Interfaces
  trait InterceptorOptions[T] extends StObject {
    
    var getToken: js.UndefOr[js.Function0[String | js.Promise[String]]] = js.undefined
    
    var header: js.UndefOr[String] = js.undefined
    
    var headerFormatter: js.UndefOr[js.Function1[/* token */ T, String]] = js.undefined
    
    var token: js.UndefOr[String] = js.undefined
  }
  object InterceptorOptions {
    
    inline def apply[T](): InterceptorOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InterceptorOptions[T]]
    }
    
    extension [Self <: InterceptorOptions[?], T](x: Self & InterceptorOptions[T]) {
      
      inline def setGetToken(value: () => String | js.Promise[String]): Self = StObject.set(x, "getToken", js.Any.fromFunction0(value))
      
      inline def setGetTokenUndefined: Self = StObject.set(x, "getToken", js.undefined)
      
      inline def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderFormatter(value: /* token */ T => String): Self = StObject.set(x, "headerFormatter", js.Any.fromFunction1(value))
      
      inline def setHeaderFormatterUndefined: Self = StObject.set(x, "headerFormatter", js.undefined)
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
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
    
    extension [Self <: TokenCacheOptions[?], T](x: Self & TokenCacheOptions[T]) {
      
      inline def setGetMaxAge(value: js.Function0[Double] | (js.Function1[/* el */ T, Double])): Self = StObject.set(x, "getMaxAge", value.asInstanceOf[js.Any])
      
      inline def setGetMaxAgeFunction0(value: () => Double): Self = StObject.set(x, "getMaxAge", js.Any.fromFunction0(value))
      
      inline def setGetMaxAgeFunction1(value: /* el */ T => Double): Self = StObject.set(x, "getMaxAge", js.Any.fromFunction1(value))
      
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
  
  type TokenProvider = js.Function1[/* config */ AxiosRequestConfig[Any], js.Promise[AxiosRequestConfig[Any]]]
}
