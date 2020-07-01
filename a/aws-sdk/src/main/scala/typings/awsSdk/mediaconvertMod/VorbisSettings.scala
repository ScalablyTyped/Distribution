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
  def apply(
    Channels: js.UndefOr[integerMin1Max2] = js.undefined,
    SampleRate: js.UndefOr[integerMin22050Max48000] = js.undefined,
    VbrQuality: js.UndefOr[integerMinNegative1Max10] = js.undefined
  ): VorbisSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Channels)) __obj.updateDynamic("Channels")(Channels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SampleRate)) __obj.updateDynamic("SampleRate")(SampleRate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(VbrQuality)) __obj.updateDynamic("VbrQuality")(VbrQuality.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VorbisSettings]
  }
}

