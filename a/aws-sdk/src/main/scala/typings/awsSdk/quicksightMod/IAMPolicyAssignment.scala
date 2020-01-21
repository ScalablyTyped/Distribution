package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAMPolicyAssignment extends js.Object {
  /**
    * Assignment ID.
    */
  var AssignmentId: js.UndefOr[String] = js.native
  /**
    * Assignment name.
    */
  var AssignmentName: js.UndefOr[IAMPolicyAssignmentName] = js.native
  /**
    * Assignment status.
    */
  var AssignmentStatus: js.UndefOr[typings.awsSdk.quicksightMod.AssignmentStatus] = js.native
  /**
    * The AWS account ID.
    */
  var AwsAccountId: js.UndefOr[typings.awsSdk.quicksightMod.AwsAccountId] = js.native
  /**
    * Identities.
    */
  var Identities: js.UndefOr[IdentityMap] = js.native
  /**
    * The Amazon Resource Name (ARN) for the IAM policy.
    */
  var PolicyArn: js.UndefOr[Arn] = js.native
}

object IAMPolicyAssignment {
  @scala.inline
  def apply(
    AssignmentId: String = null,
    AssignmentName: IAMPolicyAssignmentName = null,
    AssignmentStatus: AssignmentStatus = null,
    AwsAccountId: AwsAccountId = null,
    Identities: IdentityMap = null,
    PolicyArn: Arn = null
  ): IAMPolicyAssignment = {
    val __obj = js.Dynamic.literal()
    if (AssignmentId != null) __obj.updateDynamic("AssignmentId")(AssignmentId.asInstanceOf[js.Any])
    if (AssignmentName != null) __obj.updateDynamic("AssignmentName")(AssignmentName.asInstanceOf[js.Any])
    if (AssignmentStatus != null) __obj.updateDynamic("AssignmentStatus")(AssignmentStatus.asInstanceOf[js.Any])
    if (AwsAccountId != null) __obj.updateDynamic("AwsAccountId")(AwsAccountId.asInstanceOf[js.Any])
    if (Identities != null) __obj.updateDynamic("Identities")(Identities.asInstanceOf[js.Any])
    if (PolicyArn != null) __obj.updateDynamic("PolicyArn")(PolicyArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAMPolicyAssignment]
  }
}

