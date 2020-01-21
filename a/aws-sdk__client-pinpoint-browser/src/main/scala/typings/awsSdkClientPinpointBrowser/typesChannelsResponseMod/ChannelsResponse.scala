package typings.awsSdkClientPinpointBrowser.typesChannelsResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesChannelResponseMod.ChannelResponse
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelsResponse extends js.Object {
  /**
    * A map of channels, with the ChannelType as the key and the Channel as the value.
    */
  var Channels: js.UndefOr[
    StringDictionary[ChannelResponse] | (Iterable[js.Tuple2[String, ChannelResponse]])
  ] = js.undefined
}

object ChannelsResponse {
  @scala.inline
  def apply(
    Channels: StringDictionary[ChannelResponse] | (Iterable[js.Tuple2[String, ChannelResponse]]) = null
  ): ChannelsResponse = {
    val __obj = js.Dynamic.literal()
    if (Channels != null) __obj.updateDynamic("Channels")(Channels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelsResponse]
  }
}

