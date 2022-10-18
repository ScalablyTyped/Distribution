package typings.awsSdk.clientsWafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRuleResponse extends StObject {
  
  /**
    * Information about the Rule that you specified in the GetRule request. For more information, see the following topics:    Rule: Contains MetricName, Name, an array of Predicate objects, and RuleId     Predicate: Each Predicate object contains DataId, Negated, and Type   
    */
  var Rule: js.UndefOr[typings.awsSdk.clientsWafMod.Rule] = js.undefined
}
object GetRuleResponse {
  
  inline def apply(): GetRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRuleResponse]
  }
  
  extension [Self <: GetRuleResponse](x: Self) {
    
    inline def setRule(value: Rule): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "Rule", js.undefined)
  }
}
