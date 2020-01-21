package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNotificationRuleResult extends js.Object {
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
  def apply(
    Arn: NotificationRuleArn,
    CreatedBy: NotificationRuleCreatedBy = null,
    CreatedTimestamp: CreatedTimestamp = null,
    DetailType: DetailType = null,
    EventTypes: EventTypeBatch = null,
    LastModifiedTimestamp: LastModifiedTimestamp = null,
    Name: NotificationRuleName = null,
    Resource: NotificationRuleResource = null,
    Status: NotificationRuleStatus = null,
    Tags: Tags = null,
    Targets: TargetsBatch = null
  ): DescribeNotificationRuleResult = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy.asInstanceOf[js.Any])
    if (CreatedTimestamp != null) __obj.updateDynamic("CreatedTimestamp")(CreatedTimestamp.asInstanceOf[js.Any])
    if (DetailType != null) __obj.updateDynamic("DetailType")(DetailType.asInstanceOf[js.Any])
    if (EventTypes != null) __obj.updateDynamic("EventTypes")(EventTypes.asInstanceOf[js.Any])
    if (LastModifiedTimestamp != null) __obj.updateDynamic("LastModifiedTimestamp")(LastModifiedTimestamp.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Resource != null) __obj.updateDynamic("Resource")(Resource.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotificationRuleResult]
  }
}

