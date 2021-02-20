package typings.axiosTokenInterceptor

import typings.axios.mod.AxiosRequestConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  // Module
  @JSImport("axios-token-interceptor", JSImport.Namespace)
  @js.native
  def apply(Options: InterceptorOptions): TokenProvider = js.native
  
  @JSImport("axios-token-interceptor", "tokenCache")
  @js.native
  def tokenCache(getToken: js.Function0[js.Promise[String]], options: TokenCacheOptions): TokenCache_ = js.native
  
  // Interfaces
  @js.native
  trait InterceptorOptions extends StObject {
    
    var getToken: js.UndefOr[js.Function0[String | js.Promise[String]]] = js.native
    
    var header: js.UndefOr[String] = js.native
    
    var headerFormatter: js.UndefOr[js.Function1[/* token */ String, String]] = js.native
    
    var token: js.UndefOr[String] = js.native
  }
  object InterceptorOptions {
    
    @scala.inline
    def apply(): InterceptorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InterceptorOptions]
    }
    
    @scala.inline
    implicit class InterceptorOptionsMutableBuilder[Self <: InterceptorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetToken(value: () => String | js.Promise[String]): Self = StObject.set(x, "getToken", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetTokenUndefined: Self = StObject.set(x, "getToken", js.undefined)
      
      @scala.inline
      def setHeader(value: String): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderFormatter(value: /* token */ String => String): Self = StObject.set(x, "headerFormatter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHeaderFormatterUndefined: Self = StObject.set(x, "headerFormatter", js.undefined)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    }
  }
  
  @js.native
  trait TokenCacheOptions extends StObject {
    
    var getMaxAge: js.UndefOr[js.Function0[Double]] = js.native
    
    var maxAge: js.UndefOr[Double] = js.native
  }
  object TokenCacheOptions {
    
    @scala.inline
    def apply(): TokenCacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TokenCacheOptions]
    }
    
    @scala.inline
    implicit class TokenCacheOptionsMutableBuilder[Self <: TokenCacheOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetMaxAge(value: () => Double): Self = StObject.set(x, "getMaxAge", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetMaxAgeUndefined: Self = StObject.set(x, "getMaxAge", js.undefined)
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    }
  }
  
  @js.native
  trait TokenCache_ extends StObject {
    
    def apply(): js.Promise[String] = js.native
    
    def reset(): Unit = js.native
  }
  
  type TokenProvider = js.Function1[/* config */ AxiosRequestConfig, js.Promise[AxiosRequestConfig]]
}
