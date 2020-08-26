package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssessmentRunsRequest extends js.Object {
  /**
    * The ARN that specifies the assessment run that you want to describe.
    */
  var assessmentRunArns: BatchDescribeArnList = js.native
}

object DescribeAssessmentRunsRequest {
  @scala.inline
  def apply(assessmentRunArns: BatchDescribeArnList): DescribeAssessmentRunsRequest = {
    val __obj = js.Dynamic.literal(assessmentRunArns = assessmentRunArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssessmentRunsRequest]
  }
  @scala.inline
  implicit class DescribeAssessmentRunsRequestOps[Self <: DescribeAssessmentRunsRequest] (val x: Self) extends AnyVal {
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
    def setAssessmentRunArnsVarargs(value: Arn*): Self = this.set("assessmentRunArns", js.Array(value :_*))
    @scala.inline
    def setAssessmentRunArns(value: BatchDescribeArnList): Self = this.set("assessmentRunArns", value.asInstanceOf[js.Any])
  }
  
}

