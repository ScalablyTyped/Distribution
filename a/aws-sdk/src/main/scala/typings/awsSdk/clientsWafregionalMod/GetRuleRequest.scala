package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRuleRequest extends StObject {
  
  /**
    * The RuleId of the Rule that you want to get. RuleId is returned by CreateRule and by ListRules.
    */
  var RuleId: ResourceId
}
object GetRuleRequest {
  
  inline def apply(RuleId: ResourceId): GetRuleRequest = {
    val __obj = js.Dynamic.literal(RuleId = RuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRuleRequest]
  }
  
  extension [Self <: GetRuleRequest](x: Self) {
    
    inline def setRuleId(value: ResourceId): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
  }
}
