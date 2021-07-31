package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePresetResponse extends StObject {
  
  /**
    * A section of the response body that provides information about the preset that is created.
    */
  var Preset: js.UndefOr[typings.awsSdk.elastictranscoderMod.Preset] = js.undefined
  
  /**
    * If the preset settings don't comply with the standards for the video codec but Elastic Transcoder created the preset, this message explains the reason the preset settings don't meet the standard. Elastic Transcoder created the preset because the settings might produce acceptable output.
    */
  var Warning: js.UndefOr[String] = js.undefined
}
object CreatePresetResponse {
  
  @scala.inline
  def apply(): CreatePresetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePresetResponse]
  }
  
  @scala.inline
  implicit class CreatePresetResponseMutableBuilder[Self <: CreatePresetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreset(value: Preset): Self = StObject.set(x, "Preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetUndefined: Self = StObject.set(x, "Preset", js.undefined)
    
    @scala.inline
    def setWarning(value: String): Self = StObject.set(x, "Warning", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningUndefined: Self = StObject.set(x, "Warning", js.undefined)
  }
}
