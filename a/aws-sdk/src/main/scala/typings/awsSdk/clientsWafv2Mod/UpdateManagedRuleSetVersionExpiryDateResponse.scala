package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateManagedRuleSetVersionExpiryDateResponse extends StObject {
  
  /**
    * The version that is set to expire. 
    */
  var ExpiringVersion: js.UndefOr[VersionKeyString] = js.undefined
  
  /**
    * The time that the version will expire.  Times are in Coordinated Universal Time (UTC) format. UTC format includes the special designator, Z. For example, "2016-09-27T14:50Z". 
    */
  var ExpiryTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A token used for optimistic locking. WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var NextLockToken: js.UndefOr[LockToken] = js.undefined
}
object UpdateManagedRuleSetVersionExpiryDateResponse {
  
  inline def apply(): UpdateManagedRuleSetVersionExpiryDateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateManagedRuleSetVersionExpiryDateResponse]
  }
  
  extension [Self <: UpdateManagedRuleSetVersionExpiryDateResponse](x: Self) {
    
    inline def setExpiringVersion(value: VersionKeyString): Self = StObject.set(x, "ExpiringVersion", value.asInstanceOf[js.Any])
    
    inline def setExpiringVersionUndefined: Self = StObject.set(x, "ExpiringVersion", js.undefined)
    
    inline def setExpiryTimestamp(value: js.Date): Self = StObject.set(x, "ExpiryTimestamp", value.asInstanceOf[js.Any])
    
    inline def setExpiryTimestampUndefined: Self = StObject.set(x, "ExpiryTimestamp", js.undefined)
    
    inline def setNextLockToken(value: LockToken): Self = StObject.set(x, "NextLockToken", value.asInstanceOf[js.Any])
    
    inline def setNextLockTokenUndefined: Self = StObject.set(x, "NextLockToken", js.undefined)
  }
}
