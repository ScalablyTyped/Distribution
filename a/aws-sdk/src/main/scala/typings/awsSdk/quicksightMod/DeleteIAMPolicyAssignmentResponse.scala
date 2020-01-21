package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteIAMPolicyAssignmentResponse extends js.Object {
  /**
    * The name of the assignment. 
    */
  var AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object DeleteIAMPolicyAssignmentResponse {
  @scala.inline
  def apply(
    AssignmentName: IAMPolicyAssignmentName = null,
    RequestId: String = null,
    Status: Int | scala.Double = null
  ): DeleteIAMPolicyAssignmentResponse = {
    val __obj = js.Dynamic.literal()
    if (AssignmentName != null) __obj.updateDynamic("AssignmentName")(AssignmentName.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteIAMPolicyAssignmentResponse]
  }
}

