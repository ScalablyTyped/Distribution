package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFirewallManagerRuleGroupsResponse extends StObject {
  
  /**
    * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var NextWebACLLockToken: js.UndefOr[LockToken] = js.undefined
}
object DeleteFirewallManagerRuleGroupsResponse {
  
  @scala.inline
  def apply(): DeleteFirewallManagerRuleGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFirewallManagerRuleGroupsResponse]
  }
  
  @scala.inline
  implicit class DeleteFirewallManagerRuleGroupsResponseMutableBuilder[Self <: DeleteFirewallManagerRuleGroupsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextWebACLLockToken(value: LockToken): Self = StObject.set(x, "NextWebACLLockToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextWebACLLockTokenUndefined: Self = StObject.set(x, "NextWebACLLockToken", js.undefined)
  }
}
