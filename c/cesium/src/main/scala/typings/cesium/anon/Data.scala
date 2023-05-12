package typings.cesium.anon

import typings.cesium.mod.RequestErrorEvent
import typings.cesium.mod.Resource
import typings.cesium.mod.Resource.RetryCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: js.UndefOr[Any] = js.undefined
  
  var headers: js.UndefOr[Any] = js.undefined
  
  var overrideMimeType: js.UndefOr[String] = js.undefined
  
  var proxy: js.UndefOr[typings.cesium.mod.Proxy] = js.undefined
  
  var queryParameters: js.UndefOr[Any] = js.undefined
  
  var request: js.UndefOr[typings.cesium.mod.Request] = js.undefined
  
  var responseType: js.UndefOr[String] = js.undefined
  
  var retryAttempts: js.UndefOr[Double] = js.undefined
  
  var retryCallback: js.UndefOr[RetryCallback] = js.undefined
  
  var templateValues: js.UndefOr[Any] = js.undefined
  
  var url: String
}
object Data {
  
  inline def apply(url: String): Data = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setOverrideMimeType(value: String): Self = StObject.set(x, "overrideMimeType", value.asInstanceOf[js.Any])
    
    inline def setOverrideMimeTypeUndefined: Self = StObject.set(x, "overrideMimeType", js.undefined)
    
    inline def setProxy(value: typings.cesium.mod.Proxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setQueryParameters(value: Any): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    
    inline def setRequest(value: typings.cesium.mod.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setRetryAttempts(value: Double): Self = StObject.set(x, "retryAttempts", value.asInstanceOf[js.Any])
    
    inline def setRetryAttemptsUndefined: Self = StObject.set(x, "retryAttempts", js.undefined)
    
    inline def setRetryCallback(
      value: (/* resource */ js.UndefOr[Resource], /* error */ js.UndefOr[RequestErrorEvent]) => Boolean | js.Promise[Boolean]
    ): Self = StObject.set(x, "retryCallback", js.Any.fromFunction2(value))
    
    inline def setRetryCallbackUndefined: Self = StObject.set(x, "retryCallback", js.undefined)
    
    inline def setTemplateValues(value: Any): Self = StObject.set(x, "templateValues", value.asInstanceOf[js.Any])
    
    inline def setTemplateValuesUndefined: Self = StObject.set(x, "templateValues", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
