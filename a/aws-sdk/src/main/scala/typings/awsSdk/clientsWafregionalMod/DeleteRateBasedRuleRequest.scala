package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRateBasedRuleRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.clientsWafregionalMod.ChangeToken
  
  /**
    * The RuleId of the RateBasedRule that you want to delete. RuleId is returned by CreateRateBasedRule and by ListRateBasedRules.
    */
  var RuleId: ResourceId
}
object DeleteRateBasedRuleRequest {
  
  inline def apply(ChangeToken: ChangeToken, RuleId: ResourceId): DeleteRateBasedRuleRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRateBasedRuleRequest]
  }
  
  extension [Self <: DeleteRateBasedRuleRequest](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: ResourceId): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
  }
}
