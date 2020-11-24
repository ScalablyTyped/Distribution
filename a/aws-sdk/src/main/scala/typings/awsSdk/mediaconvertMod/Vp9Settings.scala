package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
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
  def apply(): Vp9Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vp9Settings]
  }
  
  @scala.inline
  implicit class Vp9SettingsOps[Self <: Vp9Settings] (val x: Self) extends AnyVal {
    
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
    def setBitrate(value: integerMin1000Max480000000): Self = this.set("Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitrate: Self = this.set("Bitrate", js.undefined)
    
    @scala.inline
    def setFramerateControl(value: Vp9FramerateControl): Self = this.set("FramerateControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramerateControl: Self = this.set("FramerateControl", js.undefined)
    
    @scala.inline
    def setFramerateConversionAlgorithm(value: Vp9FramerateConversionAlgorithm): Self = this.set("FramerateConversionAlgorithm", value.asInstanceOf[js.Any])
    
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
    def setHrdBufferSize(value: integerMin0Max47185920): Self = this.set("HrdBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHrdBufferSize: Self = this.set("HrdBufferSize", js.undefined)
    
    @scala.inline
    def setMaxBitrate(value: integerMin1000Max480000000): Self = this.set("MaxBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBitrate: Self = this.set("MaxBitrate", js.undefined)
    
    @scala.inline
    def setParControl(value: Vp9ParControl): Self = this.set("ParControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParControl: Self = this.set("ParControl", js.undefined)
    
    @scala.inline
    def setParDenominator(value: integerMin1Max2147483647): Self = this.set("ParDenominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParDenominator: Self = this.set("ParDenominator", js.undefined)
    
    @scala.inline
    def setParNumerator(value: integerMin1Max2147483647): Self = this.set("ParNumerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParNumerator: Self = this.set("ParNumerator", js.undefined)
    
    @scala.inline
    def setQualityTuningLevel(value: Vp9QualityTuningLevel): Self = this.set("QualityTuningLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualityTuningLevel: Self = this.set("QualityTuningLevel", js.undefined)
    
    @scala.inline
    def setRateControlMode(value: Vp9RateControlMode): Self = this.set("RateControlMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateControlMode: Self = this.set("RateControlMode", js.undefined)
  }
}
