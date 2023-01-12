package typings.browserSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormsOptions extends StObject {
  
  var inputs: Boolean
  
  var submit: Boolean
  
  var toggles: Boolean
}
object FormsOptions {
  
  inline def apply(inputs: Boolean, submit: Boolean, toggles: Boolean): FormsOptions = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], submit = submit.asInstanceOf[js.Any], toggles = toggles.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormsOptions] (val x: Self) extends AnyVal {
    
    inline def setInputs(value: Boolean): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setSubmit(value: Boolean): Self = StObject.set(x, "submit", value.asInstanceOf[js.Any])
    
    inline def setToggles(value: Boolean): Self = StObject.set(x, "toggles", value.asInstanceOf[js.Any])
  }
}
