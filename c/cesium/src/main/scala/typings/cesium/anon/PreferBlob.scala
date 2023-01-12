package typings.cesium.anon

import typings.cesium.mod.Resource
import typings.cesium.mod.Resource.RetryCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreferBlob extends StObject {
  
  var flipY: js.UndefOr[Boolean] = js.undefined
  
  var headers: js.UndefOr[Any] = js.undefined
  
  var preferBlob: js.UndefOr[Boolean] = js.undefined
  
  var preferImageBitmap: js.UndefOr[Boolean] = js.undefined
  
  var proxy: js.UndefOr[typings.cesium.mod.Proxy] = js.undefined
  
  var queryParameters: js.UndefOr[Any] = js.undefined
  
  var request: js.UndefOr[typings.cesium.mod.Request] = js.undefined
  
  var retryAttempts: js.UndefOr[Double] = js.undefined
  
  var retryCallback: js.UndefOr[RetryCallback] = js.undefined
  
  var skipColorSpaceConversion: js.UndefOr[Boolean] = js.undefined
  
  var templateValues: js.UndefOr[Any] = js.undefined
  
  var url: String
}
object PreferBlob {
  
  inline def apply(url: String): PreferBlob = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreferBlob]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreferBlob] (val x: Self) extends AnyVal {
    
    inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    inline def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setPreferBlob(value: Boolean): Self = StObject.set(x, "preferBlob", value.asInstanceOf[js.Any])
    
    inline def setPreferBlobUndefined: Self = StObject.set(x, "preferBlob", js.undefined)
    
    inline def setPreferImageBitmap(value: Boolean): Self = StObject.set(x, "preferImageBitmap", value.asInstanceOf[js.Any])
    
    inline def setPreferImageBitmapUndefined: Self = StObject.set(x, "preferImageBitmap", js.undefined)
    
    inline def setProxy(value: typings.cesium.mod.Proxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setQueryParameters(value: Any): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    
    inline def setRequest(value: typings.cesium.mod.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRetryAttempts(value: Double): Self = StObject.set(x, "retryAttempts", value.asInstanceOf[js.Any])
    
    inline def setRetryAttemptsUndefined: Self = StObject.set(x, "retryAttempts", js.undefined)
    
    inline def setRetryCallback(
      value: (/* resource */ js.UndefOr[Resource], /* error */ js.UndefOr[js.Error]) => Boolean | js.Promise[Boolean]
    ): Self = StObject.set(x, "retryCallback", js.Any.fromFunction2(value))
    
    inline def setRetryCallbackUndefined: Self = StObject.set(x, "retryCallback", js.undefined)
    
    inline def setSkipColorSpaceConversion(value: Boolean): Self = StObject.set(x, "skipColorSpaceConversion", value.asInstanceOf[js.Any])
    
    inline def setSkipColorSpaceConversionUndefined: Self = StObject.set(x, "skipColorSpaceConversion", js.undefined)
    
    inline def setTemplateValues(value: Any): Self = StObject.set(x, "templateValues", value.asInstanceOf[js.Any])
    
    inline def setTemplateValuesUndefined: Self = StObject.set(x, "templateValues", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
