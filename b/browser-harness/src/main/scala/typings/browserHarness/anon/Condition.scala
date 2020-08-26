package typings.browserHarness.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  var condition: js.Function = js.native
  var exec: js.UndefOr[js.Function] = js.native
  var timeoutMS: js.UndefOr[Double] = js.native
}

object Condition {
  @scala.inline
  def apply(condition: js.Function): Condition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
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
    def setCondition(value: js.Function): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def setExec(value: js.Function): Self = this.set("exec", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExec: Self = this.set("exec", js.undefined)
    @scala.inline
    def setTimeoutMS(value: Double): Self = this.set("timeoutMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutMS: Self = this.set("timeoutMS", js.undefined)
  }
  
}

