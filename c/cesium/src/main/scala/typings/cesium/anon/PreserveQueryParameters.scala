package typings.cesium.anon

import typings.cesium.mod.DefaultProxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreserveQueryParameters extends StObject {
  
  var headers: js.UndefOr[js.Any] = js.undefined
  
  var preserveQueryParameters: js.UndefOr[Boolean] = js.undefined
  
  var proxy: js.UndefOr[DefaultProxy] = js.undefined
  
  var queryParameters: js.UndefOr[js.Any] = js.undefined
  
  var request: js.UndefOr[typings.std.Request] = js.undefined
  
  var retryAttempts: js.UndefOr[Double] = js.undefined
  
  var retryCallback: js.UndefOr[js.Any] = js.undefined
  
  var templateValues: js.UndefOr[js.Any] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object PreserveQueryParameters {
  
  inline def apply(): PreserveQueryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreserveQueryParameters]
  }
  
  extension [Self <: PreserveQueryParameters](x: Self) {
    
    inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setPreserveQueryParameters(value: Boolean): Self = StObject.set(x, "preserveQueryParameters", value.asInstanceOf[js.Any])
    
    inline def setPreserveQueryParametersUndefined: Self = StObject.set(x, "preserveQueryParameters", js.undefined)
    
    inline def setProxy(value: DefaultProxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setQueryParameters(value: js.Any): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    
    inline def setRequest(value: typings.std.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    inline def setRetryAttempts(value: Double): Self = StObject.set(x, "retryAttempts", value.asInstanceOf[js.Any])
    
    inline def setRetryAttemptsUndefined: Self = StObject.set(x, "retryAttempts", js.undefined)
    
    inline def setRetryCallback(value: js.Any): Self = StObject.set(x, "retryCallback", value.asInstanceOf[js.Any])
    
    inline def setRetryCallbackUndefined: Self = StObject.set(x, "retryCallback", js.undefined)
    
    inline def setTemplateValues(value: js.Any): Self = StObject.set(x, "templateValues", value.asInstanceOf[js.Any])
    
    inline def setTemplateValuesUndefined: Self = StObject.set(x, "templateValues", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
