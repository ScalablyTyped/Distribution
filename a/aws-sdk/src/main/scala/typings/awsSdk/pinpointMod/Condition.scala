package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  /**
    * The conditions to evaluate for the activity.
    */
  var Conditions: js.UndefOr[ListOfSimpleCondition] = js.native
  /**
    * Specifies how to handle multiple conditions for the activity. For example, if you specify two conditions for an activity, whether both or only one of the conditions must be met for the activity to be performed.
    */
  var Operator: js.UndefOr[typings.awsSdk.pinpointMod.Operator] = js.native
}

object Condition {
  @scala.inline
  def apply(Conditions: ListOfSimpleCondition = null, Operator: Operator = null): Condition = {
    val __obj = js.Dynamic.literal()
    if (Conditions != null) __obj.updateDynamic("Conditions")(Conditions.asInstanceOf[js.Any])
    if (Operator != null) __obj.updateDynamic("Operator")(Operator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

