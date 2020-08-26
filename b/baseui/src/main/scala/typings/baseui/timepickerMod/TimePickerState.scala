package typings.baseui.timepickerMod

import typings.baseui.selectMod.Option
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePickerState extends js.Object {
  var steps: js.Array[Double] = js.native
  var value: js.UndefOr[Option] = js.native
}

object TimePickerState {
  @scala.inline
  def apply(steps: js.Array[Double]): TimePickerState = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimePickerState]
  }
  @scala.inline
  implicit class TimePickerStateOps[Self <: TimePickerState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStepsVarargs(value: Double*): Self = this.set("steps", js.Array(value :_*))
    @scala.inline
    def setSteps(value: js.Array[Double]): Self = this.set("steps", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Option): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

