package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIAMPolicyAssignmentsResponse extends js.Object {
  /**
    * Information describing the IAM policy assignments.
    */
  var IAMPolicyAssignments: js.UndefOr[IAMPolicyAssignmentSummaryList] = js.native
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object ListIAMPolicyAssignmentsResponse {
  @scala.inline
  def apply(
    IAMPolicyAssignments: IAMPolicyAssignmentSummaryList = null,
    NextToken: String = null,
    RequestId: String = null,
    Status: Int | scala.Double = null
  ): ListIAMPolicyAssignmentsResponse = {
    val __obj = js.Dynamic.literal()
    if (IAMPolicyAssignments != null) __obj.updateDynamic("IAMPolicyAssignments")(IAMPolicyAssignments.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIAMPolicyAssignmentsResponse]
  }
}

