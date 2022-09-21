package typings.chartist

import typings.chartist.chartistStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventEmitterMod {
  
  @JSImport("chartist/dist/event/EventEmitter", "EventEmitter")
  @js.native
  open class EventEmitter () extends StObject {
    
    /* private */ val allListeners: Any = js.native
    
    /**
      * Use this function to emit an event. All handlers that are listening for this event will be triggered with the data parameter.
      * @param event The event name that should be triggered
      * @param data Arbitrary data that will be passed to the event handler callback functions
      */
    def emit[T](event: String, data: T): Unit = js.native
    
    /* private */ val listeners: Any = js.native
    
    def off(event: String): Unit = js.native
    def off(event: String, listener: EventListener[Any]): Unit = js.native
    /**
      * Remove an event handler of a specific event name or remove all event handlers for a specific event.
      * @param event The event name where a specific or all handlers should be removed
      * @param [listener] An optional event handler function. If specified only this specific handler will be removed and otherwise all handlers are removed.
      */
    def off(event: Asterisk): Unit = js.native
    def off(event: Asterisk, listener: AllEventsListener[Any]): Unit = js.native
    
    def on(event: String, listener: EventListener[Any]): Unit = js.native
    /**
      * Add an event handler for a specific event
      * @param event The event name
      * @param listener A event handler function
      */
    def on(event: Asterisk, listener: AllEventsListener[Any]): Unit = js.native
  }
  
  type AllEventsListener[T] = js.Function2[/* event */ String, /* data */ T, Unit]
  
  type EventListener[T] = js.Function1[/* data */ T, Unit]
}
