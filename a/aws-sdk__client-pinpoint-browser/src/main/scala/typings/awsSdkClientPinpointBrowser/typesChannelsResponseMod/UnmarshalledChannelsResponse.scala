package typings.awsSdkClientPinpointBrowser.typesChannelsResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesChannelResponseMod.UnmarshalledChannelResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnmarshalledChannelsResponse extends ChannelsResponse {
  /**
    * A map of channels, with the ChannelType as the key and the Channel as the value.
    */
  @JSName("Channels")
  var Channels_UnmarshalledChannelsResponse: js.UndefOr[StringDictionary[UnmarshalledChannelResponse]] = js.undefined
}

object UnmarshalledChannelsResponse {
  @scala.inline
  def apply(Channels: StringDictionary[UnmarshalledChannelResponse] = null): UnmarshalledChannelsResponse = {
    val __obj = js.Dynamic.literal()
    if (Channels != null) __obj.updateDynamic("Channels")(Channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledChannelsResponse]
  }
}

