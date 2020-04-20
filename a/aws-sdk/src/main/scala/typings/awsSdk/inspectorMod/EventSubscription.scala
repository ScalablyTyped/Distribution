package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventSubscription extends js.Object {
  /**
    * The event for which Amazon Simple Notification Service (SNS) notifications are sent.
    */
  var event: InspectorEvent = js.native
  /**
    * The time at which SubscribeToEvent is called.
    */
  var subscribedAt: Timestamp = js.native
}

object EventSubscription {
  @scala.inline
  def apply(event: InspectorEvent, subscribedAt: Timestamp): EventSubscription = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], subscribedAt = subscribedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSubscription]
  }
}

