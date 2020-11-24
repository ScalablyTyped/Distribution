package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InsightRule extends js.Object {
  
  /**
    * The definition of the rule, as a JSON object. The definition contains the keywords used to define contributors, the value to aggregate on if this rule returns a sum instead of a count, and the filters. For details on the valid syntax, see Contributor Insights Rule Syntax.
    */
  var Definition: InsightRuleDefinition = js.native
  
  /**
    * The name of the rule.
    */
  var Name: InsightRuleName = js.native
  
  /**
    * For rules that you create, this is always {"Name": "CloudWatchLogRule", "Version": 1}. For built-in rules, this is {"Name": "ServiceLogRule", "Version": 1} 
    */
  var Schema: InsightRuleSchema = js.native
  
  /**
    * Indicates whether the rule is enabled or disabled.
    */
  var State: InsightRuleState = js.native
}
object InsightRule {
  
  @scala.inline
  def apply(
    Definition: InsightRuleDefinition,
    Name: InsightRuleName,
    Schema: InsightRuleSchema,
    State: InsightRuleState
  ): InsightRule = {
    val __obj = js.Dynamic.literal(Definition = Definition.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Schema = Schema.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsightRule]
  }
  
  @scala.inline
  implicit class InsightRuleOps[Self <: InsightRule] (val x: Self) extends AnyVal {
    
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
    def setDefinition(value: InsightRuleDefinition): Self = this.set("Definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: InsightRuleName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: InsightRuleSchema): Self = this.set("Schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: InsightRuleState): Self = this.set("State", value.asInstanceOf[js.Any])
  }
}
