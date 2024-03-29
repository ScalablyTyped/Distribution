package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRateBasedRuleResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the DeleteRateBasedRule request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.clientsWafMod.ChangeToken] = js.undefined
}
object DeleteRateBasedRuleResponse {
  
  inline def apply(): DeleteRateBasedRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteRateBasedRuleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRateBasedRuleResponse] (val x: Self) extends AnyVal {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
  }
}
