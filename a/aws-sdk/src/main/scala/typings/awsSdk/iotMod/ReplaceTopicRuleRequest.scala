package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReplaceTopicRuleRequest extends StObject {
  
  /**
    * The name of the rule.
    */
  var ruleName: RuleName
  
  /**
    * The rule payload.
    */
  var topicRulePayload: TopicRulePayload
}
object ReplaceTopicRuleRequest {
  
  @scala.inline
  def apply(ruleName: RuleName, topicRulePayload: TopicRulePayload): ReplaceTopicRuleRequest = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any], topicRulePayload = topicRulePayload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceTopicRuleRequest]
  }
  
  @scala.inline
  implicit class ReplaceTopicRuleRequestMutableBuilder[Self <: ReplaceTopicRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleName(value: RuleName): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicRulePayload(value: TopicRulePayload): Self = StObject.set(x, "topicRulePayload", value.asInstanceOf[js.Any])
  }
}
