package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GCMChannelRequest extends js.Object {
  /**
    * The Web API Key, also referred to as an API_KEY or server key, that you received from Google to communicate with Google services.
    */
  var ApiKey: string = js.native
  /**
    * Specifies whether to enable the GCM channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
}

object GCMChannelRequest {
  @scala.inline
  def apply(ApiKey: string, Enabled: js.UndefOr[Boolean] = js.undefined): GCMChannelRequest = {
    val __obj = js.Dynamic.literal(ApiKey = ApiKey.asInstanceOf[js.Any])
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[GCMChannelRequest]
  }
}

