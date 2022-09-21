package typings.awsSdk.elastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPresetsResponse extends StObject {
  
  /**
    * A value that you use to access the second and subsequent pages of results, if any. When the presets fit on one page or when you've reached the last page of results, the value of NextPageToken is null.
    */
  var NextPageToken: js.UndefOr[Id] = js.undefined
  
  /**
    * An array of Preset objects.
    */
  var Presets: js.UndefOr[typings.awsSdk.elastictranscoderMod.Presets] = js.undefined
}
object ListPresetsResponse {
  
  inline def apply(): ListPresetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPresetsResponse]
  }
  
  extension [Self <: ListPresetsResponse](x: Self) {
    
    inline def setNextPageToken(value: Id): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    inline def setPresets(value: Presets): Self = StObject.set(x, "Presets", value.asInstanceOf[js.Any])
    
    inline def setPresetsUndefined: Self = StObject.set(x, "Presets", js.undefined)
    
    inline def setPresetsVarargs(value: Preset*): Self = StObject.set(x, "Presets", js.Array(value*))
  }
}
