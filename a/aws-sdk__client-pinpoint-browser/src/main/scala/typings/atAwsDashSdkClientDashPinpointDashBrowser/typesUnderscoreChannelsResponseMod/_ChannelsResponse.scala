package typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreChannelsResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreChannelResponseMod._ChannelResponse
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ChannelsResponse extends js.Object {
  /**
    * A map of channels, with the ChannelType as the key and the Channel as the value.
    */
  var Channels: js.UndefOr[
    StringDictionary[_ChannelResponse] | (Iterable[js.Tuple2[String, _ChannelResponse]])
  ] = js.undefined
}

object _ChannelsResponse {
  @scala.inline
  def apply(
    Channels: StringDictionary[_ChannelResponse] | (Iterable[js.Tuple2[String, _ChannelResponse]]) = null
  ): _ChannelsResponse = {
    val __obj = js.Dynamic.literal()
    if (Channels != null) __obj.updateDynamic("Channels")(Channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ChannelsResponse]
  }
}

