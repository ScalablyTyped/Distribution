package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRuleRequest extends StObject {
  
  /**
    * The action for the default rule.
    */
  var action: RuleAction
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you retry a request that completed successfully using the same client token and parameters, the retry succeeds without performing any actions. If the parameters aren't identical, the retry fails.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The ID or Amazon Resource Name (ARN) of the listener.
    */
  var listenerIdentifier: ListenerIdentifier
  
  /**
    * The rule match.
    */
  var `match`: RuleMatch
  
  /**
    * The name of the rule. The name must be unique within the listener. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
    */
  var name: RuleName
  
  /**
    * The priority assigned to the rule. Each rule for a specific listener must have a unique priority. The lower the priority number the higher the priority.
    */
  var priority: RulePriority
  
  /**
    * The ID or Amazon Resource Name (ARN) of the service.
    */
  var serviceIdentifier: ServiceIdentifier
  
  /**
    * The tags for the rule.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateRuleRequest {
  
  inline def apply(
    action: RuleAction,
    listenerIdentifier: ListenerIdentifier,
    `match`: RuleMatch,
    name: RuleName,
    priority: RulePriority,
    serviceIdentifier: ServiceIdentifier
  ): CreateRuleRequest = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], listenerIdentifier = listenerIdentifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], serviceIdentifier = serviceIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRuleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRuleRequest] (val x: Self) extends AnyVal {
    
    inline def setAction(value: RuleAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setListenerIdentifier(value: ListenerIdentifier): Self = StObject.set(x, "listenerIdentifier", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: RuleMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setName(value: RuleName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: RulePriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setServiceIdentifier(value: ServiceIdentifier): Self = StObject.set(x, "serviceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
