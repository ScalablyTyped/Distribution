package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait H265Settings extends StObject {
  
  /**
    * Specify the strength of any adaptive quantization filters that you enable. The value that you choose here applies to the following settings: Flicker adaptive quantization (flickerAdaptiveQuantization), Spatial adaptive quantization (spatialAdaptiveQuantization), and Temporal adaptive quantization (temporalAdaptiveQuantization).
    */
  var AdaptiveQuantization: js.UndefOr[H265AdaptiveQuantization] = js.native
  
  /**
    * Enables Alternate Transfer Function SEI message for outputs using Hybrid Log Gamma (HLG) Electro-Optical Transfer Function (EOTF).
    */
  var AlternateTransferFunctionSei: js.UndefOr[H265AlternateTransferFunctionSei] = js.native
  
  /**
    * Specify the average bitrate in bits per second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique when rounded down to the nearest multiple of 1000.
    */
  var Bitrate: js.UndefOr[integerMin1000Max1466400000] = js.native
  
  /**
    * H.265 Level.
    */
  var CodecLevel: js.UndefOr[H265CodecLevel] = js.native
  
  /**
    * Represents the Profile and Tier, per the HEVC (H.265) specification. Selections are grouped as [Profile] / [Tier], so "Main/High" represents Main Profile with High Tier. 4:2:2 profiles are only available with the HEVC 4:2:2 License.
    */
  var CodecProfile: js.UndefOr[H265CodecProfile] = js.native
  
  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  var DynamicSubGop: js.UndefOr[H265DynamicSubGop] = js.native
  
  /**
    * Enable this setting to have the encoder reduce I-frame pop. I-frame pop appears as a visual flicker that can arise when the encoder saves bits by copying some macroblocks many times from frame to frame, and then refreshes them at the I-frame. When you enable this setting, the encoder updates these macroblocks slightly more often to smooth out the flicker. This setting is disabled by default. Related setting: In addition to enabling this setting, you must also set adaptiveQuantization to a value other than Off (OFF).
    */
  var FlickerAdaptiveQuantization: js.UndefOr[H265FlickerAdaptiveQuantization] = js.native
  
  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[H265FramerateControl] = js.native
  
  /**
    * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
    */
  var FramerateConversionAlgorithm: js.UndefOr[H265FramerateConversionAlgorithm] = js.native
  
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this example, use 24000 for the value of FramerateNumerator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  
  /**
    * If enable, use reference B frames for GOP structures that have B frames > 1.
    */
  var GopBReference: js.UndefOr[H265GopBReference] = js.native
  
  /**
    * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
    */
  var GopClosedCadence: js.UndefOr[integerMin0Max2147483647] = js.native
  
  /**
    * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
    */
  var GopSize: js.UndefOr[doubleMin0] = js.native
  
  /**
    * Indicates if the GOP Size in H265 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
    */
  var GopSizeUnits: js.UndefOr[H265GopSizeUnits] = js.native
  
  /**
    * Percentage of the buffer that should initially be filled (HRD buffer model).
    */
  var HrdBufferInitialFillPercentage: js.UndefOr[integerMin0Max100] = js.native
  
  /**
    * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
    */
  var HrdBufferSize: js.UndefOr[integerMin0Max1466400000] = js.native
  
  /**
    * Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
    */
  var InterlaceMode: js.UndefOr[H265InterlaceMode] = js.native
  
  /**
    * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when Rate control mode is QVBR.
    */
  var MaxBitrate: js.UndefOr[integerMin1000Max1466400000] = js.native
  
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
  var ParControl: js.UndefOr[H265ParControl] = js.native
  
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
  var QualityTuningLevel: js.UndefOr[H265QualityTuningLevel] = js.native
  
  /**
    * Settings for quality-defined variable bitrate encoding with the H.265 codec. Required when you set Rate control mode to QVBR. Not valid when you set Rate control mode to a value other than QVBR, or when you don't define Rate control mode.
    */
  var QvbrSettings: js.UndefOr[H265QvbrSettings] = js.native
  
  /**
    * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
    */
  var RateControlMode: js.UndefOr[H265RateControlMode] = js.native
  
  /**
    * Specify Sample Adaptive Offset (SAO) filter strength.  Adaptive mode dynamically selects best strength based on content
    */
  var SampleAdaptiveOffsetFilterMode: js.UndefOr[H265SampleAdaptiveOffsetFilterMode] = js.native
  
  /**
    * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for further video quality improvement. For more information about QVBR, see https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
    */
  var SceneChangeDetect: js.UndefOr[H265SceneChangeDetect] = js.native
  
  /**
    * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
    */
  var Slices: js.UndefOr[integerMin1Max32] = js.native
  
  /**
    * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
    */
  var SlowPal: js.UndefOr[H265SlowPal] = js.native
  
  /**
    * Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture, you might choose to disable this feature. Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video games, set it to Low. For content with a wider variety of textures, set it to High or Higher.
    */
  var SpatialAdaptiveQuantization: js.UndefOr[H265SpatialAdaptiveQuantization] = js.native
  
  /**
    * This field applies only if the Streams > Advanced > Framerate (framerate) field  is set to 29.970. This field works with the Streams > Advanced > Preprocessors > Deinterlacer  field (deinterlace_mode) and the Streams > Advanced > Interlaced Mode field (interlace_mode)  to identify the scan type for the output: Progressive, Interlaced, Hard Telecine or Soft Telecine. - Hard: produces 29.97i output from 23.976 input. - Soft: produces 23.976; the player converts this output to 29.97i.
    */
  var Telecine: js.UndefOr[H265Telecine] = js.native
  
  /**
    * Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on temporal variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen that doesn't have moving objects with sharp edges, such as sports athletes' faces, you might choose to disable this feature. Related setting: When you enable temporal quantization, adjust the strength of the filter with the setting Adaptive quantization (adaptiveQuantization).
    */
  var TemporalAdaptiveQuantization: js.UndefOr[H265TemporalAdaptiveQuantization] = js.native
  
  /**
    * Enables temporal layer identifiers in the encoded bitstream. Up to 3 layers are supported depending on GOP structure: I- and P-frames form one layer, reference B-frames can form a second layer and non-reference b-frames can form a third layer. Decoders can optionally decode only the lower temporal layers to generate a lower frame rate output. For example, given a bitstream with temporal IDs and with b-frames = 1 (i.e. IbPbPb display order), a decoder could decode all the frames for full frame rate output or only the I and P frames (lowest temporal layer) for a half frame rate output.
    */
  var TemporalIds: js.UndefOr[H265TemporalIds] = js.native
  
  /**
    * Enable use of tiles, allowing horizontal as well as vertical subdivision of the encoded pictures.
    */
  var Tiles: js.UndefOr[H265Tiles] = js.native
  
  /**
    * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
    */
  var UnregisteredSeiTimecode: js.UndefOr[H265UnregisteredSeiTimecode] = js.native
  
  /**
    * If the location of parameter set NAL units doesn't matter in your workflow, ignore this setting. Use this setting only with CMAF or DASH outputs, or with standalone file outputs in an MPEG-4 container (MP4 outputs). Choose HVC1 to mark your output as HVC1. This makes your output compliant with the following specification: ISO IECJTC1 SC29 N13798 Text ISO/IEC FDIS 14496-15 3rd Edition. For these outputs, the service stores parameter set NAL units in the sample headers but not in the samples directly. For MP4 outputs, when you choose HVC1, your output video might not work properly with some downstream systems and video players. The service defaults to marking your output as HEV1. For these outputs, the service writes parameter set NAL units directly into the samples.
    */
  var WriteMp4PackagingType: js.UndefOr[H265WriteMp4PackagingType] = js.native
}
object H265Settings {
  
  @scala.inline
  def apply(): H265Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[H265Settings]
  }
  
  @scala.inline
  implicit class H265SettingsMutableBuilder[Self <: H265Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdaptiveQuantization(value: H265AdaptiveQuantization): Self = StObject.set(x, "AdaptiveQuantization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdaptiveQuantizationUndefined: Self = StObject.set(x, "AdaptiveQuantization", js.undefined)
    
    @scala.inline
    def setAlternateTransferFunctionSei(value: H265AlternateTransferFunctionSei): Self = StObject.set(x, "AlternateTransferFunctionSei", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternateTransferFunctionSeiUndefined: Self = StObject.set(x, "AlternateTransferFunctionSei", js.undefined)
    
    @scala.inline
    def setBitrate(value: integerMin1000Max1466400000): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    @scala.inline
    def setCodecLevel(value: H265CodecLevel): Self = StObject.set(x, "CodecLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecLevelUndefined: Self = StObject.set(x, "CodecLevel", js.undefined)
    
    @scala.inline
    def setCodecProfile(value: H265CodecProfile): Self = StObject.set(x, "CodecProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecProfileUndefined: Self = StObject.set(x, "CodecProfile", js.undefined)
    
    @scala.inline
    def setDynamicSubGop(value: H265DynamicSubGop): Self = StObject.set(x, "DynamicSubGop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamicSubGopUndefined: Self = StObject.set(x, "DynamicSubGop", js.undefined)
    
    @scala.inline
    def setFlickerAdaptiveQuantization(value: H265FlickerAdaptiveQuantization): Self = StObject.set(x, "FlickerAdaptiveQuantization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlickerAdaptiveQuantizationUndefined: Self = StObject.set(x, "FlickerAdaptiveQuantization", js.undefined)
    
    @scala.inline
    def setFramerateControl(value: H265FramerateControl): Self = StObject.set(x, "FramerateControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateControlUndefined: Self = StObject.set(x, "FramerateControl", js.undefined)
    
    @scala.inline
    def setFramerateConversionAlgorithm(value: H265FramerateConversionAlgorithm): Self = StObject.set(x, "FramerateConversionAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateConversionAlgorithmUndefined: Self = StObject.set(x, "FramerateConversionAlgorithm", js.undefined)
    
    @scala.inline
    def setFramerateDenominator(value: integerMin1Max2147483647): Self = StObject.set(x, "FramerateDenominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateDenominatorUndefined: Self = StObject.set(x, "FramerateDenominator", js.undefined)
    
    @scala.inline
    def setFramerateNumerator(value: integerMin1Max2147483647): Self = StObject.set(x, "FramerateNumerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateNumeratorUndefined: Self = StObject.set(x, "FramerateNumerator", js.undefined)
    
    @scala.inline
    def setGopBReference(value: H265GopBReference): Self = StObject.set(x, "GopBReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGopBReferenceUndefined: Self = StObject.set(x, "GopBReference", js.undefined)
    
    @scala.inline
    def setGopClosedCadence(value: integerMin0Max2147483647): Self = StObject.set(x, "GopClosedCadence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGopClosedCadenceUndefined: Self = StObject.set(x, "GopClosedCadence", js.undefined)
    
    @scala.inline
    def setGopSize(value: doubleMin0): Self = StObject.set(x, "GopSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGopSizeUndefined: Self = StObject.set(x, "GopSize", js.undefined)
    
    @scala.inline
    def setGopSizeUnits(value: H265GopSizeUnits): Self = StObject.set(x, "GopSizeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGopSizeUnitsUndefined: Self = StObject.set(x, "GopSizeUnits", js.undefined)
    
    @scala.inline
    def setHrdBufferInitialFillPercentage(value: integerMin0Max100): Self = StObject.set(x, "HrdBufferInitialFillPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrdBufferInitialFillPercentageUndefined: Self = StObject.set(x, "HrdBufferInitialFillPercentage", js.undefined)
    
    @scala.inline
    def setHrdBufferSize(value: integerMin0Max1466400000): Self = StObject.set(x, "HrdBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrdBufferSizeUndefined: Self = StObject.set(x, "HrdBufferSize", js.undefined)
    
    @scala.inline
    def setInterlaceMode(value: H265InterlaceMode): Self = StObject.set(x, "InterlaceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterlaceModeUndefined: Self = StObject.set(x, "InterlaceMode", js.undefined)
    
    @scala.inline
    def setMaxBitrate(value: integerMin1000Max1466400000): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBitrateUndefined: Self = StObject.set(x, "MaxBitrate", js.undefined)
    
    @scala.inline
    def setMinIInterval(value: integerMin0Max30): Self = StObject.set(x, "MinIInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinIIntervalUndefined: Self = StObject.set(x, "MinIInterval", js.undefined)
    
    @scala.inline
    def setNumberBFramesBetweenReferenceFrames(value: integerMin0Max7): Self = StObject.set(x, "NumberBFramesBetweenReferenceFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberBFramesBetweenReferenceFramesUndefined: Self = StObject.set(x, "NumberBFramesBetweenReferenceFrames", js.undefined)
    
    @scala.inline
    def setNumberReferenceFrames(value: integerMin1Max6): Self = StObject.set(x, "NumberReferenceFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberReferenceFramesUndefined: Self = StObject.set(x, "NumberReferenceFrames", js.undefined)
    
    @scala.inline
    def setParControl(value: H265ParControl): Self = StObject.set(x, "ParControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParControlUndefined: Self = StObject.set(x, "ParControl", js.undefined)
    
    @scala.inline
    def setParDenominator(value: integerMin1Max2147483647): Self = StObject.set(x, "ParDenominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParDenominatorUndefined: Self = StObject.set(x, "ParDenominator", js.undefined)
    
    @scala.inline
    def setParNumerator(value: integerMin1Max2147483647): Self = StObject.set(x, "ParNumerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParNumeratorUndefined: Self = StObject.set(x, "ParNumerator", js.undefined)
    
    @scala.inline
    def setQualityTuningLevel(value: H265QualityTuningLevel): Self = StObject.set(x, "QualityTuningLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityTuningLevelUndefined: Self = StObject.set(x, "QualityTuningLevel", js.undefined)
    
    @scala.inline
    def setQvbrSettings(value: H265QvbrSettings): Self = StObject.set(x, "QvbrSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQvbrSettingsUndefined: Self = StObject.set(x, "QvbrSettings", js.undefined)
    
    @scala.inline
    def setRateControlMode(value: H265RateControlMode): Self = StObject.set(x, "RateControlMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateControlModeUndefined: Self = StObject.set(x, "RateControlMode", js.undefined)
    
    @scala.inline
    def setSampleAdaptiveOffsetFilterMode(value: H265SampleAdaptiveOffsetFilterMode): Self = StObject.set(x, "SampleAdaptiveOffsetFilterMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSampleAdaptiveOffsetFilterModeUndefined: Self = StObject.set(x, "SampleAdaptiveOffsetFilterMode", js.undefined)
    
    @scala.inline
    def setSceneChangeDetect(value: H265SceneChangeDetect): Self = StObject.set(x, "SceneChangeDetect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSceneChangeDetectUndefined: Self = StObject.set(x, "SceneChangeDetect", js.undefined)
    
    @scala.inline
    def setSlices(value: integerMin1Max32): Self = StObject.set(x, "Slices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlicesUndefined: Self = StObject.set(x, "Slices", js.undefined)
    
    @scala.inline
    def setSlowPal(value: H265SlowPal): Self = StObject.set(x, "SlowPal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlowPalUndefined: Self = StObject.set(x, "SlowPal", js.undefined)
    
    @scala.inline
    def setSpatialAdaptiveQuantization(value: H265SpatialAdaptiveQuantization): Self = StObject.set(x, "SpatialAdaptiveQuantization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialAdaptiveQuantizationUndefined: Self = StObject.set(x, "SpatialAdaptiveQuantization", js.undefined)
    
    @scala.inline
    def setTelecine(value: H265Telecine): Self = StObject.set(x, "Telecine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelecineUndefined: Self = StObject.set(x, "Telecine", js.undefined)
    
    @scala.inline
    def setTemporalAdaptiveQuantization(value: H265TemporalAdaptiveQuantization): Self = StObject.set(x, "TemporalAdaptiveQuantization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporalAdaptiveQuantizationUndefined: Self = StObject.set(x, "TemporalAdaptiveQuantization", js.undefined)
    
    @scala.inline
    def setTemporalIds(value: H265TemporalIds): Self = StObject.set(x, "TemporalIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemporalIdsUndefined: Self = StObject.set(x, "TemporalIds", js.undefined)
    
    @scala.inline
    def setTiles(value: H265Tiles): Self = StObject.set(x, "Tiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTilesUndefined: Self = StObject.set(x, "Tiles", js.undefined)
    
    @scala.inline
    def setUnregisteredSeiTimecode(value: H265UnregisteredSeiTimecode): Self = StObject.set(x, "UnregisteredSeiTimecode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnregisteredSeiTimecodeUndefined: Self = StObject.set(x, "UnregisteredSeiTimecode", js.undefined)
    
    @scala.inline
    def setWriteMp4PackagingType(value: H265WriteMp4PackagingType): Self = StObject.set(x, "WriteMp4PackagingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriteMp4PackagingTypeUndefined: Self = StObject.set(x, "WriteMp4PackagingType", js.undefined)
  }
}
