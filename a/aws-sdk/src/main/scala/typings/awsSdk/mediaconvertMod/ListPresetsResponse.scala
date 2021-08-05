package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPresetsResponse extends StObject {
  
  /**
    * Use this string to request the next batch of presets.
    */
  var NextToken: js.UndefOr[string] = js.undefined
  
  /**
    * List of presets
    */
  var Presets: js.UndefOr[listOfPreset] = js.undefined
}
object ListPresetsResponse {
  
  inline def apply(): ListPresetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPresetsResponse]
  }
  
  extension [Self <: ListPresetsResponse](x: Self) {
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPresets(value: listOfPreset): Self = StObject.set(x, "Presets", value.asInstanceOf[js.Any])
    
    inline def setPresetsUndefined: Self = StObject.set(x, "Presets", js.undefined)
    
    inline def setPresetsVarargs(value: Preset*): Self = StObject.set(x, "Presets", js.Array(value :_*))
  }
}
