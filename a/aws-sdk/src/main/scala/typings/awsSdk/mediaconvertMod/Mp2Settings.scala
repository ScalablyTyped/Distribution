package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mp2Settings extends js.Object {
  /**
    * Specify the average bitrate in bits per second.
    */
  var Bitrate: js.UndefOr[integerMin32000Max384000] = js.native
  /**
    * Set Channels to specify the number of channels in this output audio track. Choosing Mono in the console will give you 1 output channel; choosing Stereo will give you 2. In the API, valid values are 1 and 2.
    */
  var Channels: js.UndefOr[integerMin1Max2] = js.native
  /**
    * Sample rate in hz.
    */
  var SampleRate: js.UndefOr[integerMin32000Max48000] = js.native
}

object Mp2Settings {
  @scala.inline
  def apply(): Mp2Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mp2Settings]
  }
  @scala.inline
  implicit class Mp2SettingsOps[Self <: Mp2Settings] (val x: Self) extends AnyVal {
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
    def setBitrate(value: integerMin32000Max384000): Self = this.set("Bitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitrate: Self = this.set("Bitrate", js.undefined)
    @scala.inline
    def setChannels(value: integerMin1Max2): Self = this.set("Channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("Channels", js.undefined)
    @scala.inline
    def setSampleRate(value: integerMin32000Max48000): Self = this.set("SampleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleRate: Self = this.set("SampleRate", js.undefined)
  }
  
}

