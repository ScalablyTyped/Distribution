package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VorbisSettings extends js.Object {
  /**
    * Optional. Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1 output channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2. The default value is 2.
    */
  var Channels: js.UndefOr[integerMin1Max2] = js.native
  /**
    * Optional. Specify the audio sample rate in Hz. Valid values are 22050, 32000, 44100, and 48000. The default value is 48000.
    */
  var SampleRate: js.UndefOr[integerMin22050Max48000] = js.native
  /**
    * Optional. Specify the variable audio quality of this Vorbis output from -1 (lowest quality, ~45 kbit/s) to 10 (highest quality, ~500 kbit/s). The default value is 4 (~128 kbit/s). Values 5 and 6 are approximately 160 and 192 kbit/s, respectively.
    */
  var VbrQuality: js.UndefOr[integerMinNegative1Max10] = js.native
}

object VorbisSettings {
  @scala.inline
  def apply(): VorbisSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VorbisSettings]
  }
  @scala.inline
  implicit class VorbisSettingsOps[Self <: VorbisSettings] (val x: Self) extends AnyVal {
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
    def setChannels(value: integerMin1Max2): Self = this.set("Channels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannels: Self = this.set("Channels", js.undefined)
    @scala.inline
    def setSampleRate(value: integerMin22050Max48000): Self = this.set("SampleRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleRate: Self = this.set("SampleRate", js.undefined)
    @scala.inline
    def setVbrQuality(value: integerMinNegative1Max10): Self = this.set("VbrQuality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVbrQuality: Self = this.set("VbrQuality", js.undefined)
  }
  
}

