package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateIAMPolicyAssignmentRequest extends js.Object {
  /**
    * The name of the assignment. This name must be unique within an AWS account.
    */
  var AssignmentName: IAMPolicyAssignmentName = js.native
  /**
    * The status of the assignment. Possible values are as follows:    ENABLED - Anything specified in this assignment is used when creating the data source.    DISABLED - This assignment isn't used when creating the data source.    DRAFT - This assignment is an unfinished draft and isn't used when creating the data source.  
    */
  var AssignmentStatus: js.UndefOr[typings.awsSdk.quicksightMod.AssignmentStatus] = js.native
  /**
    * The ID of the AWS account that contains the IAM policy assignment.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The QuickSight users, groups, or both that you want to assign the policy to.
    */
  var Identities: js.UndefOr[IdentityMap] = js.native
  /**
    * The namespace of the assignment.
    */
  var Namespace: typings.awsSdk.quicksightMod.Namespace = js.native
  /**
    * The ARN for the IAM policy to apply to the QuickSight users and groups specified in this assignment.
    */
  var PolicyArn: js.UndefOr[Arn] = js.native
}

object UpdateIAMPolicyAssignmentRequest {
  @scala.inline
  def apply(AssignmentName: IAMPolicyAssignmentName, AwsAccountId: AwsAccountId, Namespace: Namespace): UpdateIAMPolicyAssignmentRequest = {
    val __obj = js.Dynamic.literal(AssignmentName = AssignmentName.asInstanceOf[js.Any], AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIAMPolicyAssignmentRequest]
  }
  @scala.inline
  implicit class UpdateIAMPolicyAssignmentRequestOps[Self <: UpdateIAMPolicyAssignmentRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAssignmentName(value: IAMPolicyAssignmentName): Self = this.set("AssignmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNamespace(value: Namespace): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssignmentStatus(value: AssignmentStatus): Self = this.set("AssignmentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignmentStatus: Self = this.set("AssignmentStatus", js.undefined)
    @scala.inline
    def setIdentities(value: IdentityMap): Self = this.set("Identities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentities: Self = this.set("Identities", js.undefined)
    @scala.inline
    def setPolicyArn(value: Arn): Self = this.set("PolicyArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyArn: Self = this.set("PolicyArn", js.undefined)
  }
  
}

