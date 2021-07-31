package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRateBasedRuleRequest extends StObject {
  
  /**
    * The RuleId of the RateBasedRule that you want to get. RuleId is returned by CreateRateBasedRule and by ListRateBasedRules.
    */
  var RuleId: ResourceId
}
object GetRateBasedRuleRequest {
  
  @scala.inline
  def apply(RuleId: ResourceId): GetRateBasedRuleRequest = {
    val __obj = js.Dynamic.literal(RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRateBasedRuleRequest]
  }
  
  @scala.inline
  implicit class GetRateBasedRuleRequestMutableBuilder[Self <: GetRateBasedRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleId(value: ResourceId): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
  }
}
