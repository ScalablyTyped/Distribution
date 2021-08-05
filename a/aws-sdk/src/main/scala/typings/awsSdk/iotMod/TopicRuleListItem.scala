package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleListItem extends StObject {
  
  /**
    * The date and time the rule was created.
    */
  var createdAt: js.UndefOr[CreatedAtDate] = js.undefined
  
  /**
    * The rule ARN.
    */
  var ruleArn: js.UndefOr[RuleArn] = js.undefined
  
  /**
    * Specifies whether the rule is disabled.
    */
  var ruleDisabled: js.UndefOr[IsDisabled] = js.undefined
  
  /**
    * The name of the rule.
    */
  var ruleName: js.UndefOr[RuleName] = js.undefined
  
  /**
    * The pattern for the topic names that apply.
    */
  var topicPattern: js.UndefOr[TopicPattern] = js.undefined
}
object TopicRuleListItem {
  
  inline def apply(): TopicRuleListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicRuleListItem]
  }
  
  extension [Self <: TopicRuleListItem](x: Self) {
    
    inline def setCreatedAt(value: CreatedAtDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setRuleArn(value: RuleArn): Self = StObject.set(x, "ruleArn", value.asInstanceOf[js.Any])
    
    inline def setRuleArnUndefined: Self = StObject.set(x, "ruleArn", js.undefined)
    
    inline def setRuleDisabled(value: IsDisabled): Self = StObject.set(x, "ruleDisabled", value.asInstanceOf[js.Any])
    
    inline def setRuleDisabledUndefined: Self = StObject.set(x, "ruleDisabled", js.undefined)
    
    inline def setRuleName(value: RuleName): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    
    inline def setRuleNameUndefined: Self = StObject.set(x, "ruleName", js.undefined)
    
    inline def setTopicPattern(value: TopicPattern): Self = StObject.set(x, "topicPattern", value.asInstanceOf[js.Any])
    
    inline def setTopicPatternUndefined: Self = StObject.set(x, "topicPattern", js.undefined)
  }
}
