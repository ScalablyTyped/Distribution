package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadPresetResponse extends StObject {
  
  /**
    * A section of the response body that provides information about the preset.
    */
  var Preset: js.UndefOr[typings.awsSdk.elastictranscoderMod.Preset] = js.native
}
object ReadPresetResponse {
  
  @scala.inline
  def apply(): ReadPresetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadPresetResponse]
  }
  
  @scala.inline
  implicit class ReadPresetResponseMutableBuilder[Self <: ReadPresetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPreset(value: Preset): Self = StObject.set(x, "Preset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetUndefined: Self = StObject.set(x, "Preset", js.undefined)
  }
}
