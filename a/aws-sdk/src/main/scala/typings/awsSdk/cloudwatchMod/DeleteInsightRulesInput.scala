package typings.awsSdk.cloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteInsightRulesInput extends StObject {
  
  /**
    * An array of the rule names to delete. If you need to find out the names of your rules, use DescribeInsightRules.
    */
  var RuleNames: InsightRuleNames = js.native
}
object DeleteInsightRulesInput {
  
  @scala.inline
  def apply(RuleNames: InsightRuleNames): DeleteInsightRulesInput = {
    val __obj = js.Dynamic.literal(RuleNames = RuleNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInsightRulesInput]
  }
  
  @scala.inline
  implicit class DeleteInsightRulesInputMutableBuilder[Self <: DeleteInsightRulesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRuleNames(value: InsightRuleNames): Self = StObject.set(x, "RuleNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleNamesVarargs(value: InsightRuleName*): Self = StObject.set(x, "RuleNames", js.Array(value :_*))
  }
}
