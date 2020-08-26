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
  def apply(): IAMPolicyAssignment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAMPolicyAssignment]
  }
  @scala.inline
  implicit class IAMPolicyAssignmentOps[Self <: IAMPolicyAssignment] (val x: Self) extends AnyVal {
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
    def setAssignmentId(value: String): Self = this.set("AssignmentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignmentId: Self = this.set("AssignmentId", js.undefined)
    @scala.inline
    def setAssignmentName(value: IAMPolicyAssignmentName): Self = this.set("AssignmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignmentName: Self = this.set("AssignmentName", js.undefined)
    @scala.inline
    def setAssignmentStatus(value: AssignmentStatus): Self = this.set("AssignmentStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignmentStatus: Self = this.set("AssignmentStatus", js.undefined)
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsAccountId: Self = this.set("AwsAccountId", js.undefined)
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

