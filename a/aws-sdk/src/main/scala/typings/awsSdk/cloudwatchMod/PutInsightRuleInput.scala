package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutInsightRuleInput extends js.Object {
  
  /**
    * The definition of the rule, as a JSON object. For details on the valid syntax, see Contributor Insights Rule Syntax.
    */
  var RuleDefinition: InsightRuleDefinition = js.native
  
  /**
    * A unique name for the rule.
    */
  var RuleName: InsightRuleName = js.native
  
  /**
    * The state of the rule. Valid values are ENABLED and DISABLED.
    */
  var RuleState: js.UndefOr[InsightRuleState] = js.native
  
  /**
    * A list of key-value pairs to associate with the Contributor Insights rule. You can associate as many as 50 tags with a rule. Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only the resources that have certain tag values. To be able to associate tags with a rule, you must have the cloudwatch:TagResource permission in addition to the cloudwatch:PutInsightRule permission. If you are using this operation to update an existing Contributor Insights rule, any tags you specify in this parameter are ignored. To change the tags of an existing rule, use TagResource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object PutInsightRuleInput {
  
  @scala.inline
  def apply(RuleDefinition: InsightRuleDefinition, RuleName: InsightRuleName): PutInsightRuleInput = {
    val __obj = js.Dynamic.literal(RuleDefinition = RuleDefinition.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInsightRuleInput]
  }
  
  @scala.inline
  implicit class PutInsightRuleInputOps[Self <: PutInsightRuleInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRuleDefinition(value: InsightRuleDefinition): Self = this.set("RuleDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleName(value: InsightRuleName): Self = this.set("RuleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleState(value: InsightRuleState): Self = this.set("RuleState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuleState: Self = this.set("RuleState", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
