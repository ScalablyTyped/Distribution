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
  def apply(): ConditionalSplitActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionalSplitActivity]
  }
  @scala.inline
  implicit class ConditionalSplitActivityOps[Self <: ConditionalSplitActivity] (val x: Self) extends AnyVal {
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
    def setCondition(value: Condition): Self = this.set("Condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("Condition", js.undefined)
    @scala.inline
    def setEvaluationWaitTime(value: WaitTime): Self = this.set("EvaluationWaitTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvaluationWaitTime: Self = this.set("EvaluationWaitTime", js.undefined)
    @scala.inline
    def setFalseActivity(value: string): Self = this.set("FalseActivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFalseActivity: Self = this.set("FalseActivity", js.undefined)
    @scala.inline
    def setTrueActivity(value: string): Self = this.set("TrueActivity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrueActivity: Self = this.set("TrueActivity", js.undefined)
  }
  
}

