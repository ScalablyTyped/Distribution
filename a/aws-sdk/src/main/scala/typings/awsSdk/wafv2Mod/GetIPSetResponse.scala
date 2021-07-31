package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIPSetResponse extends StObject {
  
  /**
    * 
    */
  var IPSet: js.UndefOr[typings.awsSdk.wafv2Mod.IPSet] = js.undefined
  
  /**
    * A token used for optimistic locking. AWS WAF returns a token to your get and list requests, to mark the state of the entity at the time of the request. To make changes to the entity associated with the token, you provide the token to operations like update and delete. AWS WAF uses the token to ensure that no changes have been made to the entity since you last retrieved it. If a change has been made, the update fails with a WAFOptimisticLockException. If this happens, perform another get, and use the new token returned by that operation. 
    */
  var LockToken: js.UndefOr[typings.awsSdk.wafv2Mod.LockToken] = js.undefined
}
object GetIPSetResponse {
  
  @scala.inline
  def apply(): GetIPSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIPSetResponse]
  }
  
  @scala.inline
  implicit class GetIPSetResponseMutableBuilder[Self <: GetIPSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIPSet(value: IPSet): Self = StObject.set(x, "IPSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPSetUndefined: Self = StObject.set(x, "IPSet", js.undefined)
    
    @scala.inline
    def setLockToken(value: LockToken): Self = StObject.set(x, "LockToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockTokenUndefined: Self = StObject.set(x, "LockToken", js.undefined)
  }
}
