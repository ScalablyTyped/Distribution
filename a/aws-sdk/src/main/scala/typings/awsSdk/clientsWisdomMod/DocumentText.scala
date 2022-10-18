package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentText extends StObject {
  
  /**
    * Highlights in the document text.
    */
  var highlights: js.UndefOr[Highlights] = js.undefined
  
  /**
    * Text in the document.
    */
  var text: js.UndefOr[SensitiveString] = js.undefined
}
object DocumentText {
  
  inline def apply(): DocumentText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentText]
  }
  
  extension [Self <: DocumentText](x: Self) {
    
    inline def setHighlights(value: Highlights): Self = StObject.set(x, "highlights", value.asInstanceOf[js.Any])
    
    inline def setHighlightsUndefined: Self = StObject.set(x, "highlights", js.undefined)
    
    inline def setHighlightsVarargs(value: Highlight*): Self = StObject.set(x, "highlights", js.Array(value*))
    
    inline def setText(value: SensitiveString): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
