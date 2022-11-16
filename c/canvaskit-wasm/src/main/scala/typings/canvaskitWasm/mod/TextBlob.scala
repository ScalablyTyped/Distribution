package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type TextBlob = canvaskit-wasm.canvaskit-wasm.EmbindObject<canvaskit-wasm.canvaskit-wasm.TextBlob>
}}}
to avoid circular code involving: 
- canvaskit-wasm.canvaskit-wasm.TextBlob
*/
trait TextBlob
  extends StObject
     with EmbindObject[TextBlob]
object TextBlob {
  
  inline def apply(delete: () => Unit, deleteLater: () => Unit, isAliasOf: Any => Boolean, isDeleted: () => Boolean): TextBlob = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteLater = js.Any.fromFunction0(deleteLater), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted))
    __obj.asInstanceOf[TextBlob]
  }
}
