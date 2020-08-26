package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Av1Settings extends js.Object {
  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  var AdaptiveQuantization: js.UndefOr[Av1AdaptiveQuantization] = js.native
  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[Av1FramerateControl] = js.native
  /**
    * Optional. Specify how the transcoder performs framerate conversion. The default behavior is to use duplicate drop conversion.
    */
  var FramerateConversionAlgorithm: js.UndefOr[Av1FramerateConversionAlgorithm] = js.native
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this example, use 24000 for the value of FramerateNumerator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Specify the GOP length (keyframe interval) in frames. With AV1, MediaConvert doesn't support GOP length in seconds. This value must be greater than zero and preferably equal to 1 + ((numberBFrames + 1) * x), where x is an integer value.
    */
  var GopSize: js.UndefOr[doubleMin0] = js.native
  /**
    * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when Rate control mode is QVBR.
    */
  var MaxBitrate: js.UndefOr[integerMin1000Max1152000000] = js.native
  /**
    * Specify the number of B-frames. With AV1, MediaConvert supports only 7 or 15.
    */
  var NumberBFramesBetweenReferenceFrames: js.UndefOr[integerMin7Max15] = js.native
  /**
    * Settings for quality-defined variable bitrate encoding with the AV1 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
    */
  var QvbrSettings: js.UndefOr[Av1QvbrSettings] = js.native
  /**
    * 'With AV1 outputs, for rate control mode, MediaConvert supports only quality-defined variable bitrate (QVBR). You can''t use CBR or VBR.'
    */
  var RateControlMode: js.UndefOr[Av1RateControlMode] = js.native
  /**
    * Specify the number of slices per picture. This value must be 1, 2, 4, 8, 16, or 32. For progressive pictures, this value must be less than or equal to the number of macroblock rows. For interlaced pictures, this value must be less than or equal to half the number of macroblock rows.
    */
  var Slices: js.UndefOr[integerMin1Max32] = js.native
  /**
    * Adjust quantization within each frame based on spatial variation of content complexity.
    */
  var SpatialAdaptiveQuantization: js.UndefOr[Av1SpatialAdaptiveQuantization] = js.native
}

object Av1Settings {
  @scala.inline
  def apply(): Av1Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Av1Settings]
  }
  @scala.inline
  implicit class Av1SettingsOps[Self <: Av1Settings] (val x: Self) extends AnyVal {
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
    def setAdaptiveQuantization(value: Av1AdaptiveQuantization): Self = this.set("AdaptiveQuantization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdaptiveQuantization: Self = this.set("AdaptiveQuantization", js.undefined)
    @scala.inline
    def setFramerateControl(value: Av1FramerateControl): Self = this.set("FramerateControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramerateControl: Self = this.set("FramerateControl", js.undefined)
    @scala.inline
    def setFramerateConversionAlgorithm(value: Av1FramerateConversionAlgorithm): Self = this.set("FramerateConversionAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramerateConversionAlgorithm: Self = this.set("FramerateConversionAlgorithm", js.undefined)
    @scala.inline
    def setFramerateDenominator(value: integerMin1Max2147483647): Self = this.set("FramerateDenominator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramerateDenominator: Self = this.set("FramerateDenominator", js.undefined)
    @scala.inline
    def setFramerateNumerator(value: integerMin1Max2147483647): Self = this.set("FramerateNumerator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramerateNumerator: Self = this.set("FramerateNumerator", js.undefined)
    @scala.inline
    def setGopSize(value: doubleMin0): Self = this.set("GopSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGopSize: Self = this.set("GopSize", js.undefined)
    @scala.inline
    def setMaxBitrate(value: integerMin1000Max1152000000): Self = this.set("MaxBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBitrate: Self = this.set("MaxBitrate", js.undefined)
    @scala.inline
    def setNumberBFramesBetweenReferenceFrames(value: integerMin7Max15): Self = this.set("NumberBFramesBetweenReferenceFrames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberBFramesBetweenReferenceFrames: Self = this.set("NumberBFramesBetweenReferenceFrames", js.undefined)
    @scala.inline
    def setQvbrSettings(value: Av1QvbrSettings): Self = this.set("QvbrSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQvbrSettings: Self = this.set("QvbrSettings", js.undefined)
    @scala.inline
    def setRateControlMode(value: Av1RateControlMode): Self = this.set("RateControlMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRateControlMode: Self = this.set("RateControlMode", js.undefined)
    @scala.inline
    def setSlices(value: integerMin1Max32): Self = this.set("Slices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlices: Self = this.set("Slices", js.undefined)
    @scala.inline
    def setSpatialAdaptiveQuantization(value: Av1SpatialAdaptiveQuantization): Self = this.set("SpatialAdaptiveQuantization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpatialAdaptiveQuantization: Self = this.set("SpatialAdaptiveQuantization", js.undefined)
  }
  
}

