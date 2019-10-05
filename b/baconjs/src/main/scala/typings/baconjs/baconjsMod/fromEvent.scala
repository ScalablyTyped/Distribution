package typings.baconjs.baconjsMod

import typings.baconjs.Bacon.EventStream
import typings.baconjs.JQuery
import typings.node.NodeJS.EventEmitter
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "fromEvent")
@js.native
object fromEvent extends js.Object {
  def apply[E, A](target: JQuery, eventName: String): EventStream[E, A] = js.native
  def apply[E, A](target: EventEmitter, eventName: String): EventStream[E, A] = js.native
  /**
    * @function
    * @description Creates an [EventStream]{@link Bacon.EventStream} from events on a DOM EventTarget or Node.JS EventEmitter object, or an object that supports event listeners using `on`/`off` methods.
    * @param {EventTarget|NodeJS.EventEmitter|JQuery} target
    * @param {string} eventName
    * @returns {EventStream<E, A>}
    * @example
    * Bacon.fromEvent(document.body, "click").onValue(() => {
    *     alert("Bacon!");
    * });
    * Bacon.fromEvent(process.stdin, "readable", () => {
    *     alert("Bacon!");
    * });
    * Bacon.fromEvent($("body"), "click").onValue(() => {
    *     alert("Bacon!");
    * });
    */
  def apply[E, A](target: EventTarget, eventName: String): EventStream[E, A] = js.native
  def apply[E, A, B](target: JQuery, eventName: String, eventTransformer: js.Function1[/* event */ A, B]): EventStream[E, B] = js.native
  def apply[E, A, B](target: EventEmitter, eventName: String, eventTransformer: js.Function1[/* event */ A, B]): EventStream[E, B] = js.native
  /**
    * @callback Bacon.fromEvent~eventTransformer
    * @param {A} event
    * @returns {B}
    */
  /**
    * @function Bacon.fromEvent
    * @description Creates an [EventStream]{@link Bacon.EventStream} from events on a DOM EventTarget or Node.JS EventEmitter object, or an object that supports event listeners using `on`/`off` methods. You can pass a function `eventTransformer` that transforms the emitted events' parameters.
    * @param {EventTarget|NodeJS.EventEmitter|JQuery} target
    * @param {string} eventName
    * @param {Bacon.fromEvent~eventTransformer} eventTransformer
    * @returns {EventStream<E, B>}
    * @example
    * Bacon.fromEvent(document.body, "click", (event:MouseEvent) => event.clientX).onValue(clientX => {
    *     alert("Bacon!");
    * });
    */
  def apply[E, A, B](target: EventTarget, eventName: String, eventTransformer: js.Function1[/* event */ A, B]): EventStream[E, B] = js.native
}

