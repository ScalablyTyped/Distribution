package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait H264Settings extends js.Object {
  
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
  implicit class H264SettingsOps[Self <: H264Settings] (val x: Self) extends AnyVal {
    
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
    def setAdaptiveQuantization(value: H264AdaptiveQuantization): Self = this.set("AdaptiveQuantization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdaptiveQuantization: Self = this.set("AdaptiveQuantization", js.undefined)
    
    @scala.inline
    def setAfdSignaling(value: AfdSignaling): Self = this.set("AfdSignaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfdSignaling: Self = this.set("AfdSignaling", js.undefined)
    
    @scala.inline
    def setBitrate(value: integerMin1000): Self = this.set("Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitrate: Self = this.set("Bitrate", js.undefined)
    
    @scala.inline
    def setBufFillPct(value: integerMin0Max100): Self = this.set("BufFillPct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufFillPct: Self = this.set("BufFillPct", js.undefined)
    
    @scala.inline
    def setBufSize(value: integerMin0): Self = this.set("BufSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufSize: Self = this.set("BufSize", js.undefined)
    
    @scala.inline
    def setColorMetadata(value: H264ColorMetadata): Self = this.set("ColorMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorMetadata: Self = this.set("ColorMetadata", js.undefined)
    
    @scala.inline
    def setColorSpaceSettings(value: H264ColorSpaceSettings): Self = this.set("ColorSpaceSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColorSpaceSettings: Self = this.set("ColorSpaceSettings", js.undefined)
    
    @scala.inline
    def setEntropyEncoding(value: H264EntropyEncoding): Self = this.set("EntropyEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntropyEncoding: Self = this.set("EntropyEncoding", js.undefined)
    
    @scala.inline
    def setFilterSettings(value: H264FilterSettings): Self = this.set("FilterSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterSettings: Self = this.set("FilterSettings", js.undefined)
    
    @scala.inline
    def setFixedAfd(value: FixedAfd): Self = this.set("FixedAfd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedAfd: Self = this.set("FixedAfd", js.undefined)
    
    @scala.inline
    def setFlickerAq(value: H264FlickerAq): Self = this.set("FlickerAq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlickerAq: Self = this.set("FlickerAq", js.undefined)
    
    @scala.inline
    def setForceFieldPictures(value: H264ForceFieldPictures): Self = this.set("ForceFieldPictures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceFieldPictures: Self = this.set("ForceFieldPictures", js.undefined)
    
    @scala.inline
    def setFramerateControl(value: H264FramerateControl): Self = this.set("FramerateControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramerateControl: Self = this.set("FramerateControl", js.undefined)
    
    @scala.inline
    def setFramerateDenominator(value: integerMin1): Self = this.set("FramerateDenominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramerateDenominator: Self = this.set("FramerateDenominator", js.undefined)
    
    @scala.inline
    def setFramerateNumerator(value: integerMin1): Self = this.set("FramerateNumerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramerateNumerator: Self = this.set("FramerateNumerator", js.undefined)
    
    @scala.inline
    def setGopBReference(value: H264GopBReference): Self = this.set("GopBReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGopBReference: Self = this.set("GopBReference", js.undefined)
    
    @scala.inline
    def setGopClosedCadence(value: integerMin0): Self = this.set("GopClosedCadence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGopClosedCadence: Self = this.set("GopClosedCadence", js.undefined)
    
    @scala.inline
    def setGopNumBFrames(value: integerMin0Max7): Self = this.set("GopNumBFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGopNumBFrames: Self = this.set("GopNumBFrames", js.undefined)
    
    @scala.inline
    def setGopSize(value: double): Self = this.set("GopSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGopSize: Self = this.set("GopSize", js.undefined)
    
    @scala.inline
    def setGopSizeUnits(value: H264GopSizeUnits): Self = this.set("GopSizeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGopSizeUnits: Self = this.set("GopSizeUnits", js.undefined)
    
    @scala.inline
    def setLevel(value: H264Level): Self = this.set("Level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("Level", js.undefined)
    
    @scala.inline
    def setLookAheadRateControl(value: H264LookAheadRateControl): Self = this.set("LookAheadRateControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLookAheadRateControl: Self = this.set("LookAheadRateControl", js.undefined)
    
    @scala.inline
    def setMaxBitrate(value: integerMin1000): Self = this.set("MaxBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBitrate: Self = this.set("MaxBitrate", js.undefined)
    
    @scala.inline
    def setMinIInterval(value: integerMin0Max30): Self = this.set("MinIInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinIInterval: Self = this.set("MinIInterval", js.undefined)
    
    @scala.inline
    def setNumRefFrames(value: integerMin1Max6): Self = this.set("NumRefFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumRefFrames: Self = this.set("NumRefFrames", js.undefined)
    
    @scala.inline
    def setParControl(value: H264ParControl): Self = this.set("ParControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParControl: Self = this.set("ParControl", js.undefined)
    
    @scala.inline
    def setParDenominator(value: integerMin1): Self = this.set("ParDenominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParDenominator: Self = this.set("ParDenominator", js.undefined)
    
    @scala.inline
    def setParNumerator(value: integerMin1): Self = this.set("ParNumerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParNumerator: Self = this.set("ParNumerator", js.undefined)
    
    @scala.inline
    def setProfile(value: H264Profile): Self = this.set("Profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("Profile", js.undefined)
    
    @scala.inline
    def setQualityLevel(value: H264QualityLevel): Self = this.set("QualityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualityLevel: Self = this.set("QualityLevel", js.undefined)
    
    @scala.inline
    def setQvbrQualityLevel(value: integerMin1Max10): Self = this.set("QvbrQualityLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQvbrQualityLevel: Self = this.set("QvbrQualityLevel", js.undefined)
    
    @scala.inline
    def setRateControlMode(value: H264RateControlMode): Self = this.set("RateControlMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateControlMode: Self = this.set("RateControlMode", js.undefined)
    
    @scala.inline
    def setScanType(value: H264ScanType): Self = this.set("ScanType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScanType: Self = this.set("ScanType", js.undefined)
    
    @scala.inline
    def setSceneChangeDetect(value: H264SceneChangeDetect): Self = this.set("SceneChangeDetect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSceneChangeDetect: Self = this.set("SceneChangeDetect", js.undefined)
    
    @scala.inline
    def setSlices(value: integerMin1Max32): Self = this.set("Slices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlices: Self = this.set("Slices", js.undefined)
    
    @scala.inline
    def setSoftness(value: integerMin0Max128): Self = this.set("Softness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftness: Self = this.set("Softness", js.undefined)
    
    @scala.inline
    def setSpatialAq(value: H264SpatialAq): Self = this.set("SpatialAq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpatialAq: Self = this.set("SpatialAq", js.undefined)
    
    @scala.inline
    def setSubgopLength(value: H264SubGopLength): Self = this.set("SubgopLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubgopLength: Self = this.set("SubgopLength", js.undefined)
    
    @scala.inline
    def setSyntax(value: H264Syntax): Self = this.set("Syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyntax: Self = this.set("Syntax", js.undefined)
    
    @scala.inline
    def setTemporalAq(value: H264TemporalAq): Self = this.set("TemporalAq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemporalAq: Self = this.set("TemporalAq", js.undefined)
    
    @scala.inline
    def setTimecodeInsertion(value: H264TimecodeInsertionBehavior): Self = this.set("TimecodeInsertion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimecodeInsertion: Self = this.set("TimecodeInsertion", js.undefined)
  }
}
