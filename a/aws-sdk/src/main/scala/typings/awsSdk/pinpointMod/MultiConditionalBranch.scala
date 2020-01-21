package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiConditionalBranch extends js.Object {
  /**
    * The condition to evaluate for the activity path.
    */
  var Condition: js.UndefOr[SimpleCondition] = js.native
  /**
    * The unique identifier for the next activity to perform, after completing the activity for the path.
    */
  var NextActivity: js.UndefOr[string] = js.native
}

object MultiConditionalBranch {
  @scala.inline
  def apply(Condition: SimpleCondition = null, NextActivity: string = null): MultiConditionalBranch = {
    val __obj = js.Dynamic.literal()
    if (Condition != null) __obj.updateDynamic("Condition")(Condition.asInstanceOf[js.Any])
    if (NextActivity != null) __obj.updateDynamic("NextActivity")(NextActivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiConditionalBranch]
  }
}

