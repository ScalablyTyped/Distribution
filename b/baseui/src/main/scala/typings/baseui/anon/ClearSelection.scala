package typings.baseui.anon

import typings.baseui.dataTableMod.RowT
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearSelection extends StObject {
  
  def clearSelection(): js.Any
  
  var event: MouseEvent[HTMLButtonElement, NativeMouseEvent]
  
  var selection: js.Array[RowT]
}
object ClearSelection {
  
  inline def apply(
    clearSelection: () => js.Any,
    event: MouseEvent[HTMLButtonElement, NativeMouseEvent],
    selection: js.Array[RowT]
  ): ClearSelection = {
    val __obj = js.Dynamic.literal(clearSelection = js.Any.fromFunction0(clearSelection), event = event.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearSelection]
  }
  
  extension [Self <: ClearSelection](x: Self) {
    
    inline def setClearSelection(value: () => js.Any): Self = StObject.set(x, "clearSelection", js.Any.fromFunction0(value))
    
    inline def setEvent(value: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: js.Array[RowT]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionVarargs(value: RowT*): Self = StObject.set(x, "selection", js.Array(value :_*))
  }
}
