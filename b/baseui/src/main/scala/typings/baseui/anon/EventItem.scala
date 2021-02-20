package typings.baseui.anon

import typings.react.mod.SyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventItem extends StObject {
  
  var event: SyntheticEvent[_, typings.std.Event] = js.native
  
  var item: js.Any = js.native
}
object EventItem {
  
  @scala.inline
  def apply(event: SyntheticEvent[_, typings.std.Event], item: js.Any): EventItem = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventItem]
  }
  
  @scala.inline
  implicit class EventItemMutableBuilder[Self <: EventItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvent(value: SyntheticEvent[_, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
