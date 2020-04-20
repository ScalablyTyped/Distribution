package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartAssessmentRunResponse extends js.Object {
  /**
    * The ARN of the assessment run that has been started.
    */
  var assessmentRunArn: Arn = js.native
}

object StartAssessmentRunResponse {
  @scala.inline
  def apply(assessmentRunArn: Arn): StartAssessmentRunResponse = {
    val __obj = js.Dynamic.literal(assessmentRunArn = assessmentRunArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartAssessmentRunResponse]
  }
}

