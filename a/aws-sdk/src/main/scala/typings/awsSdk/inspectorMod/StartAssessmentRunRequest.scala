package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartAssessmentRunRequest extends js.Object {
  /**
    * You can specify the name for the assessment run. The name must be unique for the assessment template whose ARN is used to start the assessment run.
    */
  var assessmentRunName: js.UndefOr[AssessmentRunName] = js.native
  /**
    * The ARN of the assessment template of the assessment run that you want to start.
    */
  var assessmentTemplateArn: Arn = js.native
}

object StartAssessmentRunRequest {
  @scala.inline
  def apply(assessmentTemplateArn: Arn): StartAssessmentRunRequest = {
    val __obj = js.Dynamic.literal(assessmentTemplateArn = assessmentTemplateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAssessmentRunRequest]
  }
  @scala.inline
  implicit class StartAssessmentRunRequestOps[Self <: StartAssessmentRunRequest] (val x: Self) extends AnyVal {
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
    def setAssessmentTemplateArn(value: Arn): Self = this.set("assessmentTemplateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssessmentRunName(value: AssessmentRunName): Self = this.set("assessmentRunName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssessmentRunName: Self = this.set("assessmentRunName", js.undefined)
  }
  
}

