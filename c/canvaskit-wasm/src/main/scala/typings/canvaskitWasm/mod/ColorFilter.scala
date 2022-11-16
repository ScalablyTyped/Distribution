package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type ColorFilter = canvaskit-wasm.canvaskit-wasm.EmbindObject<canvaskit-wasm.canvaskit-wasm.ColorFilter>
}}}
to avoid circular code involving: 
- canvaskit-wasm.canvaskit-wasm.ColorFilter
*/
trait ColorFilter
  extends StObject
     with EmbindObject[ColorFilter]
object ColorFilter {
  
  inline def apply(delete: () => Unit, deleteLater: () => Unit, isAliasOf: Any => Boolean, isDeleted: () => Boolean): ColorFilter = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteLater = js.Any.fromFunction0(deleteLater), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted))
    __obj.asInstanceOf[ColorFilter]
  }
}
