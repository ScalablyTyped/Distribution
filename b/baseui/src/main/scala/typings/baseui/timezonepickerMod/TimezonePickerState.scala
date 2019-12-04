package typings.baseui.timezonepickerMod

import typings.baseui.selectMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimezonePickerState extends js.Object {
  var timezones: js.Array[Option]
  var value: js.UndefOr[String] = js.undefined
}

object TimezonePickerState {
  @scala.inline
  def apply(timezones: js.Array[Option], value: String = null): TimezonePickerState = {
    val __obj = js.Dynamic.literal(timezones = timezones.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimezonePickerState]
  }
}

