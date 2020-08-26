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
  def apply(): JourneyPushMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JourneyPushMessage]
  }
  @scala.inline
  implicit class JourneyPushMessageOps[Self <: JourneyPushMessage] (val x: Self) extends AnyVal {
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
    def setTimeToLive(value: string): Self = this.set("TimeToLive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeToLive: Self = this.set("TimeToLive", js.undefined)
  }
  
}

