package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoiseReducerSpatialFilterSettings extends StObject {
  
  /**
    * Specify strength of post noise reduction sharpening filter, with 0 disabling the filter and 3 enabling it at maximum strength.
    */
  var PostFilterSharpenStrength: js.UndefOr[integerMin0Max3] = js.native
  
  /**
    * The speed of the filter, from -2 (lower speed) to 3 (higher speed), with 0 being the nominal value.
    */
  var Speed: js.UndefOr[integerMinNegative2Max3] = js.native
  
  /**
    * Relative strength of noise reducing filter. Higher values produce stronger filtering.
    */
  var Strength: js.UndefOr[integerMin0Max16] = js.native
}
object NoiseReducerSpatialFilterSettings {
  
  @scala.inline
  def apply(): NoiseReducerSpatialFilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoiseReducerSpatialFilterSettings]
  }
  
  @scala.inline
  implicit class NoiseReducerSpatialFilterSettingsMutableBuilder[Self <: NoiseReducerSpatialFilterSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostFilterSharpenStrength(value: integerMin0Max3): Self = StObject.set(x, "PostFilterSharpenStrength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostFilterSharpenStrengthUndefined: Self = StObject.set(x, "PostFilterSharpenStrength", js.undefined)
    
    @scala.inline
    def setSpeed(value: integerMinNegative2Max3): Self = StObject.set(x, "Speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "Speed", js.undefined)
    
    @scala.inline
    def setStrength(value: integerMin0Max16): Self = StObject.set(x, "Strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrengthUndefined: Self = StObject.set(x, "Strength", js.undefined)
  }
}
