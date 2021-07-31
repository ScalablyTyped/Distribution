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
  
  @scala.inline
  def apply(): ListPresetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPresetsResponse]
  }
  
  @scala.inline
  implicit class ListPresetsResponseMutableBuilder[Self <: ListPresetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: Id): Self = StObject.set(x, "NextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "NextPageToken", js.undefined)
    
    @scala.inline
    def setPresets(value: Presets): Self = StObject.set(x, "Presets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPresetsUndefined: Self = StObject.set(x, "Presets", js.undefined)
    
    @scala.inline
    def setPresetsVarargs(value: Preset*): Self = StObject.set(x, "Presets", js.Array(value :_*))
  }
}
