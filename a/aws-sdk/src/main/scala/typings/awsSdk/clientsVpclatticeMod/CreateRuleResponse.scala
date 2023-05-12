package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRuleResponse extends StObject {
  
  /**
    * The rule action. Each rule must include exactly one of the following types of actions: forward or fixed-response, and it must be the last action to be performed.
    */
  var action: js.UndefOr[RuleAction] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var arn: js.UndefOr[RuleArn] = js.undefined
  
  /**
    * The ID of the rule.
    */
  var id: js.UndefOr[RuleId] = js.undefined
  
  /**
    * The rule match. The RuleMatch must be an HttpMatch. This means that the rule should be an exact match on HTTP constraints which are made up of the HTTP method, path, and header.
    */
  var `match`: js.UndefOr[RuleMatch] = js.undefined
  
  /**
    * The name of the rule.
    */
  var name: js.UndefOr[RuleName] = js.undefined
  
  /**
    * The priority assigned to the rule. The lower the priority number the higher the priority.
    */
  var priority: js.UndefOr[RulePriority] = js.undefined
}
object CreateRuleResponse {
  
  inline def apply(): CreateRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateRuleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateRuleResponse] (val x: Self) extends AnyVal {
    
    inline def setAction(value: RuleAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setArn(value: RuleArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setId(value: RuleId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMatch(value: RuleMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setName(value: RuleName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPriority(value: RulePriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
