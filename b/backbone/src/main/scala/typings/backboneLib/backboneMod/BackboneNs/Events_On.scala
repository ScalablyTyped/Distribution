package typings
package backboneLib.backboneMod.BackboneNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Helper shorthands for classes that implement the Events interface.
  * Define your class like this:
  *
  * import {
  *     Events,
  *     Events_On,
  *     Events_Off,
  *     Events_Trigger,
  *     Events_Listen,
  *     Events_Stop,
  * } from 'backbone';
  *
  * class YourClass implements Events {
  *     on: Events_On<YourClass>;
  *     off: Events_Off<YourClass>;
  *     trigger: Events_Trigger<YourClass>;
  *     bind: Events_On<YourClass>;
  *     unbind: Events_Off<YourClass>;
  *
  *     once: Events_On<YourClass>;
  *     listenTo: Events_Listen<YourClass>;
  *     listenToOnce: Events_Listen<YourClass>;
  *     stopListening: Events_Stop<YourClass>;
  *
  *     // ... (other methods)
  * }
  *
  * Object.assign(YourClass.prototype, Events);  // can also use _.extend
  *
  * If you are just writing a class type declaration that doesn't already
  * extend some other base class, you can use the EventsMixin instead;
  * see below.
  */
@js.native
trait Events_On[BaseT] extends js.Object {
  def apply[T /* <: BaseT */](`this`: T, eventMap: EventMap): T = js.native
  def apply[T /* <: BaseT */](`this`: T, eventMap: EventMap, context: js.Any): T = js.native
  def apply[T /* <: BaseT */](`this`: T, eventName: java.lang.String, callback: EventHandler): T = js.native
  def apply[T /* <: BaseT */](`this`: T, eventName: java.lang.String, callback: EventHandler, context: js.Any): T = js.native
}

