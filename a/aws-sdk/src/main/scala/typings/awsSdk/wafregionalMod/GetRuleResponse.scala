package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRuleResponse extends StObject {
  
  /**
    * Information about the Rule that you specified in the GetRule request. For more information, see the following topics:    Rule: Contains MetricName, Name, an array of Predicate objects, and RuleId     Predicate: Each Predicate object contains DataId, Negated, and Type   
    */
  var Rule: js.UndefOr[typings.awsSdk.wafregionalMod.Rule] = js.undefined
}
object GetRuleResponse {
  
  @scala.inline
  def apply(): GetRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRuleResponse]
  }
  
  @scala.inline
  implicit class GetRuleResponseMutableBuilder[Self <: GetRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: Rule): Self = StObject.set(x, "Rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "Rule", js.undefined)
  }
}
