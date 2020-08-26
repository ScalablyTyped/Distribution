package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueConfiguration extends js.Object {
  /**
    * A collection of bucket events for which to send notifications
    */
  var Events: EventList = js.native
  var Filter: js.UndefOr[NotificationConfigurationFilter] = js.native
  var Id: js.UndefOr[NotificationId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3 publishes a message when it detects events of the specified type.
    */
  var QueueArn: typings.awsSdk.s3Mod.QueueArn = js.native
}

object QueueConfiguration {
  @scala.inline
  def apply(Events: EventList, QueueArn: QueueArn): QueueConfiguration = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], QueueArn = QueueArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueConfiguration]
  }
  @scala.inline
  implicit class QueueConfigurationOps[Self <: QueueConfiguration] (val x: Self) extends AnyVal {
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
    def setQueueArn(value: QueueArn): Self = this.set("QueueArn", value.asInstanceOf[js.Any])
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

