package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRuleResponse extends StObject {
  
  /**
    * Information about the action for the specified listener rule.
    */
  var action: js.UndefOr[RuleAction] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var arn: js.UndefOr[RuleArn] = js.undefined
  
  /**
    * The ID of the listener.
    */
  var id: js.UndefOr[RuleId] = js.undefined
  
  /**
    * Indicates whether this is the default rule.
    */
  var isDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The rule match.
    */
  var `match`: js.UndefOr[RuleMatch] = js.undefined
  
  /**
    * The name of the listener.
    */
  var name: js.UndefOr[RuleName] = js.undefined
  
  /**
    * The rule priority.
    */
  var priority: js.UndefOr[RulePriority] = js.undefined
}
object UpdateRuleResponse {
  
  inline def apply(): UpdateRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRuleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRuleResponse] (val x: Self) extends AnyVal {
    
    inline def setAction(value: RuleAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setArn(value: RuleArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setId(value: RuleId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
    
    inline def setMatch(value: RuleMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setName(value: RuleName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPriority(value: RulePriority): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
