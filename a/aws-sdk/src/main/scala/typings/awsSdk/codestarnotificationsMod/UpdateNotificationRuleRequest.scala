package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateNotificationRuleRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notification rule.
    */
  var Arn: NotificationRuleArn = js.native
  
  /**
    * The level of detail to include in the notifications for this resource. BASIC will include only the contents of the event as it would appear in AWS CloudWatch. FULL will include any supplemental information provided by AWS CodeStar Notifications and/or the service for the resource for which the notification is created.
    */
  var DetailType: js.UndefOr[typings.awsSdk.codestarnotificationsMod.DetailType] = js.native
  
  /**
    * A list of event types associated with this notification rule.
    */
  var EventTypeIds: js.UndefOr[typings.awsSdk.codestarnotificationsMod.EventTypeIds] = js.native
  
  /**
    * The name of the notification rule.
    */
  var Name: js.UndefOr[NotificationRuleName] = js.native
  
  /**
    * The status of the notification rule. Valid statuses include enabled (sending notifications) or disabled (not sending notifications).
    */
  var Status: js.UndefOr[NotificationRuleStatus] = js.native
  
  /**
    * The address and type of the targets to receive notifications from this notification rule.
    */
  var Targets: js.UndefOr[typings.awsSdk.codestarnotificationsMod.Targets] = js.native
}
object UpdateNotificationRuleRequest {
  
  @scala.inline
  def apply(Arn: NotificationRuleArn): UpdateNotificationRuleRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNotificationRuleRequest]
  }
  
  @scala.inline
  implicit class UpdateNotificationRuleRequestMutableBuilder[Self <: UpdateNotificationRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailType(value: DetailType): Self = StObject.set(x, "DetailType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailTypeUndefined: Self = StObject.set(x, "DetailType", js.undefined)
    
    @scala.inline
    def setEventTypeIds(value: EventTypeIds): Self = StObject.set(x, "EventTypeIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypeIdsUndefined: Self = StObject.set(x, "EventTypeIds", js.undefined)
    
    @scala.inline
    def setEventTypeIdsVarargs(value: EventTypeId*): Self = StObject.set(x, "EventTypeIds", js.Array(value :_*))
    
    @scala.inline
    def setName(value: NotificationRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setStatus(value: NotificationRuleStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
  }
}
