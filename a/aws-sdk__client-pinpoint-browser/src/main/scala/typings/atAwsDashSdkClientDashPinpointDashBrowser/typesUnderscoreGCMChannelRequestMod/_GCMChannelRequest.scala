package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreGCMChannelRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _GCMChannelRequest extends js.Object {
  /**
    * Platform credential API key from Google.
    */
  var ApiKey: js.UndefOr[String] = js.undefined
  /**
    * If the channel is enabled for sending messages.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}

object _GCMChannelRequest {
  @scala.inline
  def apply(ApiKey: String = null, Enabled: js.UndefOr[Boolean] = js.undefined): _GCMChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (ApiKey != null) __obj.updateDynamic("ApiKey")(ApiKey.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[_GCMChannelRequest]
  }
}

