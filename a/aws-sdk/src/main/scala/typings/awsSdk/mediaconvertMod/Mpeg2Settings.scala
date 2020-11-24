package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mpeg2Settings extends js.Object {
  
  /**
    * Specify the strength of any adaptive quantization filters that you enable. The value that you choose here applies to the following settings: Spatial adaptive quantization (spatialAdaptiveQuantization), and Temporal adaptive quantization (temporalAdaptiveQuantization).
    */
  var AdaptiveQuantization: js.UndefOr[Mpeg2AdaptiveQuantization] = js.native
  
  /**
    * Specify the average bitrate in bits per second. Required for VBR and CBR. For MS Smooth outputs, bitrates must be unique when rounded down to the nearest multiple of 1000.
    */
  var Bitrate: js.UndefOr[integerMin1000Max288000000] = js.native
  
  /**
    * Use Level (Mpeg2CodecLevel) to set the MPEG-2 level for the video output.
    */
  var CodecLevel: js.UndefOr[Mpeg2CodecLevel] = js.native
  
  /**
    * Use Profile (Mpeg2CodecProfile) to set the MPEG-2 profile for the video output.
    */
  var CodecProfile: js.UndefOr[Mpeg2CodecProfile] = js.native
  
  /**
    * Choose Adaptive to improve subjective video quality for high-motion content. This will cause the service to use fewer B-frames (which infer information based on other frames) for high-motion portions of the video and more B-frames for low-motion portions. The maximum number of B-frames is limited by the value you provide for the setting B frames between reference frames (numberBFramesBetweenReferenceFrames).
    */
  var DynamicSubGop: js.UndefOr[Mpeg2DynamicSubGop] = js.native
  
  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[Mpeg2FramerateControl] = js.native
  
  /**
    * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
    */
  var FramerateConversionAlgorithm: js.UndefOr[Mpeg2FramerateConversionAlgorithm] = js.native
  
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max1001] = js.native
  
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this example, use 24000 for the value of FramerateNumerator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateNumerator: js.UndefOr[integerMin24Max60000] = js.native
  
  /**
    * Frequency of closed GOPs. In streaming applications, it is recommended that this be set to 1 so a decoder joining mid-stream will receive an IDR frame as quickly as possible. Setting this value to 0 will break output segmenting.
    */
  var GopClosedCadence: js.UndefOr[integerMin0Max2147483647] = js.native
  
  /**
    * GOP Length (keyframe interval) in frames or seconds. Must be greater than zero.
    */
  var GopSize: js.UndefOr[doubleMin0] = js.native
  
  /**
    * Indicates if the GOP Size in MPEG2 is specified in frames or seconds. If seconds the system will convert the GOP Size into a frame count at run time.
    */
  var GopSizeUnits: js.UndefOr[Mpeg2GopSizeUnits] = js.native
  
  /**
    * Percentage of the buffer that should initially be filled (HRD buffer model).
    */
  var HrdBufferInitialFillPercentage: js.UndefOr[integerMin0Max100] = js.native
  
  /**
    * Size of buffer (HRD buffer model) in bits. For example, enter five megabits as 5000000.
    */
  var HrdBufferSize: js.UndefOr[integerMin0Max47185920] = js.native
  
  /**
    * Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
    */
  var InterlaceMode: js.UndefOr[Mpeg2InterlaceMode] = js.native
  
  /**
    * Use Intra DC precision (Mpeg2IntraDcPrecision) to set quantization precision for intra-block DC coefficients. If you choose the value auto, the service will automatically select the precision based on the per-frame compression ratio.
    */
  var IntraDcPrecision: js.UndefOr[Mpeg2IntraDcPrecision] = js.native
  
  /**
    * Maximum bitrate in bits/second. For example, enter five megabits per second as 5000000.
    */
  var MaxBitrate: js.UndefOr[integerMin1000Max300000000] = js.native
  
  /**
    * Enforces separation between repeated (cadence) I-frames and I-frames inserted by Scene Change Detection. If a scene change I-frame is within I-interval frames of a cadence I-frame, the GOP is shrunk and/or stretched to the scene change I-frame. GOP stretch requires enabling lookahead as well as setting I-interval. The normal cadence resumes for the next GOP. This setting is only used when Scene Change Detect is enabled. Note: Maximum GOP stretch = GOP size + Min-I-interval - 1
    */
  var MinIInterval: js.UndefOr[integerMin0Max30] = js.native
  
  /**
    * Number of B-frames between reference frames.
    */
  var NumberBFramesBetweenReferenceFrames: js.UndefOr[integerMin0Max7] = js.native
  
  /**
    * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
    */
  var ParControl: js.UndefOr[Mpeg2ParControl] = js.native
  
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
  var QualityTuningLevel: js.UndefOr[Mpeg2QualityTuningLevel] = js.native
  
  /**
    * Use Rate control mode (Mpeg2RateControlMode) to specifiy whether the bitrate is variable (vbr) or constant (cbr).
    */
  var RateControlMode: js.UndefOr[Mpeg2RateControlMode] = js.native
  
  /**
    * Enable this setting to insert I-frames at scene changes that the service automatically detects. This improves video quality and is enabled by default.
    */
  var SceneChangeDetect: js.UndefOr[Mpeg2SceneChangeDetect] = js.native
  
  /**
    * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
    */
  var SlowPal: js.UndefOr[Mpeg2SlowPal] = js.native
  
  /**
    * Ignore this setting unless you need to comply with a specification that requires a specific value. If you don't have a specification requirement, we recommend that you adjust the softness of your output by using a lower value for the setting Sharpness (sharpness) or by enabling a noise reducer filter (noiseReducerFilter). The Softness (softness) setting specifies the quantization matrices that the encoder uses. Keep the default value, 0, to use the AWS Elemental default matrices. Choose a value from 17 to 128 to use planar interpolation. Increasing values from 17 to 128 result in increasing reduction of high-frequency data. The value 128 results in the softest video.
    */
  var Softness: js.UndefOr[integerMin0Max128] = js.native
  
  /**
    * Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on spatial variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas that can sustain more distortion with no noticeable visual degradation and uses more bits on areas where any small distortion will be noticeable. For example, complex textured blocks are encoded with fewer bits and smooth textured blocks are encoded with more bits. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen with a lot of complex texture, you might choose to disable this feature. Related setting: When you enable spatial adaptive quantization, set the value for Adaptive quantization (adaptiveQuantization) depending on your content. For homogeneous content, such as cartoons and video games, set it to Low. For content with a wider variety of textures, set it to High or Higher.
    */
  var SpatialAdaptiveQuantization: js.UndefOr[Mpeg2SpatialAdaptiveQuantization] = js.native
  
  /**
    * Specify whether this output's video uses the D10 syntax. Keep the default value to  not use the syntax. Related settings: When you choose D10 (D_10) for your MXF  profile (profile), you must also set this value to to D10 (D_10).
    */
  var Syntax: js.UndefOr[Mpeg2Syntax] = js.native
  
  /**
    * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard or soft telecine to create a smoother picture. Hard telecine (HARD) produces a 29.97i output. Soft telecine (SOFT) produces an output with a 23.976 output that signals to the video player device to do the conversion during play back. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
    */
  var Telecine: js.UndefOr[Mpeg2Telecine] = js.native
  
  /**
    * Keep the default value, Enabled (ENABLED), to adjust quantization within each frame based on temporal variation of content complexity. When you enable this feature, the encoder uses fewer bits on areas of the frame that aren't moving and uses more bits on complex objects with sharp edges that move a lot. For example, this feature improves the readability of text tickers on newscasts and scoreboards on sports matches. Enabling this feature will almost always improve your video quality. Note, though, that this feature doesn't take into account where the viewer's attention is likely to be. If viewers are likely to be focusing their attention on a part of the screen that doesn't have moving objects with sharp edges, such as sports athletes' faces, you might choose to disable this feature. Related setting: When you enable temporal quantization, adjust the strength of the filter with the setting Adaptive quantization (adaptiveQuantization).
    */
  var TemporalAdaptiveQuantization: js.UndefOr[Mpeg2TemporalAdaptiveQuantization] = js.native
}
object Mpeg2Settings {
  
  @scala.inline
  def apply(): Mpeg2Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mpeg2Settings]
  }
  
  @scala.inline
  implicit class Mpeg2SettingsOps[Self <: Mpeg2Settings] (val x: Self) extends AnyVal {
    
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
    def setAdaptiveQuantization(value: Mpeg2AdaptiveQuantization): Self = this.set("AdaptiveQuantization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdaptiveQuantization: Self = this.set("AdaptiveQuantization", js.undefined)
    
    @scala.inline
    def setBitrate(value: integerMin1000Max288000000): Self = this.set("Bitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBitrate: Self = this.set("Bitrate", js.undefined)
    
    @scala.inline
    def setCodecLevel(value: Mpeg2CodecLevel): Self = this.set("CodecLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodecLevel: Self = this.set("CodecLevel", js.undefined)
    
    @scala.inline
    def setCodecProfile(value: Mpeg2CodecProfile): Self = this.set("CodecProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodecProfile: Self = this.set("CodecProfile", js.undefined)
    
    @scala.inline
    def setDynamicSubGop(value: Mpeg2DynamicSubGop): Self = this.set("DynamicSubGop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDynamicSubGop: Self = this.set("DynamicSubGop", js.undefined)
    
    @scala.inline
    def setFramerateControl(value: Mpeg2FramerateControl): Self = this.set("FramerateControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramerateControl: Self = this.set("FramerateControl", js.undefined)
    
    @scala.inline
    def setFramerateConversionAlgorithm(value: Mpeg2FramerateConversionAlgorithm): Self = this.set("FramerateConversionAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramerateConversionAlgorithm: Self = this.set("FramerateConversionAlgorithm", js.undefined)
    
    @scala.inline
    def setFramerateDenominator(value: integerMin1Max1001): Self = this.set("FramerateDenominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramerateDenominator: Self = this.set("FramerateDenominator", js.undefined)
    
    @scala.inline
    def setFramerateNumerator(value: integerMin24Max60000): Self = this.set("FramerateNumerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramerateNumerator: Self = this.set("FramerateNumerator", js.undefined)
    
    @scala.inline
    def setGopClosedCadence(value: integerMin0Max2147483647): Self = this.set("GopClosedCadence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGopClosedCadence: Self = this.set("GopClosedCadence", js.undefined)
    
    @scala.inline
    def setGopSize(value: doubleMin0): Self = this.set("GopSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGopSize: Self = this.set("GopSize", js.undefined)
    
    @scala.inline
    def setGopSizeUnits(value: Mpeg2GopSizeUnits): Self = this.set("GopSizeUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGopSizeUnits: Self = this.set("GopSizeUnits", js.undefined)
    
    @scala.inline
    def setHrdBufferInitialFillPercentage(value: integerMin0Max100): Self = this.set("HrdBufferInitialFillPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHrdBufferInitialFillPercentage: Self = this.set("HrdBufferInitialFillPercentage", js.undefined)
    
    @scala.inline
    def setHrdBufferSize(value: integerMin0Max47185920): Self = this.set("HrdBufferSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHrdBufferSize: Self = this.set("HrdBufferSize", js.undefined)
    
    @scala.inline
    def setInterlaceMode(value: Mpeg2InterlaceMode): Self = this.set("InterlaceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterlaceMode: Self = this.set("InterlaceMode", js.undefined)
    
    @scala.inline
    def setIntraDcPrecision(value: Mpeg2IntraDcPrecision): Self = this.set("IntraDcPrecision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntraDcPrecision: Self = this.set("IntraDcPrecision", js.undefined)
    
    @scala.inline
    def setMaxBitrate(value: integerMin1000Max300000000): Self = this.set("MaxBitrate", value.asInstanceOf[js.Any])
    
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
    def setParControl(value: Mpeg2ParControl): Self = this.set("ParControl", value.asInstanceOf[js.Any])
    
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
    def setQualityTuningLevel(value: Mpeg2QualityTuningLevel): Self = this.set("QualityTuningLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQualityTuningLevel: Self = this.set("QualityTuningLevel", js.undefined)
    
    @scala.inline
    def setRateControlMode(value: Mpeg2RateControlMode): Self = this.set("RateControlMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRateControlMode: Self = this.set("RateControlMode", js.undefined)
    
    @scala.inline
    def setSceneChangeDetect(value: Mpeg2SceneChangeDetect): Self = this.set("SceneChangeDetect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSceneChangeDetect: Self = this.set("SceneChangeDetect", js.undefined)
    
    @scala.inline
    def setSlowPal(value: Mpeg2SlowPal): Self = this.set("SlowPal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlowPal: Self = this.set("SlowPal", js.undefined)
    
    @scala.inline
    def setSoftness(value: integerMin0Max128): Self = this.set("Softness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSoftness: Self = this.set("Softness", js.undefined)
    
    @scala.inline
    def setSpatialAdaptiveQuantization(value: Mpeg2SpatialAdaptiveQuantization): Self = this.set("SpatialAdaptiveQuantization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpatialAdaptiveQuantization: Self = this.set("SpatialAdaptiveQuantization", js.undefined)
    
    @scala.inline
    def setSyntax(value: Mpeg2Syntax): Self = this.set("Syntax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyntax: Self = this.set("Syntax", js.undefined)
    
    @scala.inline
    def setTelecine(value: Mpeg2Telecine): Self = this.set("Telecine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTelecine: Self = this.set("Telecine", js.undefined)
    
    @scala.inline
    def setTemporalAdaptiveQuantization(value: Mpeg2TemporalAdaptiveQuantization): Self = this.set("TemporalAdaptiveQuantization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemporalAdaptiveQuantization: Self = this.set("TemporalAdaptiveQuantization", js.undefined)
  }
}
