package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VoiceChannelRequest extends js.Object {
  /**
    * Specifies whether to enable the voice channel for the application.
    */
  var Enabled: js.UndefOr[boolean] = js.native
}

object VoiceChannelRequest {
  @scala.inline
  def apply(Enabled: js.UndefOr[boolean] = js.undefined): VoiceChannelRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VoiceChannelRequest]
  }
}

