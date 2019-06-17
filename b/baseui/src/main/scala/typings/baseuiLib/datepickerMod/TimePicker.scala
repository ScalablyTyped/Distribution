package typings
package baseuiLib.datepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/datepicker", "TimePicker")
@js.native
class TimePicker ()
  extends reactLib.reactMod.Component[TimePickerProps, TimePickerState, js.Any] {
  def buildSelectedOption(value: stdLib.Date, format: java.lang.String): js.Object = js.native
  def buildSteps(): js.Array[scala.Double] = js.native
  def handleChange(steps: scala.Double): scala.Unit = js.native
}

