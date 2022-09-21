package typings.awsSdk.locationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchForSuggestionsResult extends StObject {
  
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
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
  }
}
