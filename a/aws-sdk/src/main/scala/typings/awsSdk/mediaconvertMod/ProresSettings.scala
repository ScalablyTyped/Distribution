package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProresSettings extends StObject {
  
  /**
    * Use Profile (ProResCodecProfile) to specifiy the type of Apple ProRes codec to use for this output.
    */
  var CodecProfile: js.UndefOr[ProresCodecProfile] = js.native
  
  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[ProresFramerateControl] = js.native
  
  /**
    * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
    */
  var FramerateConversionAlgorithm: js.UndefOr[ProresFramerateConversionAlgorithm] = js.native
  
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this example, use 24000 for the value of FramerateNumerator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  
  /**
    * Choose the scan line type for the output. Keep the default value, Progressive (PROGRESSIVE) to create a progressive output, regardless of the scan type of your input. Use Top field first (TOP_FIELD) or Bottom field first (BOTTOM_FIELD) to create an output that's interlaced with the same field polarity throughout. Use Follow, default top (FOLLOW_TOP_FIELD) or Follow, default bottom (FOLLOW_BOTTOM_FIELD) to produce outputs with the same field polarity as the source. For jobs that have multiple inputs, the output field polarity might change over the course of the output. Follow behavior depends on the input scan type. If the source is interlaced, the output will be interlaced with the same polarity as the source. If the source is progressive, the output will be interlaced with top field bottom field first, depending on which of the Follow options you choose.
    */
  var InterlaceMode: js.UndefOr[ProresInterlaceMode] = js.native
  
  /**
    * Optional. Specify how the service determines the pixel aspect ratio (PAR) for this output. The default behavior, Follow source (INITIALIZE_FROM_SOURCE), uses the PAR from your input video for your output. To specify a different PAR in the console, choose any value other than Follow source. To specify a different PAR by editing the JSON job specification, choose SPECIFIED. When you choose SPECIFIED for this setting, you must also specify values for the parNumerator and parDenominator settings.
    */
  var ParControl: js.UndefOr[ProresParControl] = js.native
  
  /**
    * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this example, the value for parDenominator is 33.
    */
  var ParDenominator: js.UndefOr[integerMin1Max2147483647] = js.native
  
  /**
    * Required when you set Pixel aspect ratio (parControl) to SPECIFIED. On the console, this corresponds to any value other than Follow source. When you specify an output pixel aspect ratio (PAR) that is different from your input video PAR, provide your output PAR as a ratio. For example, for D1/DV NTSC widescreen, you would specify the ratio 40:33. In this example, the value for parNumerator is 40.
    */
  var ParNumerator: js.UndefOr[integerMin1Max2147483647] = js.native
  
  /**
    * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output. When you enable slow PAL, MediaConvert relabels the video frames to 25 fps and resamples your audio to keep it synchronized with the video. Note that enabling this setting will slightly reduce the duration of your video. Required settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
    */
  var SlowPal: js.UndefOr[ProresSlowPal] = js.native
  
  /**
    * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
    */
  var Telecine: js.UndefOr[ProresTelecine] = js.native
}
object ProresSettings {
  
  @scala.inline
  def apply(): ProresSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProresSettings]
  }
  
  @scala.inline
  implicit class ProresSettingsMutableBuilder[Self <: ProresSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodecProfile(value: ProresCodecProfile): Self = StObject.set(x, "CodecProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecProfileUndefined: Self = StObject.set(x, "CodecProfile", js.undefined)
    
    @scala.inline
    def setFramerateControl(value: ProresFramerateControl): Self = StObject.set(x, "FramerateControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateControlUndefined: Self = StObject.set(x, "FramerateControl", js.undefined)
    
    @scala.inline
    def setFramerateConversionAlgorithm(value: ProresFramerateConversionAlgorithm): Self = StObject.set(x, "FramerateConversionAlgorithm", value.asInstanceOf[js.Any])
    
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
    def setInterlaceMode(value: ProresInterlaceMode): Self = StObject.set(x, "InterlaceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterlaceModeUndefined: Self = StObject.set(x, "InterlaceMode", js.undefined)
    
    @scala.inline
    def setParControl(value: ProresParControl): Self = StObject.set(x, "ParControl", value.asInstanceOf[js.Any])
    
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
    def setSlowPal(value: ProresSlowPal): Self = StObject.set(x, "SlowPal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlowPalUndefined: Self = StObject.set(x, "SlowPal", js.undefined)
    
    @scala.inline
    def setTelecine(value: ProresTelecine): Self = StObject.set(x, "Telecine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelecineUndefined: Self = StObject.set(x, "Telecine", js.undefined)
  }
}
