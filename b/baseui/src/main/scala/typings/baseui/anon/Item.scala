package typings.baseui.anon

import typings.react.mod.SyntheticEvent
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Item extends StObject {
  
  var event: js.UndefOr[(SyntheticEvent[HTMLElement, typings.std.Event]) | KeyboardEvent] = js.undefined
  
  var item: typings.baseui.menuTypesMod.Item
}
object Item {
  
  inline def apply(item: typings.baseui.menuTypesMod.Item): Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[Item]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Item] (val x: Self) extends AnyVal {
    
    inline def setEvent(value: (SyntheticEvent[HTMLElement, typings.std.Event]) | KeyboardEvent): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    
    inline def setItem(value: typings.baseui.menuTypesMod.Item): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
  }
}
