package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XavcHdProfileSettings extends StObject {
  
  /**
    * Specify the XAVC HD (Long GOP) Bitrate Class to set the bitrate of your output. Outputs of the same class have similar image quality over the operating points that are valid for that class.
    */
  var BitrateClass: js.UndefOr[XavcHdProfileBitrateClass] = js.undefined
  
  /**
    * The best way to set up adaptive quantization is to keep the default value, Auto (AUTO), for the setting Adaptive quantization (XavcAdaptiveQuantization). When you do so, MediaConvert automatically applies the best types of quantization for your video content. Include this setting in your JSON job specification only when you choose to change the default value for Adaptive quantization. Enable this setting to have the encoder reduce I-frame pop. I-frame pop appears as a visual flicker that can arise when the encoder saves bits by copying some macroblocks many times from frame to frame, and then refreshes them at the I-frame. When you enable this setting, the encoder updates these macroblocks slightly more often to smooth out the flicker. This setting is disabled by default. Related setting: In addition to enabling this setting, you must also set Adaptive quantization (adaptiveQuantization) to a value other than Off (OFF) or Auto (AUTO). Use Adaptive quantization to adjust the degree of smoothing that Flicker adaptive quantization provides.
    */
  var FlickerAdaptiveQuantization: js.UndefOr[XavcFlickerAdaptiveQuantization] = js.undefined
  
  /**
    * Specify whether the encoder uses B-frames as reference frames for other pictures in the same GOP. Choose Allow (ENABLED) to allow the encoder to use B-frames as reference frames. Choose Don't allow (DISABLED) to prevent the encoder from using B-frames as reference frames.
    */
  var GopBReference: js.UndefOr[XavcGopBReference] = js.undefined
  
  /**
    * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
    */
  var GopClosedCadence: js.UndefOr[integerMin0Max2147483647] = js.undefined
  
  /**
    * Specify the size of the buffer that MediaConvert uses in the HRD buffer model for this output. Specify this value in bits; for example, enter five megabits as 5000000. When you don't set this value, or you set it to zero, MediaConvert calculates the default by doubling the bitrate of this output point.
    */
  var HrdBufferSize: js.UndefOr[integerMin0Max1152000000] = js.undefined
  
  /**
    * Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
    */
  var InterlaceMode: js.UndefOr[XavcInterlaceMode] = js.undefined
  
  /**
    * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, single-pass encoding.
    */
  var QualityTuningLevel: js.UndefOr[XavcHdProfileQualityTuningLevel] = js.undefined
  
  /**
    * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
    */
  var Slices: js.UndefOr[integerMin4Max12] = js.undefined
  
  /**
    * Ignore this setting unless you set Frame rate (framerateNumerator divided by framerateDenominator) to 29.970. If your input framerate is 23.976, choose Hard (HARD). Otherwise, keep the default value None (NONE). For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-telecine-and-inverse-telecine.html.
    */
  var Telecine: js.UndefOr[XavcHdProfileTelecine] = js.undefined
}
object XavcHdProfileSettings {
  
  inline def apply(): XavcHdProfileSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XavcHdProfileSettings]
  }
  
  extension [Self <: XavcHdProfileSettings](x: Self) {
    
    inline def setBitrateClass(value: XavcHdProfileBitrateClass): Self = StObject.set(x, "BitrateClass", value.asInstanceOf[js.Any])
    
    inline def setBitrateClassUndefined: Self = StObject.set(x, "BitrateClass", js.undefined)
    
    inline def setFlickerAdaptiveQuantization(value: XavcFlickerAdaptiveQuantization): Self = StObject.set(x, "FlickerAdaptiveQuantization", value.asInstanceOf[js.Any])
    
    inline def setFlickerAdaptiveQuantizationUndefined: Self = StObject.set(x, "FlickerAdaptiveQuantization", js.undefined)
    
    inline def setGopBReference(value: XavcGopBReference): Self = StObject.set(x, "GopBReference", value.asInstanceOf[js.Any])
    
    inline def setGopBReferenceUndefined: Self = StObject.set(x, "GopBReference", js.undefined)
    
    inline def setGopClosedCadence(value: integerMin0Max2147483647): Self = StObject.set(x, "GopClosedCadence", value.asInstanceOf[js.Any])
    
    inline def setGopClosedCadenceUndefined: Self = StObject.set(x, "GopClosedCadence", js.undefined)
    
    inline def setHrdBufferSize(value: integerMin0Max1152000000): Self = StObject.set(x, "HrdBufferSize", value.asInstanceOf[js.Any])
    
    inline def setHrdBufferSizeUndefined: Self = StObject.set(x, "HrdBufferSize", js.undefined)
    
    inline def setInterlaceMode(value: XavcInterlaceMode): Self = StObject.set(x, "InterlaceMode", value.asInstanceOf[js.Any])
    
    inline def setInterlaceModeUndefined: Self = StObject.set(x, "InterlaceMode", js.undefined)
    
    inline def setQualityTuningLevel(value: XavcHdProfileQualityTuningLevel): Self = StObject.set(x, "QualityTuningLevel", value.asInstanceOf[js.Any])
    
    inline def setQualityTuningLevelUndefined: Self = StObject.set(x, "QualityTuningLevel", js.undefined)
    
    inline def setSlices(value: integerMin4Max12): Self = StObject.set(x, "Slices", value.asInstanceOf[js.Any])
    
    inline def setSlicesUndefined: Self = StObject.set(x, "Slices", js.undefined)
    
    inline def setTelecine(value: XavcHdProfileTelecine): Self = StObject.set(x, "Telecine", value.asInstanceOf[js.Any])
    
    inline def setTelecineUndefined: Self = StObject.set(x, "Telecine", js.undefined)
  }
}
