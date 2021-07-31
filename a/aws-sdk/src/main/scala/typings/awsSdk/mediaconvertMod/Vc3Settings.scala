package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Vc3Settings extends StObject {
  
  /**
    * If you are using the console, use the Framerate setting to specify the frame rate for this output. If you want to keep the same frame rate as the input video, choose Follow source. If you want to do frame rate conversion, choose a frame rate from the dropdown list or choose Custom. The framerates shown in the dropdown list are decimal approximations of fractions. If you choose Custom, specify your frame rate as a fraction. If you are creating your transcoding job specification as a JSON file without the console, use FramerateControl to specify which value the service uses for the frame rate for this output. Choose INITIALIZE_FROM_SOURCE if you want the service to use the frame rate from the input. Choose SPECIFIED if you want the service to use the frame rate you specify in the settings FramerateNumerator and FramerateDenominator.
    */
  var FramerateControl: js.UndefOr[Vc3FramerateControl] = js.undefined
  
  /**
    * Choose the method that you want MediaConvert to use when increasing or decreasing the frame rate. We recommend using drop duplicate (DUPLICATE_DROP) for numerically simple conversions, such as 60 fps to 30 fps. For numerically complex conversions, you can use interpolate (INTERPOLATE) to avoid stutter. This results in a smooth picture, but might introduce undesirable video artifacts. For complex frame rate conversions, especially if your source video has already been converted from its original cadence, use FrameFormer (FRAMEFORMER) to do motion-compensated interpolation. FrameFormer chooses the best conversion method frame by frame. Note that using FrameFormer increases the transcoding time and incurs a significant add-on cost.
    */
  var FramerateConversionAlgorithm: js.UndefOr[Vc3FramerateConversionAlgorithm] = js.undefined
  
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateDenominator to specify the denominator of this fraction. In this example, use 1001 for the value of FramerateDenominator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max1001] = js.undefined
  
  /**
    * When you use the API for transcode jobs that use frame rate conversion, specify the frame rate as a fraction. For example,  24000 / 1001 = 23.976 fps. Use FramerateNumerator to specify the numerator of this fraction. In this example, use 24000 for the value of FramerateNumerator. When you use the console for transcode jobs that use frame rate conversion, provide the value as a decimal number for Framerate. In this example, specify 23.976.
    */
  var FramerateNumerator: js.UndefOr[integerMin24Max60000] = js.undefined
  
  /**
    * Optional. Choose the scan line type for this output. If you don't specify a value, MediaConvert will create a progressive output.
    */
  var InterlaceMode: js.UndefOr[Vc3InterlaceMode] = js.undefined
  
  /**
    * Ignore this setting unless your input frame rate is 23.976 or 24 frames per second (fps). Enable slow PAL to create a 25 fps output by relabeling the video frames and resampling your audio. Note that enabling this setting will slightly reduce the duration of your video. Related settings: You must also set Framerate to 25. In your JSON job specification, set (framerateControl) to (SPECIFIED), (framerateNumerator) to 25 and (framerateDenominator) to 1.
    */
  var SlowPal: js.UndefOr[Vc3SlowPal] = js.undefined
  
  /**
    * When you do frame rate conversion from 23.976 frames per second (fps) to 29.97 fps, and your output scan type is interlaced, you can optionally enable hard telecine (HARD) to create a smoother picture. When you keep the default value, None (NONE), MediaConvert does a standard frame rate conversion to 29.97 without doing anything with the field polarity to create a smoother picture.
    */
  var Telecine: js.UndefOr[Vc3Telecine] = js.undefined
  
  /**
    * Specify the VC3 class to choose the quality characteristics for this output. VC3 class, together with the settings Framerate (framerateNumerator and framerateDenominator) and Resolution (height and width), determine your output bitrate. For example, say that your video resolution is 1920x1080 and your framerate is 29.97. Then Class 145 (CLASS_145) gives you an output with a bitrate of approximately 145 Mbps and Class 220 (CLASS_220) gives you and output with a bitrate of approximately 220 Mbps. VC3 class also specifies the color bit depth of your output.
    */
  var Vc3Class: js.UndefOr[typings.awsSdk.mediaconvertMod.Vc3Class] = js.undefined
}
object Vc3Settings {
  
  @scala.inline
  def apply(): Vc3Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Vc3Settings]
  }
  
  @scala.inline
  implicit class Vc3SettingsMutableBuilder[Self <: Vc3Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFramerateControl(value: Vc3FramerateControl): Self = StObject.set(x, "FramerateControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateControlUndefined: Self = StObject.set(x, "FramerateControl", js.undefined)
    
    @scala.inline
    def setFramerateConversionAlgorithm(value: Vc3FramerateConversionAlgorithm): Self = StObject.set(x, "FramerateConversionAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateConversionAlgorithmUndefined: Self = StObject.set(x, "FramerateConversionAlgorithm", js.undefined)
    
    @scala.inline
    def setFramerateDenominator(value: integerMin1Max1001): Self = StObject.set(x, "FramerateDenominator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateDenominatorUndefined: Self = StObject.set(x, "FramerateDenominator", js.undefined)
    
    @scala.inline
    def setFramerateNumerator(value: integerMin24Max60000): Self = StObject.set(x, "FramerateNumerator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramerateNumeratorUndefined: Self = StObject.set(x, "FramerateNumerator", js.undefined)
    
    @scala.inline
    def setInterlaceMode(value: Vc3InterlaceMode): Self = StObject.set(x, "InterlaceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterlaceModeUndefined: Self = StObject.set(x, "InterlaceMode", js.undefined)
    
    @scala.inline
    def setSlowPal(value: Vc3SlowPal): Self = StObject.set(x, "SlowPal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlowPalUndefined: Self = StObject.set(x, "SlowPal", js.undefined)
    
    @scala.inline
    def setTelecine(value: Vc3Telecine): Self = StObject.set(x, "Telecine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTelecineUndefined: Self = StObject.set(x, "Telecine", js.undefined)
    
    @scala.inline
    def setVc3Class(value: Vc3Class): Self = StObject.set(x, "Vc3Class", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVc3ClassUndefined: Self = StObject.set(x, "Vc3Class", js.undefined)
  }
}
