package typings.cesium.anon

import typings.cesium.mod.DefaultProxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreserveQueryParameters extends StObject {
  
  var headers: js.UndefOr[js.Any] = js.native
  
  var preserveQueryParameters: js.UndefOr[Boolean] = js.native
  
  var proxy: js.UndefOr[DefaultProxy] = js.native
  
  var queryParameters: js.UndefOr[js.Any] = js.native
  
  var request: js.UndefOr[typings.std.Request] = js.native
  
  var retryAttempts: js.UndefOr[Double] = js.native
  
  var retryCallback: js.UndefOr[js.Any] = js.native
  
  var templateValues: js.UndefOr[js.Any] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object PreserveQueryParameters {
  
  @scala.inline
  def apply(): PreserveQueryParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreserveQueryParameters]
  }
  
  @scala.inline
  implicit class PreserveQueryParametersMutableBuilder[Self <: PreserveQueryParameters] (val x: Self) extends AnyVal {
    
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
    def setRetryCallback(value: js.Any): Self = StObject.set(x, "retryCallback", value.asInstanceOf[js.Any])
    
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
