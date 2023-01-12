package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetManagedRuleSetResponse extends StObject {
  
  /**
    * A token used for optimistic locking. WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var LockToken: js.UndefOr[typings.awsSdk.clientsWafv2Mod.LockToken] = js.undefined
  
  /**
    * The managed rule set that you requested. 
    */
  var ManagedRuleSet: js.UndefOr[typings.awsSdk.clientsWafv2Mod.ManagedRuleSet] = js.undefined
}
object GetManagedRuleSetResponse {
  
  inline def apply(): GetManagedRuleSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetManagedRuleSetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetManagedRuleSetResponse] (val x: Self) extends AnyVal {
    
    inline def setLockToken(value: LockToken): Self = StObject.set(x, "LockToken", value.asInstanceOf[js.Any])
    
    inline def setLockTokenUndefined: Self = StObject.set(x, "LockToken", js.undefined)
    
    inline def setManagedRuleSet(value: ManagedRuleSet): Self = StObject.set(x, "ManagedRuleSet", value.asInstanceOf[js.Any])
    
    inline def setManagedRuleSetUndefined: Self = StObject.set(x, "ManagedRuleSet", js.undefined)
  }
}
