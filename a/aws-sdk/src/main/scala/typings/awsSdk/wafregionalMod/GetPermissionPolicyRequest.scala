package typings.awsSdk.wafregionalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPermissionPolicyRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the RuleGroup for which you want to get the policy.
    */
  var ResourceArn: typings.awsSdk.wafregionalMod.ResourceArn = js.native
}

object GetPermissionPolicyRequest {
  @scala.inline
  def apply(ResourceArn: ResourceArn): GetPermissionPolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetPermissionPolicyRequest]
  }
}

