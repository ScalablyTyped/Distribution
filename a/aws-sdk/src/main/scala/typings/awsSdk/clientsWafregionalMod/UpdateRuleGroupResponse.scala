package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRuleGroupResponse extends StObject {
  
  /**
    * The ChangeToken that you used to submit the UpdateRuleGroup request. You can also use this value to query the status of the request. For more information, see GetChangeTokenStatus.
    */
  var ChangeToken: js.UndefOr[typings.awsSdk.clientsWafregionalMod.ChangeToken] = js.undefined
}
object UpdateRuleGroupResponse {
  
  inline def apply(): UpdateRuleGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRuleGroupResponse]
  }
  
  extension [Self <: UpdateRuleGroupResponse](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setChangeTokenUndefined: Self = StObject.set(x, "ChangeToken", js.undefined)
  }
}
