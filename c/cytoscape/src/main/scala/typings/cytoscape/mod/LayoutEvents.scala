package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutEvents extends StObject {
  
  def addListener(events: EventNames, data: Any, handler: EventHandler): this.type = js.native
  def addListener(events: EventNames, handler: EventHandler): this.type = js.native
  
  def bind(events: EventNames, data: Any, handler: EventHandler): this.type = js.native
  def bind(events: EventNames, handler: EventHandler): this.type = js.native
  
  def listen(events: EventNames, data: Any, handler: EventHandler): this.type = js.native
  def listen(events: EventNames, handler: EventHandler): this.type = js.native
  
  /**
    * Remove event handlers on the layout.
    * http://js.cytoscape.org/#layout.off
    *
    * @param events A space separated list of event names.
    * @param handler [optional] A reference to the handler function to remove.
    */
  def off(events: EventNames): this.type = js.native
  def off(events: EventNames, handler: EventHandler): this.type = js.native
  
  def on(events: EventNames, data: Any, handler: EventHandler): this.type = js.native
  /**
    * http://js.cytoscape.org/#layouts/layout-events
    */
  /**
    * @param events A space separated list of event names.
    * @param data [optional] A plain object which is passed to the
    * handler in the event object argument.
    * @param handler  The handler function that is called
    * when one of the specified events occurs.
    */
  def on(events: EventNames, handler: EventHandler): this.type = js.native
  
  def one(events: EventNames, data: Any, handler: EventHandler): this.type = js.native
  /**
    * Bind to events that are emitted by the layout, and trigger the handler only once.
    * @param events A space separated list of event names.
    * @param data [optional] A plain object which is passed to the handler in the event object argument.
    * @param handler The handler function that is called when one of the specified events occurs.
    */
  def one(events: EventNames, handler: EventHandler): this.type = js.native
  
  def pon(events: EventNames): js.Promise[EventObject] = js.native
  
  /**
    * Get a promise that is resolved with the first of any of
    * the specified events triggered on the layout.
    * http://js.cytoscape.org/#layout.promiseOn
    */
  def promiseOn(events: EventNames): js.Promise[EventObject] = js.native
  
  /**
    * Remove all event handlers on the layout.
    * https://js.cytoscape.org/#layout.removeAllListeners
    */
  def removeAllListeners(): this.type = js.native
  
  def removeListener(events: EventNames): this.type = js.native
  def removeListener(events: EventNames, handler: EventHandler): this.type = js.native
  
  /**
    * Trigger one or more events on the layout.
    * http://js.cytoscape.org/#layout.trigger
    * @param events A space separated list of event names to trigger.
    * @param extraParams [optional] An array of additional parameters to pass to the handler.
    */
  def trigger(events: EventNames): this.type = js.native
  def trigger(events: EventNames, extraParams: js.Array[Any]): this.type = js.native
  
  def unbind(events: EventNames): this.type = js.native
  def unbind(events: EventNames, handler: EventHandler): this.type = js.native
  
  def unlisten(events: EventNames): this.type = js.native
  def unlisten(events: EventNames, handler: EventHandler): this.type = js.native
}
