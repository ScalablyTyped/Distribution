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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
    
    inline def setAllowUndo(value: Boolean): Self = StObject.set(x, "allowUndo", value.asInstanceOf[js.Any])
    
    inline def setAllowUndoUndefined: Self = StObject.set(x, "allowUndo", js.undefined)
  }
}
