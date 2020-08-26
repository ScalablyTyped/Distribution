package typings.awsSdkClientPinpointBrowser.typesChannelsResponseMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientPinpointBrowser.typesChannelResponseMod.UnmarshalledChannelResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledChannelsResponse extends ChannelsResponse {
  /**
    * A map of channels, with the ChannelType as the key and the Channel as the value.
    */
  @JSName("Channels")
  var Channels_UnmarshalledChannelsResponse: js.UndefOr[StringDictionary[UnmarshalledChannelResponse]] = js.native
}

object UnmarshalledChannelsResponse {
  @scala.inline
  def apply(): UnmarshalledChannelsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledChannelsResponse]
  }
  @scala.inline
  implicit class UnmarshalledChannelsResponseOps[Self <: UnmarshalledChannelsResponse] (val x: Self) extends AnyVal {
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
    def setChannels(value: StringDictionary[UnmarshalledChannelResponse]): Self = this.set("Channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("Channels", js.undefined)
  }
  
}

