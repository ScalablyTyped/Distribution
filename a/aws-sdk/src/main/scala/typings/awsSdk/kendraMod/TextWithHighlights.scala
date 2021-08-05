package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextWithHighlights extends StObject {
  
  /**
    * The beginning and end of the text that should be highlighted.
    */
  var Highlights: js.UndefOr[HighlightList] = js.undefined
  
  /**
    * The text to display to the user.
    */
  var Text: js.UndefOr[String] = js.undefined
}
object TextWithHighlights {
  
  inline def apply(): TextWithHighlights = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextWithHighlights]
  }
  
  extension [Self <: TextWithHighlights](x: Self) {
    
    inline def setHighlights(value: HighlightList): Self = StObject.set(x, "Highlights", value.asInstanceOf[js.Any])
    
    inline def setHighlightsUndefined: Self = StObject.set(x, "Highlights", js.undefined)
    
    inline def setHighlightsVarargs(value: Highlight*): Self = StObject.set(x, "Highlights", js.Array(value :_*))
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
  }
}
