package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateIAMPolicyAssignmentResponse extends js.Object {
  /**
    * The ID of the assignment.
    */
  var AssignmentId: js.UndefOr[String] = js.native
  /**
    * The name of the assignment. 
    */
  var AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.native
  /**
    * The status of the assignment. Possible values are as follows:    ENABLED - Anything specified in this assignment is used when creating the data source.    DISABLED - This assignment isn't used when creating the data source.    DRAFT - This assignment is an unfinished draft and isn't used when creating the data source.  
    */
  var AssignmentStatus: js.UndefOr[typings.awsSdk.quicksightMod.AssignmentStatus] = js.native
  /**
    * The QuickSight users, groups, or both that the IAM policy is assigned to.
    */
  var Identities: js.UndefOr[IdentityMap] = js.native
  /**
    * The ARN for the IAM policy applied to the QuickSight users and groups specified in this assignment.
    */
  var PolicyArn: js.UndefOr[Arn] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object UpdateIAMPolicyAssignmentResponse {
  @scala.inline
  def apply(
    AssignmentId: String = null,
    AssignmentName: IAMPolicyAssignmentName = null,
    AssignmentStatus: AssignmentStatus = null,
    Identities: IdentityMap = null,
    PolicyArn: Arn = null,
    RequestId: String = null,
    Status: Int | scala.Double = null
  ): UpdateIAMPolicyAssignmentResponse = {
    val __obj = js.Dynamic.literal()
    if (AssignmentId != null) __obj.updateDynamic("AssignmentId")(AssignmentId.asInstanceOf[js.Any])
    if (AssignmentName != null) __obj.updateDynamic("AssignmentName")(AssignmentName.asInstanceOf[js.Any])
    if (AssignmentStatus != null) __obj.updateDynamic("AssignmentStatus")(AssignmentStatus.asInstanceOf[js.Any])
    if (Identities != null) __obj.updateDynamic("Identities")(Identities.asInstanceOf[js.Any])
    if (PolicyArn != null) __obj.updateDynamic("PolicyArn")(PolicyArn.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIAMPolicyAssignmentResponse]
  }
}

