package typings.baconjs.baconjsMod

import typings.baconjs.Bacon.Observable
import typings.baconjs.Bacon.Property
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "combineAsArray")
@js.native
object combineAsArray extends js.Object {
  /**
    * @function
    * @description Combines [Property]{@link Bacon.Property}s, [EventStream]{@link Bacon.EventStream}s and constant values so that the result Property will have an array of all property values as its value. Like [Bacon.combineAsArray]{@link Bacon.combineAsArray}, but `streams` are provided as a list of arguments as opposed to a single array.
    * @param {...(A|Observable<E, A>)} streams
    * @returns {Property<E, A[]>}
    */
  def apply[E, A](streams: (A | (Observable[E, A]))*): Property[E, js.Array[A]] = js.native
  /**
    * @function Bacon.combineAsArray
    * @description Combines [Property]{@link Bacon.Property}s, [EventStream]{@link Bacon.EventStream}s and constant values so that the result Property will have an array of all property values as its value. The input array may contain both Properties and EventStreams. In the latter case, the stream is first converted into a Property and then combined with the other Property's.
    * @param {(A|Observable<E, A>)[]} streams
    * @returns {Property<E, A[]>}
    */
  def apply[E, A](streams: js.Array[A | (Observable[E, A])]): Property[E, js.Array[A]] = js.native
}

