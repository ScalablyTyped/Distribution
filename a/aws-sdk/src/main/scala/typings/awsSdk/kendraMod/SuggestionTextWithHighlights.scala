package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestionTextWithHighlights extends StObject {
  
  /**
    * The beginning and end of the query suggestion text that should be highlighted.
    */
  var Highlights: js.UndefOr[SuggestionHighlightList] = js.undefined
  
  /**
    * The query suggestion text to display to the user.
    */
  var Text: js.UndefOr[String] = js.undefined
}
object SuggestionTextWithHighlights {
  
  inline def apply(): SuggestionTextWithHighlights = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestionTextWithHighlights]
  }
  
  extension [Self <: SuggestionTextWithHighlights](x: Self) {
    
    inline def setHighlights(value: SuggestionHighlightList): Self = StObject.set(x, "Highlights", value.asInstanceOf[js.Any])
    
    inline def setHighlightsUndefined: Self = StObject.set(x, "Highlights", js.undefined)
    
    inline def setHighlightsVarargs(value: SuggestionHighlight*): Self = StObject.set(x, "Highlights", js.Array(value*))
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
  }
}
