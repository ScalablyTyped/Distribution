package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A part of a symbol description that links from a jsdoc @link tag to a declaration */
trait JSDocLinkDisplayPart
  extends StObject
     with SymbolDisplayPart {
  
  /** The location of the declaration that the @link tag links to. */
  var target: FileSpan
}
object JSDocLinkDisplayPart {
  
  inline def apply(kind: String, target: FileSpan, text: String): JSDocLinkDisplayPart = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSDocLinkDisplayPart]
  }
  
  extension [Self <: JSDocLinkDisplayPart](x: Self) {
    
    inline def setTarget(value: FileSpan): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
