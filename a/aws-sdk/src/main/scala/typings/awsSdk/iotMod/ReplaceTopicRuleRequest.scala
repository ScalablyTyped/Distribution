package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplaceTopicRuleRequest extends js.Object {
  
  /**
    * The name of the rule.
    */
  var ruleName: RuleName = js.native
  
  /**
    * The rule payload.
    */
  var topicRulePayload: TopicRulePayload = js.native
}
object ReplaceTopicRuleRequest {
  
  @scala.inline
  def apply(ruleName: RuleName, topicRulePayload: TopicRulePayload): ReplaceTopicRuleRequest = {
    val __obj = js.Dynamic.literal(ruleName = ruleName.asInstanceOf[js.Any], topicRulePayload = topicRulePayload.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceTopicRuleRequest]
  }
  
  @scala.inline
  implicit class ReplaceTopicRuleRequestOps[Self <: ReplaceTopicRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRuleName(value: RuleName): Self = this.set("ruleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopicRulePayload(value: TopicRulePayload): Self = this.set("topicRulePayload", value.asInstanceOf[js.Any])
  }
}
