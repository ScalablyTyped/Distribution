package typings.backbone.mod

import typings.jquery.JQueryXHR
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PersistenceOptions extends StObject {
  
  var beforeSend: js.UndefOr[js.Function1[/* jqxhr */ JQueryXHR, Unit]] = js.undefined
  
  var data: js.UndefOr[js.Any] = js.undefined
  
  var emulateHTTP: js.UndefOr[Boolean] = js.undefined
  
  var emulateJSON: js.UndefOr[Boolean] = js.undefined
  
  var error: js.UndefOr[
    js.Function3[
      /* modelOrCollection */ js.UndefOr[js.Any], 
      /* jqxhr */ js.UndefOr[JQueryXHR], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  // TODO: copy all parameters from JQueryAjaxSettings except success/error callbacks?
  var success: js.UndefOr[
    js.Function3[
      /* modelOrCollection */ js.UndefOr[js.Any], 
      /* response */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object PersistenceOptions {
  
  @scala.inline
  def apply(): PersistenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PersistenceOptions]
  }
  
  @scala.inline
  implicit class PersistenceOptionsMutableBuilder[Self <: PersistenceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeSend(value: /* jqxhr */ JQueryXHR => Unit): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEmulateHTTP(value: Boolean): Self = StObject.set(x, "emulateHTTP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulateHTTPUndefined: Self = StObject.set(x, "emulateHTTP", js.undefined)
    
    @scala.inline
    def setEmulateJSON(value: Boolean): Self = StObject.set(x, "emulateJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmulateJSONUndefined: Self = StObject.set(x, "emulateJSON", js.undefined)
    
    @scala.inline
    def setError(
      value: (/* modelOrCollection */ js.UndefOr[js.Any], /* jqxhr */ js.UndefOr[JQueryXHR], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setSuccess(
      value: (/* modelOrCollection */ js.UndefOr[js.Any], /* response */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Any]) => Unit
    ): Self = StObject.set(x, "success", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
