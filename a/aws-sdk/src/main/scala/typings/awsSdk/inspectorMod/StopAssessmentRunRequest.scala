package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopAssessmentRunRequest extends js.Object {
  /**
    * The ARN of the assessment run that you want to stop.
    */
  var assessmentRunArn: Arn = js.native
  /**
    * An input option that can be set to either START_EVALUATION or SKIP_EVALUATION. START_EVALUATION (the default value), stops the AWS agent from collecting data and begins the results evaluation and the findings generation process. SKIP_EVALUATION cancels the assessment run immediately, after which no findings are generated.
    */
  var stopAction: js.UndefOr[StopAction] = js.native
}

object StopAssessmentRunRequest {
  @scala.inline
  def apply(assessmentRunArn: Arn, stopAction: StopAction = null): StopAssessmentRunRequest = {
    val __obj = js.Dynamic.literal(assessmentRunArn = assessmentRunArn.asInstanceOf[js.Any])
    if (stopAction != null) __obj.updateDynamic("stopAction")(stopAction.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopAssessmentRunRequest]
  }
}

