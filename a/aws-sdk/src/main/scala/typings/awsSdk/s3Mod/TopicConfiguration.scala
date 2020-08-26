package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopicConfiguration extends js.Object {
  /**
    * The Amazon S3 bucket event about which to send notifications. For more information, see Supported Event Types in the Amazon Simple Storage Service Developer Guide.
    */
  var Events: EventList = js.native
  var Filter: js.UndefOr[NotificationConfigurationFilter] = js.native
  var Id: js.UndefOr[NotificationId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to which Amazon S3 publishes a message when it detects events of the specified type.
    */
  var TopicArn: typings.awsSdk.s3Mod.TopicArn = js.native
}

object TopicConfiguration {
  @scala.inline
  def apply(Events: EventList, TopicArn: TopicArn): TopicConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], TopicArn = TopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicConfiguration]
  }
  @scala.inline
  implicit class TopicConfigurationOps[Self <: TopicConfiguration] (val x: Self) extends AnyVal {
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
    def setEventsVarargs(value: Event*): Self = this.set("Events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: EventList): Self = this.set("Events", value.asInstanceOf[js.Any])
    @scala.inline
    def setTopicArn(value: TopicArn): Self = this.set("TopicArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilter(value: NotificationConfigurationFilter): Self = this.set("Filter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilter: Self = this.set("Filter", js.undefined)
    @scala.inline
    def setId(value: NotificationId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
  }
  
}

