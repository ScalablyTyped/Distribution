package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNotificationRuleRequest extends js.Object {
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
  def apply(
    Arn: NotificationRuleArn,
    DetailType: DetailType = null,
    EventTypeIds: EventTypeIds = null,
    Name: NotificationRuleName = null,
    Status: NotificationRuleStatus = null,
    Targets: Targets = null
  ): UpdateNotificationRuleRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    if (DetailType != null) __obj.updateDynamic("DetailType")(DetailType.asInstanceOf[js.Any])
    if (EventTypeIds != null) __obj.updateDynamic("EventTypeIds")(EventTypeIds.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNotificationRuleRequest]
  }
}

