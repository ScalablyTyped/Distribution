package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleUpdate extends StObject {
  
  /**
    * The rule action.
    */
  var action: js.UndefOr[RuleAction] = js.undefined
  
  /**
    * The rule match.
    */
  var `match`: js.UndefOr[RuleMatch] = js.undefined
  
  /**
    * The rule priority. A listener can't have multiple rules with the same priority.
    */
  var priority: js.UndefOr[RulePriority] = js.undefined
  
  /**
    * The ID or Amazon Resource Name (ARN) of the rule.
    */
  var ruleIdentifier: RuleIdentifier
}
object RuleUpdate {
  
  inline def apply(ruleIdentifier: RuleIdentifier): RuleUpdate = {
    val __obj = js.Dynamic.literal(ruleIdentifier = ruleIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleUpdate] (val x: Self) extends AnyVal {
    
    inline def setAction(value: RuleAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setMatch(value: RuleMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setPriority(value: RulePriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRuleIdentifier(value: RuleIdentifier): Self = StObject.set(x, "ruleIdentifier", value.asInstanceOf[js.Any])
  }
}
