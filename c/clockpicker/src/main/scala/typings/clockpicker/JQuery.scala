package typings.clockpicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def clockpicker(): JQuery
  def clockpicker(methodName: String, params: Any*): JQuery
  def clockpicker(options: ClockPickerOptions): JQuery
  @JSName("clockpicker")
  var clockpicker_Original: ClockPicker
}
object JQuery {
  
  inline def apply(clockpicker: ClockPicker): JQuery = {
    val __obj = js.Dynamic.literal(clockpicker = clockpicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  extension [Self <: JQuery](x: Self) {
    
    inline def setClockpicker(value: ClockPicker): Self = StObject.set(x, "clockpicker", value.asInstanceOf[js.Any])
  }
}
