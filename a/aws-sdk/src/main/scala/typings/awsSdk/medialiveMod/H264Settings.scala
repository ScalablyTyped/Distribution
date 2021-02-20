package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait H264Settings extends StObject {
  
  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  var AdaptiveQuantization: js.UndefOr[H264AdaptiveQuantization] = js.native
  
  /**
    * Indicates that AFD values will be written into the output stream.  If afdSignaling is "auto", the system will try to preserve the input AFD value (in cases where multiple AFD values are valid). If set to "fixed", the AFD value will be the value configured in the fixedAfd parameter.
    */
  var AfdSignaling: js.UndefOr[typings.awsSdk.medialiveMod.AfdSignaling] = js.native
  
  /**
    * Average bitrate in bits/second. Required when the rate control mode is VBR or CBR. Not used for QVBR. In an MS Smooth output group, each output must have a unique value when its bitrate is rounded down to the nearest multiple of 1000.
    */
  var Bitrate: js.UndefOr[integerMin1000] = js.native
  
  /**
    * Percentage of the buffer that should initially be filled (HRD buffer model).
    */
  var BufFillPct: js.UndefOr[integerMin0Max100] = js.native
  
  /**
    * Size of buffer (HRD buffer model) in bits.
    */
  var BufSize: js.UndefOr[integerMin0] = js.native
  
  /**
    * Includes colorspace metadata in the output.
    */
  var ColorMetadata: js.UndefOr[H264ColorMetadata] = js.native
  
  /**
    * Color Space settings
    */
  var ColorSpaceSettings: js.UndefOr[H264ColorSpaceSettings] = js.native
  
  /**
    * Entropy encoding mode.  Use cabac (must be in Main or High profile) or cavlc.
    */
  var EntropyEncoding: js.UndefOr[H264EntropyEncoding] = js.native
  
  /**
    * Optional filters that you can apply to an encode.
    */
  var FilterSettings: js.UndefOr[H264FilterSettings] = js.native
  
  /**
    * Four bit AFD value to write on all frames of video in the output stream. Only valid when afdSignaling is set to 'Fixed'.
    */
  var FixedAfd: js.UndefOr[typings.awsSdk.medialiveMod.FixedAfd] = js.native
  
  /**
    * If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
    */
  var FlickerAq: js.UndefOr[H264FlickerAq] = js.native
  
  /**
    * This setting applies only when scan type is "interlaced." It controls whether coding is performed on a field basis or on a frame basis. (When the video is progressive, the coding is always performed on a frame basis.)
  enabled: Force MediaLive to code on a field basis, so that odd and even sets of fields are coded separately.
  disabled: Code the two sets of fields separately (on a field basis) or together (on a frame basis using PAFF), depending on what is most appropriate for the content.
    */
  var ForceFieldPictures: js.UndefOr[H264ForceFieldPictures] = js.native
  
  /**
    * This field indicates how the output video frame rate is specified.  If "specified" is selected then the output video frame rate is determined by framerateNumerator and framerateDenominator, else if "initializeFromSource" is selected then the output video frame rate will be set equal to the input video frame rate of the first input.
    */
  var FramerateControl: js.UndefOr[H264FramerateControl] = js.native
  
  /**
    * Framerate denominator.
    */
  var FramerateDenominator: js.UndefOr[integerMin1] = js.native
  
  /**
    * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
    */
  var FramerateNumerator: js.UndefOr[integerMin1] = js.native
  
  /**
    * Documentation update needed
    */
  var GopBReference: js.UndefOr[H264GopBReference] = js.native
  
  /**
    * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
    */
  var GopClosedCadence: js.UndefOr[integerMin0] = js.native
  
  /**
    * Number of B-frames between reference frames.
    */
  var GopNumBFrames: js.UndefOr[integerMin0Max7] = js.native
  
  /**
    * GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits.
  If gopSizeUnits is frames, gopSize must be an integer and must be greater than or equal to 1.
  If gopSizeUnits is seconds, gopSize must be greater than 0, but need not be an integer.
    */
  var GopSize: js.UndefOr[double] = js.native
  
  /**
    * Indicates if the gopSize is specified in frames or seconds. If seconds the system will convert the gopSize into a frame count at run time.
    */
  var GopSizeUnits: js.UndefOr[H264GopSizeUnits] = js.native
  
  /**
    * H.264 Level.
    */
  var Level: js.UndefOr[H264Level] = js.native
  
  /**
    * Amount of lookahead. A value of low can decrease latency and memory usage, while high can produce better quality for certain content.
    */
  var LookAheadRateControl: js.UndefOr[H264LookAheadRateControl] = js.native
  
  /**
    * For QVBR: See the tooltip for Quality level
  For VBR: Set the maximum bitrate in order to accommodate expected spikes in the complexity of the video.
    */
  var MaxBitrate: js.UndefOr[integerMin1000] = js.native
  
  /**
    * Only meaningful if sceneChangeDetect is set to enabled.  Defaults to 5 if multiplex rate control is used.  Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
    */
  var MinIInterval: js.UndefOr[integerMin0Max30] = js.native
  
  /**
    * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced encoding.
    */
  var NumRefFrames: js.UndefOr[integerMin1Max6] = js.native
  
  /**
    * This field indicates how the output pixel aspect ratio is specified.  If "specified" is selected then the output video pixel aspect ratio is determined by parNumerator and parDenominator, else if "initializeFromSource" is selected then the output pixsel aspect ratio will be set equal to the input video pixel aspect ratio of the first input.
    */
  var ParControl: js.UndefOr[H264ParControl] = js.native
  
  /**
    * Pixel Aspect Ratio denominator.
    */
  var ParDenominator: js.UndefOr[integerMin1] = js.native
  
  /**
    * Pixel Aspect Ratio numerator.
    */
  var ParNumerator: js.UndefOr[integerMin1] = js.native
  
  /**
    * H.264 Profile.
    */
  var Profile: js.UndefOr[H264Profile] = js.native
  
  /**
    * Leave as STANDARD_QUALITY or choose a different value (which might result in additional costs to run the channel).
  - ENHANCED_QUALITY: Produces a slightly better video quality without an increase in the bitrate. Has an effect only when the Rate control mode is QVBR or CBR. If this channel is in a MediaLive multiplex, the value must be ENHANCED_QUALITY.
  - STANDARD_QUALITY: Valid for any Rate control mode.
    */
  var QualityLevel: js.UndefOr[H264QualityLevel] = js.native
  
  /**
    * Controls the target quality for the video encode. Applies only when the rate control mode is QVBR. Set values for the QVBR quality level field and Max bitrate field that suit your most important viewing devices. Recommended values are:
  - Primary screen: Quality level: 8 to 10. Max bitrate: 4M
  - PC or tablet: Quality level: 7. Max bitrate: 1.5M to 3M
  - Smartphone: Quality level: 6. Max bitrate: 1M to 1.5M
    */
  var QvbrQualityLevel: js.UndefOr[integerMin1Max10] = js.native
  
  /**
    * Rate control mode.
  QVBR: Quality will match the specified quality level except when it is constrained by the
  maximum bitrate.  Recommended if you or your viewers pay for bandwidth.
  VBR: Quality and bitrate vary, depending on the video complexity. Recommended instead of QVBR
  if you want to maintain a specific average bitrate over the duration of the channel.
  CBR: Quality varies, depending on the video complexity. Recommended only if you distribute
  your assets to devices that cannot handle variable bitrates.
  Multiplex: This rate control mode is only supported (and is required) when the video is being
  delivered to a MediaLive Multiplex in which case the rate control configuration is controlled
  by the properties within the Multiplex Program.
    */
  var RateControlMode: js.UndefOr[H264RateControlMode] = js.native
  
  /**
    * Sets the scan type of the output to progressive or top-field-first interlaced.
    */
  var ScanType: js.UndefOr[H264ScanType] = js.native
  
  /**
    * Scene change detection.
  - On: inserts I-frames when scene change is detected.
  - Off: does not force an I-frame when scene change is detected.
    */
  var SceneChangeDetect: js.UndefOr[H264SceneChangeDetect] = js.native
  
  /**
    * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
  This field is optional; when no value is specified the encoder will choose the number of slices based on encode resolution.
    */
  var Slices: js.UndefOr[integerMin1Max32] = js.native
  
  /**
    * Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
    */
  var Softness: js.UndefOr[integerMin0Max128] = js.native
  
  /**
    * If set to enabled, adjust quantization within each frame based on spatial variation of content complexity.
    */
  var SpatialAq: js.UndefOr[H264SpatialAq] = js.native
  
  /**
    * If set to fixed, use gopNumBFrames B-frames per sub-GOP. If set to dynamic, optimize the number of B-frames used for each sub-GOP to improve visual quality.
    */
  var SubgopLength: js.UndefOr[H264SubGopLength] = js.native
  
  /**
    * Produces a bitstream compliant with SMPTE RP-2027.
    */
  var Syntax: js.UndefOr[H264Syntax] = js.native
  
  /**
    * If set to enabled, adjust quantization within each frame based on temporal variation of content complexity.
    */
  var TemporalAq: js.UndefOr[H264TemporalAq] = js.native
  
  /**
    * Determines how timecodes should be inserted into the video elementary stream.
  - 'disabled': Do not include timecodes
  - 'picTimingSei': Pass through picture timing SEI messages from the source specified in Timecode Config
    */
  var TimecodeInsertion: js.UndefOr[H264TimecodeInsertionBehavior] = js.native
}
object H264Settings {
  
  @scala.inline
  def apply(): H264Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[H264Settings]
  }
  
  @scala.inline
  implicit class H264SettingsMutableBuilder[Self <: H264Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdaptiveQuantization(value: H264AdaptiveQuantization): Self = StObject.set(x, "AdaptiveQuantization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdaptiveQuantizationUndefined: Self = StObject.set(x, "AdaptiveQuantization", js.undefined)
    
    @scala.inline
    def setAfdSignaling(value: AfdSignaling): Self = StObject.set(x, "AfdSignaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfdSignalingUndefined: Self = StObject.set(x, "AfdSignaling", js.undefined)
    
    @scala.inline
    def setBitrate(value: integerMin1000): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    @scala.inline
    def setBufFillPct(value: integerMin0Max100): Self = StObject.set(x, "BufFillPct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufFillPctUndefined: Self = StObject.set(x, "BufFillPct", js.undefined)
    
    @scala.inline
    def setBufSize(value: integerMin0): Self = StObject.set(x, "BufSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufSizeUndefined: Self = StObject.set(x, "BufSize", js.undefined)
    
    @scala.inline
    def setColorMetadata(value: H264ColorMetadata): Self = StObject.set(x, "ColorMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorMetadataUndefined: Self = StObject.set(x, "ColorMetadata", js.undefined)
    
    @scala.inline
    def setColorSpaceSettings(value: H264ColorSpaceSettings): Self = StObject.set(x, "ColorSpaceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorSpaceSettingsUndefined: Self = StObject.set(x, "ColorSpaceSettings", js.undefined)
    
    @scala.inline
    def setEntropyEncoding(value: H264EntropyEncoding): Self = StObject.set(x, "EntropyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntropyEncodingUndefined: Self = StObject.set(x, "EntropyEncoding", js.undefined)
    
    @scala.inline
    def setFilterSettings(value: H264FilterSettings): Self = StObject.set(x, "FilterSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterSettingsUndefined: Self = StObject.set(x, "FilterSettings", js.undefined)
    
    @scala.inline
    def setFixedAfd(value: FixedAfd): Self = StObject.set(x, "FixedAfd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFixedAfdUndefined: Self = StObject.set(x, "FixedAfd", js.undefined)
    
    @scala.inline
    def setFlickerAq(value: H264FlickerAq): Self = StObject.set(x, "FlickerAq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlickerAqUndefined: Self = StObject.set(x, "FlickerAq", js.undefined)
    
    @scala.inline
    def setForceFieldPictures(value: H264ForceFieldPictures): Self = StObject.set(x, "ForceFieldPictures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceFieldPicturesUndefined: Self = StObject.set(x, "ForceFieldPictures", js.undefined)
    
    @scala.inline
    def setFramerateControl(value: H264FramerateControl): Self = StObject.set(x, "FramerateControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateControlUndefined: Self = StObject.set(x, "FramerateControl", js.undefined)
    
    @scala.inline
    def setFramerateDenominator(value: integerMin1): Self = StObject.set(x, "FramerateDenominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateDenominatorUndefined: Self = StObject.set(x, "FramerateDenominator", js.undefined)
    
    @scala.inline
    def setFramerateNumerator(value: integerMin1): Self = StObject.set(x, "FramerateNumerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateNumeratorUndefined: Self = StObject.set(x, "FramerateNumerator", js.undefined)
    
    @scala.inline
    def setGopBReference(value: H264GopBReference): Self = StObject.set(x, "GopBReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGopBReferenceUndefined: Self = StObject.set(x, "GopBReference", js.undefined)
    
    @scala.inline
    def setGopClosedCadence(value: integerMin0): Self = StObject.set(x, "GopClosedCadence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGopClosedCadenceUndefined: Self = StObject.set(x, "GopClosedCadence", js.undefined)
    
    @scala.inline
    def setGopNumBFrames(value: integerMin0Max7): Self = StObject.set(x, "GopNumBFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGopNumBFramesUndefined: Self = StObject.set(x, "GopNumBFrames", js.undefined)
    
    @scala.inline
    def setGopSize(value: double): Self = StObject.set(x, "GopSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGopSizeUndefined: Self = StObject.set(x, "GopSize", js.undefined)
    
    @scala.inline
    def setGopSizeUnits(value: H264GopSizeUnits): Self = StObject.set(x, "GopSizeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGopSizeUnitsUndefined: Self = StObject.set(x, "GopSizeUnits", js.undefined)
    
    @scala.inline
    def setLevel(value: H264Level): Self = StObject.set(x, "Level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "Level", js.undefined)
    
    @scala.inline
    def setLookAheadRateControl(value: H264LookAheadRateControl): Self = StObject.set(x, "LookAheadRateControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLookAheadRateControlUndefined: Self = StObject.set(x, "LookAheadRateControl", js.undefined)
    
    @scala.inline
    def setMaxBitrate(value: integerMin1000): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBitrateUndefined: Self = StObject.set(x, "MaxBitrate", js.undefined)
    
    @scala.inline
    def setMinIInterval(value: integerMin0Max30): Self = StObject.set(x, "MinIInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinIIntervalUndefined: Self = StObject.set(x, "MinIInterval", js.undefined)
    
    @scala.inline
    def setNumRefFrames(value: integerMin1Max6): Self = StObject.set(x, "NumRefFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumRefFramesUndefined: Self = StObject.set(x, "NumRefFrames", js.undefined)
    
    @scala.inline
    def setParControl(value: H264ParControl): Self = StObject.set(x, "ParControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParControlUndefined: Self = StObject.set(x, "ParControl", js.undefined)
    
    @scala.inline
    def setParDenominator(value: integerMin1): Self = StObject.set(x, "ParDenominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParDenominatorUndefined: Self = StObject.set(x, "ParDenominator", js.undefined)
    
    @scala.inline
    def setParNumerator(value: integerMin1): Self = StObject.set(x, "ParNumerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParNumeratorUndefined: Self = StObject.set(x, "ParNumerator", js.undefined)
    
    @scala.inline
    def setProfile(value: H264Profile): Self = StObject.set(x, "Profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "Profile", js.undefined)
    
    @scala.inline
    def setQualityLevel(value: H264QualityLevel): Self = StObject.set(x, "QualityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityLevelUndefined: Self = StObject.set(x, "QualityLevel", js.undefined)
    
    @scala.inline
    def setQvbrQualityLevel(value: integerMin1Max10): Self = StObject.set(x, "QvbrQualityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQvbrQualityLevelUndefined: Self = StObject.set(x, "QvbrQualityLevel", js.undefined)
    
    @scala.inline
    def setRateControlMode(value: H264RateControlMode): Self = StObject.set(x, "RateControlMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateControlModeUndefined: Self = StObject.set(x, "RateControlMode", js.undefined)
    
    @scala.inline
    def setScanType(value: H264ScanType): Self = StObject.set(x, "ScanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScanTypeUndefined: Self = StObject.set(x, "ScanType", js.undefined)
    
    @scala.inline
    def setSceneChangeDetect(value: H264SceneChangeDetect): Self = StObject.set(x, "SceneChangeDetect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSceneChangeDetectUndefined: Self = StObject.set(x, "SceneChangeDetect", js.undefined)
    
    @scala.inline
    def setSlices(value: integerMin1Max32): Self = StObject.set(x, "Slices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicesUndefined: Self = StObject.set(x, "Slices", js.undefined)
    
    @scala.inline
    def setSoftness(value: integerMin0Max128): Self = StObject.set(x, "Softness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftnessUndefined: Self = StObject.set(x, "Softness", js.undefined)
    
    @scala.inline
    def setSpatialAq(value: H264SpatialAq): Self = StObject.set(x, "SpatialAq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialAqUndefined: Self = StObject.set(x, "SpatialAq", js.undefined)
    
    @scala.inline
    def setSubgopLength(value: H264SubGopLength): Self = StObject.set(x, "SubgopLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubgopLengthUndefined: Self = StObject.set(x, "SubgopLength", js.undefined)
    
    @scala.inline
    def setSyntax(value: H264Syntax): Self = StObject.set(x, "Syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyntaxUndefined: Self = StObject.set(x, "Syntax", js.undefined)
    
    @scala.inline
    def setTemporalAq(value: H264TemporalAq): Self = StObject.set(x, "TemporalAq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporalAqUndefined: Self = StObject.set(x, "TemporalAq", js.undefined)
    
    @scala.inline
    def setTimecodeInsertion(value: H264TimecodeInsertionBehavior): Self = StObject.set(x, "TimecodeInsertion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimecodeInsertionUndefined: Self = StObject.set(x, "TimecodeInsertion", js.undefined)
  }
}
