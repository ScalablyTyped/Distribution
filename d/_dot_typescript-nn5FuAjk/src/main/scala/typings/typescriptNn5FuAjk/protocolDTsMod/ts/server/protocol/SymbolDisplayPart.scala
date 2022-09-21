package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Part of a symbol description.
  */
trait SymbolDisplayPart extends StObject {
  
  /**
    * The symbol's kind (such as 'className' or 'parameterName' or plain 'text').
    */
  var kind: String
  
  /**
    * Text of an item describing the symbol.
    */
  var text: String
}
object SymbolDisplayPart {
  
  inline def apply(kind: String, text: String): SymbolDisplayPart = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymbolDisplayPart]
  }
  
  extension [Self <: SymbolDisplayPart](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
