package typings.baconjs.baconjsMod

import typings.baconjs.Bacon.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "later")
@js.native
object later extends js.Object {
  /**
    * @function
    * @description Creates a single-element [EventStream]{@link Bacon.EventStream} that produces given `value` after a given `delay` (in milliseconds).
    * @param {number} delay
    * @param {A} value
    * @returns {EventStream<E, A>}
    */
  def apply[E, A](delay: Double, value: A): EventStream[E, A] = js.native
}

