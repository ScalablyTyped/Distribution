package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait H265Settings extends js.Object {
  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  var AdaptiveQuantization: js.UndefOr[H265AdaptiveQuantization] = js.native
  /**
    * Indicates that AFD values will be written into the output stream.  If afdSignaling is "auto", the system will try to preserve the input AFD value (in cases where multiple AFD values are valid). If set to "fixed", the AFD value will be the value configured in the fixedAfd parameter.
    */
  var AfdSignaling: js.UndefOr[typings.awsSdk.medialiveMod.AfdSignaling] = js.native
  /**
    * Whether or not EML should insert an Alternative Transfer Function SEI message to support backwards compatibility with non-HDR decoders and displays.
    */
  var AlternativeTransferFunction: js.UndefOr[H265AlternativeTransferFunction] = js.native
  /**
    * Average bitrate in bits/second. Required when the rate control mode is VBR or CBR. Not used for QVBR. In an MS Smooth output group, each output must have a unique value when its bitrate is rounded down to the nearest multiple of 1000.
    */
  var Bitrate: js.UndefOr[integerMin100000Max40000000] = js.native
  /**
    * Size of buffer (HRD buffer model) in bits.
    */
  var BufSize: js.UndefOr[integerMin100000Max80000000] = js.native
  /**
    * Includes colorspace metadata in the output.
    */
  var ColorMetadata: js.UndefOr[H265ColorMetadata] = js.native
  /**
    * Color Space settings
    */
  var ColorSpaceSettings: js.UndefOr[H265ColorSpaceSettings] = js.native
  /**
    * Four bit AFD value to write on all frames of video in the output stream. Only valid when afdSignaling is set to 'Fixed'.
    */
  var FixedAfd: js.UndefOr[typings.awsSdk.medialiveMod.FixedAfd] = js.native
  /**
    * If set to enabled, adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
    */
  var FlickerAq: js.UndefOr[H265FlickerAq] = js.native
  /**
    * Framerate denominator.
    */
  var FramerateDenominator: integerMin1Max3003 = js.native
  /**
    * Framerate numerator - framerate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
    */
  var FramerateNumerator: integerMin1 = js.native
  /**
    * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
    */
  var GopClosedCadence: js.UndefOr[integerMin0] = js.native
  /**
    * GOP size (keyframe interval) in units of either frames or seconds per gopSizeUnits.
  If gopSizeUnits is frames, gopSize must be an integer and must be greater than or equal to 1.
  If gopSizeUnits is seconds, gopSize must be greater than 0, but need not be an integer.
    */
  var GopSize: js.UndefOr[double] = js.native
  /**
    * Indicates if the gopSize is specified in frames or seconds. If seconds the system will convert the gopSize into a frame count at run time.
    */
  var GopSizeUnits: js.UndefOr[H265GopSizeUnits] = js.native
  /**
    * H.265 Level.
    */
  var Level: js.UndefOr[H265Level] = js.native
  /**
    * Amount of lookahead. A value of low can decrease latency and memory usage, while high can produce better quality for certain content.
    */
  var LookAheadRateControl: js.UndefOr[H265LookAheadRateControl] = js.native
  /**
    * For QVBR: See the tooltip for Quality level
    */
  var MaxBitrate: js.UndefOr[integerMin100000Max40000000] = js.native
  /**
    * Only meaningful if sceneChangeDetect is set to enabled.  Defaults to 5 if multiplex rate control is used.  Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
    */
  var MinIInterval: js.UndefOr[integerMin0Max30] = js.native
  /**
    * Pixel Aspect Ratio denominator.
    */
  var ParDenominator: js.UndefOr[integerMin1] = js.native
  /**
    * Pixel Aspect Ratio numerator.
    */
  var ParNumerator: js.UndefOr[integerMin1] = js.native
  /**
    * H.265 Profile.
    */
  var Profile: js.UndefOr[H265Profile] = js.native
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
  CBR: Quality varies, depending on the video complexity. Recommended only if you distribute
  your assets to devices that cannot handle variable bitrates.
    */
  var RateControlMode: js.UndefOr[H265RateControlMode] = js.native
  /**
    * Sets the scan type of the output to progressive or top-field-first interlaced.
    */
  var ScanType: js.UndefOr[H265ScanType] = js.native
  /**
    * Scene change detection.
    */
  var SceneChangeDetect: js.UndefOr[H265SceneChangeDetect] = js.native
  /**
    * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
  This field is optional; when no value is specified the encoder will choose the number of slices based on encode resolution.
    */
  var Slices: js.UndefOr[integerMin1Max16] = js.native
  /**
    * H.265 Tier.
    */
  var Tier: js.UndefOr[H265Tier] = js.native
  /**
    * Determines how timecodes should be inserted into the video elementary stream.
  - 'disabled': Do not include timecodes
  - 'picTimingSei': Pass through picture timing SEI messages from the source specified in Timecode Config
    */
  var TimecodeInsertion: js.UndefOr[H265TimecodeInsertionBehavior] = js.native
}

object H265Settings {
  @scala.inline
  def apply(
    FramerateDenominator: integerMin1Max3003,
    FramerateNumerator: integerMin1,
    AdaptiveQuantization: H265AdaptiveQuantization = null,
    AfdSignaling: AfdSignaling = null,
    AlternativeTransferFunction: H265AlternativeTransferFunction = null,
    Bitrate: js.UndefOr[integerMin100000Max40000000] = js.undefined,
    BufSize: js.UndefOr[integerMin100000Max80000000] = js.undefined,
    ColorMetadata: H265ColorMetadata = null,
    ColorSpaceSettings: H265ColorSpaceSettings = null,
    FixedAfd: FixedAfd = null,
    FlickerAq: H265FlickerAq = null,
    GopClosedCadence: js.UndefOr[integerMin0] = js.undefined,
    GopSize: js.UndefOr[double] = js.undefined,
    GopSizeUnits: H265GopSizeUnits = null,
    Level: H265Level = null,
    LookAheadRateControl: H265LookAheadRateControl = null,
    MaxBitrate: js.UndefOr[integerMin100000Max40000000] = js.undefined,
    MinIInterval: js.UndefOr[integerMin0Max30] = js.undefined,
    ParDenominator: js.UndefOr[integerMin1] = js.undefined,
    ParNumerator: js.UndefOr[integerMin1] = js.undefined,
    Profile: H265Profile = null,
    QvbrQualityLevel: js.UndefOr[integerMin1Max10] = js.undefined,
    RateControlMode: H265RateControlMode = null,
    ScanType: H265ScanType = null,
    SceneChangeDetect: H265SceneChangeDetect = null,
    Slices: js.UndefOr[integerMin1Max16] = js.undefined,
    Tier: H265Tier = null,
    TimecodeInsertion: H265TimecodeInsertionBehavior = null
  ): H265Settings = {
    val __obj = js.Dynamic.literal(FramerateDenominator = FramerateDenominator.asInstanceOf[js.Any], FramerateNumerator = FramerateNumerator.asInstanceOf[js.Any])
    if (AdaptiveQuantization != null) __obj.updateDynamic("AdaptiveQuantization")(AdaptiveQuantization.asInstanceOf[js.Any])
    if (AfdSignaling != null) __obj.updateDynamic("AfdSignaling")(AfdSignaling.asInstanceOf[js.Any])
    if (AlternativeTransferFunction != null) __obj.updateDynamic("AlternativeTransferFunction")(AlternativeTransferFunction.asInstanceOf[js.Any])
    if (!js.isUndefined(Bitrate)) __obj.updateDynamic("Bitrate")(Bitrate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(BufSize)) __obj.updateDynamic("BufSize")(BufSize.get.asInstanceOf[js.Any])
    if (ColorMetadata != null) __obj.updateDynamic("ColorMetadata")(ColorMetadata.asInstanceOf[js.Any])
    if (ColorSpaceSettings != null) __obj.updateDynamic("ColorSpaceSettings")(ColorSpaceSettings.asInstanceOf[js.Any])
    if (FixedAfd != null) __obj.updateDynamic("FixedAfd")(FixedAfd.asInstanceOf[js.Any])
    if (FlickerAq != null) __obj.updateDynamic("FlickerAq")(FlickerAq.asInstanceOf[js.Any])
    if (!js.isUndefined(GopClosedCadence)) __obj.updateDynamic("GopClosedCadence")(GopClosedCadence.get.asInstanceOf[js.Any])
    if (!js.isUndefined(GopSize)) __obj.updateDynamic("GopSize")(GopSize.get.asInstanceOf[js.Any])
    if (GopSizeUnits != null) __obj.updateDynamic("GopSizeUnits")(GopSizeUnits.asInstanceOf[js.Any])
    if (Level != null) __obj.updateDynamic("Level")(Level.asInstanceOf[js.Any])
    if (LookAheadRateControl != null) __obj.updateDynamic("LookAheadRateControl")(LookAheadRateControl.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxBitrate)) __obj.updateDynamic("MaxBitrate")(MaxBitrate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MinIInterval)) __obj.updateDynamic("MinIInterval")(MinIInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ParDenominator)) __obj.updateDynamic("ParDenominator")(ParDenominator.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ParNumerator)) __obj.updateDynamic("ParNumerator")(ParNumerator.get.asInstanceOf[js.Any])
    if (Profile != null) __obj.updateDynamic("Profile")(Profile.asInstanceOf[js.Any])
    if (!js.isUndefined(QvbrQualityLevel)) __obj.updateDynamic("QvbrQualityLevel")(QvbrQualityLevel.get.asInstanceOf[js.Any])
    if (RateControlMode != null) __obj.updateDynamic("RateControlMode")(RateControlMode.asInstanceOf[js.Any])
    if (ScanType != null) __obj.updateDynamic("ScanType")(ScanType.asInstanceOf[js.Any])
    if (SceneChangeDetect != null) __obj.updateDynamic("SceneChangeDetect")(SceneChangeDetect.asInstanceOf[js.Any])
    if (!js.isUndefined(Slices)) __obj.updateDynamic("Slices")(Slices.get.asInstanceOf[js.Any])
    if (Tier != null) __obj.updateDynamic("Tier")(Tier.asInstanceOf[js.Any])
    if (TimecodeInsertion != null) __obj.updateDynamic("TimecodeInsertion")(TimecodeInsertion.asInstanceOf[js.Any])
    __obj.asInstanceOf[H265Settings]
  }
}

