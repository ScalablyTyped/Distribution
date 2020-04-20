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
}

