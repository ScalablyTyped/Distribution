package typings.cesium.anon

import typings.cesium.mod.DefaultProxy
import typings.cesium.mod.Resource
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RetryAttempts extends StObject {
  
  var headers: js.UndefOr[js.Any] = js.undefined
  
  var overrideMimeType: js.UndefOr[String] = js.undefined
  
  var proxy: js.UndefOr[DefaultProxy] = js.undefined
  
  var queryParameters: js.UndefOr[js.Any] = js.undefined
  
  var request: js.UndefOr[typings.std.Request] = js.undefined
  
  var responseType: js.UndefOr[String] = js.undefined
  
  var retryAttempts: js.UndefOr[Double] = js.undefined
  
  var retryCallback: js.UndefOr[typings.cesium.mod.Resource.RetryCallback] = js.undefined
  
  var templateValues: js.UndefOr[js.Any] = js.undefined
  
  var url: String
}
object RetryAttempts {
  
  inline def apply(url: String): RetryAttempts = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetryAttempts]
  }
  
  extension [Self <: RetryAttempts](x: Self) {
    
    inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setOverrideMimeType(value: String): Self = StObject.set(x, "overrideMimeType", value.asInstanceOf[js.Any])
    
    inline def setOverrideMimeTypeUndefined: Self = StObject.set(x, "overrideMimeType", js.undefined)
    
    inline def setProxy(value: DefaultProxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setQueryParameters(value: js.Any): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    
    inline def setRequest(value: typings.std.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setResponseType(value: String): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    inline def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    inline def setRetryAttempts(value: Double): Self = StObject.set(x, "retryAttempts", value.asInstanceOf[js.Any])
    
    inline def setRetryAttemptsUndefined: Self = StObject.set(x, "retryAttempts", js.undefined)
    
    inline def setRetryCallback(value: (/* resource */ Resource, /* error */ Error) => Unit): Self = StObject.set(x, "retryCallback", js.Any.fromFunction2(value))
    
    inline def setRetryCallbackUndefined: Self = StObject.set(x, "retryCallback", js.undefined)
    
    inline def setTemplateValues(value: js.Any): Self = StObject.set(x, "templateValues", value.asInstanceOf[js.Any])
    
    inline def setTemplateValuesUndefined: Self = StObject.set(x, "templateValues", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
