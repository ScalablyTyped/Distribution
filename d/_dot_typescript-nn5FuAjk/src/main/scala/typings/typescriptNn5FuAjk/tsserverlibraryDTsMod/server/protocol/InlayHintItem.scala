package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlayHintItem extends StObject {
  
  var kind: InlayHintKind
  
  var position: Location
  
  var text: String
  
  var whitespaceAfter: js.UndefOr[Boolean] = js.undefined
  
  var whitespaceBefore: js.UndefOr[Boolean] = js.undefined
}
object InlayHintItem {
  
  inline def apply(kind: InlayHintKind, position: Location, text: String): InlayHintItem = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlayHintItem]
  }
  
  extension [Self <: InlayHintItem](x: Self) {
    
    inline def setKind(value: InlayHintKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Location): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setWhitespaceAfter(value: Boolean): Self = StObject.set(x, "whitespaceAfter", value.asInstanceOf[js.Any])
    
    inline def setWhitespaceAfterUndefined: Self = StObject.set(x, "whitespaceAfter", js.undefined)
    
    inline def setWhitespaceBefore(value: Boolean): Self = StObject.set(x, "whitespaceBefore", value.asInstanceOf[js.Any])
    
    inline def setWhitespaceBeforeUndefined: Self = StObject.set(x, "whitespaceBefore", js.undefined)
  }
}
