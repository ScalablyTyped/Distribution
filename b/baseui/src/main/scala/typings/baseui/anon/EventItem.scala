package typings.baseui.anon

import typings.react.mod.SyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventItem extends StObject {
  
  var event: SyntheticEvent[js.Any, typings.std.Event]
  
  var item: js.Any
}
object EventItem {
  
  inline def apply(event: SyntheticEvent[js.Any, typings.std.Event], item: js.Any): EventItem = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  
  extension [Self <: EventItem](x: Self) {
    
    inline def setEvent(value: SyntheticEvent[js.Any, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
