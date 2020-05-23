package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProresSettings extends js.Object {
  /**
    * Use Profile (ProResCodecProfile) to specifiy the type of Apple ProRes codec to use for this output.
    */
  var CodecProfile: js.UndefOr[ProresCodecProfile] = js.native
  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job sepecification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[ProresFramerateControl] = js.native
  /**
    * When set to INTERPOLATE, produces smoother motion during frame rate conversion.
    */
  var FramerateConversionAlgorithm: js.UndefOr[ProresFramerateConversionAlgorithm] = js.native
  /**
    * Frame rate denominator.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this example, use 24000 for the value of FramerateNumerator.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type.
    - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
    - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
    */
  var InterlaceMode: js.UndefOr[ProresInterlaceMode] = js.native
  /**
    * Use (ProresParControl) to specify how the service determines the pixel aspect ratio. Set to Follow source (INITIALIZE_FROM_SOURCE) to use the pixel aspect ratio from the input.  To specify a different pixel aspect ratio: Using the console, choose it from the dropdown menu. Using the API, set ProresParControl to (SPECIFIED) and provide  for (ParNumerator) and (ParDenominator).
    */
  var ParControl: js.UndefOr[ProresParControl] = js.native
  /**
    * Pixel Aspect Ratio denominator.
    */
  var ParDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Pixel Aspect Ratio numerator.
    */
  var ParNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  var SlowPal: js.UndefOr[ProresSlowPal] = js.native
  /**
    * Only use Telecine (ProresTelecine) when you set Framerate (Framerate) to 29.970. Set Telecine (ProresTelecine) to Hard (hard) to produce a 29.97i output from a 23.976 input. Set it to Soft (soft) to produce 23.976 output and leave converstion to the player.
    */
  var Telecine: js.UndefOr[ProresTelecine] = js.native
}

object ProresSettings {
  @scala.inline
  def apply(
    CodecProfile: ProresCodecProfile = null,
    FramerateControl: ProresFramerateControl = null,
    FramerateConversionAlgorithm: ProresFramerateConversionAlgorithm = null,
    FramerateDenominator: js.UndefOr[integerMin1Max2147483647] = js.undefined,
    FramerateNumerator: js.UndefOr[integerMin1Max2147483647] = js.undefined,
    InterlaceMode: ProresInterlaceMode = null,
    ParControl: ProresParControl = null,
    ParDenominator: js.UndefOr[integerMin1Max2147483647] = js.undefined,
    ParNumerator: js.UndefOr[integerMin1Max2147483647] = js.undefined,
    SlowPal: ProresSlowPal = null,
    Telecine: ProresTelecine = null
  ): ProresSettings = {
    val __obj = js.Dynamic.literal()
    if (CodecProfile != null) __obj.updateDynamic("CodecProfile")(CodecProfile.asInstanceOf[js.Any])
    if (FramerateControl != null) __obj.updateDynamic("FramerateControl")(FramerateControl.asInstanceOf[js.Any])
    if (FramerateConversionAlgorithm != null) __obj.updateDynamic("FramerateConversionAlgorithm")(FramerateConversionAlgorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(FramerateDenominator)) __obj.updateDynamic("FramerateDenominator")(FramerateDenominator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FramerateNumerator)) __obj.updateDynamic("FramerateNumerator")(FramerateNumerator.get.asInstanceOf[js.Any])
    if (InterlaceMode != null) __obj.updateDynamic("InterlaceMode")(InterlaceMode.asInstanceOf[js.Any])
    if (ParControl != null) __obj.updateDynamic("ParControl")(ParControl.asInstanceOf[js.Any])
    if (!js.isUndefined(ParDenominator)) __obj.updateDynamic("ParDenominator")(ParDenominator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ParNumerator)) __obj.updateDynamic("ParNumerator")(ParNumerator.get.asInstanceOf[js.Any])
    if (SlowPal != null) __obj.updateDynamic("SlowPal")(SlowPal.asInstanceOf[js.Any])
    if (Telecine != null) __obj.updateDynamic("Telecine")(Telecine.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProresSettings]
  }
}

