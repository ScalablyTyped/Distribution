package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a set of highligh spans for a give name
  */
trait DocumentHighlightsItem extends StObject {
  
  /**
    * File containing highlight spans.
    */
  var file: String
  
  /**
    * Spans to highlight in file.
    */
  var highlightSpans: Array[HighlightSpan]
}
object DocumentHighlightsItem {
  
  inline def apply(file: String, highlightSpans: Array[HighlightSpan]): DocumentHighlightsItem = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], highlightSpans = highlightSpans.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentHighlightsItem]
  }
  
  extension [Self <: DocumentHighlightsItem](x: Self) {
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setHighlightSpans(value: Array[HighlightSpan]): Self = StObject.set(x, "highlightSpans", value.asInstanceOf[js.Any])
  }
}
