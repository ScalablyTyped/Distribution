package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoiseReducerFilterSettings extends StObject {
  
  /**
    * Relative strength of noise reducing filter. Higher values produce stronger filtering.
    */
  var Strength: js.UndefOr[integerMin0Max3] = js.undefined
}
object NoiseReducerFilterSettings {
  
  @scala.inline
  def apply(): NoiseReducerFilterSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoiseReducerFilterSettings]
  }
  
  @scala.inline
  implicit class NoiseReducerFilterSettingsMutableBuilder[Self <: NoiseReducerFilterSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStrength(value: integerMin0Max3): Self = StObject.set(x, "Strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrengthUndefined: Self = StObject.set(x, "Strength", js.undefined)
  }
}
