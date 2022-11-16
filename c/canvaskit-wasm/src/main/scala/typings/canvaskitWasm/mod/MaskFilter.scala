package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type MaskFilter = canvaskit-wasm.canvaskit-wasm.EmbindObject<canvaskit-wasm.canvaskit-wasm.MaskFilter>
}}}
to avoid circular code involving: 
- canvaskit-wasm.canvaskit-wasm.MaskFilter
*/
trait MaskFilter
  extends StObject
     with EmbindObject[MaskFilter]
object MaskFilter {
  
  inline def apply(delete: () => Unit, deleteLater: () => Unit, isAliasOf: Any => Boolean, isDeleted: () => Boolean): MaskFilter = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete), deleteLater = js.Any.fromFunction0(deleteLater), isAliasOf = js.Any.fromFunction1(isAliasOf), isDeleted = js.Any.fromFunction0(isDeleted))
    __obj.asInstanceOf[MaskFilter]
  }
}
