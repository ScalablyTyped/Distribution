package typings.awsSdkClientPinpointBrowser.typesChannelsResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesChannelResponseMod.ChannelResponse
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelsResponse extends js.Object {
  /**
    * A map of channels, with the ChannelType as the key and the Channel as the value.
    */
  var Channels: js.UndefOr[
    StringDictionary[ChannelResponse] | (Iterable[js.Tuple2[String, ChannelResponse]])
  ] = js.native
}

object ChannelsResponse {
  @scala.inline
  def apply(): ChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelsResponse]
  }
  @scala.inline
  implicit class ChannelsResponseOps[Self <: ChannelsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChannels(value: StringDictionary[ChannelResponse] | (Iterable[js.Tuple2[String, ChannelResponse]])): Self = this.set("Channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("Channels", js.undefined)
  }
  
}

