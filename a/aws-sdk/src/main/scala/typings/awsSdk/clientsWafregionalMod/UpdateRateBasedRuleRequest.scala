package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRateBasedRuleRequest extends StObject {
  
  /**
    * The value returned by the most recent call to GetChangeToken.
    */
  var ChangeToken: typings.awsSdk.clientsWafregionalMod.ChangeToken
  
  /**
    * The maximum number of requests, which have an identical value in the field specified by the RateKey, allowed in a five-minute period. If the number of requests exceeds the RateLimit and the other predicates specified in the rule are also met, AWS WAF triggers the action that is specified for this rule.
    */
  var RateLimit: typings.awsSdk.clientsWafregionalMod.RateLimit
  
  /**
    * The RuleId of the RateBasedRule that you want to update. RuleId is returned by CreateRateBasedRule and by ListRateBasedRules.
    */
  var RuleId: ResourceId
  
  /**
    * An array of RuleUpdate objects that you want to insert into or delete from a RateBasedRule. 
    */
  var Updates: RuleUpdates
}
object UpdateRateBasedRuleRequest {
  
  inline def apply(ChangeToken: ChangeToken, RateLimit: RateLimit, RuleId: ResourceId, Updates: RuleUpdates): UpdateRateBasedRuleRequest = {
    val __obj = js.Dynamic.literal(ChangeToken = ChangeToken.asInstanceOf[js.Any], RateLimit = RateLimit.asInstanceOf[js.Any], RuleId = RuleId.asInstanceOf[js.Any], Updates = Updates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRateBasedRuleRequest]
  }
  
  extension [Self <: UpdateRateBasedRuleRequest](x: Self) {
    
    inline def setChangeToken(value: ChangeToken): Self = StObject.set(x, "ChangeToken", value.asInstanceOf[js.Any])
    
    inline def setRateLimit(value: RateLimit): Self = StObject.set(x, "RateLimit", value.asInstanceOf[js.Any])
    
    inline def setRuleId(value: ResourceId): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
    
    inline def setUpdates(value: RuleUpdates): Self = StObject.set(x, "Updates", value.asInstanceOf[js.Any])
    
    inline def setUpdatesVarargs(value: RuleUpdate*): Self = StObject.set(x, "Updates", js.Array(value*))
  }
}
