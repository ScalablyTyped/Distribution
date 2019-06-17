package typings
package baseuiLib.datepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerState extends js.Object {
  var steps: js.Array[scala.Double]
  var value: js.UndefOr[baseuiLib.selectMod.Option] = js.undefined
}

object TimePickerState {
  @scala.inline
  def apply(steps: js.Array[scala.Double], value: baseuiLib.selectMod.Option = null): TimePickerState = {
    val __obj = js.Dynamic.literal(steps = steps)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[TimePickerState]
  }
}

