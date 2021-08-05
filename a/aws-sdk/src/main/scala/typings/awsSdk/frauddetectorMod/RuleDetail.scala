package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleDetail extends StObject {
  
  /**
    * The rule ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.undefined
  
  /**
    * The timestamp of when the rule was created.
    */
  var createdTime: js.UndefOr[time] = js.undefined
  
  /**
    * The rule description.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.undefined
  
  /**
    * The detector for which the rule is associated.
    */
  var detectorId: js.UndefOr[identifier] = js.undefined
  
  /**
    * The rule expression.
    */
  var expression: js.UndefOr[ruleExpression] = js.undefined
  
  /**
    * The rule language.
    */
  var language: js.UndefOr[Language] = js.undefined
  
  /**
    * Timestamp of the last time the rule was updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.undefined
  
  /**
    * The rule outcomes.
    */
  var outcomes: js.UndefOr[NonEmptyListOfStrings] = js.undefined
  
  /**
    * The rule ID.
    */
  var ruleId: js.UndefOr[identifier] = js.undefined
  
  /**
    * The rule version.
    */
  var ruleVersion: js.UndefOr[wholeNumberVersionString] = js.undefined
}
object RuleDetail {
  
  inline def apply(): RuleDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleDetail]
  }
  
  extension [Self <: RuleDetail](x: Self) {
    
    inline def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedTime(value: time): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    inline def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    inline def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
    
    inline def setExpression(value: ruleExpression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLastUpdatedTime(value: time): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    inline def setOutcomes(value: NonEmptyListOfStrings): Self = StObject.set(x, "outcomes", value.asInstanceOf[js.Any])
    
    inline def setOutcomesUndefined: Self = StObject.set(x, "outcomes", js.undefined)
    
    inline def setOutcomesVarargs(value: String*): Self = StObject.set(x, "outcomes", js.Array(value :_*))
    
    inline def setRuleId(value: identifier): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
    
    inline def setRuleVersion(value: wholeNumberVersionString): Self = StObject.set(x, "ruleVersion", value.asInstanceOf[js.Any])
    
    inline def setRuleVersionUndefined: Self = StObject.set(x, "ruleVersion", js.undefined)
  }
}
