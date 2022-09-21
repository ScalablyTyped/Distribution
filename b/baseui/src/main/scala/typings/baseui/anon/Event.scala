package typings.baseui.anon

import typings.baseui.dataTableTypesMod.Row
import typings.react.mod.SyntheticEvent
import typings.std.HTMLButtonElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  var event: SyntheticEvent[HTMLButtonElement, typings.std.Event]
  
  var row: Row
}
object Event {
  
  inline def apply(event: SyntheticEvent[HTMLButtonElement, typings.std.Event], row: Row): Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
  
  extension [Self <: Event](x: Self) {
    
    inline def setEvent(value: SyntheticEvent[HTMLButtonElement, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setRow(value: Row): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
  }
}
