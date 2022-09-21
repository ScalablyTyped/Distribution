package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.HighlightSpanKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Span augmented with extra information that denotes the kind of the highlighting to be used for span.
  */
trait HighlightSpan
  extends StObject
     with TextSpanWithContext {
  
  var kind: HighlightSpanKind
}
object HighlightSpan {
  
  inline def apply(end: Location, kind: HighlightSpanKind, start: Location): HighlightSpan = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightSpan]
  }
  
  extension [Self <: HighlightSpan](x: Self) {
    
    inline def setKind(value: HighlightSpanKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
  }
}
