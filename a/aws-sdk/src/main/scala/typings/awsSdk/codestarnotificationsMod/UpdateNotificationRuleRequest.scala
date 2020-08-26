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
  def apply(Arn: NotificationRuleArn): UpdateNotificationRuleRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNotificationRuleRequest]
  }
  @scala.inline
  implicit class UpdateNotificationRuleRequestOps[Self <: UpdateNotificationRuleRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: NotificationRuleArn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetailType(value: DetailType): Self = this.set("DetailType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailType: Self = this.set("DetailType", js.undefined)
    @scala.inline
    def setEventTypeIdsVarargs(value: EventTypeId*): Self = this.set("EventTypeIds", js.Array(value :_*))
    @scala.inline
    def setEventTypeIds(value: EventTypeIds): Self = this.set("EventTypeIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTypeIds: Self = this.set("EventTypeIds", js.undefined)
    @scala.inline
    def setName(value: NotificationRuleName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setStatus(value: NotificationRuleStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = this.set("Targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: Targets): Self = this.set("Targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("Targets", js.undefined)
  }
  
}

