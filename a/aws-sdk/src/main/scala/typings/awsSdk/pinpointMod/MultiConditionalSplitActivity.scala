package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultiConditionalSplitActivity extends js.Object {
  /**
    * The paths for the activity, including the conditions for entering each path and the activity to perform for each path.
    */
  var Branches: js.UndefOr[ListOfMultiConditionalBranch] = js.native
  /**
    * The unique identifier for the activity to perform for participants who don't meet any of the conditions specified for other paths in the activity.
    */
  var DefaultActivity: js.UndefOr[string] = js.native
  /**
    * The amount of time to wait or the date and time when Amazon Pinpoint determines whether the conditions are met.
    */
  var EvaluationWaitTime: js.UndefOr[WaitTime] = js.native
}

object MultiConditionalSplitActivity {
  @scala.inline
  def apply(
    Branches: ListOfMultiConditionalBranch = null,
    DefaultActivity: string = null,
    EvaluationWaitTime: WaitTime = null
  ): MultiConditionalSplitActivity = {
    val __obj = js.Dynamic.literal()
    if (Branches != null) __obj.updateDynamic("Branches")(Branches.asInstanceOf[js.Any])
    if (DefaultActivity != null) __obj.updateDynamic("DefaultActivity")(DefaultActivity.asInstanceOf[js.Any])
    if (EvaluationWaitTime != null) __obj.updateDynamic("EvaluationWaitTime")(EvaluationWaitTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiConditionalSplitActivity]
  }
}

