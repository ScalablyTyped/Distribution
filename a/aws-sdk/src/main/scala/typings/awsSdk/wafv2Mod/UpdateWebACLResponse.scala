package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWebACLResponse extends StObject {
  
  /**
    * A token used for optimistic locking. AWS WAF returns this token to your update requests. You use NextLockToken in the same manner as you use LockToken. 
    */
  var NextLockToken: js.UndefOr[LockToken] = js.undefined
}
object UpdateWebACLResponse {
  
  inline def apply(): UpdateWebACLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateWebACLResponse]
  }
  
  extension [Self <: UpdateWebACLResponse](x: Self) {
    
    inline def setNextLockToken(value: LockToken): Self = StObject.set(x, "NextLockToken", value.asInstanceOf[js.Any])
    
    inline def setNextLockTokenUndefined: Self = StObject.set(x, "NextLockToken", js.undefined)
  }
}
