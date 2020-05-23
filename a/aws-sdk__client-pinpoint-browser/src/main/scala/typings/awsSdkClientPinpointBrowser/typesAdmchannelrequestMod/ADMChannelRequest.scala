package typings.awsSdkClientPinpointBrowser.typesAdmchannelrequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ADMChannelRequest extends js.Object {
  /**
    * The Client ID that you obtained from the Amazon App Distribution Portal.
    */
  var ClientId: js.UndefOr[String] = js.undefined
  /**
    * The Client Secret that you obtained from the Amazon App Distribution Portal.
    */
  var ClientSecret: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether or not the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}

object ADMChannelRequest {
  @scala.inline
  def apply(ClientId: String = null, ClientSecret: String = null, Enabled: js.UndefOr[Boolean] = js.undefined): ADMChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId.asInstanceOf[js.Any])
    if (ClientSecret != null) __obj.updateDynamic("ClientSecret")(ClientSecret.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ADMChannelRequest]
  }
}

