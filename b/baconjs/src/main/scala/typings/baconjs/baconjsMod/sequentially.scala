package typings.baconjs.baconjsMod

import typings.baconjs.Bacon.EventStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "sequentially")
@js.native
object sequentially extends js.Object {
  /**
    * @function
    * @description Creates a [EventStream]{@link Bacon.EventStream} containing given `values` (given as array) with the given `interval` (in milliseconds).
    * @param {number} interval
    * @param {A[]} values
    * @returns {EventStream<E, A>}
    */
  def apply[E, A](interval: Double, values: js.Array[A]): EventStream[E, A] = js.native
}

