package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulePriorityPair extends StObject {
  
  /**
    * The rule priority.
    */
  var Priority: js.UndefOr[RulePriority] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var RuleArn: js.UndefOr[typings.awsSdk.elbv2Mod.RuleArn] = js.undefined
}
object RulePriorityPair {
  
  inline def apply(): RulePriorityPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RulePriorityPair]
  }
  
  extension [Self <: RulePriorityPair](x: Self) {
    
    inline def setPriority(value: RulePriority): Self = StObject.set(x, "Priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "Priority", js.undefined)
    
    inline def setRuleArn(value: RuleArn): Self = StObject.set(x, "RuleArn", value.asInstanceOf[js.Any])
    
    inline def setRuleArnUndefined: Self = StObject.set(x, "RuleArn", js.undefined)
  }
}
