package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateExclusionsPreviewRequest extends js.Object {
  /**
    * The ARN that specifies the assessment template for which you want to create an exclusions preview.
    */
  var assessmentTemplateArn: Arn = js.native
}

object CreateExclusionsPreviewRequest {
  @scala.inline
  def apply(assessmentTemplateArn: Arn): CreateExclusionsPreviewRequest = {
    val __obj = js.Dynamic.literal(assessmentTemplateArn = assessmentTemplateArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateExclusionsPreviewRequest]
  }
}

