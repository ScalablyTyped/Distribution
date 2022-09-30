package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchForSuggestionsResult extends StObject {
  
  /**
    * The unique identifier of the place. You can use this with the GetPlace operation to find the place again later.  For SearchPlaceIndexForSuggestions operations, the PlaceId is returned by place indexes that use HERE or Esri as data providers. 
    */
  var PlaceId: js.UndefOr[typings.awsSdk.locationMod.PlaceId] = js.undefined
  
  /**
    * The text of the place suggestion, typically formatted as an address string.
    */
  var Text: String
}
object SearchForSuggestionsResult {
  
  inline def apply(Text: String): SearchForSuggestionsResult = {
    val __obj = js.Dynamic.literal(Text = Text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchForSuggestionsResult]
  }
  
  extension [Self <: SearchForSuggestionsResult](x: Self) {
    
    inline def setPlaceId(value: PlaceId): Self = StObject.set(x, "PlaceId", value.asInstanceOf[js.Any])
    
    inline def setPlaceIdUndefined: Self = StObject.set(x, "PlaceId", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
