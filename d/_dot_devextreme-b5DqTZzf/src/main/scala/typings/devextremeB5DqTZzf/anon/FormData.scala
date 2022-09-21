package typings.devextremeB5DqTZzf.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormData extends StObject {
  
  var formData: js.UndefOr[Any] = js.undefined
  
  var headers: js.UndefOr[Any] = js.undefined
  
  var xhrFields: js.UndefOr[Any] = js.undefined
}
object FormData {
  
  inline def apply(): FormData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormData]
  }
  
  extension [Self <: FormData](x: Self) {
    
    inline def setFormData(value: Any): Self = StObject.set(x, "formData", value.asInstanceOf[js.Any])
    
    inline def setFormDataUndefined: Self = StObject.set(x, "formData", js.undefined)
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setXhrFields(value: Any): Self = StObject.set(x, "xhrFields", value.asInstanceOf[js.Any])
    
    inline def setXhrFieldsUndefined: Self = StObject.set(x, "xhrFields", js.undefined)
  }
}
