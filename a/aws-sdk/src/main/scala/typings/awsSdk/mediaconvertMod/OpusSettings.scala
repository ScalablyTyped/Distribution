package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpusSettings extends js.Object {
  /**
    * Optional. Specify the average bitrate in bits per second. Valid values are multiples of 8000, from 32000 through 192000. The default value is 96000, which we recommend for quality and bandwidth.
    */
  var Bitrate: js.UndefOr[integerMin32000Max192000] = js.native
  /**
    * Specify the number of channels in this output audio track. Choosing Mono on the console gives you 1 output channel; choosing Stereo gives you 2. In the API, valid values are 1 and 2.
    */
  var Channels: js.UndefOr[integerMin1Max2] = js.native
  /**
    * Optional. Sample rate in hz. Valid values are 16000, 24000, and 48000. The default value is 48000.
    */
  var SampleRate: js.UndefOr[integerMin16000Max48000] = js.native
}

object OpusSettings {
  @scala.inline
  def apply(
    Bitrate: js.UndefOr[integerMin32000Max192000] = js.undefined,
    Channels: js.UndefOr[integerMin1Max2] = js.undefined,
    SampleRate: js.UndefOr[integerMin16000Max48000] = js.undefined
  ): OpusSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Bitrate)) __obj.updateDynamic("Bitrate")(Bitrate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Channels)) __obj.updateDynamic("Channels")(Channels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SampleRate)) __obj.updateDynamic("SampleRate")(SampleRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpusSettings]
  }
}

