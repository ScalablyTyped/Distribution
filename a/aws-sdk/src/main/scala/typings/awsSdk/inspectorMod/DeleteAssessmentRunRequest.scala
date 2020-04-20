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
}

