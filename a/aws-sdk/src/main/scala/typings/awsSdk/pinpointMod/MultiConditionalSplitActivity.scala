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
  def apply(): MultiConditionalSplitActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultiConditionalSplitActivity]
  }
  @scala.inline
  implicit class MultiConditionalSplitActivityOps[Self <: MultiConditionalSplitActivity] (val x: Self) extends AnyVal {
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
    def setBranchesVarargs(value: MultiConditionalBranch*): Self = this.set("Branches", js.Array(value :_*))
    @scala.inline
    def setBranches(value: ListOfMultiConditionalBranch): Self = this.set("Branches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranches: Self = this.set("Branches", js.undefined)
    @scala.inline
    def setDefaultActivity(value: string): Self = this.set("DefaultActivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultActivity: Self = this.set("DefaultActivity", js.undefined)
    @scala.inline
    def setEvaluationWaitTime(value: WaitTime): Self = this.set("EvaluationWaitTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluationWaitTime: Self = this.set("EvaluationWaitTime", js.undefined)
  }
  
}

