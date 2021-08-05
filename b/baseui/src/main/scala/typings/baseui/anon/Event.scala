package typings.baseui.anon

import typings.baseui.dataTableMod.RowT
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var event: MouseEvent[HTMLButtonElement, NativeMouseEvent]
  
  var row: RowT
}
object Event {
  
  inline def apply(event: MouseEvent[HTMLButtonElement, NativeMouseEvent], row: RowT): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setEvent(value: MouseEvent[HTMLButtonElement, NativeMouseEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setRow(value: RowT): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
