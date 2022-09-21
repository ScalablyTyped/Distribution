package typings.typescriptNn5FuAjk.ts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSDocLinkDisplayPart
  extends StObject
     with SymbolDisplayPart {
  
  var target: DocumentSpan
}
object JSDocLinkDisplayPart {
  
  inline def apply(kind: java.lang.String, target: DocumentSpan, text: java.lang.String): JSDocLinkDisplayPart = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSDocLinkDisplayPart]
  }
  
  extension [Self <: JSDocLinkDisplayPart](x: Self) {
    
    inline def setTarget(value: DocumentSpan): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
