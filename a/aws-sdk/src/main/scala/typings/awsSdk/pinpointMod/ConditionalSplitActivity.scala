package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalSplitActivity extends js.Object {
  /**
    * The conditions that define the paths for the activity, and the relationship between the conditions.
    */
  var Condition: js.UndefOr[typings.awsSdk.pinpointMod.Condition] = js.native
  /**
    * The amount of time to wait before determining whether the conditions are met, or the date and time when Amazon Pinpoint determines whether the conditions are met.
    */
  var EvaluationWaitTime: js.UndefOr[WaitTime] = js.native
  /**
    * The unique identifier for the activity to perform if the conditions aren't met.
    */
  var FalseActivity: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the activity to perform if the conditions are met.
    */
  var TrueActivity: js.UndefOr[string] = js.native
}

object ConditionalSplitActivity {
  @scala.inline
  def apply(
    Condition: Condition = null,
    EvaluationWaitTime: WaitTime = null,
    FalseActivity: string = null,
    TrueActivity: string = null
  ): ConditionalSplitActivity = {
    val __obj = js.Dynamic.literal()
    if (Condition != null) __obj.updateDynamic("Condition")(Condition.asInstanceOf[js.Any])
    if (EvaluationWaitTime != null) __obj.updateDynamic("EvaluationWaitTime")(EvaluationWaitTime.asInstanceOf[js.Any])
    if (FalseActivity != null) __obj.updateDynamic("FalseActivity")(FalseActivity.asInstanceOf[js.Any])
    if (TrueActivity != null) __obj.updateDynamic("TrueActivity")(TrueActivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalSplitActivity]
  }
}

