package typings.cytoscape.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The principle events from the graph model.
  *  http://js.cytoscape.org/#core/events
  */
@js.native
trait CoreEvents extends StObject {
  
  def addListener(eventsMap: StringDictionary[EventHandler]): this.type = js.native
  def addListener(eventsMap: StringDictionary[EventHandler], selector: js.UndefOr[scala.Nothing], data: js.Any): this.type = js.native
  def addListener(eventsMap: StringDictionary[EventHandler], selector: Selector): this.type = js.native
  def addListener(eventsMap: StringDictionary[EventHandler], selector: Selector, data: js.Any): this.type = js.native
  def addListener(events: EventNames, handler: EventHandler): this.type = js.native
  def addListener(events: EventNames, selector: Selector, data: js.Any, handler: EventHandler): this.type = js.native
  def addListener(events: EventNames, selector: Selector, handler: EventHandler): this.type = js.native
  
  def bind(eventsMap: StringDictionary[EventHandler]): this.type = js.native
  def bind(eventsMap: StringDictionary[EventHandler], selector: js.UndefOr[scala.Nothing], data: js.Any): this.type = js.native
  def bind(eventsMap: StringDictionary[EventHandler], selector: Selector): this.type = js.native
  def bind(eventsMap: StringDictionary[EventHandler], selector: Selector, data: js.Any): this.type = js.native
  def bind(events: EventNames, handler: EventHandler): this.type = js.native
  def bind(events: EventNames, selector: Selector, data: js.Any, handler: EventHandler): this.type = js.native
  def bind(events: EventNames, selector: Selector, handler: EventHandler): this.type = js.native
  
  def emit(events: EventNames): this.type = js.native
  def emit(events: EventNames, extraParams: js.Array[_]): this.type = js.native
  
  def listen(eventsMap: StringDictionary[EventHandler]): this.type = js.native
  def listen(eventsMap: StringDictionary[EventHandler], selector: js.UndefOr[scala.Nothing], data: js.Any): this.type = js.native
  def listen(eventsMap: StringDictionary[EventHandler], selector: Selector): this.type = js.native
  def listen(eventsMap: StringDictionary[EventHandler], selector: Selector, data: js.Any): this.type = js.native
  def listen(events: EventNames, handler: EventHandler): this.type = js.native
  def listen(events: EventNames, selector: Selector, data: js.Any, handler: EventHandler): this.type = js.native
  def listen(events: EventNames, selector: Selector, handler: EventHandler): this.type = js.native
  
  def off(eventsMap: StringDictionary[EventHandler]): this.type = js.native
  def off(eventsMap: StringDictionary[EventHandler], selector: Selector): this.type = js.native
  /**
    * Remove event handlers.
    *  http://js.cytoscape.org/#cy.off
    *
    * @param events A space separated list of event names.
    * @param selector [optional] The same selector used to bind to the events.
    * @param handler [optional] A reference to the handler function to remove.
    * @param eventsMap A map of event names to handler functions to remove.
    */
  def off(events: EventNames): this.type = js.native
  def off(events: EventNames, selector: js.UndefOr[scala.Nothing], handler: EventHandler): this.type = js.native
  def off(events: EventNames, selector: Selector): this.type = js.native
  def off(events: EventNames, selector: Selector, handler: EventHandler): this.type = js.native
  
  def on(eventsMap: StringDictionary[EventHandler]): this.type = js.native
  def on(eventsMap: StringDictionary[EventHandler], selector: js.UndefOr[scala.Nothing], data: js.Any): this.type = js.native
  def on(eventsMap: StringDictionary[EventHandler], selector: Selector): this.type = js.native
  def on(eventsMap: StringDictionary[EventHandler], selector: Selector, data: js.Any): this.type = js.native
  /**
    * Bind to events that occur in the graph.
    *
    * @param events A space separated list of event names.
    * @param handler The handler function that is called when one of the specified events occurs.
    * @param selector A selector to specify elements for which the handler is triggered.
    * @param data A plain object which is passed to the handler in the event object argument.
    * @param eventsMap A map of event names to handler functions.
    */
  def on(events: EventNames, handler: EventHandler): this.type = js.native
  def on(events: EventNames, selector: Selector, data: js.Any, handler: EventHandler): this.type = js.native
  def on(events: EventNames, selector: Selector, handler: EventHandler): this.type = js.native
  
  /**
    * Bind to events that occur in the graph, and trigger the handler only once.
    *
    * @param eventsMap A map of event names to handler functions.
    * @param selector A selector to specify elements for which the handler is triggered.
    * @param data A plain object which is passed to the handler in the event object argument.
    */
  def one(eventsMap: StringDictionary[EventHandler]): this.type = js.native
  def one(eventsMap: StringDictionary[EventHandler], selector: js.UndefOr[scala.Nothing], data: js.Any): this.type = js.native
  def one(eventsMap: StringDictionary[EventHandler], selector: Selector): this.type = js.native
  def one(eventsMap: StringDictionary[EventHandler], selector: Selector, data: js.Any): this.type = js.native
  /**
    * Bind to events that occur in the graph, and trigger the handler only once.
    *
    * @param events A space separated list of event names.
    * @param handler The handler function that is called when one of the specified events occurs.
    */
  def one(events: EventNames, handler: EventHandler): this.type = js.native
  /**
    * Bind to events that occur in the graph, and trigger the handler only once.
    *
    * @param events A space separated list of event names.
    * @param handler The handler function that is called when one of the specified events occurs.
    * @param selector A selector to specify elements for which the handler is triggered.
    * @param data A plain object which is passed to the handler in the event object argument.
    */
  def one(events: EventNames, selector: Selector, data: js.Any, handler: EventHandler): this.type = js.native
  /**
    * Bind to events that occur in the graph, and trigger the handler only once.
    *
    * @param events A space separated list of event names.
    * @param handler The handler function that is called when one of the specified events occurs.
    * @param selector A selector to specify elements for which the handler is triggered.
    */
  def one(events: EventNames, selector: Selector, handler: EventHandler): this.type = js.native
  
  def pon(events: EventNames): js.Promise[EventHandler] = js.native
  def pon(events: EventNames, selector: Selector): js.Promise[EventHandler] = js.native
  
  /**
    * Get a promise that is resolved with the first
    * of any of the specified events triggered on the graph.
    * @param events A space separated list of event names.
    * @param selector [optional] A selector to specify elements for which the handler is triggered.
    */
  def promiseOn(events: EventNames): js.Promise[EventHandler] = js.native
  def promiseOn(events: EventNames, selector: Selector): js.Promise[EventHandler] = js.native
  
  /**
    * Run a callback as soon as the graph becomes ready. If the graph is already ready, then the callback is called immediately.
    * @param fn The callback run as soon as the graph is ready, inside which this refers to the core (cy).
    */
  def ready(fn: EventHandler): this.type = js.native
  
  def removeListener(eventsMap: StringDictionary[EventHandler]): this.type = js.native
  def removeListener(eventsMap: StringDictionary[EventHandler], selector: Selector): this.type = js.native
  def removeListener(events: EventNames): this.type = js.native
  def removeListener(events: EventNames, selector: js.UndefOr[scala.Nothing], handler: EventHandler): this.type = js.native
  def removeListener(events: EventNames, selector: Selector): this.type = js.native
  def removeListener(events: EventNames, selector: Selector, handler: EventHandler): this.type = js.native
  
  /**
    * Trigger one or more events.
    *
    * @param events A space separated list of event names to trigger.
    * @param extraParams [optional] An array of additional parameters to pass to the handler.
    */
  def trigger(events: EventNames): this.type = js.native
  def trigger(events: EventNames, extraParams: js.Array[_]): this.type = js.native
  
  def unbind(eventsMap: StringDictionary[EventHandler]): this.type = js.native
  def unbind(eventsMap: StringDictionary[EventHandler], selector: Selector): this.type = js.native
  def unbind(events: EventNames): this.type = js.native
  def unbind(events: EventNames, selector: js.UndefOr[scala.Nothing], handler: EventHandler): this.type = js.native
  def unbind(events: EventNames, selector: Selector): this.type = js.native
  def unbind(events: EventNames, selector: Selector, handler: EventHandler): this.type = js.native
  
  def unlisten(eventsMap: StringDictionary[EventHandler]): this.type = js.native
  def unlisten(eventsMap: StringDictionary[EventHandler], selector: Selector): this.type = js.native
  def unlisten(events: EventNames): this.type = js.native
  def unlisten(events: EventNames, selector: js.UndefOr[scala.Nothing], handler: EventHandler): this.type = js.native
  def unlisten(events: EventNames, selector: Selector): this.type = js.native
  def unlisten(events: EventNames, selector: Selector, handler: EventHandler): this.type = js.native
}
