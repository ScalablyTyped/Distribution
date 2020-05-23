package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyEventSubscriptionMessage extends js.Object {
  /**
    *  A Boolean value; set to true to activate the subscription. 
    */
  var Enabled: js.UndefOr[BooleanOptional] = js.native
  /**
    *  A list of event categories for a source type that you want to subscribe to. Use the DescribeEventCategories action to see a list of event categories. 
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.native
  /**
    *  The Amazon Resource Name (ARN) of the Amazon SNS topic created for event notification. The ARN is created by Amazon SNS when you create a topic and subscribe to it.
    */
  var SnsTopicArn: js.UndefOr[String] = js.native
  /**
    *  The type of AWS DMS resource that generates the events you want to subscribe to.  Valid values: replication-instance | replication-task
    */
  var SourceType: js.UndefOr[String] = js.native
  /**
    * The name of the AWS DMS event notification subscription to be modified.
    */
  var SubscriptionName: String = js.native
}

object ModifyEventSubscriptionMessage {
  @scala.inline
  def apply(
    SubscriptionName: String,
    Enabled: js.UndefOr[BooleanOptional] = js.undefined,
    EventCategories: EventCategoriesList = null,
    SnsTopicArn: String = null,
    SourceType: String = null
  ): ModifyEventSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SubscriptionName = SubscriptionName.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (EventCategories != null) __obj.updateDynamic("EventCategories")(EventCategories.asInstanceOf[js.Any])
    if (SnsTopicArn != null) __obj.updateDynamic("SnsTopicArn")(SnsTopicArn.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyEventSubscriptionMessage]
  }
}

