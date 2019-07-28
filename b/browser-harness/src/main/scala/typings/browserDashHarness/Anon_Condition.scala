package typings.browserDashHarness

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Condition extends js.Object {
  var condition: js.Function
  var exec: js.UndefOr[js.Function] = js.undefined
  var timeoutMS: js.UndefOr[Double] = js.undefined
}

object Anon_Condition {
  @scala.inline
  def apply(condition: js.Function, exec: js.Function = null, timeoutMS: Int | Double = null): Anon_Condition = {
    val __obj = js.Dynamic.literal(condition = condition)
    if (exec != null) __obj.updateDynamic("exec")(exec)
    if (timeoutMS != null) __obj.updateDynamic("timeoutMS")(timeoutMS.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Condition]
  }
}

