package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateAssessmentTargetRequest extends js.Object {
  /**
    * The ARN of the assessment target that you want to update.
    */
  var assessmentTargetArn: Arn = js.native
  /**
    * The name of the assessment target that you want to update.
    */
  var assessmentTargetName: AssessmentTargetName = js.native
  /**
    * The ARN of the resource group that is used to specify the new resource group to associate with the assessment target.
    */
  var resourceGroupArn: js.UndefOr[Arn] = js.native
}

object UpdateAssessmentTargetRequest {
  @scala.inline
  def apply(assessmentTargetArn: Arn, assessmentTargetName: AssessmentTargetName): UpdateAssessmentTargetRequest = {
    val __obj = js.Dynamic.literal(assessmentTargetArn = assessmentTargetArn.asInstanceOf[js.Any], assessmentTargetName = assessmentTargetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAssessmentTargetRequest]
  }
  @scala.inline
  implicit class UpdateAssessmentTargetRequestOps[Self <: UpdateAssessmentTargetRequest] (val x: Self) extends AnyVal {
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
    def setAssessmentTargetArn(value: Arn): Self = this.set("assessmentTargetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssessmentTargetName(value: AssessmentTargetName): Self = this.set("assessmentTargetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceGroupArn(value: Arn): Self = this.set("resourceGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceGroupArn: Self = this.set("resourceGroupArn", js.undefined)
  }
  
}

