package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssessmentTargetsRequest extends js.Object {
  /**
    * The ARNs that specifies the assessment targets that you want to describe.
    */
  var assessmentTargetArns: BatchDescribeArnList = js.native
}

object DescribeAssessmentTargetsRequest {
  @scala.inline
  def apply(assessmentTargetArns: BatchDescribeArnList): DescribeAssessmentTargetsRequest = {
    val __obj = js.Dynamic.literal(assessmentTargetArns = assessmentTargetArns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAssessmentTargetsRequest]
  }
}

