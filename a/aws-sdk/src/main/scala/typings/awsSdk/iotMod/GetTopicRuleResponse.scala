package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTopicRuleResponse extends StObject {
  
  /**
    * The rule.
    */
  var rule: js.UndefOr[TopicRule] = js.native
  
  /**
    * The rule ARN.
    */
  var ruleArn: js.UndefOr[RuleArn] = js.native
}
object GetTopicRuleResponse {
  
  @scala.inline
  def apply(): GetTopicRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetTopicRuleResponse]
  }
  
  @scala.inline
  implicit class GetTopicRuleResponseMutableBuilder[Self <: GetTopicRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRule(value: TopicRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleArn(value: RuleArn): Self = StObject.set(x, "ruleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleArnUndefined: Self = StObject.set(x, "ruleArn", js.undefined)
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
  }
}
