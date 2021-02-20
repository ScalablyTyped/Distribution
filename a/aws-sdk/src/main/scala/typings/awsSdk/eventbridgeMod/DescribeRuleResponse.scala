package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeRuleResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the rule.
    */
  var Arn: js.UndefOr[RuleArn] = js.native
  
  /**
    * The account ID of the user that created the rule. If you use PutRule to put a rule on an event bus in another account, the other account is the owner of the rule, and the rule ARN includes the account ID for that account. However, the value for CreatedBy is the account ID as the account that created the rule in the other account.
    */
  var CreatedBy: js.UndefOr[typings.awsSdk.eventbridgeMod.CreatedBy] = js.native
  
  /**
    * The description of the rule.
    */
  var Description: js.UndefOr[RuleDescription] = js.native
  
  /**
    * The name of the event bus associated with the rule.
    */
  var EventBusName: js.UndefOr[typings.awsSdk.eventbridgeMod.EventBusName] = js.native
  
  /**
    * The event pattern. For more information, see Events and Event Patterns in the Amazon EventBridge User Guide.
    */
  var EventPattern: js.UndefOr[typings.awsSdk.eventbridgeMod.EventPattern] = js.native
  
  /**
    * If this is a managed rule, created by an AWS service on your behalf, this field displays the principal name of the AWS service that created the rule.
    */
  var ManagedBy: js.UndefOr[typings.awsSdk.eventbridgeMod.ManagedBy] = js.native
  
  /**
    * The name of the rule.
    */
  var Name: js.UndefOr[RuleName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role associated with the rule.
    */
  var RoleArn: js.UndefOr[typings.awsSdk.eventbridgeMod.RoleArn] = js.native
  
  /**
    * The scheduling expression. For example, "cron(0 20 * * ? *)", "rate(5 minutes)".
    */
  var ScheduleExpression: js.UndefOr[typings.awsSdk.eventbridgeMod.ScheduleExpression] = js.native
  
  /**
    * Specifies whether the rule is enabled or disabled.
    */
  var State: js.UndefOr[RuleState] = js.native
}
object DescribeRuleResponse {
  
  @scala.inline
  def apply(): DescribeRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRuleResponse]
  }
  
  @scala.inline
  implicit class DescribeRuleResponseMutableBuilder[Self <: DescribeRuleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: RuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCreatedBy(value: CreatedBy): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setDescription(value: RuleDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEventBusName(value: EventBusName): Self = StObject.set(x, "EventBusName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventBusNameUndefined: Self = StObject.set(x, "EventBusName", js.undefined)
    
    @scala.inline
    def setEventPattern(value: EventPattern): Self = StObject.set(x, "EventPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPatternUndefined: Self = StObject.set(x, "EventPattern", js.undefined)
    
    @scala.inline
    def setManagedBy(value: ManagedBy): Self = StObject.set(x, "ManagedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedByUndefined: Self = StObject.set(x, "ManagedBy", js.undefined)
    
    @scala.inline
    def setName(value: RuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setRoleArn(value: RoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    @scala.inline
    def setScheduleExpression(value: ScheduleExpression): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleExpressionUndefined: Self = StObject.set(x, "ScheduleExpression", js.undefined)
    
    @scala.inline
    def setState(value: RuleState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
