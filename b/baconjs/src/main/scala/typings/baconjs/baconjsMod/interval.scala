package typings.baconjs.baconjsMod

import typings.baconjs.Bacon.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "interval")
@js.native
object interval extends js.Object {
  /**
    * @function
    * @description Repeats the single `value` indefinitely with the given `interval` (in milliseconds).
    * @param {number} interval
    * @param {A} value
    * @returns {EventStream<E, A>}
    */
  def apply[E, A](interval: Double, value: A): EventStream[E, A] = js.native
}

