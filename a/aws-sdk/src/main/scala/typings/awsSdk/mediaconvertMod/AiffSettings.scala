package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AiffSettings extends js.Object {
  /**
    * Specify Bit depth (BitDepth), in bits per sample, to choose the encoding quality for this audio track.
    */
  var BitDepth: js.UndefOr[integerMin16Max24] = js.native
  /**
    * Specify the number of channels in this output audio track. Valid values are 1 and even numbers up to 64. For example, 1, 2, 4, 6, and so on, up to 64.
    */
  var Channels: js.UndefOr[integerMin1Max64] = js.native
  /**
    * Sample rate in hz.
    */
  var SampleRate: js.UndefOr[integerMin8000Max192000] = js.native
}

object AiffSettings {
  @scala.inline
  def apply(
    BitDepth: js.UndefOr[integerMin16Max24] = js.undefined,
    Channels: js.UndefOr[integerMin1Max64] = js.undefined,
    SampleRate: js.UndefOr[integerMin8000Max192000] = js.undefined
  ): AiffSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BitDepth)) __obj.updateDynamic("BitDepth")(BitDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Channels)) __obj.updateDynamic("Channels")(Channels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(SampleRate)) __obj.updateDynamic("SampleRate")(SampleRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AiffSettings]
  }
}

