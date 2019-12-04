package typings.baseui.timepickerMod

import typings.baseui.selectMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerState extends js.Object {
  var steps: js.Array[Double]
  var value: js.UndefOr[Option] = js.undefined
}

object TimePickerState {
  @scala.inline
  def apply(steps: js.Array[Double], value: Option = null): TimePickerState = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerState]
  }
}

