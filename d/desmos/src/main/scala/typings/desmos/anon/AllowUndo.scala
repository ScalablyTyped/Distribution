package typings.desmos.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowUndo extends StObject {
  
  /**
    * Preserve the undo/redo history.
    * @default false
    */
  var allowUndo: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Remap colors in the saved state to those in the current Calculator.colors object. See the Colors section.
    * @default false
    */
  var remapColors: js.UndefOr[Boolean] = js.undefined
}
object AllowUndo {
  
  inline def apply(): AllowUndo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowUndo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowUndo] (val x: Self) extends AnyVal {
    
    inline def setAllowUndo(value: Boolean): Self = StObject.set(x, "allowUndo", value.asInstanceOf[js.Any])
    
    inline def setAllowUndoUndefined: Self = StObject.set(x, "allowUndo", js.undefined)
    
    inline def setRemapColors(value: Boolean): Self = StObject.set(x, "remapColors", value.asInstanceOf[js.Any])
    
    inline def setRemapColorsUndefined: Self = StObject.set(x, "remapColors", js.undefined)
  }
}
