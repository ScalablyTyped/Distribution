package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateTopicRuleRequest extends StObject {
  
  /**
    * The name of the rule.
    */
  var ruleName: RuleName
  
  /**
    * Metadata which can be used to manage the topic rule.  For URI Request parameters use format: ...key1=value1&amp;key2=value2... For the CLI command-line parameter use format: --tags "key1=value1&amp;key2=value2..." For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..." 
    */
  var tags: js.UndefOr[String] = js.undefined
  
  /**
    * The rule payload.
    */
  var topicRulePayload: TopicRulePayload
}
object CreateTopicRuleRequest {
  
  @scala.inline
  def apply(ruleName: RuleName, topicRulePayload: TopicRulePayload): CreateTopicRuleRequest = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any], topicRulePayload = topicRulePayload.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTopicRuleRequest]
  }
  
  @scala.inline
  implicit class CreateTopicRuleRequestMutableBuilder[Self <: CreateTopicRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleName(value: RuleName): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: String): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTopicRulePayload(value: TopicRulePayload): Self = StObject.set(x, "topicRulePayload", value.asInstanceOf[js.Any])
  }
}
