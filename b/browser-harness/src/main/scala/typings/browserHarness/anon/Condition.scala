package typings.browserHarness.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  var condition: js.Function
  var exec: js.UndefOr[js.Function] = js.undefined
  var timeoutMS: js.UndefOr[Double] = js.undefined
}

object Condition {
  @scala.inline
  def apply(condition: js.Function, exec: js.Function = null, timeoutMS: js.UndefOr[Double] = js.undefined): Condition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(exec.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutMS)) __obj.updateDynamic("timeoutMS")(timeoutMS.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

