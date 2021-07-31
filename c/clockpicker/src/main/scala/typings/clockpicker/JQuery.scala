package typings.clockpicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQuery extends StObject {
  
  def clockpicker(): JQuery
  def clockpicker(methodName: String, params: js.Any*): JQuery
  def clockpicker(options: ClockPickerOptions): JQuery
  @JSName("clockpicker")
  var clockpicker_Original: ClockPicker
}
object JQuery {
  
  @scala.inline
  def apply(clockpicker: ClockPicker): JQuery = {
    val __obj = js.Dynamic.literal(clockpicker = clockpicker.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQuery]
  }
  
  @scala.inline
  implicit class JQueryMutableBuilder[Self <: JQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClockpicker(value: ClockPicker): Self = StObject.set(x, "clockpicker", value.asInstanceOf[js.Any])
  }
}
