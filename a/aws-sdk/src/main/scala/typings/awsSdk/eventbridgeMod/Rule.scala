package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var Arn: js.UndefOr[RuleArn] = js.undefined
  
  /**
    * The description of the rule.
    */
  var Description: js.UndefOr[RuleDescription] = js.undefined
  
  /**
    * The name or ARN of the event bus associated with the rule. If you omit this, the default event bus is used.
    */
  var EventBusName: js.UndefOr[typings.awsSdk.eventbridgeMod.EventBusName] = js.undefined
  
  /**
    * The event pattern of the rule. For more information, see Events and Event Patterns in the Amazon EventBridge User Guide.
    */
  var EventPattern: js.UndefOr[typings.awsSdk.eventbridgeMod.EventPattern] = js.undefined
  
  /**
    * If the rule was created on behalf of your account by an AWS service, this field displays the principal name of the service that created the rule.
    */
  var ManagedBy: js.UndefOr[typings.awsSdk.eventbridgeMod.ManagedBy] = js.undefined
  
  /**
    * The name of the rule.
    */
  var Name: js.UndefOr[RuleName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role that is used for target invocation.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.eventbridgeMod.RoleArn] = js.undefined
  
  /**
    * The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
    */
  var ScheduleExpression: js.UndefOr[typings.awsSdk.eventbridgeMod.ScheduleExpression] = js.undefined
  
  /**
    * The state of the rule.
    */
  var State: js.UndefOr[RuleState] = js.undefined
}
object Rule {
  
  inline def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  
  extension [Self <: Rule](x: Self) {
    
    inline def setArn(value: RuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setDescription(value: RuleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEventBusName(value: EventBusName): Self = StObject.set(x, "EventBusName", value.asInstanceOf[js.Any])
    
    inline def setEventBusNameUndefined: Self = StObject.set(x, "EventBusName", js.undefined)
    
    inline def setEventPattern(value: EventPattern): Self = StObject.set(x, "EventPattern", value.asInstanceOf[js.Any])
    
    inline def setEventPatternUndefined: Self = StObject.set(x, "EventPattern", js.undefined)
    
    inline def setManagedBy(value: ManagedBy): Self = StObject.set(x, "ManagedBy", value.asInstanceOf[js.Any])
    
    inline def setManagedByUndefined: Self = StObject.set(x, "ManagedBy", js.undefined)
    
    inline def setName(value: RuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setScheduleExpression(value: ScheduleExpression): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
    
    inline def setScheduleExpressionUndefined: Self = StObject.set(x, "ScheduleExpression", js.undefined)
    
    inline def setState(value: RuleState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
