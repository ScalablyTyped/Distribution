package typings.baseui.timezonepickerMod

import typings.react.mod.Component
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/timezonepicker", "TimezonePicker")
@js.native
class TimezonePicker ()
  extends Component[TimezonePickerProps, TimezonePickerState, js.Any] {
  def buildTimezones(compareDate: Date): js.Array[String] = js.native
}

