package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreChannelsResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreChannelResponseMod._UnmarshalledChannelResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _UnmarshalledChannelsResponse extends _ChannelsResponse {
  /**
    * A map of channels, with the ChannelType as the key and the Channel as the value.
    */
  @JSName("Channels")
  var Channels__UnmarshalledChannelsResponse: js.UndefOr[StringDictionary[_UnmarshalledChannelResponse]] = js.undefined
}

object _UnmarshalledChannelsResponse {
  @scala.inline
  def apply(Channels: StringDictionary[_UnmarshalledChannelResponse] = null): _UnmarshalledChannelsResponse = {
    val __obj = js.Dynamic.literal()
    if (Channels != null) __obj.updateDynamic("Channels")(Channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[_UnmarshalledChannelsResponse]
  }
}

