package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.TextSpan because Already inherited
- typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol.TextSpanWithContext because var conflicts: end, start. Inlined contextStart, contextEnd */ trait FileSpanWithContext
  extends StObject
     with FileSpan {
  
  var contextEnd: js.UndefOr[Location] = js.undefined
  
  var contextStart: js.UndefOr[Location] = js.undefined
}
object FileSpanWithContext {
  
  inline def apply(end: Location, file: String, start: Location): FileSpanWithContext = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSpanWithContext]
  }
  
  extension [Self <: FileSpanWithContext](x: Self) {
    
    inline def setContextEnd(value: Location): Self = StObject.set(x, "contextEnd", value.asInstanceOf[js.Any])
    
    inline def setContextEndUndefined: Self = StObject.set(x, "contextEnd", js.undefined)
    
    inline def setContextStart(value: Location): Self = StObject.set(x, "contextStart", value.asInstanceOf[js.Any])
    
    inline def setContextStartUndefined: Self = StObject.set(x, "contextStart", js.undefined)
  }
}
