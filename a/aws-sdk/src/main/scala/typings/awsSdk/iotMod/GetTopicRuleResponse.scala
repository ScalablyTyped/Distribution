package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTopicRuleResponse extends StObject {
  
  /**
    * The rule.
    */
  var rule: js.UndefOr[TopicRule] = js.undefined
  
  /**
    * The rule ARN.
    */
  var ruleArn: js.UndefOr[RuleArn] = js.undefined
}
object GetTopicRuleResponse {
  
  inline def apply(): GetTopicRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTopicRuleResponse]
  }
  
  extension [Self <: GetTopicRuleResponse](x: Self) {
    
    inline def setRule(value: TopicRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleArn(value: RuleArn): Self = StObject.set(x, "ruleArn", value.asInstanceOf[js.Any])
    
    inline def setRuleArnUndefined: Self = StObject.set(x, "ruleArn", js.undefined)
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
