package typings.awsSdkClientPinpointBrowser.typesSmschannelrequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMSChannelRequest extends js.Object {
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Sender identifier of your messages.
    */
  var SenderId: js.UndefOr[String] = js.undefined
  /**
    * ShortCode registered with phone provider.
    */
  var ShortCode: js.UndefOr[String] = js.undefined
}

object SMSChannelRequest {
  @scala.inline
  def apply(Enabled: js.UndefOr[Boolean] = js.undefined, SenderId: String = null, ShortCode: String = null): SMSChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    if (SenderId != null) __obj.updateDynamic("SenderId")(SenderId.asInstanceOf[js.Any])
    if (ShortCode != null) __obj.updateDynamic("ShortCode")(ShortCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SMSChannelRequest]
  }
}

