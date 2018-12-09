package typings
package cytoscapeLib.cytoscapeMod.cytoscapeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * http://js.cytoscape.org/#collection/events
     */
@js.native
trait CollectionEvents extends js.Object {
  def addListener(events: EventNames, handler: EventHandler): this.type = js.native
  def addListener(events: EventNames, selector: java.lang.String, data: js.Any, handler: EventHandler): this.type = js.native
  def addListener(events: EventNames, selector: java.lang.String, handler: EventHandler): this.type = js.native
  def bind(events: EventNames, handler: EventHandler): this.type = js.native
  def bind(events: EventNames, selector: java.lang.String, data: js.Any, handler: EventHandler): this.type = js.native
  def bind(events: EventNames, selector: java.lang.String, handler: EventHandler): this.type = js.native
  def emit(events: EventNames): this.type = js.native
  def emit(events: EventNames, extra: js.Array[java.lang.String]): this.type = js.native
  def listen(events: EventNames, handler: EventHandler): this.type = js.native
  def listen(events: EventNames, selector: java.lang.String, data: js.Any, handler: EventHandler): this.type = js.native
  def listen(events: EventNames, selector: java.lang.String, handler: EventHandler): this.type = js.native
  /**
           * http://js.cytoscape.org/#eles.off
           * alias unbind, unlisten, removeListener
           */
  def off(events: EventNames): this.type = js.native
  /**
           * http://js.cytoscape.org/#eles.off
           * alias unbind, unlisten, removeListener
           */
  def off(events: EventNames, selector: java.lang.String): this.type = js.native
  /**
           * http://js.cytoscape.org/#eles.off
           * alias unbind, unlisten, removeListener
           */
  def off(events: EventNames, selector: java.lang.String, handler: EventHandler): this.type = js.native
  def on(events: EventNames, handler: EventHandler): this.type = js.native
  /**
           * http://js.cytoscape.org/#eles.on
           */
  def on(events: EventNames, selector: java.lang.String, data: js.Any, handler: EventHandler): this.type = js.native
  def on(events: EventNames, selector: java.lang.String, handler: EventHandler): this.type = js.native
  def once(events: EventNames, handler: EventHandler): this.type = js.native
  /**
           * http://js.cytoscape.org/#eles.once
           */
  def once(events: EventNames, selector: java.lang.String, data: js.Any, handler: EventHandler): this.type = js.native
  def once(events: EventNames, selector: java.lang.String, handler: EventHandler): this.type = js.native
  def one(events: EventNames, handler: EventHandler): this.type = js.native
  /**
           * @param events A space separated list of event names.
           * @param selector [optional] A delegate selector to specify child elements for which the handler is triggered.
           * @param data [optional] A plain object which is passed to the handler in the event object argument.
           * @param function(event) The handler function that is called when one of the specified events occurs.
           * @param event The event object.
           * http://js.cytoscape.org/#eles.one
           */
  def one(events: EventNames, selector: java.lang.String, data: js.Any, handler: EventHandler): this.type = js.native
  def one(events: EventNames, selector: java.lang.String, handler: EventHandler): this.type = js.native
  def pon(events: EventNames): js.Promise[EventHandler] = js.native
  def pon(events: EventNames, selector: java.lang.String): js.Promise[EventHandler] = js.native
  /**
           * http://js.cytoscape.org/#eles.promiseOn
           * alias: pon
           */
  def promiseOn(events: EventNames): js.Promise[EventHandler] = js.native
  /**
           * http://js.cytoscape.org/#eles.promiseOn
           * alias: pon
           */
  def promiseOn(events: EventNames, selector: java.lang.String): js.Promise[EventHandler] = js.native
  def removeListener(events: EventNames): this.type = js.native
  def removeListener(events: EventNames, selector: java.lang.String): this.type = js.native
  def removeListener(events: EventNames, selector: java.lang.String, handler: EventHandler): this.type = js.native
  /**
           * http://js.cytoscape.org/#eles.trigger
           * alias: emit
           */
  def trigger(events: EventNames): this.type = js.native
  /**
           * http://js.cytoscape.org/#eles.trigger
           * alias: emit
           */
  def trigger(events: EventNames, extra: js.Array[java.lang.String]): this.type = js.native
  def unbind(events: EventNames): this.type = js.native
  def unbind(events: EventNames, selector: java.lang.String): this.type = js.native
  def unbind(events: EventNames, selector: java.lang.String, handler: EventHandler): this.type = js.native
  def unlisten(events: EventNames): this.type = js.native
  def unlisten(events: EventNames, selector: java.lang.String): this.type = js.native
  def unlisten(events: EventNames, selector: java.lang.String, handler: EventHandler): this.type = js.native
}

