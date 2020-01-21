package typings.browserHarness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCondition extends js.Object {
  var condition: js.Function
  var exec: js.UndefOr[js.Function] = js.undefined
  var timeoutMS: js.UndefOr[Double] = js.undefined
}

object AnonCondition {
  @scala.inline
  def apply(condition: js.Function, exec: js.Function = null, timeoutMS: Int | Double = null): AnonCondition = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(exec.asInstanceOf[js.Any])
    if (timeoutMS != null) __obj.updateDynamic("timeoutMS")(timeoutMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCondition]
  }
}

