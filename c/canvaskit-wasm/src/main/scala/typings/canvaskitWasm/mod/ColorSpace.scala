package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type ColorSpace = canvaskit-wasm.canvaskit-wasm.EmbindObject<canvaskit-wasm.canvaskit-wasm.ColorSpace>
}}}
to avoid circular code involving: 
- canvaskit-wasm.canvaskit-wasm.ColorSpace
*/
trait ColorSpace
  extends StObject
     with EmbindObject[ColorSpace]
object ColorSpace {
  
  inline def apply(delete: () => Unit, deleteLater: () => Unit, isAliasOf: Any => Boolean, isDeleted: () => Boolean): ColorSpace = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteLater = js.Any.fromFunction0(deleteLater), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted))
    __obj.asInstanceOf[ColorSpace]
  }
}
