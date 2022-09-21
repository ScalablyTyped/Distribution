package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFirewallManagerRuleGroupsResponse extends StObject {
  
  /**
    * A token used for optimistic locking. WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var NextWebACLLockToken: js.UndefOr[LockToken] = js.undefined
}
object DeleteFirewallManagerRuleGroupsResponse {
  
  inline def apply(): DeleteFirewallManagerRuleGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteFirewallManagerRuleGroupsResponse]
  }
  
  extension [Self <: DeleteFirewallManagerRuleGroupsResponse](x: Self) {
    
    inline def setNextWebACLLockToken(value: LockToken): Self = StObject.set(x, "NextWebACLLockToken", value.asInstanceOf[js.Any])
    
    inline def setNextWebACLLockTokenUndefined: Self = StObject.set(x, "NextWebACLLockToken", js.undefined)
  }
}
