package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRuleRequest extends StObject {
  
  /**
    * Information about the action for the specified listener rule.
    */
  var action: js.UndefOr[RuleAction] = js.undefined
  
  /**
    * The ID or Amazon Resource Name (ARN) of the listener.
    */
  var listenerIdentifier: ListenerIdentifier
  
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
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service.
    */
  var serviceIdentifier: ServiceIdentifier
}
object UpdateRuleRequest {
  
  inline def apply(
    listenerIdentifier: ListenerIdentifier,
    ruleIdentifier: RuleIdentifier,
    serviceIdentifier: ServiceIdentifier
  ): UpdateRuleRequest = {
    val __obj = js.Dynamic.literal(listenerIdentifier = listenerIdentifier.asInstanceOf[js.Any], ruleIdentifier = ruleIdentifier.asInstanceOf[js.Any], serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setAction(value: RuleAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setListenerIdentifier(value: ListenerIdentifier): Self = StObject.set(x, "listenerIdentifier", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: RuleMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setPriority(value: RulePriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setRuleIdentifier(value: RuleIdentifier): Self = StObject.set(x, "ruleIdentifier", value.asInstanceOf[js.Any])
    
    inline def setServiceIdentifier(value: ServiceIdentifier): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
  }
}
