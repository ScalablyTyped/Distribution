package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RuleDetail extends StObject {
  
  /**
    * The rule ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.native
  
  /**
    * The timestamp of when the rule was created.
    */
  var createdTime: js.UndefOr[time] = js.native
  
  /**
    * The rule description.
    */
  var description: js.UndefOr[typings.awsSdk.frauddetectorMod.description] = js.native
  
  /**
    * The detector for which the rule is associated.
    */
  var detectorId: js.UndefOr[identifier] = js.native
  
  /**
    * The rule expression.
    */
  var expression: js.UndefOr[ruleExpression] = js.native
  
  /**
    * The rule language.
    */
  var language: js.UndefOr[Language] = js.native
  
  /**
    * Timestamp of the last time the rule was updated.
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  
  /**
    * The rule outcomes.
    */
  var outcomes: js.UndefOr[NonEmptyListOfStrings] = js.native
  
  /**
    * The rule ID.
    */
  var ruleId: js.UndefOr[identifier] = js.native
  
  /**
    * The rule version.
    */
  var ruleVersion: js.UndefOr[wholeNumberVersionString] = js.native
}
object RuleDetail {
  
  @scala.inline
  def apply(): RuleDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleDetail]
  }
  
  @scala.inline
  implicit class RuleDetailMutableBuilder[Self <: RuleDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: time): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    @scala.inline
    def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
    
    @scala.inline
    def setExpression(value: ruleExpression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setLanguage(value: Language): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLastUpdatedTime(value: time): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    @scala.inline
    def setOutcomes(value: NonEmptyListOfStrings): Self = StObject.set(x, "outcomes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomesUndefined: Self = StObject.set(x, "outcomes", js.undefined)
    
    @scala.inline
    def setOutcomesVarargs(value: String*): Self = StObject.set(x, "outcomes", js.Array(value :_*))
    
    @scala.inline
    def setRuleId(value: identifier): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
    
    @scala.inline
    def setRuleVersion(value: wholeNumberVersionString): Self = StObject.set(x, "ruleVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleVersionUndefined: Self = StObject.set(x, "ruleVersion", js.undefined)
  }
}
