package typings.cesium.anon

import typings.cesium.mod.DefaultProxy
import typings.cesium.mod.Resource
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  var headers: js.UndefOr[js.Any] = js.undefined
  
  var preserveQueryParameters: js.UndefOr[Boolean] = js.undefined
  
  var proxy: js.UndefOr[DefaultProxy] = js.undefined
  
  var queryParameters: js.UndefOr[js.Any] = js.undefined
  
  var request: js.UndefOr[typings.std.Request] = js.undefined
  
  var retryAttempts: js.UndefOr[Double] = js.undefined
  
  var retryCallback: js.UndefOr[typings.cesium.mod.Resource.RetryCallback] = js.undefined
  
  var templateValues: js.UndefOr[js.Any] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object Request {
  
  @scala.inline
  def apply(): Request = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setPreserveQueryParameters(value: Boolean): Self = StObject.set(x, "preserveQueryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreserveQueryParametersUndefined: Self = StObject.set(x, "preserveQueryParameters", js.undefined)
    
    @scala.inline
    def setProxy(value: DefaultProxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    @scala.inline
    def setQueryParameters(value: js.Any): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryParametersUndefined: Self = StObject.set(x, "queryParameters", js.undefined)
    
    @scala.inline
    def setRequest(value: typings.std.Request): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestUndefined: Self = StObject.set(x, "request", js.undefined)
    
    @scala.inline
    def setRetryAttempts(value: Double): Self = StObject.set(x, "retryAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryAttemptsUndefined: Self = StObject.set(x, "retryAttempts", js.undefined)
    
    @scala.inline
    def setRetryCallback(value: (/* resource */ Resource, /* error */ Error) => Unit): Self = StObject.set(x, "retryCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRetryCallbackUndefined: Self = StObject.set(x, "retryCallback", js.undefined)
    
    @scala.inline
    def setTemplateValues(value: js.Any): Self = StObject.set(x, "templateValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateValuesUndefined: Self = StObject.set(x, "templateValues", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
