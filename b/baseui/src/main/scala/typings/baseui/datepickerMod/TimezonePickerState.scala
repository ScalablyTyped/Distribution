package typings.baseui.datepickerMod

import typings.baseui.selectMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimezonePickerState extends StObject {
  
  var timezones: js.Array[Option]
  
  var value: js.UndefOr[String] = js.undefined
}
object TimezonePickerState {
  
  inline def apply(timezones: js.Array[Option]): TimezonePickerState = {
    val __obj = js.Dynamic.literal(timezones = timezones.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimezonePickerState]
  }
  
  extension [Self <: TimezonePickerState](x: Self) {
    
    inline def setTimezones(value: js.Array[Option]): Self = StObject.set(x, "timezones", value.asInstanceOf[js.Any])
    
    inline def setTimezonesVarargs(value: Option*): Self = StObject.set(x, "timezones", js.Array(value :_*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
