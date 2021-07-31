package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleGroupReferenceStatement extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the entity.
    */
  var ARN: ResourceArn
  
  /**
    * The names of rules that are in the referenced rule group, but that you want AWS WAF to exclude from processing for this rule statement. 
    */
  var ExcludedRules: js.UndefOr[typings.awsSdk.wafv2Mod.ExcludedRules] = js.undefined
}
object RuleGroupReferenceStatement {
  
  @scala.inline
  def apply(ARN: ResourceArn): RuleGroupReferenceStatement = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleGroupReferenceStatement]
  }
  
  @scala.inline
  implicit class RuleGroupReferenceStatementMutableBuilder[Self <: RuleGroupReferenceStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: ResourceArn): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedRules(value: ExcludedRules): Self = StObject.set(x, "ExcludedRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludedRulesUndefined: Self = StObject.set(x, "ExcludedRules", js.undefined)
    
    @scala.inline
    def setExcludedRulesVarargs(value: ExcludedRule*): Self = StObject.set(x, "ExcludedRules", js.Array(value :_*))
  }
}
