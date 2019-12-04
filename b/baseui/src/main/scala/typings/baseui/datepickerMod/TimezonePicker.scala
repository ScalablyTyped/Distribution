package typings.baseui.datepickerMod

import typings.react.reactMod.Component
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/datepicker", "TimezonePicker")
@js.native
class TimezonePicker ()
  extends Component[TimezonePickerProps, TimezonePickerState, js.Any] {
  def buildTimezones(compareDate: Date): js.Array[String] = js.native
}

