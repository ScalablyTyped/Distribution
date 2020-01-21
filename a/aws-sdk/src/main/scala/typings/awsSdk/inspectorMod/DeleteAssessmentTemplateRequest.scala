package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAssessmentTemplateRequest extends js.Object {
  /**
    * The ARN that specifies the assessment template that you want to delete.
    */
  var assessmentTemplateArn: Arn = js.native
}

object DeleteAssessmentTemplateRequest {
  @scala.inline
  def apply(assessmentTemplateArn: Arn): DeleteAssessmentTemplateRequest = {
    val __obj = js.Dynamic.literal(assessmentTemplateArn = assessmentTemplateArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteAssessmentTemplateRequest]
  }
}

