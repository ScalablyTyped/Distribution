package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeNotificationRuleResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notification rule.
    */
  var Arn: NotificationRuleArn
  
  /**
    * The name or email alias of the person who created the notification rule.
    */
  var CreatedBy: js.UndefOr[NotificationRuleCreatedBy] = js.undefined
  
  /**
    * The date and time the notification rule was created, in timestamp format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The level of detail included in the notifications for this resource. BASIC will include only the contents of the event as it would appear in Amazon CloudWatch. FULL will include any supplemental information provided by AWS CodeStar Notifications and/or the service for the resource for which the notification is created.
    */
  var DetailType: js.UndefOr[typings.awsSdk.codestarnotificationsMod.DetailType] = js.undefined
  
  /**
    * A list of the event types associated with the notification rule.
    */
  var EventTypes: js.UndefOr[EventTypeBatch] = js.undefined
  
  /**
    * The date and time the notification rule was most recently updated, in timestamp format.
    */
  var LastModifiedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the notification rule.
    */
  var Name: js.UndefOr[NotificationRuleName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource associated with the notification rule.
    */
  var Resource: js.UndefOr[NotificationRuleResource] = js.undefined
  
  /**
    * The status of the notification rule. Valid statuses are on (sending notifications) or off (not sending notifications).
    */
  var Status: js.UndefOr[NotificationRuleStatus] = js.undefined
  
  /**
    * The tags associated with the notification rule.
    */
  var Tags: js.UndefOr[typings.awsSdk.codestarnotificationsMod.Tags] = js.undefined
  
  /**
    * A list of the Chatbot topics and Chatbot clients associated with the notification rule.
    */
  var Targets: js.UndefOr[TargetsBatch] = js.undefined
}
object DescribeNotificationRuleResult {
  
  inline def apply(Arn: NotificationRuleArn): DescribeNotificationRuleResult = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotificationRuleResult]
  }
  
  extension [Self <: DescribeNotificationRuleResult](x: Self) {
    
    inline def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCreatedBy(value: NotificationRuleCreatedBy): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setDetailType(value: DetailType): Self = StObject.set(x, "DetailType", value.asInstanceOf[js.Any])
    
    inline def setDetailTypeUndefined: Self = StObject.set(x, "DetailType", js.undefined)
    
    inline def setEventTypes(value: EventTypeBatch): Self = StObject.set(x, "EventTypes", value.asInstanceOf[js.Any])
    
    inline def setEventTypesUndefined: Self = StObject.set(x, "EventTypes", js.undefined)
    
    inline def setEventTypesVarargs(value: EventTypeSummary*): Self = StObject.set(x, "EventTypes", js.Array(value*))
    
    inline def setLastModifiedTimestamp(value: js.Date): Self = StObject.set(x, "LastModifiedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimestampUndefined: Self = StObject.set(x, "LastModifiedTimestamp", js.undefined)
    
    inline def setName(value: NotificationRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setResource(value: NotificationRuleResource): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
    
    inline def setStatus(value: NotificationRuleStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTargets(value: TargetsBatch): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: TargetSummary*): Self = StObject.set(x, "Targets", js.Array(value*))
  }
}
