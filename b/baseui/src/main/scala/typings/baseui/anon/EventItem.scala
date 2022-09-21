package typings.baseui.anon

import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventItem extends StObject {
  
  var event: typings.std.Event | KeyboardEvent
  
  var item: typings.baseui.sideNavigationTypesMod.Item
}
object EventItem {
  
  inline def apply(event: typings.std.Event | KeyboardEvent, item: typings.baseui.sideNavigationTypesMod.Item): EventItem = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  
  extension [Self <: EventItem](x: Self) {
    
    inline def setEvent(value: typings.std.Event | KeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setItem(value: typings.baseui.sideNavigationTypesMod.Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
