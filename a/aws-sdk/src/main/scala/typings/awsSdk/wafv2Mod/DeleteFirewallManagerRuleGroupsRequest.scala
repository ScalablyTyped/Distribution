package typings.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteFirewallManagerRuleGroupsRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the web ACL.
    */
  var WebACLArn: ResourceArn = js.native
  
  /**
    * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var WebACLLockToken: LockToken = js.native
}
object DeleteFirewallManagerRuleGroupsRequest {
  
  @scala.inline
  def apply(WebACLArn: ResourceArn, WebACLLockToken: LockToken): DeleteFirewallManagerRuleGroupsRequest = {
    val __obj = js.Dynamic.literal(WebACLArn = WebACLArn.asInstanceOf[js.Any], WebACLLockToken = WebACLLockToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFirewallManagerRuleGroupsRequest]
  }
  
  @scala.inline
  implicit class DeleteFirewallManagerRuleGroupsRequestOps[Self <: DeleteFirewallManagerRuleGroupsRequest] (val x: Self) extends AnyVal {
    
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
    def setWebACLArn(value: ResourceArn): Self = this.set("WebACLArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebACLLockToken(value: LockToken): Self = this.set("WebACLLockToken", value.asInstanceOf[js.Any])
  }
}
