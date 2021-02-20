package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPresetResponse extends StObject {
  
  /**
    * A preset is a collection of preconfigured media conversion settings that you want MediaConvert to apply to the output during the conversion process.
    */
  var Preset: js.UndefOr[typings.awsSdk.mediaconvertMod.Preset] = js.native
}
object GetPresetResponse {
  
  @scala.inline
  def apply(): GetPresetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPresetResponse]
  }
  
  @scala.inline
  implicit class GetPresetResponseMutableBuilder[Self <: GetPresetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreset(value: Preset): Self = StObject.set(x, "Preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetUndefined: Self = StObject.set(x, "Preset", js.undefined)
  }
}
