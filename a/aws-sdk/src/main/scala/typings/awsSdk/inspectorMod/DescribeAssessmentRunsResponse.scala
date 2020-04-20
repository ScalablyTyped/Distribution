package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssessmentRunsResponse extends js.Object {
  /**
    * Information about the assessment run.
    */
  var assessmentRuns: AssessmentRunList = js.native
  /**
    * Assessment run details that cannot be described. An error code is provided for each failed item.
    */
  var failedItems: FailedItems = js.native
}

object DescribeAssessmentRunsResponse {
  @scala.inline
  def apply(assessmentRuns: AssessmentRunList, failedItems: FailedItems): DescribeAssessmentRunsResponse = {
    val __obj = js.Dynamic.literal(assessmentRuns = assessmentRuns.asInstanceOf[js.Any], failedItems = failedItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssessmentRunsResponse]
  }
}

