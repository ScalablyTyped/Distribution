package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JourneyPushMessage extends js.Object {
  /**
    * The number of seconds that the push notification service should keep the message, if the service is unable to deliver the notification the first time. This value is converted to an expiration value when it's sent to a push-notification service. If this value is 0, the service treats the notification as if it expires immediately and the service doesn't store or try to deliver the notification again. This value doesn't apply to messages that are sent through the Amazon Device Messaging (ADM) service.
    */
  var TimeToLive: js.UndefOr[string] = js.native
}

object JourneyPushMessage {
  @scala.inline
  def apply(TimeToLive: string = null): JourneyPushMessage = {
    val __obj = js.Dynamic.literal()
    if (TimeToLive != null) __obj.updateDynamic("TimeToLive")(TimeToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneyPushMessage]
  }
}

