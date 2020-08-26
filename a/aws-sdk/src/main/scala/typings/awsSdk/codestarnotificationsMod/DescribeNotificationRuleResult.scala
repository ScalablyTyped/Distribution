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
  def apply(Arn: NotificationRuleArn): DescribeNotificationRuleResult = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotificationRuleResult]
  }
  @scala.inline
  implicit class DescribeNotificationRuleResultOps[Self <: DescribeNotificationRuleResult] (val x: Self) extends AnyVal {
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
    def setCreatedBy(value: NotificationRuleCreatedBy): Self = this.set("CreatedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("CreatedBy", js.undefined)
    @scala.inline
    def setCreatedTimestamp(value: CreatedTimestamp): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    @scala.inline
    def setDetailType(value: DetailType): Self = this.set("DetailType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailType: Self = this.set("DetailType", js.undefined)
    @scala.inline
    def setEventTypesVarargs(value: EventTypeSummary*): Self = this.set("EventTypes", js.Array(value :_*))
    @scala.inline
    def setEventTypes(value: EventTypeBatch): Self = this.set("EventTypes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventTypes: Self = this.set("EventTypes", js.undefined)
    @scala.inline
    def setLastModifiedTimestamp(value: LastModifiedTimestamp): Self = this.set("LastModifiedTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedTimestamp: Self = this.set("LastModifiedTimestamp", js.undefined)
    @scala.inline
    def setName(value: NotificationRuleName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setResource(value: NotificationRuleResource): Self = this.set("Resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("Resource", js.undefined)
    @scala.inline
    def setStatus(value: NotificationRuleStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: TargetSummary*): Self = this.set("Targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: TargetsBatch): Self = this.set("Targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("Targets", js.undefined)
  }
  
}

