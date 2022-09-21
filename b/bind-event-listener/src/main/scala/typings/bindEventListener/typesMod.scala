package typings.bindEventListener

import typings.std.AddEventListenerOptions
import typings.std.Event
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait Binding[Target /* <: EventTarget */, EventName /* <: String */] extends StObject {
    
    var listener: Listener[Target, EventName]
    
    var options: js.UndefOr[Boolean | AddEventListenerOptions] = js.undefined
    
    var `type`: EventName
  }
  object Binding {
    
    inline def apply[Target /* <: EventTarget */, EventName /* <: String */](listener: Listener[Target, EventName], `type`: EventName): Binding[Target, EventName] = {
      val __obj = js.Dynamic.literal(listener = listener.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Binding[Target, EventName]]
    }
    
    extension [Self <: Binding[?, ?], Target /* <: EventTarget */, EventName /* <: String */](x: Self & (Binding[Target, EventName])) {
      
      inline def setListener(value: Listener[Target, EventName]): Self = StObject.set(x, "listener", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Boolean | AddEventListenerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setType(value: EventName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type ExtractEventTypeFromHandler[MaybeFn /* <: Any */] = Event
  
  type GetEventType[Target /* <: EventTarget */, EventName /* <: String */] = Event | (ExtractEventTypeFromHandler[
    /* import warning: importer.ImportType#apply Failed type conversion: Target['on${EventName}'] */ js.Any
  ])
  
  type Listener[Target /* <: EventTarget */, EventName /* <: String */] = (ListenerObject[GetEventType[Target, EventName]]) | (js.ThisFunction1[/* this */ Target, /* e */ GetEventType[Target, EventName], Unit])
  
  trait ListenerObject[TEvent /* <: Event */] extends StObject {
    
    def handleEvent(e: TEvent): Unit
  }
  object ListenerObject {
    
    inline def apply[TEvent /* <: Event */](handleEvent: TEvent => Unit): ListenerObject[TEvent] = {
      val __obj = js.Dynamic.literal(handleEvent = js.Any.fromFunction1(handleEvent))
      __obj.asInstanceOf[ListenerObject[TEvent]]
    }
    
    extension [Self <: ListenerObject[?], TEvent /* <: Event */](x: Self & ListenerObject[TEvent]) {
      
      inline def setHandleEvent(value: TEvent => Unit): Self = StObject.set(x, "handleEvent", js.Any.fromFunction1(value))
    }
  }
  
  type UnbindFn = js.Function0[Unit]
}
