package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait H265Settings extends StObject {
  
  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  var AdaptiveQuantization: js.UndefOr[H265AdaptiveQuantization] = js.undefined
  
  /**
    * Indicates that AFD values will be written into the output stream.  If afdSignaling is "auto", the system will try to preserve the input AFD value (in cases where multiple AFD values are valid). If set to "fixed", the AFD value will be the value configured in the fixedAfd parameter.
    */
  var AfdSignaling: js.UndefOr[typings.awsSdk.medialiveMod.AfdSignaling] = js.undefined
  
  /**
    * Whether or not EML should insert an Alternative Transfer Function SEI message to support backwards compatibility with non-HDR decoders and displays.
    */
  var AlternativeTransferFunction: js.UndefOr[H265AlternativeTransferFunction] = js.undefined
  
  /**
    * Average bitrate in bits/second. Required when the rate control mode is VBR or CBR. Not used for QVBR. In an MS Smooth output group, each output must have a unique value when its bitrate is rounded down to the nearest multiple of 1000.
    */
  var Bitrate: js.UndefOr[integerMin100000Max40000000] = js.undefined
  
  /**
    * Size of buffer (HRD buffer model) in bits.
    */
  var BufSize: js.UndefOr[integerMin100000Max80000000] = js.undefined
  
  /**
    * Includes colorspace metadata in the output.
    */
  var ColorMetadata: js.UndefOr[H265ColorMetadata] = js.undefined
  
  /**
    * Color Space settings
    */
  var ColorSpaceSettings: js.UndefOr[H265ColorSpaceSettings] = js.undefined
  
  /**
    * Optional filters that you can apply to an encode.
    */
  var FilterSettings: js.UndefOr[H265FilterSettings] = js.undefined
  
  /**
    * Four bit AFD value to write on all frames of video in the output stream. Only valid when afdSignaling is set to 'Fixed'.
    */
  var FixedAfd: js.UndefOr[typings.awsSdk.medialiveMod.FixedAfd] = js.undefined
  
  /**
    * If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
    */
  var FlickerAq: js.UndefOr[H265FlickerAq] = js.undefined
  
  /**
    * Framerate denominator.
    */
  var FramerateDenominator: integerMin1Max3003
  
  /**
    * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
    */
  var FramerateNumerator: integerMin1
  
  /**
    * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
    */
  var GopClosedCadence: js.UndefOr[integerMin0] = js.undefined
  
  /**
    * GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits.
  If gopSizeUnits is frames, gopSize must be an integer and must be greater than or equal to 1.
  If gopSizeUnits is seconds, gopSize must be greater than 0, but need not be an integer.
    */
  var GopSize: js.UndefOr[double] = js.undefined
  
  /**
    * Indicates if the gopSize is specified in frames or seconds. If seconds the system will convert the gopSize into a frame count at run time.
    */
  var GopSizeUnits: js.UndefOr[H265GopSizeUnits] = js.undefined
  
  /**
    * H.265 Level.
    */
  var Level: js.UndefOr[H265Level] = js.undefined
  
  /**
    * Amount of lookahead. A value of low can decrease latency and memory usage, while high can produce better quality for certain content.
    */
  var LookAheadRateControl: js.UndefOr[H265LookAheadRateControl] = js.undefined
  
  /**
    * For QVBR: See the tooltip for Quality level
    */
  var MaxBitrate: js.UndefOr[integerMin100000Max40000000] = js.undefined
  
  /**
    * Only meaningful if sceneChangeDetect is set to enabled.  Defaults to 5 if multiplex rate control is used.  Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
    */
  var MinIInterval: js.UndefOr[integerMin0Max30] = js.undefined
  
  /**
    * Pixel Aspect Ratio denominator.
    */
  var ParDenominator: js.UndefOr[integerMin1] = js.undefined
  
  /**
    * Pixel Aspect Ratio numerator.
    */
  var ParNumerator: js.UndefOr[integerMin1] = js.undefined
  
  /**
    * H.265 Profile.
    */
  var Profile: js.UndefOr[H265Profile] = js.undefined
  
  /**
    * Controls the target quality for the video encode. Applies only when the rate control mode is QVBR. Set values for the QVBR quality level field and Max bitrate field that suit your most important viewing devices. Recommended values are:
  - Primary screen: Quality level: 8 to 10. Max bitrate: 4M
  - PC or tablet: Quality level: 7. Max bitrate: 1.5M to 3M
  - Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
    */
  var QvbrQualityLevel: js.UndefOr[integerMin1Max10] = js.undefined
  
  /**
    * Rate control mode.
  QVBR: Quality will match the specified quality level except when it is constrained by the
  maximum bitrate.  Recommended if you or your viewers pay for bandwidth.
  CBR: Quality varies, depending on the video complexity. Recommended only if you distribute
  your assets to devices that cannot handle variable bitrates.
  Multiplex: This rate control mode is only supported (and is required) when the video is being
  delivered to a MediaLive Multiplex in which case the rate control configuration is controlled
  by the properties within the Multiplex Program.
    */
  var RateControlMode: js.UndefOr[H265RateControlMode] = js.undefined
  
  /**
    * Sets the scan type of the output to progressive or top-field-first interlaced.
    */
  var ScanType: js.UndefOr[H265ScanType] = js.undefined
  
  /**
    * Scene change detection.
    */
  var SceneChangeDetect: js.UndefOr[H265SceneChangeDetect] = js.undefined
  
  /**
    * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
  This field is optional; when no value is specified the encoder will choose the number of slices based on encode resolution.
    */
  var Slices: js.UndefOr[integerMin1Max16] = js.undefined
  
  /**
    * H.265 Tier.
    */
  var Tier: js.UndefOr[H265Tier] = js.undefined
  
  /**
    * Determines how timecodes should be inserted into the video elementary stream.
  - 'disabled': Do not include timecodes
  - 'picTimingSei': Pass through picture timing SEI messages from the source specified in Timecode Config
    */
  var TimecodeInsertion: js.UndefOr[H265TimecodeInsertionBehavior] = js.undefined
}
object H265Settings {
  
  inline def apply(FramerateDenominator: integerMin1Max3003, FramerateNumerator: integerMin1): H265Settings = {
    val __obj = js.Dynamic.literal(FramerateDenominator = FramerateDenominator.asInstanceOf[js.Any], FramerateNumerator = FramerateNumerator.asInstanceOf[js.Any])
    __obj.asInstanceOf[H265Settings]
  }
  
  extension [Self <: H265Settings](x: Self) {
    
    inline def setAdaptiveQuantization(value: H265AdaptiveQuantization): Self = StObject.set(x, "AdaptiveQuantization", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveQuantizationUndefined: Self = StObject.set(x, "AdaptiveQuantization", js.undefined)
    
    inline def setAfdSignaling(value: AfdSignaling): Self = StObject.set(x, "AfdSignaling", value.asInstanceOf[js.Any])
    
    inline def setAfdSignalingUndefined: Self = StObject.set(x, "AfdSignaling", js.undefined)
    
    inline def setAlternativeTransferFunction(value: H265AlternativeTransferFunction): Self = StObject.set(x, "AlternativeTransferFunction", value.asInstanceOf[js.Any])
    
    inline def setAlternativeTransferFunctionUndefined: Self = StObject.set(x, "AlternativeTransferFunction", js.undefined)
    
    inline def setBitrate(value: integerMin100000Max40000000): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    inline def setBufSize(value: integerMin100000Max80000000): Self = StObject.set(x, "BufSize", value.asInstanceOf[js.Any])
    
    inline def setBufSizeUndefined: Self = StObject.set(x, "BufSize", js.undefined)
    
    inline def setColorMetadata(value: H265ColorMetadata): Self = StObject.set(x, "ColorMetadata", value.asInstanceOf[js.Any])
    
    inline def setColorMetadataUndefined: Self = StObject.set(x, "ColorMetadata", js.undefined)
    
    inline def setColorSpaceSettings(value: H265ColorSpaceSettings): Self = StObject.set(x, "ColorSpaceSettings", value.asInstanceOf[js.Any])
    
    inline def setColorSpaceSettingsUndefined: Self = StObject.set(x, "ColorSpaceSettings", js.undefined)
    
    inline def setFilterSettings(value: H265FilterSettings): Self = StObject.set(x, "FilterSettings", value.asInstanceOf[js.Any])
    
    inline def setFilterSettingsUndefined: Self = StObject.set(x, "FilterSettings", js.undefined)
    
    inline def setFixedAfd(value: FixedAfd): Self = StObject.set(x, "FixedAfd", value.asInstanceOf[js.Any])
    
    inline def setFixedAfdUndefined: Self = StObject.set(x, "FixedAfd", js.undefined)
    
    inline def setFlickerAq(value: H265FlickerAq): Self = StObject.set(x, "FlickerAq", value.asInstanceOf[js.Any])
    
    inline def setFlickerAqUndefined: Self = StObject.set(x, "FlickerAq", js.undefined)
    
    inline def setFramerateDenominator(value: integerMin1Max3003): Self = StObject.set(x, "FramerateDenominator", value.asInstanceOf[js.Any])
    
    inline def setFramerateNumerator(value: integerMin1): Self = StObject.set(x, "FramerateNumerator", value.asInstanceOf[js.Any])
    
    inline def setGopClosedCadence(value: integerMin0): Self = StObject.set(x, "GopClosedCadence", value.asInstanceOf[js.Any])
    
    inline def setGopClosedCadenceUndefined: Self = StObject.set(x, "GopClosedCadence", js.undefined)
    
    inline def setGopSize(value: double): Self = StObject.set(x, "GopSize", value.asInstanceOf[js.Any])
    
    inline def setGopSizeUndefined: Self = StObject.set(x, "GopSize", js.undefined)
    
    inline def setGopSizeUnits(value: H265GopSizeUnits): Self = StObject.set(x, "GopSizeUnits", value.asInstanceOf[js.Any])
    
    inline def setGopSizeUnitsUndefined: Self = StObject.set(x, "GopSizeUnits", js.undefined)
    
    inline def setLevel(value: H265Level): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "Level", js.undefined)
    
    inline def setLookAheadRateControl(value: H265LookAheadRateControl): Self = StObject.set(x, "LookAheadRateControl", value.asInstanceOf[js.Any])
    
    inline def setLookAheadRateControlUndefined: Self = StObject.set(x, "LookAheadRateControl", js.undefined)
    
    inline def setMaxBitrate(value: integerMin100000Max40000000): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxBitrateUndefined: Self = StObject.set(x, "MaxBitrate", js.undefined)
    
    inline def setMinIInterval(value: integerMin0Max30): Self = StObject.set(x, "MinIInterval", value.asInstanceOf[js.Any])
    
    inline def setMinIIntervalUndefined: Self = StObject.set(x, "MinIInterval", js.undefined)
    
    inline def setParDenominator(value: integerMin1): Self = StObject.set(x, "ParDenominator", value.asInstanceOf[js.Any])
    
    inline def setParDenominatorUndefined: Self = StObject.set(x, "ParDenominator", js.undefined)
    
    inline def setParNumerator(value: integerMin1): Self = StObject.set(x, "ParNumerator", value.asInstanceOf[js.Any])
    
    inline def setParNumeratorUndefined: Self = StObject.set(x, "ParNumerator", js.undefined)
    
    inline def setProfile(value: H265Profile): Self = StObject.set(x, "Profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "Profile", js.undefined)
    
    inline def setQvbrQualityLevel(value: integerMin1Max10): Self = StObject.set(x, "QvbrQualityLevel", value.asInstanceOf[js.Any])
    
    inline def setQvbrQualityLevelUndefined: Self = StObject.set(x, "QvbrQualityLevel", js.undefined)
    
    inline def setRateControlMode(value: H265RateControlMode): Self = StObject.set(x, "RateControlMode", value.asInstanceOf[js.Any])
    
    inline def setRateControlModeUndefined: Self = StObject.set(x, "RateControlMode", js.undefined)
    
    inline def setScanType(value: H265ScanType): Self = StObject.set(x, "ScanType", value.asInstanceOf[js.Any])
    
    inline def setScanTypeUndefined: Self = StObject.set(x, "ScanType", js.undefined)
    
    inline def setSceneChangeDetect(value: H265SceneChangeDetect): Self = StObject.set(x, "SceneChangeDetect", value.asInstanceOf[js.Any])
    
    inline def setSceneChangeDetectUndefined: Self = StObject.set(x, "SceneChangeDetect", js.undefined)
    
    inline def setSlices(value: integerMin1Max16): Self = StObject.set(x, "Slices", value.asInstanceOf[js.Any])
    
    inline def setSlicesUndefined: Self = StObject.set(x, "Slices", js.undefined)
    
    inline def setTier(value: H265Tier): Self = StObject.set(x, "Tier", value.asInstanceOf[js.Any])
    
    inline def setTierUndefined: Self = StObject.set(x, "Tier", js.undefined)
    
    inline def setTimecodeInsertion(value: H265TimecodeInsertionBehavior): Self = StObject.set(x, "TimecodeInsertion", value.asInstanceOf[js.Any])
    
    inline def setTimecodeInsertionUndefined: Self = StObject.set(x, "TimecodeInsertion", js.undefined)
  }
}
