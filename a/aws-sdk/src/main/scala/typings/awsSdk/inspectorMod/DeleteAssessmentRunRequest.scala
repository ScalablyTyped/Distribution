package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAssessmentRunRequest extends js.Object {
  /**
    * The ARN that specifies the assessment run that you want to delete.
    */
  var assessmentRunArn: Arn = js.native
}

object DeleteAssessmentRunRequest {
  @scala.inline
  def apply(assessmentRunArn: Arn): DeleteAssessmentRunRequest = {
    val __obj = js.Dynamic.literal(assessmentRunArn = assessmentRunArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAssessmentRunRequest]
  }
  @scala.inline
  implicit class DeleteAssessmentRunRequestOps[Self <: DeleteAssessmentRunRequest] (val x: Self) extends AnyVal {
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
    def setAssessmentRunArn(value: Arn): Self = this.set("assessmentRunArn", value.asInstanceOf[js.Any])
  }
  
}

