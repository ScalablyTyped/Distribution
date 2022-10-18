package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFirewallManagerRuleGroupsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the web ACL.
    */
  var WebACLArn: ResourceArn
  
  /**
    * A token used for optimistic locking. WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var WebACLLockToken: LockToken
}
object DeleteFirewallManagerRuleGroupsRequest {
  
  inline def apply(WebACLArn: ResourceArn, WebACLLockToken: LockToken): DeleteFirewallManagerRuleGroupsRequest = {
    val __obj = js.Dynamic.literal(WebACLArn = WebACLArn.asInstanceOf[js.Any], WebACLLockToken = WebACLLockToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFirewallManagerRuleGroupsRequest]
  }
  
  extension [Self <: DeleteFirewallManagerRuleGroupsRequest](x: Self) {
    
    inline def setWebACLArn(value: ResourceArn): Self = StObject.set(x, "WebACLArn", value.asInstanceOf[js.Any])
    
    inline def setWebACLLockToken(value: LockToken): Self = StObject.set(x, "WebACLLockToken", value.asInstanceOf[js.Any])
  }
}
