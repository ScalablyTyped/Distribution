package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPermissionPolicyRequest extends js.Object {
  /**
    * The policy to attach to the specified rule group.  The policy specifications must conform to the following:   The policy must be composed using IAM Policy version 2012-10-17 or version 2015-01-01.   The policy must include specifications for Effect, Action, and Principal.    Effect must specify Allow.    Action must specify wafv2:CreateWebACL, wafv2:UpdateWebACL, and wafv2:PutFirewallManagerRuleGroups. AWS WAF rejects any extra actions or wildcard actions in the policy.   The policy must not include a Resource parameter.   For more information, see IAM Policies. 
    */
  var Policy: PolicyString = js.native
  /**
    * The Amazon Resource Name (ARN) of the RuleGroup to which you want to attach the policy.
    */
  var ResourceArn: typings.awsSdk.wafv2Mod.ResourceArn = js.native
}

object PutPermissionPolicyRequest {
  @scala.inline
  def apply(Policy: PolicyString, ResourceArn: ResourceArn): PutPermissionPolicyRequest = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPermissionPolicyRequest]
  }
  @scala.inline
  implicit class PutPermissionPolicyRequestOps[Self <: PutPermissionPolicyRequest] (val x: Self) extends AnyVal {
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
    def setPolicy(value: PolicyString): Self = this.set("Policy", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceArn(value: ResourceArn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
  }
  
}

