package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait H264Settings extends StObject {
  
  /**
    * Keep the default value, Auto (AUTO), for this setting to have MediaConvert automatically apply the best types of quantization for your video content. When you want to apply your quantization settings manually, you must set H264AdaptiveQuantization to a value other than Auto (AUTO). Use this setting to specify the strength of any adaptive quantization filters that you enable. If you don't want MediaConvert to do any adaptive quantization in this transcode, set Adaptive quantization (H264AdaptiveQuantization) to Off (OFF). Related settings: The value that you choose here applies to the following settings: H264FlickerAdaptiveQuantization, H264SpatialAdaptiveQuantization, and H264TemporalAdaptiveQuantization.
    */
  var AdaptiveQuantization: js.UndefOr[H264AdaptiveQuantization] = js.undefined
  
  /**
    * Specify the average bitrate in bits per second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique when rounded down to the nearest multiple of 1000.
    */
  var Bitrate: js.UndefOr[integerMin1000Max1152000000] = js.undefined
  
  /**
    * Specify an H.264 level that is consistent with your output video settings. If you aren't sure what level to specify, choose Auto (AUTO).
    */
  var CodecLevel: js.UndefOr[H264CodecLevel] = js.undefined
  
  /**
    * H.264 Profile. High 4:2:2 and 10-bit profiles are only available with the AVC-I License.
    */
  var CodecProfile: js.UndefOr[H264CodecProfile] = js.undefined
  
  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  var DynamicSubGop: js.UndefOr[H264DynamicSubGop] = js.undefined
  
  /**
    * Entropy encoding mode. Use CABAC (must be in Main or High profile) or CAVLC.
    */
  var EntropyEncoding: js.UndefOr[H264EntropyEncoding] = js.undefined
  
  /**
    * The video encoding method for your MPEG-4 AVC output. Keep the default value, PAFF, to have MediaConvert use PAFF encoding for interlaced outputs. Choose Force field (FORCE_FIELD) to disable PAFF encoding and create separate interlaced fields. Choose MBAFF to disable PAFF and have MediaConvert use MBAFF encoding for interlaced outputs.
    */
  var FieldEncoding: js.UndefOr[H264FieldEncoding] = js.undefined
  
  /**
    * Only use this setting when you change the default value, AUTO, for the setting H264AdaptiveQuantization. When you keep all defaults, excluding H264AdaptiveQuantization and all other adaptive quantization from your JSON job specification, MediaConvert automatically applies the best types of quantization for your video content. When you set H264AdaptiveQuantization to a value other than AUTO, the default value for H264FlickerAdaptiveQuantization is Disabled (DISABLED). Change this value to Enabled (ENABLED) to reduce I-frame pop. I-frame pop appears as a visual flicker that can arise when the encoder saves bits by copying some macroblocks many times from frame to frame, and then refreshes them at the I-frame. When you enable this setting, the encoder updates these macroblocks slightly more often to smooth out the flicker. To manually enable or disable H264FlickerAdaptiveQuantization, you must set Adaptive quantization (H264AdaptiveQuantization) to a value other than AUTO.
    */
  var FlickerAdaptiveQuantization: js.UndefOr[H264FlickerAdaptiveQuantization] = js.undefined
  
  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[H264FramerateControl] = js.undefined
  
  /**
    * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
    */
  var FramerateConversionAlgorithm: js.UndefOr[H264FramerateConversionAlgorithm] = js.undefined
  
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this example, use 24000 for the value of FramerateNumerator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * If enable, use reference B frames for GOP structures that have B frames > 1.
    */
  var GopBReference: js.UndefOr[H264GopBReference] = js.undefined
  
  /**
    * Specify the relative frequency of open to closed GOPs in this output. For example, if you want to allow four open GOPs and then require a closed GOP, set this value to 5. We recommend that you have the transcoder automatically choose this value for you based on characteristics of your input video. To enable this automatic behavior, keep the default value by leaving this setting out of your JSON job specification. In the console, do this by keeping the default empty value. If you do explicitly specify a value, for segmented outputs, don't set this value to 0.
    */
  var GopClosedCadence: js.UndefOr[integerMin0Max2147483647] = js.undefined
  
  /**
    * Use this setting only when you set GOP mode control (GopSizeUnits) to Specified, frames (FRAMES) or Specified, seconds (SECONDS). Specify the GOP length using a whole number of frames or a decimal value of seconds. MediaConvert will interpret this value as frames or seconds depending on the value you choose for GOP mode control (GopSizeUnits). If you want to allow MediaConvert to automatically determine GOP size, leave GOP size blank and set GOP mode control to Auto (AUTO). If your output group specifies HLS, DASH, or CMAF, leave GOP size blank and set GOP mode control to Auto in each output in your output group.
    */
  var GopSize: js.UndefOr[doubleMin0] = js.undefined
  
  /**
    * Specify how the transcoder determines GOP size for this output. We recommend that you have the transcoder automatically choose this value for you based on characteristics of your input video. To enable this automatic behavior, choose Auto (AUTO) and and leave GOP size (GopSize) blank. By default, if you don't specify GOP mode control (GopSizeUnits), MediaConvert will use automatic behavior. If your output group specifies HLS, DASH, or CMAF, set GOP mode control to Auto and leave GOP size blank in each output in your output group. To explicitly specify the GOP length, choose Specified, frames (FRAMES) or Specified, seconds (SECONDS) and then provide the GOP length in the related setting GOP size (GopSize).
    */
  var GopSizeUnits: js.UndefOr[H264GopSizeUnits] = js.undefined
  
  /**
    * Percentage of the buffer that should initially be filled (HRD buffer model).
    */
  var HrdBufferInitialFillPercentage: js.UndefOr[integerMin0Max100] = js.undefined
  
  /**
    * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
    */
  var HrdBufferSize: js.UndefOr[integerMin0Max1152000000] = js.undefined
  
  /**
    * Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
    */
  var InterlaceMode: js.UndefOr[H264InterlaceMode] = js.undefined
  
  /**
    * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000. Required when Rate control mode is QVBR.
    */
  var MaxBitrate: js.UndefOr[integerMin1000Max1152000000] = js.undefined
  
  /**
    * Use this setting only when you also enable Scene change detection (SceneChangeDetect). This setting determines how the encoder manages the spacing between I-frames that it inserts as part of the I-frame cadence and the I-frames that it inserts for Scene change detection. We recommend that you have the transcoder automatically choose this value for you based on characteristics of your input video. To enable this automatic behavior, keep the default value by leaving this setting out of your JSON job specification. In the console, do this by keeping the default empty value. When you explicitly specify a value for this setting, the encoder determines whether to skip a cadence-driven I-frame by the value you set. For example, if you set Min I interval (minIInterval) to 5 and a cadence-driven I-frame would fall within 5 frames of a scene-change I-frame, then the encoder skips the cadence-driven I-frame. In this way, one GOP is shrunk slightly and one GOP is stretched slightly. When the cadence-driven I-frames are farther from the scene-change I-frame than the value you set, then the encoder leaves all I-frames in place and the GOPs surrounding the scene change are smaller than the usual cadence GOPs.
    */
  var MinIInterval: js.UndefOr[integerMin0Max30] = js.undefined
  
  /**
    * This setting to determines the number of B-frames that MediaConvert puts between reference frames in this output. We recommend that you use automatic behavior to allow the transcoder to choose the best value based on characteristics of your input video. In the console, choose AUTO to select this automatic behavior. When you manually edit your JSON job specification, leave this setting out to choose automatic behavior. When you want to specify this number explicitly, choose a whole number from 0 through 7.
    */
  var NumberBFramesBetweenReferenceFrames: js.UndefOr[integerMin0Max7] = js.undefined
  
  /**
    * Number of reference frames to use. The encoder may use more than requested if using B-frames and/or interlaced encoding.
    */
  var NumberReferenceFrames: js.UndefOr[integerMin1Max6] = js.undefined
  
  /**
    * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
    */
  var ParControl: js.UndefOr[H264ParControl] = js.undefined
  
  /**
    * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this example, the value for parDenominator is 33.
    */
  var ParDenominator: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this example, the value for parNumerator is 40.
    */
  var ParNumerator: js.UndefOr[integerMin1Max2147483647] = js.undefined
  
  /**
    * Optional. Use Quality tuning level (qualityTuningLevel) to choose how you want to trade off encoding speed for output video quality. The default behavior is faster, lower quality, single-pass encoding.
    */
  var QualityTuningLevel: js.UndefOr[H264QualityTuningLevel] = js.undefined
  
  /**
    * Settings for quality-defined variable bitrate encoding with the H.265 codec. Use these settings only when you set QVBR for Rate control mode (RateControlMode).
    */
  var QvbrSettings: js.UndefOr[H264QvbrSettings] = js.undefined
  
  /**
    * Use this setting to specify whether this output has a variable bitrate (VBR), constant bitrate (CBR) or quality-defined variable bitrate (QVBR).
    */
  var RateControlMode: js.UndefOr[H264RateControlMode] = js.undefined
  
  /**
    * Places a PPS header on each encoded picture, even if repeated.
    */
  var RepeatPps: js.UndefOr[H264RepeatPps] = js.undefined
  
  /**
    * Use this setting for interlaced outputs, when your output frame rate is half of your input frame rate. In this situation, choose Optimized interlacing (INTERLACED_OPTIMIZE) to create a better quality interlaced output. In this case, each progressive frame from the input corresponds to an interlaced field in the output. Keep the default value, Basic interlacing (INTERLACED), for all other output frame rates. With basic interlacing, MediaConvert performs any frame rate conversion first and then interlaces the frames. When you choose Optimized interlacing and you set your output frame rate to a value that isn't suitable for optimized interlacing, MediaConvert automatically falls back to basic interlacing. Required settings: To use optimized interlacing, you must set Telecine (telecine) to None (NONE) or Soft (SOFT). You can't use optimized interlacing for hard telecine outputs. You must also set Interlace mode (interlaceMode) to a value other than Progressive (PROGRESSIVE).
    */
  var ScanTypeConversionMode: js.UndefOr[H264ScanTypeConversionMode] = js.undefined
  
  /**
    * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default. If this output uses QVBR, choose Transition detection (TRANSITION_DETECTION) for further video quality improvement. For more information about QVBR, see https://docs.aws.amazon.com/console/mediaconvert/cbr-vbr-qvbr.
    */
  var SceneChangeDetect: js.UndefOr[H264SceneChangeDetect] = js.undefined
  
  /**
    * Number of slices per picture. Must be less than or equal to the number of macroblock rows for progressive pictures, and less than or equal to half the number of macroblock rows for interlaced pictures.
    */
  var Slices: js.UndefOr[integerMin1Max32] = js.undefined
  
  /**
    * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
    */
  var SlowPal: js.UndefOr[H264SlowPal] = js.undefined
  
  /**
    * Ignore this setting unless you need to comply with a specification that requires a specific value. If you don't have a specification requirement, we recommend that you adjust the softness of your output by using a lower value for the setting Sharpness (sharpness) or by enabling a noise reducer filter (noiseReducerFilter). The Softness (softness) setting specifies the quantization matrices that the encoder uses. Keep the default value, 0, for flat quantization. Choose the value 1 or 16 to use the default JVT softening quantization matricies from the H.264 specification. Choose a value from 17 to 128 to use planar interpolation. Increasing values from 17 to 128 result in increasing reduction of high-frequency data. The value 128 results in the softest video.
    */
  var Softness: js.UndefOr[integerMin0Max128] = js.undefined
  
  /**
    * Only use this setting when you change the default value, Auto (AUTO), for the setting H264AdaptiveQuantization. When you keep all defaults, excluding H264AdaptiveQuantization and all other adaptive quantization from your JSON job specification, MediaConvert automatically applies the best types of quantization for your video content. When you set H264AdaptiveQuantization to a value other than AUTO, the default value for H264SpatialAdaptiveQuantization is Enabled (ENABLED). Keep this default value to adjust quantization within each frame based on spatial variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture, you might choose to set H264SpatialAdaptiveQuantization to Disabled (DISABLED). Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization (H264AdaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video games, set it to Low. For content with a wider variety of textures, set it to High or Higher. To manually enable or disable H264SpatialAdaptiveQuantization, you must set Adaptive quantization (H264AdaptiveQuantization) to a value other than AUTO.
    */
  var SpatialAdaptiveQuantization: js.UndefOr[H264SpatialAdaptiveQuantization] = js.undefined
  
  /**
    * Produces a bitstream compliant with SMPTE RP-2027.
    */
  var Syntax: js.UndefOr[H264Syntax] = js.undefined
  
  /**
    * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard or soft telecine to create a smoother picture. Hard telecine (HARD) produces a 29.97i output. Soft telecine (SOFT) produces an output with a 23.976 output that signals to the video player device to do the conversion during play back. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
    */
  var Telecine: js.UndefOr[H264Telecine] = js.undefined
  
  /**
    * Only use this setting when you change the default value, AUTO, for the setting H264AdaptiveQuantization. When you keep all defaults, excluding H264AdaptiveQuantization and all other adaptive quantization from your JSON job specification, MediaConvert automatically applies the best types of quantization for your video content. When you set H264AdaptiveQuantization to a value other than AUTO, the default value for H264TemporalAdaptiveQuantization is Enabled (ENABLED). Keep this default value to adjust quantization within each frame based on temporal variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen that doesn't have moving objects with sharp edges, such as sports athletes' faces, you might choose to set H264TemporalAdaptiveQuantization to Disabled (DISABLED). Related setting: When you enable temporal quantization, adjust the strength of the filter with the setting Adaptive quantization (adaptiveQuantization). To manually enable or disable H264TemporalAdaptiveQuantization, you must set Adaptive quantization (H264AdaptiveQuantization) to a value other than AUTO.
    */
  var TemporalAdaptiveQuantization: js.UndefOr[H264TemporalAdaptiveQuantization] = js.undefined
  
  /**
    * Inserts timecode for each frame as 4 bytes of an unregistered SEI message.
    */
  var UnregisteredSeiTimecode: js.UndefOr[H264UnregisteredSeiTimecode] = js.undefined
}
object H264Settings {
  
  inline def apply(): H264Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[H264Settings]
  }
  
  extension [Self <: H264Settings](x: Self) {
    
    inline def setAdaptiveQuantization(value: H264AdaptiveQuantization): Self = StObject.set(x, "AdaptiveQuantization", value.asInstanceOf[js.Any])
    
    inline def setAdaptiveQuantizationUndefined: Self = StObject.set(x, "AdaptiveQuantization", js.undefined)
    
    inline def setBitrate(value: integerMin1000Max1152000000): Self = StObject.set(x, "Bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "Bitrate", js.undefined)
    
    inline def setCodecLevel(value: H264CodecLevel): Self = StObject.set(x, "CodecLevel", value.asInstanceOf[js.Any])
    
    inline def setCodecLevelUndefined: Self = StObject.set(x, "CodecLevel", js.undefined)
    
    inline def setCodecProfile(value: H264CodecProfile): Self = StObject.set(x, "CodecProfile", value.asInstanceOf[js.Any])
    
    inline def setCodecProfileUndefined: Self = StObject.set(x, "CodecProfile", js.undefined)
    
    inline def setDynamicSubGop(value: H264DynamicSubGop): Self = StObject.set(x, "DynamicSubGop", value.asInstanceOf[js.Any])
    
    inline def setDynamicSubGopUndefined: Self = StObject.set(x, "DynamicSubGop", js.undefined)
    
    inline def setEntropyEncoding(value: H264EntropyEncoding): Self = StObject.set(x, "EntropyEncoding", value.asInstanceOf[js.Any])
    
    inline def setEntropyEncodingUndefined: Self = StObject.set(x, "EntropyEncoding", js.undefined)
    
    inline def setFieldEncoding(value: H264FieldEncoding): Self = StObject.set(x, "FieldEncoding", value.asInstanceOf[js.Any])
    
    inline def setFieldEncodingUndefined: Self = StObject.set(x, "FieldEncoding", js.undefined)
    
    inline def setFlickerAdaptiveQuantization(value: H264FlickerAdaptiveQuantization): Self = StObject.set(x, "FlickerAdaptiveQuantization", value.asInstanceOf[js.Any])
    
    inline def setFlickerAdaptiveQuantizationUndefined: Self = StObject.set(x, "FlickerAdaptiveQuantization", js.undefined)
    
    inline def setFramerateControl(value: H264FramerateControl): Self = StObject.set(x, "FramerateControl", value.asInstanceOf[js.Any])
    
    inline def setFramerateControlUndefined: Self = StObject.set(x, "FramerateControl", js.undefined)
    
    inline def setFramerateConversionAlgorithm(value: H264FramerateConversionAlgorithm): Self = StObject.set(x, "FramerateConversionAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setFramerateConversionAlgorithmUndefined: Self = StObject.set(x, "FramerateConversionAlgorithm", js.undefined)
    
    inline def setFramerateDenominator(value: integerMin1Max2147483647): Self = StObject.set(x, "FramerateDenominator", value.asInstanceOf[js.Any])
    
    inline def setFramerateDenominatorUndefined: Self = StObject.set(x, "FramerateDenominator", js.undefined)
    
    inline def setFramerateNumerator(value: integerMin1Max2147483647): Self = StObject.set(x, "FramerateNumerator", value.asInstanceOf[js.Any])
    
    inline def setFramerateNumeratorUndefined: Self = StObject.set(x, "FramerateNumerator", js.undefined)
    
    inline def setGopBReference(value: H264GopBReference): Self = StObject.set(x, "GopBReference", value.asInstanceOf[js.Any])
    
    inline def setGopBReferenceUndefined: Self = StObject.set(x, "GopBReference", js.undefined)
    
    inline def setGopClosedCadence(value: integerMin0Max2147483647): Self = StObject.set(x, "GopClosedCadence", value.asInstanceOf[js.Any])
    
    inline def setGopClosedCadenceUndefined: Self = StObject.set(x, "GopClosedCadence", js.undefined)
    
    inline def setGopSize(value: doubleMin0): Self = StObject.set(x, "GopSize", value.asInstanceOf[js.Any])
    
    inline def setGopSizeUndefined: Self = StObject.set(x, "GopSize", js.undefined)
    
    inline def setGopSizeUnits(value: H264GopSizeUnits): Self = StObject.set(x, "GopSizeUnits", value.asInstanceOf[js.Any])
    
    inline def setGopSizeUnitsUndefined: Self = StObject.set(x, "GopSizeUnits", js.undefined)
    
    inline def setHrdBufferInitialFillPercentage(value: integerMin0Max100): Self = StObject.set(x, "HrdBufferInitialFillPercentage", value.asInstanceOf[js.Any])
    
    inline def setHrdBufferInitialFillPercentageUndefined: Self = StObject.set(x, "HrdBufferInitialFillPercentage", js.undefined)
    
    inline def setHrdBufferSize(value: integerMin0Max1152000000): Self = StObject.set(x, "HrdBufferSize", value.asInstanceOf[js.Any])
    
    inline def setHrdBufferSizeUndefined: Self = StObject.set(x, "HrdBufferSize", js.undefined)
    
    inline def setInterlaceMode(value: H264InterlaceMode): Self = StObject.set(x, "InterlaceMode", value.asInstanceOf[js.Any])
    
    inline def setInterlaceModeUndefined: Self = StObject.set(x, "InterlaceMode", js.undefined)
    
    inline def setMaxBitrate(value: integerMin1000Max1152000000): Self = StObject.set(x, "MaxBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxBitrateUndefined: Self = StObject.set(x, "MaxBitrate", js.undefined)
    
    inline def setMinIInterval(value: integerMin0Max30): Self = StObject.set(x, "MinIInterval", value.asInstanceOf[js.Any])
    
    inline def setMinIIntervalUndefined: Self = StObject.set(x, "MinIInterval", js.undefined)
    
    inline def setNumberBFramesBetweenReferenceFrames(value: integerMin0Max7): Self = StObject.set(x, "NumberBFramesBetweenReferenceFrames", value.asInstanceOf[js.Any])
    
    inline def setNumberBFramesBetweenReferenceFramesUndefined: Self = StObject.set(x, "NumberBFramesBetweenReferenceFrames", js.undefined)
    
    inline def setNumberReferenceFrames(value: integerMin1Max6): Self = StObject.set(x, "NumberReferenceFrames", value.asInstanceOf[js.Any])
    
    inline def setNumberReferenceFramesUndefined: Self = StObject.set(x, "NumberReferenceFrames", js.undefined)
    
    inline def setParControl(value: H264ParControl): Self = StObject.set(x, "ParControl", value.asInstanceOf[js.Any])
    
    inline def setParControlUndefined: Self = StObject.set(x, "ParControl", js.undefined)
    
    inline def setParDenominator(value: integerMin1Max2147483647): Self = StObject.set(x, "ParDenominator", value.asInstanceOf[js.Any])
    
    inline def setParDenominatorUndefined: Self = StObject.set(x, "ParDenominator", js.undefined)
    
    inline def setParNumerator(value: integerMin1Max2147483647): Self = StObject.set(x, "ParNumerator", value.asInstanceOf[js.Any])
    
    inline def setParNumeratorUndefined: Self = StObject.set(x, "ParNumerator", js.undefined)
    
    inline def setQualityTuningLevel(value: H264QualityTuningLevel): Self = StObject.set(x, "QualityTuningLevel", value.asInstanceOf[js.Any])
    
    inline def setQualityTuningLevelUndefined: Self = StObject.set(x, "QualityTuningLevel", js.undefined)
    
    inline def setQvbrSettings(value: H264QvbrSettings): Self = StObject.set(x, "QvbrSettings", value.asInstanceOf[js.Any])
    
    inline def setQvbrSettingsUndefined: Self = StObject.set(x, "QvbrSettings", js.undefined)
    
    inline def setRateControlMode(value: H264RateControlMode): Self = StObject.set(x, "RateControlMode", value.asInstanceOf[js.Any])
    
    inline def setRateControlModeUndefined: Self = StObject.set(x, "RateControlMode", js.undefined)
    
    inline def setRepeatPps(value: H264RepeatPps): Self = StObject.set(x, "RepeatPps", value.asInstanceOf[js.Any])
    
    inline def setRepeatPpsUndefined: Self = StObject.set(x, "RepeatPps", js.undefined)
    
    inline def setScanTypeConversionMode(value: H264ScanTypeConversionMode): Self = StObject.set(x, "ScanTypeConversionMode", value.asInstanceOf[js.Any])
    
    inline def setScanTypeConversionModeUndefined: Self = StObject.set(x, "ScanTypeConversionMode", js.undefined)
    
    inline def setSceneChangeDetect(value: H264SceneChangeDetect): Self = StObject.set(x, "SceneChangeDetect", value.asInstanceOf[js.Any])
    
    inline def setSceneChangeDetectUndefined: Self = StObject.set(x, "SceneChangeDetect", js.undefined)
    
    inline def setSlices(value: integerMin1Max32): Self = StObject.set(x, "Slices", value.asInstanceOf[js.Any])
    
    inline def setSlicesUndefined: Self = StObject.set(x, "Slices", js.undefined)
    
    inline def setSlowPal(value: H264SlowPal): Self = StObject.set(x, "SlowPal", value.asInstanceOf[js.Any])
    
    inline def setSlowPalUndefined: Self = StObject.set(x, "SlowPal", js.undefined)
    
    inline def setSoftness(value: integerMin0Max128): Self = StObject.set(x, "Softness", value.asInstanceOf[js.Any])
    
    inline def setSoftnessUndefined: Self = StObject.set(x, "Softness", js.undefined)
    
    inline def setSpatialAdaptiveQuantization(value: H264SpatialAdaptiveQuantization): Self = StObject.set(x, "SpatialAdaptiveQuantization", value.asInstanceOf[js.Any])
    
    inline def setSpatialAdaptiveQuantizationUndefined: Self = StObject.set(x, "SpatialAdaptiveQuantization", js.undefined)
    
    inline def setSyntax(value: H264Syntax): Self = StObject.set(x, "Syntax", value.asInstanceOf[js.Any])
    
    inline def setSyntaxUndefined: Self = StObject.set(x, "Syntax", js.undefined)
    
    inline def setTelecine(value: H264Telecine): Self = StObject.set(x, "Telecine", value.asInstanceOf[js.Any])
    
    inline def setTelecineUndefined: Self = StObject.set(x, "Telecine", js.undefined)
    
    inline def setTemporalAdaptiveQuantization(value: H264TemporalAdaptiveQuantization): Self = StObject.set(x, "TemporalAdaptiveQuantization", value.asInstanceOf[js.Any])
    
    inline def setTemporalAdaptiveQuantizationUndefined: Self = StObject.set(x, "TemporalAdaptiveQuantization", js.undefined)
    
    inline def setUnregisteredSeiTimecode(value: H264UnregisteredSeiTimecode): Self = StObject.set(x, "UnregisteredSeiTimecode", value.asInstanceOf[js.Any])
    
    inline def setUnregisteredSeiTimecodeUndefined: Self = StObject.set(x, "UnregisteredSeiTimecode", js.undefined)
  }
}
