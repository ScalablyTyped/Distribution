package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WavSettings extends js.Object {
  /**
    * Specify Bit depth (BitDepth), in bits per sample, to choose the encoding quality for this audio track.
    */
  var BitDepth: js.UndefOr[integerMin16Max24] = js.native
  /**
    * Specify the number of channels in this output audio track. Valid values are 1 and even numbers up to 64. For example, 1, 2, 4, 6, and so on, up to 64.
    */
  var Channels: js.UndefOr[integerMin1Max64] = js.native
  /**
    * The service defaults to using RIFF for WAV outputs. If your output audio is likely to exceed 4 GB in file size, or if you otherwise need the extended support of the RF64 format, set your output WAV file format to RF64.
    */
  var Format: js.UndefOr[WavFormat] = js.native
  /**
    * Sample rate in Hz.
    */
  var SampleRate: js.UndefOr[integerMin8000Max192000] = js.native
}

object WavSettings {
  @scala.inline
  def apply(
    BitDepth: js.UndefOr[integerMin16Max24] = js.undefined,
    Channels: js.UndefOr[integerMin1Max64] = js.undefined,
    Format: WavFormat = null,
    SampleRate: js.UndefOr[integerMin8000Max192000] = js.undefined
  ): WavSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BitDepth)) __obj.updateDynamic("BitDepth")(BitDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Channels)) __obj.updateDynamic("Channels")(Channels.get.asInstanceOf[js.Any])
    if (Format != null) __obj.updateDynamic("Format")(Format.asInstanceOf[js.Any])
    if (!js.isUndefined(SampleRate)) __obj.updateDynamic("SampleRate")(SampleRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WavSettings]
  }
}

