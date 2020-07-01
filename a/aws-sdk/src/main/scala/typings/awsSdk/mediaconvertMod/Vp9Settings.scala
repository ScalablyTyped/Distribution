package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vp9Settings extends js.Object {
  /**
    * Target bitrate in bits/second. For example, enter five megabits per second as 5000000.
    */
  var Bitrate: js.UndefOr[integerMin1000Max480000000] = js.native
  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[Vp9FramerateControl] = js.native
  /**
    * Optional. Specify how the transcoder performs framerate conversion. The default behavior is to use Drop duplicate (DUPLICATE_DROP) conversion. When you choose Interpolate (INTERPOLATE) instead, the conversion produces smoother motion.
    */
  var FramerateConversionAlgorithm: js.UndefOr[Vp9FramerateConversionAlgorithm] = js.native
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this example, use 24000 for the value of FramerateNumerator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * GOP Length (keyframe interval) in frames. Must be greater than zero.
    */
  var GopSize: js.UndefOr[doubleMin0] = js.native
  /**
    * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
    */
  var HrdBufferSize: js.UndefOr[integerMin0Max47185920] = js.native
  /**
    * Ignore this setting unless you set qualityTuningLevel to MULTI_PASS. Optional. Specify the maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. The default behavior uses twice the target bitrate as the maximum bitrate.
    */
  var MaxBitrate: js.UndefOr[integerMin1000Max480000000] = js.native
  /**
    * Optional. Specify how the service determines the pixel aspect ratio for this output. The default behavior is to use the same pixel aspect ratio as your input video.
    */
  var ParControl: js.UndefOr[Vp9ParControl] = js.native
  /**
    * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this example, the value for parDenominator is 33.
    */
  var ParDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this example, the value for parNumerator is 40.
    */
  var ParNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, multi-pass encoding.
    */
  var QualityTuningLevel: js.UndefOr[Vp9QualityTuningLevel] = js.native
  /**
    * With the VP9 codec, you can use only the variable bitrate (VBR) rate control mode.
    */
  var RateControlMode: js.UndefOr[Vp9RateControlMode] = js.native
}

object Vp9Settings {
  @scala.inline
  def apply(
    Bitrate: js.UndefOr[integerMin1000Max480000000] = js.undefined,
    FramerateControl: Vp9FramerateControl = null,
    FramerateConversionAlgorithm: Vp9FramerateConversionAlgorithm = null,
    FramerateDenominator: js.UndefOr[integerMin1Max2147483647] = js.undefined,
    FramerateNumerator: js.UndefOr[integerMin1Max2147483647] = js.undefined,
    GopSize: js.UndefOr[doubleMin0] = js.undefined,
    HrdBufferSize: js.UndefOr[integerMin0Max47185920] = js.undefined,
    MaxBitrate: js.UndefOr[integerMin1000Max480000000] = js.undefined,
    ParControl: Vp9ParControl = null,
    ParDenominator: js.UndefOr[integerMin1Max2147483647] = js.undefined,
    ParNumerator: js.UndefOr[integerMin1Max2147483647] = js.undefined,
    QualityTuningLevel: Vp9QualityTuningLevel = null,
    RateControlMode: Vp9RateControlMode = null
  ): Vp9Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Bitrate)) __obj.updateDynamic("Bitrate")(Bitrate.get.asInstanceOf[js.Any])
    if (FramerateControl != null) __obj.updateDynamic("FramerateControl")(FramerateControl.asInstanceOf[js.Any])
    if (FramerateConversionAlgorithm != null) __obj.updateDynamic("FramerateConversionAlgorithm")(FramerateConversionAlgorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(FramerateDenominator)) __obj.updateDynamic("FramerateDenominator")(FramerateDenominator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(FramerateNumerator)) __obj.updateDynamic("FramerateNumerator")(FramerateNumerator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(GopSize)) __obj.updateDynamic("GopSize")(GopSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(HrdBufferSize)) __obj.updateDynamic("HrdBufferSize")(HrdBufferSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxBitrate)) __obj.updateDynamic("MaxBitrate")(MaxBitrate.get.asInstanceOf[js.Any])
    if (ParControl != null) __obj.updateDynamic("ParControl")(ParControl.asInstanceOf[js.Any])
    if (!js.isUndefined(ParDenominator)) __obj.updateDynamic("ParDenominator")(ParDenominator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ParNumerator)) __obj.updateDynamic("ParNumerator")(ParNumerator.get.asInstanceOf[js.Any])
    if (QualityTuningLevel != null) __obj.updateDynamic("QualityTuningLevel")(QualityTuningLevel.asInstanceOf[js.Any])
    if (RateControlMode != null) __obj.updateDynamic("RateControlMode")(RateControlMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vp9Settings]
  }
}

