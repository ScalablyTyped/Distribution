package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemixSettings extends js.Object {
  /**
    * Channel mapping (ChannelMapping) contains the group of fields that hold the remixing value for each channel. Units are in dB. Acceptable values are within the range from -60 (mute) through 6. A setting of 0 passes the input channel unchanged to the output channel (no attenuation or amplification).
    */
  var ChannelMapping: js.UndefOr[typings.awsSdk.mediaconvertMod.ChannelMapping] = js.native
  /**
    * Specify the number of audio channels from your input that you want to use in your output. With remixing, you might combine or split the data in these channels, so the number of channels in your final output might be different.
    */
  var ChannelsIn: js.UndefOr[integerMin1Max64] = js.native
  /**
    * Specify the number of channels in this output after remixing. Valid values: 1, 2, 4, 6, 8... 64. (1 and even numbers to 64.)
    */
  var ChannelsOut: js.UndefOr[integerMin1Max64] = js.native
}

object RemixSettings {
  @scala.inline
  def apply(): RemixSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemixSettings]
  }
  @scala.inline
  implicit class RemixSettingsOps[Self <: RemixSettings] (val x: Self) extends AnyVal {
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
    def setChannelMapping(value: ChannelMapping): Self = this.set("ChannelMapping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelMapping: Self = this.set("ChannelMapping", js.undefined)
    @scala.inline
    def setChannelsIn(value: integerMin1Max64): Self = this.set("ChannelsIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelsIn: Self = this.set("ChannelsIn", js.undefined)
    @scala.inline
    def setChannelsOut(value: integerMin1Max64): Self = this.set("ChannelsOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannelsOut: Self = this.set("ChannelsOut", js.undefined)
  }
  
}

