package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAssessmentTemplateResponse extends js.Object {
  /**
    * The ARN that specifies the assessment template that is created.
    */
  var assessmentTemplateArn: Arn = js.native
}

object CreateAssessmentTemplateResponse {
  @scala.inline
  def apply(assessmentTemplateArn: Arn): CreateAssessmentTemplateResponse = {
    val __obj = js.Dynamic.literal(assessmentTemplateArn = assessmentTemplateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssessmentTemplateResponse]
  }
  @scala.inline
  implicit class CreateAssessmentTemplateResponseOps[Self <: CreateAssessmentTemplateResponse] (val x: Self) extends AnyVal {
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
  }
  
}

