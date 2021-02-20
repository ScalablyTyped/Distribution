package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoPreprocessor extends StObject {
  
  /**
    * Enable the Color corrector (ColorCorrector) feature if necessary. Enable or disable this feature for each output individually. This setting is disabled by default.
    */
  var ColorCorrector: js.UndefOr[typings.awsSdk.mediaconvertMod.ColorCorrector] = js.native
  
  /**
    * Use Deinterlacer (Deinterlacer) to produce smoother motion and a clearer picture.
    */
  var Deinterlacer: js.UndefOr[typings.awsSdk.mediaconvertMod.Deinterlacer] = js.native
  
  /**
    * Enable Dolby Vision feature to produce Dolby Vision compatible video output.
    */
  var DolbyVision: js.UndefOr[typings.awsSdk.mediaconvertMod.DolbyVision] = js.native
  
  /**
    * Enable the Image inserter (ImageInserter) feature to include a graphic overlay on your video. Enable or disable this feature for each output individually. This setting is disabled by default.
    */
  var ImageInserter: js.UndefOr[typings.awsSdk.mediaconvertMod.ImageInserter] = js.native
  
  /**
    * Enable the Noise reducer (NoiseReducer) feature to remove noise from your video output if necessary. Enable or disable this feature for each output individually. This setting is disabled by default.
    */
  var NoiseReducer: js.UndefOr[typings.awsSdk.mediaconvertMod.NoiseReducer] = js.native
  
  /**
    * If you work with a third party video watermarking partner, use the group of settings that correspond with your watermarking partner to include watermarks in your output.
    */
  var PartnerWatermarking: js.UndefOr[typings.awsSdk.mediaconvertMod.PartnerWatermarking] = js.native
  
  /**
    * Timecode burn-in (TimecodeBurnIn)--Burns the output timecode and specified prefix into the output.
    */
  var TimecodeBurnin: js.UndefOr[typings.awsSdk.mediaconvertMod.TimecodeBurnin] = js.native
}
object VideoPreprocessor {
  
  @scala.inline
  def apply(): VideoPreprocessor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoPreprocessor]
  }
  
  @scala.inline
  implicit class VideoPreprocessorMutableBuilder[Self <: VideoPreprocessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColorCorrector(value: ColorCorrector): Self = StObject.set(x, "ColorCorrector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorCorrectorUndefined: Self = StObject.set(x, "ColorCorrector", js.undefined)
    
    @scala.inline
    def setDeinterlacer(value: Deinterlacer): Self = StObject.set(x, "Deinterlacer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeinterlacerUndefined: Self = StObject.set(x, "Deinterlacer", js.undefined)
    
    @scala.inline
    def setDolbyVision(value: DolbyVision): Self = StObject.set(x, "DolbyVision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDolbyVisionUndefined: Self = StObject.set(x, "DolbyVision", js.undefined)
    
    @scala.inline
    def setImageInserter(value: ImageInserter): Self = StObject.set(x, "ImageInserter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageInserterUndefined: Self = StObject.set(x, "ImageInserter", js.undefined)
    
    @scala.inline
    def setNoiseReducer(value: NoiseReducer): Self = StObject.set(x, "NoiseReducer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoiseReducerUndefined: Self = StObject.set(x, "NoiseReducer", js.undefined)
    
    @scala.inline
    def setPartnerWatermarking(value: PartnerWatermarking): Self = StObject.set(x, "PartnerWatermarking", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartnerWatermarkingUndefined: Self = StObject.set(x, "PartnerWatermarking", js.undefined)
    
    @scala.inline
    def setTimecodeBurnin(value: TimecodeBurnin): Self = StObject.set(x, "TimecodeBurnin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimecodeBurninUndefined: Self = StObject.set(x, "TimecodeBurnin", js.undefined)
  }
}
