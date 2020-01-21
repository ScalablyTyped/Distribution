package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateChannelResponse extends js.Object {
  var Channel: js.UndefOr[typings.awsSdk.medialiveMod.Channel] = js.native
}

object UpdateChannelResponse {
  @scala.inline
  def apply(Channel: Channel = null): UpdateChannelResponse = {
    val __obj = js.Dynamic.literal()
    if (Channel != null) __obj.updateDynamic("Channel")(Channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelResponse]
  }
}

