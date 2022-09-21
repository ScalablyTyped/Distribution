package typings.cytoscape.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * http://js.cytoscape.org/#collection/events
  */
@js.native
trait CollectionEvents extends StObject {
  
  def addListener(events: EventNames, handler: EventHandler): this.type = js.native
  def addListener(events: EventNames, selector: String, handler: EventHandler): this.type = js.native
  
  def bind(events: EventNames, handler: EventHandler): this.type = js.native
  def bind(events: EventNames, selector: String, handler: EventHandler): this.type = js.native
  
  def emit(events: EventNames): this.type = js.native
  def emit(events: EventNames, extra: js.Array[Any]): this.type = js.native
  
  def listen(events: EventNames, handler: EventHandler): this.type = js.native
  def listen(events: EventNames, selector: String, handler: EventHandler): this.type = js.native
  
  /**
    * http://js.cytoscape.org/#eles.off
    * @alias unbind, unlisten, removeListener
    */
  def off(events: EventNames): this.type = js.native
  def off(events: EventNames, selector: String): this.type = js.native
  def off(events: EventNames, selector: String, handler: EventHandler): this.type = js.native
  def off(events: EventNames, selector: Unit, handler: EventHandler): this.type = js.native
  
  def on(events: EventNames, handler: EventHandler): this.type = js.native
  /**
    * http://js.cytoscape.org/#eles.on
    * @param events A space separated list of event names.
    * @param selector [optional] A delegate selector to specify child elements for which the handler runs.
    * @param handler The handler function called when one of the specified events occurs. Takes the event object as a parameter.
    */
  def on(events: EventNames, selector: String, handler: EventHandler): this.type = js.native
  
  def once(events: EventNames, handler: EventHandler): this.type = js.native
  /**
    * http://js.cytoscape.org/#eles.once
    */
  def once(events: EventNames, selector: String, data: Any, handler: EventHandler): this.type = js.native
  def once(events: EventNames, selector: String, handler: EventHandler): this.type = js.native
  
  def one(events: EventNames, handler: EventHandler): this.type = js.native
  /**
    * @param events A space separated list of event names.
    * @param selector [optional] A delegate selector to specify child elements for which the handler is triggered.
    * @param data [optional] A plain object which is passed to the handler in the event object argument.
    * @param function(event) The handler function that is called when one of the specified events occurs.
    * @param event The event object.
    * http://js.cytoscape.org/#eles.one
    */
  def one(events: EventNames, selector: String, data: Any, handler: EventHandler): this.type = js.native
  def one(events: EventNames, selector: String, handler: EventHandler): this.type = js.native
  
  def pon(events: EventNames): js.Promise[EventHandler] = js.native
  def pon(events: EventNames, selector: String): js.Promise[EventHandler] = js.native
  
  /**
    * http://js.cytoscape.org/#eles.promiseOn
    * @alias pon
    */
  def promiseOn(events: EventNames): js.Promise[EventHandler] = js.native
  def promiseOn(events: EventNames, selector: String): js.Promise[EventHandler] = js.native
  
  /**
    * https://js.cytoscape.org/#eles.removeAllListeners
    */
  def removeAllListeners(): this.type = js.native
  
  def removeListener(events: EventNames): this.type = js.native
  def removeListener(events: EventNames, selector: String): this.type = js.native
  def removeListener(events: EventNames, selector: String, handler: EventHandler): this.type = js.native
  def removeListener(events: EventNames, selector: Unit, handler: EventHandler): this.type = js.native
  
  /**
    * http://js.cytoscape.org/#eles.trigger
    * @alias emit
    */
  def trigger(events: EventNames): this.type = js.native
  def trigger(events: EventNames, extra: js.Array[Any]): this.type = js.native
  
  def unbind(events: EventNames): this.type = js.native
  def unbind(events: EventNames, selector: String): this.type = js.native
  def unbind(events: EventNames, selector: String, handler: EventHandler): this.type = js.native
  def unbind(events: EventNames, selector: Unit, handler: EventHandler): this.type = js.native
  
  def unlisten(events: EventNames): this.type = js.native
  def unlisten(events: EventNames, selector: String): this.type = js.native
  def unlisten(events: EventNames, selector: String, handler: EventHandler): this.type = js.native
  def unlisten(events: EventNames, selector: Unit, handler: EventHandler): this.type = js.native
}
