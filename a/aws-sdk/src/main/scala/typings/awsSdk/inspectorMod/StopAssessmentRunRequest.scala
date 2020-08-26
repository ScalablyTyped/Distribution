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
  def apply(assessmentRunArn: Arn): StopAssessmentRunRequest = {
    val __obj = js.Dynamic.literal(assessmentRunArn = assessmentRunArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopAssessmentRunRequest]
  }
  @scala.inline
  implicit class StopAssessmentRunRequestOps[Self <: StopAssessmentRunRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setStopAction(value: StopAction): Self = this.set("stopAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopAction: Self = this.set("stopAction", js.undefined)
  }
  
}

