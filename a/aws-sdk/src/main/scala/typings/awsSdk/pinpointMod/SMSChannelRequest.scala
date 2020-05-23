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
  def apply(Enabled: js.UndefOr[boolean] = js.undefined, SenderId: string = null, ShortCode: string = null): SMSChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (SenderId != null) __obj.updateDynamic("SenderId")(SenderId.asInstanceOf[js.Any])
    if (ShortCode != null) __obj.updateDynamic("ShortCode")(ShortCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMSChannelRequest]
  }
}

