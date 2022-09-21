package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSpanWithContext
  extends StObject
     with TextSpan {
  
  var contextEnd: js.UndefOr[Location] = js.undefined
  
  var contextStart: js.UndefOr[Location] = js.undefined
}
object TextSpanWithContext {
  
  inline def apply(end: Location, start: Location): TextSpanWithContext = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextSpanWithContext]
  }
  
  extension [Self <: TextSpanWithContext](x: Self) {
    
    inline def setContextEnd(value: Location): Self = StObject.set(x, "contextEnd", value.asInstanceOf[js.Any])
    
    inline def setContextEndUndefined: Self = StObject.set(x, "contextEnd", js.undefined)
    
    inline def setContextStart(value: Location): Self = StObject.set(x, "contextStart", value.asInstanceOf[js.Any])
    
    inline def setContextStartUndefined: Self = StObject.set(x, "contextStart", js.undefined)
  }
}
