package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutInsightRuleInput extends StObject {
  
  /**
    * The definition of the rule, as a JSON object. For details on the valid syntax, see Contributor Insights Rule Syntax.
    */
  var RuleDefinition: InsightRuleDefinition
  
  /**
    * A unique name for the rule.
    */
  var RuleName: InsightRuleName
  
  /**
    * The state of the rule. Valid values are ENABLED and DISABLED.
    */
  var RuleState: js.UndefOr[InsightRuleState] = js.undefined
  
  /**
    * A list of key-value pairs to associate with the Contributor Insights rule. You can associate as many as 50 tags with a rule. Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only the resources that have certain tag values. To be able to associate tags with a rule, you must have the cloudwatch:TagResource permission in addition to the cloudwatch:PutInsightRule permission. If you are using this operation to update an existing Contributor Insights rule, any tags you specify in this parameter are ignored. To change the tags of an existing rule, use TagResource.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object PutInsightRuleInput {
  
  inline def apply(RuleDefinition: InsightRuleDefinition, RuleName: InsightRuleName): PutInsightRuleInput = {
    val __obj = js.Dynamic.literal(RuleDefinition = RuleDefinition.asInstanceOf[js.Any], RuleName = RuleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutInsightRuleInput]
  }
  
  extension [Self <: PutInsightRuleInput](x: Self) {
    
    inline def setRuleDefinition(value: InsightRuleDefinition): Self = StObject.set(x, "RuleDefinition", value.asInstanceOf[js.Any])
    
    inline def setRuleName(value: InsightRuleName): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    inline def setRuleState(value: InsightRuleState): Self = StObject.set(x, "RuleState", value.asInstanceOf[js.Any])
    
    inline def setRuleStateUndefined: Self = StObject.set(x, "RuleState", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
