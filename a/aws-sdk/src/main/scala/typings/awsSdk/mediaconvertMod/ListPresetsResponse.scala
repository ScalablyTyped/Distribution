package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPresetsResponse extends StObject {
  
  /**
    * Use this string to request the next batch of presets.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * List of presets
    */
  var Presets: js.UndefOr[listOfPreset] = js.native
}
object ListPresetsResponse {
  
  @scala.inline
  def apply(): ListPresetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPresetsResponse]
  }
  
  @scala.inline
  implicit class ListPresetsResponseMutableBuilder[Self <: ListPresetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setPresets(value: listOfPreset): Self = StObject.set(x, "Presets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetsUndefined: Self = StObject.set(x, "Presets", js.undefined)
    
    @scala.inline
    def setPresetsVarargs(value: Preset*): Self = StObject.set(x, "Presets", js.Array(value :_*))
  }
}
