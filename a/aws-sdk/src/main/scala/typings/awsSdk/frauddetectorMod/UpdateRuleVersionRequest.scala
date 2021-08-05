package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRuleVersionRequest extends StObject {
  
  /**
    * The description.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.undefined
  
  /**
    * The rule expression.
    */
  var expression: ruleExpression
  
  /**
    * The language.
    */
  var language: Language
  
  /**
    * The outcomes.
    */
  var outcomes: NonEmptyListOfStrings
  
  /**
    * The rule to update.
    */
  var rule: Rule
  
  /**
    * The tags to assign to the rule version.
    */
  var tags: js.UndefOr[tagList] = js.undefined
}
object UpdateRuleVersionRequest {
  
  inline def apply(expression: ruleExpression, language: Language, outcomes: NonEmptyListOfStrings, rule: Rule): UpdateRuleVersionRequest = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], outcomes = outcomes.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRuleVersionRequest]
  }
  
  extension [Self <: UpdateRuleVersionRequest](x: Self) {
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpression(value: ruleExpression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setOutcomes(value: NonEmptyListOfStrings): Self = StObject.set(x, "outcomes", value.asInstanceOf[js.Any])
    
    inline def setOutcomesVarargs(value: String*): Self = StObject.set(x, "outcomes", js.Array(value :_*))
    
    inline def setRule(value: Rule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
