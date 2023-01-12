package typings.baseui.anon

import typings.baseui.dataTableTypesMod.Row
import typings.react.mod.SyntheticEvent
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearSelection extends StObject {
  
  def clearSelection(): Any
  
  var event: SyntheticEvent[HTMLButtonElement, typings.std.Event]
  
  var selection: js.Array[Row]
}
object ClearSelection {
  
  inline def apply(
    clearSelection: () => Any,
    event: SyntheticEvent[HTMLButtonElement, typings.std.Event],
    selection: js.Array[Row]
  ): ClearSelection = {
    val __obj = js.Dynamic.literal(clearSelection = js.Any.fromFunction0(clearSelection), event = event.asInstanceOf[js.Any], selection = selection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearSelection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearSelection] (val x: Self) extends AnyVal {
    
    inline def setClearSelection(value: () => Any): Self = StObject.set(x, "clearSelection", js.Any.fromFunction0(value))
    
    inline def setEvent(value: SyntheticEvent[HTMLButtonElement, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setSelection(value: js.Array[Row]): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionVarargs(value: Row*): Self = StObject.set(x, "selection", js.Array(value*))
  }
}
