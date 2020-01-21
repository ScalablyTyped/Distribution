package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeIAMPolicyAssignmentResponse extends js.Object {
  /**
    * Information describing the IAM policy assignment.
    */
  var IAMPolicyAssignment: js.UndefOr[typings.awsSdk.quicksightMod.IAMPolicyAssignment] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object DescribeIAMPolicyAssignmentResponse {
  @scala.inline
  def apply(
    IAMPolicyAssignment: IAMPolicyAssignment = null,
    RequestId: String = null,
    Status: Int | scala.Double = null
  ): DescribeIAMPolicyAssignmentResponse = {
    val __obj = js.Dynamic.literal()
    if (IAMPolicyAssignment != null) __obj.updateDynamic("IAMPolicyAssignment")(IAMPolicyAssignment.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeIAMPolicyAssignmentResponse]
  }
}

