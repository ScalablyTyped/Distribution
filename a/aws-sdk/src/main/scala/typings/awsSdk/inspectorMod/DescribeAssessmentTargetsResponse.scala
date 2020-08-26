package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssessmentTargetsResponse extends js.Object {
  /**
    * Information about the assessment targets.
    */
  var assessmentTargets: AssessmentTargetList = js.native
  /**
    * Assessment target details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
}

object DescribeAssessmentTargetsResponse {
  @scala.inline
  def apply(assessmentTargets: AssessmentTargetList, failedItems: FailedItems): DescribeAssessmentTargetsResponse = {
    val __obj = js.Dynamic.literal(assessmentTargets = assessmentTargets.asInstanceOf[js.Any], failedItems = failedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssessmentTargetsResponse]
  }
  @scala.inline
  implicit class DescribeAssessmentTargetsResponseOps[Self <: DescribeAssessmentTargetsResponse] (val x: Self) extends AnyVal {
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
    def setAssessmentTargetsVarargs(value: AssessmentTarget*): Self = this.set("assessmentTargets", js.Array(value :_*))
    @scala.inline
    def setAssessmentTargets(value: AssessmentTargetList): Self = this.set("assessmentTargets", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailedItems(value: FailedItems): Self = this.set("failedItems", value.asInstanceOf[js.Any])
  }
  
}

