package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSender extends StObject {
  
  def event[T /* <: js.Object */](body: T, eventName: String): Unit
  @JSName("event")
  var event_Original: Event
}
object EventSender {
  
  inline def apply(event: (/* body */ js.Object, /* eventName */ String) => Unit): EventSender = {
    val __obj = js.Dynamic.literal(event = js.Any.fromFunction2(event))
    __obj.asInstanceOf[EventSender]
  }
  
  extension [Self <: EventSender](x: Self) {
    
    inline def setEvent(value: (/* body */ js.Object, /* eventName */ String) => Unit): Self = StObject.set(x, "event", js.Any.fromFunction2(value))
  }
}
