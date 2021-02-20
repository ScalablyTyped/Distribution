package typings.awsSdk.codestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeNotificationRuleResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the notification rule.
    */
  var Arn: NotificationRuleArn = js.native
  
  /**
    * The name or email alias of the person who created the notification rule.
    */
  var CreatedBy: js.UndefOr[NotificationRuleCreatedBy] = js.native
  
  /**
    * The date and time the notification rule was created, in timestamp format.
    */
  var CreatedTimestamp: js.UndefOr[typings.awsSdk.codestarnotificationsMod.CreatedTimestamp] = js.native
  
  /**
    * The level of detail included in the notifications for this resource. BASIC will include only the contents of the event as it would appear in AWS CloudWatch. FULL will include any supplemental information provided by AWS CodeStar Notifications and/or the service for the resource for which the notification is created.
    */
  var DetailType: js.UndefOr[typings.awsSdk.codestarnotificationsMod.DetailType] = js.native
  
  /**
    * A list of the event types associated with the notification rule.
    */
  var EventTypes: js.UndefOr[EventTypeBatch] = js.native
  
  /**
    * The date and time the notification rule was most recently updated, in timestamp format.
    */
  var LastModifiedTimestamp: js.UndefOr[typings.awsSdk.codestarnotificationsMod.LastModifiedTimestamp] = js.native
  
  /**
    * The name of the notification rule.
    */
  var Name: js.UndefOr[NotificationRuleName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the resource associated with the notification rule.
    */
  var Resource: js.UndefOr[NotificationRuleResource] = js.native
  
  /**
    * The status of the notification rule. Valid statuses are on (sending notifications) or off (not sending notifications).
    */
  var Status: js.UndefOr[NotificationRuleStatus] = js.native
  
  /**
    * The tags associated with the notification rule.
    */
  var Tags: js.UndefOr[typings.awsSdk.codestarnotificationsMod.Tags] = js.native
  
  /**
    * A list of the SNS topics associated with the notification rule.
    */
  var Targets: js.UndefOr[TargetsBatch] = js.native
}
object DescribeNotificationRuleResult {
  
  @scala.inline
  def apply(Arn: NotificationRuleArn): DescribeNotificationRuleResult = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotificationRuleResult]
  }
  
  @scala.inline
  implicit class DescribeNotificationRuleResultMutableBuilder[Self <: DescribeNotificationRuleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NotificationRuleArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBy(value: NotificationRuleCreatedBy): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    @scala.inline
    def setCreatedTimestamp(value: CreatedTimestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setDetailType(value: DetailType): Self = StObject.set(x, "DetailType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailTypeUndefined: Self = StObject.set(x, "DetailType", js.undefined)
    
    @scala.inline
    def setEventTypes(value: EventTypeBatch): Self = StObject.set(x, "EventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTypesUndefined: Self = StObject.set(x, "EventTypes", js.undefined)
    
    @scala.inline
    def setEventTypesVarargs(value: EventTypeSummary*): Self = StObject.set(x, "EventTypes", js.Array(value :_*))
    
    @scala.inline
    def setLastModifiedTimestamp(value: LastModifiedTimestamp): Self = StObject.set(x, "LastModifiedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimestampUndefined: Self = StObject.set(x, "LastModifiedTimestamp", js.undefined)
    
    @scala.inline
    def setName(value: NotificationRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setResource(value: NotificationRuleResource): Self = StObject.set(x, "Resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceUndefined: Self = StObject.set(x, "Resource", js.undefined)
    
    @scala.inline
    def setStatus(value: NotificationRuleStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTargets(value: TargetsBatch): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: TargetSummary*): Self = StObject.set(x, "Targets", js.Array(value :_*))
  }
}
