package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssessmentTargetsResponse extends js.Object {
  /**
    * Information about the assessment targets.
    */
  var assessmentTargets: AssessmentTargetList = js.native
  /**
    * Assessment target details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
}

object DescribeAssessmentTargetsResponse {
  @scala.inline
  def apply(assessmentTargets: AssessmentTargetList, failedItems: FailedItems): DescribeAssessmentTargetsResponse = {
    val __obj = js.Dynamic.literal(assessmentTargets = assessmentTargets.asInstanceOf[js.Any], failedItems = failedItems.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeAssessmentTargetsResponse]
  }
}

