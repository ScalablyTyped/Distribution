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
  def apply(SubscriptionName: String): ModifyEventSubscriptionMessage = {
    val __obj = js.Dynamic.literal(SubscriptionName = SubscriptionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyEventSubscriptionMessage]
  }
  @scala.inline
  implicit class ModifyEventSubscriptionMessageOps[Self <: ModifyEventSubscriptionMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setSubscriptionName(value: String): Self = this.set("SubscriptionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: BooleanOptional): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    @scala.inline
    def setEventCategoriesVarargs(value: String*): Self = this.set("EventCategories", js.Array(value :_*))
    @scala.inline
    def setEventCategories(value: EventCategoriesList): Self = this.set("EventCategories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventCategories: Self = this.set("EventCategories", js.undefined)
    @scala.inline
    def setSnsTopicArn(value: String): Self = this.set("SnsTopicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnsTopicArn: Self = this.set("SnsTopicArn", js.undefined)
    @scala.inline
    def setSourceType(value: String): Self = this.set("SourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceType: Self = this.set("SourceType", js.undefined)
  }
  
}

