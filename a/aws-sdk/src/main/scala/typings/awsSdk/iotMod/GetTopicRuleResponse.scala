package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTopicRuleResponse extends js.Object {
  
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
  implicit class GetTopicRuleResponseOps[Self <: GetTopicRuleResponse] (val x: Self) extends AnyVal {
    
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
    def setRule(value: TopicRule): Self = this.set("rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
    
    @scala.inline
    def setRuleArn(value: RuleArn): Self = this.set("ruleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleArn: Self = this.set("ruleArn", js.undefined)
  }
}
