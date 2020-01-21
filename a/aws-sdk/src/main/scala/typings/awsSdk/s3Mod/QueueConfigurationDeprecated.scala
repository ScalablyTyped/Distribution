package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueConfigurationDeprecated extends js.Object {
  var Event: js.UndefOr[typings.awsSdk.s3Mod.Event] = js.native
  /**
    * A collection of bucket events for which to send notifications
    */
  var Events: js.UndefOr[EventList] = js.native
  var Id: js.UndefOr[NotificationId] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Amazon SQS queue to which Amazon S3 publishes a message when it detects events of the specified type. 
    */
  var Queue: js.UndefOr[QueueArn] = js.native
}

object QueueConfigurationDeprecated {
  @scala.inline
  def apply(Event: Event = null, Events: EventList = null, Id: NotificationId = null, Queue: QueueArn = null): QueueConfigurationDeprecated = {
    val __obj = js.Dynamic.literal()
    if (Event != null) __obj.updateDynamic("Event")(Event.asInstanceOf[js.Any])
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (Queue != null) __obj.updateDynamic("Queue")(Queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueConfigurationDeprecated]
  }
}

