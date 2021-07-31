package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIPSetResponse extends StObject {
  
  /**
    * A token used for optimistic locking. AWS WAF returns this token to your update requests. You use NextLockToken in the same manner as you use LockToken. 
    */
  var NextLockToken: js.UndefOr[LockToken] = js.undefined
}
object UpdateIPSetResponse {
  
  @scala.inline
  def apply(): UpdateIPSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateIPSetResponse]
  }
  
  @scala.inline
  implicit class UpdateIPSetResponseMutableBuilder[Self <: UpdateIPSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextLockToken(value: LockToken): Self = StObject.set(x, "NextLockToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextLockTokenUndefined: Self = StObject.set(x, "NextLockToken", js.undefined)
  }
}
