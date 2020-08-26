package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMSChannelRequest extends js.Object {
  /**
    * Specifies whether to enable the SMS channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
  /**
    * The identity that you want to display on recipients' devices when they receive messages from the SMS channel.
    */
  var SenderId: js.UndefOr[string] = js.native
  /**
    * The registered short code that you want to use when you send messages through the SMS channel.
    */
  var ShortCode: js.UndefOr[string] = js.native
}

object SMSChannelRequest {
  @scala.inline
  def apply(): SMSChannelRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMSChannelRequest]
  }
  @scala.inline
  implicit class SMSChannelRequestOps[Self <: SMSChannelRequest] (val x: Self) extends AnyVal {
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
    def setEnabled(value: boolean): Self = this.set("Enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("Enabled", js.undefined)
    @scala.inline
    def setSenderId(value: string): Self = this.set("SenderId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSenderId: Self = this.set("SenderId", js.undefined)
    @scala.inline
    def setShortCode(value: string): Self = this.set("ShortCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShortCode: Self = this.set("ShortCode", js.undefined)
  }
  
}

