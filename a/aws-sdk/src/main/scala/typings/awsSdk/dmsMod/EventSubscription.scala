package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSubscription extends js.Object {
  /**
    * The AWS DMS event notification subscription Id.
    */
  var CustSubscriptionId: js.UndefOr[String] = js.native
  /**
    * The AWS customer account associated with the AWS DMS event notification subscription.
    */
  var CustomerAwsId: js.UndefOr[String] = js.native
  /**
    * Boolean value that indicates if the event subscription is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
  /**
    * A lists of event categories.
    */
  var EventCategoriesList: js.UndefOr[typings.awsSdk.dmsMod.EventCategoriesList] = js.native
  /**
    * The topic ARN of the AWS DMS event notification subscription.
    */
  var SnsTopicArn: js.UndefOr[String] = js.native
  /**
    * A list of source Ids for the event subscription.
    */
  var SourceIdsList: js.UndefOr[typings.awsSdk.dmsMod.SourceIdsList] = js.native
  /**
    *  The type of AWS DMS resource that generates events.  Valid values: replication-instance | replication-server | security-group | replication-task
    */
  var SourceType: js.UndefOr[String] = js.native
  /**
    * The status of the AWS DMS event notification subscription. Constraints: Can be one of the following: creating | modifying | deleting | active | no-permission | topic-not-exist The status "no-permission" indicates that AWS DMS no longer has permission to post to the SNS topic. The status "topic-not-exist" indicates that the topic was deleted after the subscription was created.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The time the AWS DMS event notification subscription was created.
    */
  var SubscriptionCreationTime: js.UndefOr[String] = js.native
}

object EventSubscription {
  @scala.inline
  def apply(
    CustSubscriptionId: String = null,
    CustomerAwsId: String = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    EventCategoriesList: EventCategoriesList = null,
    SnsTopicArn: String = null,
    SourceIdsList: SourceIdsList = null,
    SourceType: String = null,
    Status: String = null,
    SubscriptionCreationTime: String = null
  ): EventSubscription = {
    val __obj = js.Dynamic.literal()
    if (CustSubscriptionId != null) __obj.updateDynamic("CustSubscriptionId")(CustSubscriptionId.asInstanceOf[js.Any])
    if (CustomerAwsId != null) __obj.updateDynamic("CustomerAwsId")(CustomerAwsId.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (EventCategoriesList != null) __obj.updateDynamic("EventCategoriesList")(EventCategoriesList.asInstanceOf[js.Any])
    if (SnsTopicArn != null) __obj.updateDynamic("SnsTopicArn")(SnsTopicArn.asInstanceOf[js.Any])
    if (SourceIdsList != null) __obj.updateDynamic("SourceIdsList")(SourceIdsList.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SubscriptionCreationTime != null) __obj.updateDynamic("SubscriptionCreationTime")(SubscriptionCreationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSubscription]
  }
}

