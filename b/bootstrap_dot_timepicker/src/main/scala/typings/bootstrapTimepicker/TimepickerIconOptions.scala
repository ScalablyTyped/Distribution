package typings.bootstrapTimepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimepickerIconOptions extends StObject {
  
  var down: js.UndefOr[String] = js.undefined
  
  var up: js.UndefOr[String] = js.undefined
}
object TimepickerIconOptions {
  
  inline def apply(): TimepickerIconOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimepickerIconOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimepickerIconOptions] (val x: Self) extends AnyVal {
    
    inline def setDown(value: String): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
    
    inline def setUp(value: String): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
