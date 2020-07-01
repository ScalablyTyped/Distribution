package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoiseReducerTemporalFilterSettings extends js.Object {
  /**
    * Use Aggressive mode for content that has complex motion. Higher values produce stronger temporal filtering. This filters highly complex scenes more aggressively and creates better VQ for low bitrate outputs.
    */
  var AggressiveMode: js.UndefOr[integerMin0Max4] = js.native
  /**
    * Optional. When you set Noise reducer (noiseReducer) to Temporal (TEMPORAL), you can optionally use this setting to apply additional sharpening. The default behavior, Auto (AUTO) allows the transcoder to determine whether to apply filtering, depending on input type and quality.
    */
  var PostTemporalSharpening: js.UndefOr[NoiseFilterPostTemporalSharpening] = js.native
  /**
    * The speed of the filter (higher number is faster). Low setting reduces bit rate at the cost of transcode time, high setting improves transcode time at the cost of bit rate.
    */
  var Speed: js.UndefOr[integerMinNegative1Max3] = js.native
  /**
    * Specify the strength of the noise reducing filter on this output. Higher values produce stronger filtering. We recommend the following value ranges, depending on the result that you want: * 0-2 for complexity reduction with minimal sharpness loss * 2-8 for complexity reduction with image preservation * 8-16 for a high level of complexity reduction
    */
  var Strength: js.UndefOr[integerMin0Max16] = js.native
}

object NoiseReducerTemporalFilterSettings {
  @scala.inline
  def apply(
    AggressiveMode: js.UndefOr[integerMin0Max4] = js.undefined,
    PostTemporalSharpening: NoiseFilterPostTemporalSharpening = null,
    Speed: js.UndefOr[integerMinNegative1Max3] = js.undefined,
    Strength: js.UndefOr[integerMin0Max16] = js.undefined
  ): NoiseReducerTemporalFilterSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AggressiveMode)) __obj.updateDynamic("AggressiveMode")(AggressiveMode.get.asInstanceOf[js.Any])
    if (PostTemporalSharpening != null) __obj.updateDynamic("PostTemporalSharpening")(PostTemporalSharpening.asInstanceOf[js.Any])
    if (!js.isUndefined(Speed)) __obj.updateDynamic("Speed")(Speed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Strength)) __obj.updateDynamic("Strength")(Strength.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoiseReducerTemporalFilterSettings]
  }
}

