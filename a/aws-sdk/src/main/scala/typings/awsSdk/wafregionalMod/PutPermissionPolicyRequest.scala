package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPermissionPolicyRequest extends js.Object {
  /**
    * The policy to attach to the specified RuleGroup.
    */
  var Policy: PolicyString = js.native
  /**
    * The Amazon Resource Name (ARN) of the RuleGroup to which you want to attach the policy.
    */
  var ResourceArn: typings.awsSdk.wafregionalMod.ResourceArn = js.native
}

object PutPermissionPolicyRequest {
  @scala.inline
  def apply(Policy: PolicyString, ResourceArn: ResourceArn): PutPermissionPolicyRequest = {
    val __obj = js.Dynamic.literal(Policy = Policy.asInstanceOf[js.Any], ResourceArn = ResourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutPermissionPolicyRequest]
  }
}

