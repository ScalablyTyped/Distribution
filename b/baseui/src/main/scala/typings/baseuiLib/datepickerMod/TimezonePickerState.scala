package typings
package baseuiLib.datepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimezonePickerState extends js.Object {
  var timezones: js.Array[baseuiLib.selectMod.Option]
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object TimezonePickerState {
  @scala.inline
  def apply(timezones: js.Array[baseuiLib.selectMod.Option], value: java.lang.String = null): TimezonePickerState = {
    val __obj = js.Dynamic.literal(timezones = timezones)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TimezonePickerState]
  }
}

