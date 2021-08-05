package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Av1Settings extends StObject {
  
  /**
    * Specify the strength of any adaptive quantization filters that you enable. The value that you choose here applies to Spatial adaptive quantization (spatialAdaptiveQuantization).
    */
  var AdaptiveQuantization: js.UndefOr[Av1AdaptiveQuantization] = js.undefined
  
  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[Av1FramerateControl] = js.undefined
  
  /**
    * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
    */
  var FramerateConversionAlgorithm: js.UndefOr[Av1FramerateConversionAlgorithm] = js.undefined
  
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this example, use 24000 for the value of FramerateNumerator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * Specify the GOP length (keyframe interval) in frames. With AV1, MediaConvert doesn't support GOP length in seconds. This value must be greater than zero and preferably equal to 1 + ((numberBFrames + 1) * x), where x is an integer value.
    */
  var GopSize: js.UndefOr[doubleMin0] = js.undefined
  
  /**
    * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when Rate control mode is QVBR.
    */
  var MaxBitrate: js.UndefOr[integerMin1000Max1152000000] = js.undefined
  
  /**
    * Specify the number of B-frames. With AV1, MediaConvert supports only 7 or 15.
    */
  var NumberBFramesBetweenReferenceFrames: js.UndefOr[integerMin7Max15] = js.undefined
  
  /**
    * Settings for quality-defined variable bitrate encoding with the AV1 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
    */
  var QvbrSettings: js.UndefOr[Av1QvbrSettings] = js.undefined
  
  /**
    * 'With AV1 outputs, for rate control mode, MediaConvert supports only quality-defined variable bitrate (QVBR). You can''t use CBR or VBR.'
    */
  var RateControlMode: js.UndefOr[Av1RateControlMode] = js.undefined
  
  /**
    * Specify the number of slices per picture. This value must be 1, 2, 4, 8, 16, or 32. For progressive pictures, this value must be less than or equal to the number of macroblock rows. For interlaced pictures, this value must be less than or equal to half the number of macroblock rows.
    */
  var Slices: js.UndefOr[integerMin1Max32] = js.undefined
  
  /**
    * Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture, you might choose to disable this feature. Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video games, set it to Low. For content with a wider variety of textures, set it to High or Higher.
    */
  var SpatialAdaptiveQuantization: js.UndefOr[Av1SpatialAdaptiveQuantization] = js.undefined
}
object Av1Settings {
  
  inline def apply(): Av1Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Av1Settings]
  }
  
  extension [Self <: Av1Settings](x: Self) {
    
    inline def setAdaptiveQuantization(value: Av1AdaptiveQuantization): Self = StObject.set(x, "AdaptiveQuantization", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveQuantizationUndefined: Self = StObject.set(x, "AdaptiveQuantization", js.undefined)
    
    inline def setFramerateControl(value: Av1FramerateControl): Self = StObject.set(x, "FramerateControl", value.asInstanceOf[js.Any])
    
    inline def setFramerateControlUndefined: Self = StObject.set(x, "FramerateControl", js.undefined)
    
    inline def setFramerateConversionAlgorithm(value: Av1FramerateConversionAlgorithm): Self = StObject.set(x, "FramerateConversionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setFramerateConversionAlgorithmUndefined: Self = StObject.set(x, "FramerateConversionAlgorithm", js.undefined)
    
    inline def setFramerateDenominator(value: integerMin1Max2147483647): Self = StObject.set(x, "FramerateDenominator", value.asInstanceOf[js.Any])
    
    inline def setFramerateDenominatorUndefined: Self = StObject.set(x, "FramerateDenominator", js.undefined)
    
    inline def setFramerateNumerator(value: integerMin1Max2147483647): Self = StObject.set(x, "FramerateNumerator", value.asInstanceOf[js.Any])
    
    inline def setFramerateNumeratorUndefined: Self = StObject.set(x, "FramerateNumerator", js.undefined)
    
    inline def setGopSize(value: doubleMin0): Self = StObject.set(x, "GopSize", value.asInstanceOf[js.Any])
    
    inline def setGopSizeUndefined: Self = StObject.set(x, "GopSize", js.undefined)
    
    inline def setMaxBitrate(value: integerMin1000Max1152000000): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxBitrateUndefined: Self = StObject.set(x, "MaxBitrate", js.undefined)
    
    inline def setNumberBFramesBetweenReferenceFrames(value: integerMin7Max15): Self = StObject.set(x, "NumberBFramesBetweenReferenceFrames", value.asInstanceOf[js.Any])
    
    inline def setNumberBFramesBetweenReferenceFramesUndefined: Self = StObject.set(x, "NumberBFramesBetweenReferenceFrames", js.undefined)
    
    inline def setQvbrSettings(value: Av1QvbrSettings): Self = StObject.set(x, "QvbrSettings", value.asInstanceOf[js.Any])
    
    inline def setQvbrSettingsUndefined: Self = StObject.set(x, "QvbrSettings", js.undefined)
    
    inline def setRateControlMode(value: Av1RateControlMode): Self = StObject.set(x, "RateControlMode", value.asInstanceOf[js.Any])
    
    inline def setRateControlModeUndefined: Self = StObject.set(x, "RateControlMode", js.undefined)
    
    inline def setSlices(value: integerMin1Max32): Self = StObject.set(x, "Slices", value.asInstanceOf[js.Any])
    
    inline def setSlicesUndefined: Self = StObject.set(x, "Slices", js.undefined)
    
    inline def setSpatialAdaptiveQuantization(value: Av1SpatialAdaptiveQuantization): Self = StObject.set(x, "SpatialAdaptiveQuantization", value.asInstanceOf[js.Any])
    
    inline def setSpatialAdaptiveQuantizationUndefined: Self = StObject.set(x, "SpatialAdaptiveQuantization", js.undefined)
  }
}
