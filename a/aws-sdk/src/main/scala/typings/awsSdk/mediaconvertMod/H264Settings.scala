package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait H264Settings extends js.Object {
  /**
    * Adaptive quantization. Allows intra-frame quantizers to vary to improve visual quality.
    */
  var AdaptiveQuantization: js.UndefOr[H264AdaptiveQuantization] = js.native
  /**
    * Specify the average bitrate in bits per second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique when rounded down to the nearest multiple of 1000.
    */
  var Bitrate: js.UndefOr[integerMin1000Max1152000000] = js.native
  /**
    * Specify an H.264 level that is consistent with your output video settings. If you aren't sure what level to specify, choose Auto (AUTO).
    */
  var CodecLevel: js.UndefOr[H264CodecLevel] = js.native
  /**
    * H.264 Profile. High 4:2:2 and 10-bit profiles are only available with the AVC-I License.
    */
  var CodecProfile: js.UndefOr[H264CodecProfile] = js.native
  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  var DynamicSubGop: js.UndefOr[H264DynamicSubGop] = js.native
  /**
    * Entropy encoding mode. Use CABAC (must be in Main or High profile) or CAVLC.
    */
  var EntropyEncoding: js.UndefOr[H264EntropyEncoding] = js.native
  /**
    * Choosing FORCE_FIELD disables PAFF encoding for interlaced outputs.
    */
  var FieldEncoding: js.UndefOr[H264FieldEncoding] = js.native
  /**
    * Adjust quantization within each frame to reduce flicker or 'pop' on I-frames.
    */
  var FlickerAdaptiveQuantization: js.UndefOr[H264FlickerAdaptiveQuantization] = js.native
  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[H264FramerateControl] = js.native
  /**
    * Optional. Specify how the transcoder performs framerate conversion. The default behavior is to use duplicate drop conversion.
    */
  var FramerateConversionAlgorithm: js.UndefOr[H264FramerateConversionAlgorithm] = js.native
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Frame rate numerator - frame rate is a fraction, e.g. 24000 / 1001 = 23.976 fps.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * If enable, use reference B frames for GOP structures that have B frames > 1.
    */
  var GopBReference: js.UndefOr[H264GopBReference] = js.native
  /**
    * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
    */
  var GopClosedCadence: js.UndefOr[integerMin0Max2147483647] = js.native
  /**
    * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
    */
  var GopSize: js.UndefOr[doubleMin0] = js.native
  /**
    * Indicates if the GOP Size in H264 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
    */
  var GopSizeUnits: js.UndefOr[H264GopSizeUnits] = js.native
  /**
    * Percentage of the buffer that should initially be filled (HRD buffer model).
    */
  var HrdBufferInitialFillPercentage: js.UndefOr[integerMin0Max100] = js.native
  /**
    * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
    */
  var HrdBufferSize: js.UndefOr[integerMin0Max1152000000] = js.native
  /**
    * Use Interlace mode (InterlaceMode) to choose the scan line type for the output. * Top Field First (TOP_FIELD) and Bottom Field First (BOTTOM_FIELD) produce interlaced output with the entire output having the same field polarity (top or bottom first). * Follow, Default Top (FOLLOW_TOP_FIELD) and Follow, Default Bottom (FOLLOW_BOTTOM_FIELD) use the same field polarity as the source. Therefore, behavior depends on the input scan type, as follows.
    - If the source is interlaced, the output will be interlaced with the same polarity as the source (it will follow the source). The output could therefore be a mix of "top field first" and "bottom field first".
    - If the source is progressive, the output will be interlaced with "top field first" or "bottom field first" polarity, depending on which of the Follow options you chose.
    */
  var InterlaceMode: js.UndefOr[H264InterlaceMode] = js.native
  /**
    * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when Rate control mode is QVBR.
    */
  var MaxBitrate: js.UndefOr[integerMin1000Max1152000000] = js.native
  /**
    * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
    */
  var MinIInterval: js.UndefOr[integerMin0Max30] = js.native
  /**
    * Number of B-frames between reference frames.
    */
  var NumberBFramesBetweenReferenceFrames: js.UndefOr[integerMin0Max7] = js.native
  /**
    * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced encoding.
    */
  var NumberReferenceFrames: js.UndefOr[integerMin1Max6] = js.native
  /**
    * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
    */
  var ParControl: js.UndefOr[H264ParControl] = js.native
  /**
    * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this example, the value for parDenominator is 33.
    */
  var ParDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this example, the value for parNumerator is 40.
    */
  var ParNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  /**
    * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, single-pass encoding.
    */
  var QualityTuningLevel: js.UndefOr[H264QualityTuningLevel] = js.native
  /**
    * Settings for quality-defined variable bitrate encoding with the H.264 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
    */
  var QvbrSettings: js.UndefOr[H264QvbrSettings] = js.native
  /**
    * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
    */
  var RateControlMode: js.UndefOr[H264RateControlMode] = js.native
  /**
    * Places a PPS header on each encoded picture, even if repeated.
    */
  var RepeatPps: js.UndefOr[H264RepeatPps] = js.native
  /**
    * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for further video quality improvement. For more information about QVBR, see https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
    */
  var SceneChangeDetect: js.UndefOr[H264SceneChangeDetect] = js.native
  /**
    * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
    */
  var Slices: js.UndefOr[integerMin1Max32] = js.native
  /**
    * Enables Slow PAL rate conversion. 23.976fps and 24fps input is relabeled as 25fps, and audio is sped up correspondingly.
    */
  var SlowPal: js.UndefOr[H264SlowPal] = js.native
  /**
    * Softness. Selects quantizer matrix, larger values reduce high-frequency content in the encoded image.
    */
  var Softness: js.UndefOr[integerMin0Max128] = js.native
  /**
    * Adjust quantization within each frame based on spatial variation of content complexity.
    */
  var SpatialAdaptiveQuantization: js.UndefOr[H264SpatialAdaptiveQuantization] = js.native
  /**
    * Produces a bitstream compliant with SMPTE RP-2027.
    */
  var Syntax: js.UndefOr[H264Syntax] = js.native
  /**
    * This field applies only if the Streams > Advanced > Framerate (framerate) field  is set to 29.970. This field works with the Streams > Advanced > Preprocessors > Deinterlacer  field (deinterlace_mode) and the Streams > Advanced > Interlaced Mode field (interlace_mode)  to identify the scan type for the output: Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces 23.976; the player converts this output to 29.97i.
    */
  var Telecine: js.UndefOr[H264Telecine] = js.native
  /**
    * Adjust quantization within each frame based on temporal variation of content complexity.
    */
  var TemporalAdaptiveQuantization: js.UndefOr[H264TemporalAdaptiveQuantization] = js.native
  /**
    * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
    */
  var UnregisteredSeiTimecode: js.UndefOr[H264UnregisteredSeiTimecode] = js.native
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
    def setBitrate(value: integerMin1000Max1152000000): Self = this.set("Bitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBitrate: Self = this.set("Bitrate", js.undefined)
    @scala.inline
    def setCodecLevel(value: H264CodecLevel): Self = this.set("CodecLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodecLevel: Self = this.set("CodecLevel", js.undefined)
    @scala.inline
    def setCodecProfile(value: H264CodecProfile): Self = this.set("CodecProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCodecProfile: Self = this.set("CodecProfile", js.undefined)
    @scala.inline
    def setDynamicSubGop(value: H264DynamicSubGop): Self = this.set("DynamicSubGop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicSubGop: Self = this.set("DynamicSubGop", js.undefined)
    @scala.inline
    def setEntropyEncoding(value: H264EntropyEncoding): Self = this.set("EntropyEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntropyEncoding: Self = this.set("EntropyEncoding", js.undefined)
    @scala.inline
    def setFieldEncoding(value: H264FieldEncoding): Self = this.set("FieldEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldEncoding: Self = this.set("FieldEncoding", js.undefined)
    @scala.inline
    def setFlickerAdaptiveQuantization(value: H264FlickerAdaptiveQuantization): Self = this.set("FlickerAdaptiveQuantization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlickerAdaptiveQuantization: Self = this.set("FlickerAdaptiveQuantization", js.undefined)
    @scala.inline
    def setFramerateControl(value: H264FramerateControl): Self = this.set("FramerateControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramerateControl: Self = this.set("FramerateControl", js.undefined)
    @scala.inline
    def setFramerateConversionAlgorithm(value: H264FramerateConversionAlgorithm): Self = this.set("FramerateConversionAlgorithm", value.asInstanceOf[js.Any])
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
    def setGopBReference(value: H264GopBReference): Self = this.set("GopBReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGopBReference: Self = this.set("GopBReference", js.undefined)
    @scala.inline
    def setGopClosedCadence(value: integerMin0Max2147483647): Self = this.set("GopClosedCadence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGopClosedCadence: Self = this.set("GopClosedCadence", js.undefined)
    @scala.inline
    def setGopSize(value: doubleMin0): Self = this.set("GopSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGopSize: Self = this.set("GopSize", js.undefined)
    @scala.inline
    def setGopSizeUnits(value: H264GopSizeUnits): Self = this.set("GopSizeUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGopSizeUnits: Self = this.set("GopSizeUnits", js.undefined)
    @scala.inline
    def setHrdBufferInitialFillPercentage(value: integerMin0Max100): Self = this.set("HrdBufferInitialFillPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHrdBufferInitialFillPercentage: Self = this.set("HrdBufferInitialFillPercentage", js.undefined)
    @scala.inline
    def setHrdBufferSize(value: integerMin0Max1152000000): Self = this.set("HrdBufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHrdBufferSize: Self = this.set("HrdBufferSize", js.undefined)
    @scala.inline
    def setInterlaceMode(value: H264InterlaceMode): Self = this.set("InterlaceMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterlaceMode: Self = this.set("InterlaceMode", js.undefined)
    @scala.inline
    def setMaxBitrate(value: integerMin1000Max1152000000): Self = this.set("MaxBitrate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxBitrate: Self = this.set("MaxBitrate", js.undefined)
    @scala.inline
    def setMinIInterval(value: integerMin0Max30): Self = this.set("MinIInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinIInterval: Self = this.set("MinIInterval", js.undefined)
    @scala.inline
    def setNumberBFramesBetweenReferenceFrames(value: integerMin0Max7): Self = this.set("NumberBFramesBetweenReferenceFrames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberBFramesBetweenReferenceFrames: Self = this.set("NumberBFramesBetweenReferenceFrames", js.undefined)
    @scala.inline
    def setNumberReferenceFrames(value: integerMin1Max6): Self = this.set("NumberReferenceFrames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberReferenceFrames: Self = this.set("NumberReferenceFrames", js.undefined)
    @scala.inline
    def setParControl(value: H264ParControl): Self = this.set("ParControl", value.asInstanceOf[js.Any])
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
    def setQualityTuningLevel(value: H264QualityTuningLevel): Self = this.set("QualityTuningLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualityTuningLevel: Self = this.set("QualityTuningLevel", js.undefined)
    @scala.inline
    def setQvbrSettings(value: H264QvbrSettings): Self = this.set("QvbrSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQvbrSettings: Self = this.set("QvbrSettings", js.undefined)
    @scala.inline
    def setRateControlMode(value: H264RateControlMode): Self = this.set("RateControlMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRateControlMode: Self = this.set("RateControlMode", js.undefined)
    @scala.inline
    def setRepeatPps(value: H264RepeatPps): Self = this.set("RepeatPps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRepeatPps: Self = this.set("RepeatPps", js.undefined)
    @scala.inline
    def setSceneChangeDetect(value: H264SceneChangeDetect): Self = this.set("SceneChangeDetect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSceneChangeDetect: Self = this.set("SceneChangeDetect", js.undefined)
    @scala.inline
    def setSlices(value: integerMin1Max32): Self = this.set("Slices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlices: Self = this.set("Slices", js.undefined)
    @scala.inline
    def setSlowPal(value: H264SlowPal): Self = this.set("SlowPal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlowPal: Self = this.set("SlowPal", js.undefined)
    @scala.inline
    def setSoftness(value: integerMin0Max128): Self = this.set("Softness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSoftness: Self = this.set("Softness", js.undefined)
    @scala.inline
    def setSpatialAdaptiveQuantization(value: H264SpatialAdaptiveQuantization): Self = this.set("SpatialAdaptiveQuantization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpatialAdaptiveQuantization: Self = this.set("SpatialAdaptiveQuantization", js.undefined)
    @scala.inline
    def setSyntax(value: H264Syntax): Self = this.set("Syntax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyntax: Self = this.set("Syntax", js.undefined)
    @scala.inline
    def setTelecine(value: H264Telecine): Self = this.set("Telecine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTelecine: Self = this.set("Telecine", js.undefined)
    @scala.inline
    def setTemporalAdaptiveQuantization(value: H264TemporalAdaptiveQuantization): Self = this.set("TemporalAdaptiveQuantization", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemporalAdaptiveQuantization: Self = this.set("TemporalAdaptiveQuantization", js.undefined)
    @scala.inline
    def setUnregisteredSeiTimecode(value: H264UnregisteredSeiTimecode): Self = this.set("UnregisteredSeiTimecode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnregisteredSeiTimecode: Self = this.set("UnregisteredSeiTimecode", js.undefined)
  }
  
}

