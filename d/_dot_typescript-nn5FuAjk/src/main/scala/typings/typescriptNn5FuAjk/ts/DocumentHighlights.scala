package typings.typescriptNn5FuAjk.ts

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentHighlights extends StObject {
  
  var fileName: java.lang.String
  
  var highlightSpans: Array[HighlightSpan]
}
object DocumentHighlights {
  
  inline def apply(fileName: java.lang.String, highlightSpans: Array[HighlightSpan]): DocumentHighlights = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any], highlightSpans = highlightSpans.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentHighlights]
  }
  
  extension [Self <: DocumentHighlights](x: Self) {
    
    inline def setFileName(value: java.lang.String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setHighlightSpans(value: Array[HighlightSpan]): Self = StObject.set(x, "highlightSpans", value.asInstanceOf[js.Any])
  }
}
