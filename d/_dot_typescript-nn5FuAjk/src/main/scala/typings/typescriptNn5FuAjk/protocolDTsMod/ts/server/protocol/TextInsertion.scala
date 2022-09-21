package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextInsertion extends StObject {
  
  /** The position in newText the caret should point to after the insertion. */
  var caretOffset: Double
  
  var newText: String
}
object TextInsertion {
  
  inline def apply(caretOffset: Double, newText: String): TextInsertion = {
    val __obj = js.Dynamic.literal(caretOffset = caretOffset.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInsertion]
  }
  
  extension [Self <: TextInsertion](x: Self) {
    
    inline def setCaretOffset(value: Double): Self = StObject.set(x, "caretOffset", value.asInstanceOf[js.Any])
    
    inline def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
  }
}
