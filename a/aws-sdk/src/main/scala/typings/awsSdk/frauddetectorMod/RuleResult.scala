package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleResult extends StObject {
  
  /**
    * The outcomes of the matched rule, based on the rule execution mode.
    */
  var outcomes: js.UndefOr[ListOfStrings] = js.undefined
  
  /**
    * The rule ID that was matched, based on the rule execution mode.
    */
  var ruleId: js.UndefOr[String] = js.undefined
}
object RuleResult {
  
  @scala.inline
  def apply(): RuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleResult]
  }
  
  @scala.inline
  implicit class RuleResultMutableBuilder[Self <: RuleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutcomes(value: ListOfStrings): Self = StObject.set(x, "outcomes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutcomesUndefined: Self = StObject.set(x, "outcomes", js.undefined)
    
    @scala.inline
    def setOutcomesVarargs(value: String*): Self = StObject.set(x, "outcomes", js.Array(value :_*))
    
    @scala.inline
    def setRuleId(value: String): Self = StObject.set(x, "ruleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleIdUndefined: Self = StObject.set(x, "ruleId", js.undefined)
  }
}
