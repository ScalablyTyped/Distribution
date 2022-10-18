package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutManagedRuleSetVersionsResponse extends StObject {
  
  /**
    * A token used for optimistic locking. WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var NextLockToken: js.UndefOr[LockToken] = js.undefined
}
object PutManagedRuleSetVersionsResponse {
  
  inline def apply(): PutManagedRuleSetVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutManagedRuleSetVersionsResponse]
  }
  
  extension [Self <: PutManagedRuleSetVersionsResponse](x: Self) {
    
    inline def setNextLockToken(value: LockToken): Self = StObject.set(x, "NextLockToken", value.asInstanceOf[js.Any])
    
    inline def setNextLockTokenUndefined: Self = StObject.set(x, "NextLockToken", js.undefined)
  }
}
