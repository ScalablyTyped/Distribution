package typings.awsSdk.fmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsVPCSecurityGroupViolation extends js.Object {
  /**
    * List of rules specified in the security group of the AWS Firewall Manager policy that partially match the ViolationTarget rule.
    */
  var PartialMatches: js.UndefOr[typings.awsSdk.fmsMod.PartialMatches] = js.native
  /**
    * Remediation options for the rule specified in the ViolationTarget.
    */
  var PossibleSecurityGroupRemediationActions: js.UndefOr[SecurityGroupRemediationActions] = js.native
  /**
    * The security group rule that is being evaluated.
    */
  var ViolationTarget: js.UndefOr[typings.awsSdk.fmsMod.ViolationTarget] = js.native
  /**
    * A description of the security group that violates the policy.
    */
  var ViolationTargetDescription: js.UndefOr[LengthBoundedString] = js.native
}

object AwsVPCSecurityGroupViolation {
  @scala.inline
  def apply(): AwsVPCSecurityGroupViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsVPCSecurityGroupViolation]
  }
  @scala.inline
  implicit class AwsVPCSecurityGroupViolationOps[Self <: AwsVPCSecurityGroupViolation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPartialMatchesVarargs(value: PartialMatch*): Self = this.set("PartialMatches", js.Array(value :_*))
    @scala.inline
    def setPartialMatches(value: PartialMatches): Self = this.set("PartialMatches", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartialMatches: Self = this.set("PartialMatches", js.undefined)
    @scala.inline
    def setPossibleSecurityGroupRemediationActionsVarargs(value: SecurityGroupRemediationAction*): Self = this.set("PossibleSecurityGroupRemediationActions", js.Array(value :_*))
    @scala.inline
    def setPossibleSecurityGroupRemediationActions(value: SecurityGroupRemediationActions): Self = this.set("PossibleSecurityGroupRemediationActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePossibleSecurityGroupRemediationActions: Self = this.set("PossibleSecurityGroupRemediationActions", js.undefined)
    @scala.inline
    def setViolationTarget(value: ViolationTarget): Self = this.set("ViolationTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViolationTarget: Self = this.set("ViolationTarget", js.undefined)
    @scala.inline
    def setViolationTargetDescription(value: LengthBoundedString): Self = this.set("ViolationTargetDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViolationTargetDescription: Self = this.set("ViolationTargetDescription", js.undefined)
  }
  
}

