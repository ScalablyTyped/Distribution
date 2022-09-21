package typings.desmos.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  /**
    * Preserve the undo/redo history.
    * @default false
    */
  var allowUndo: js.UndefOr[Boolean] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setAllowUndo(value: Boolean): Self = StObject.set(x, "allowUndo", value.asInstanceOf[js.Any])
    
    inline def setAllowUndoUndefined: Self = StObject.set(x, "allowUndo", js.undefined)
  }
}
