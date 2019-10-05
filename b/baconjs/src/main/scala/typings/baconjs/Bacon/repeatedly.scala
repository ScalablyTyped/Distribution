package typings.baconjs.Bacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Bacon.repeatedly")
@js.native
object repeatedly extends js.Object {
  /**
    * @function
    * @description Repeats given `values` indefinitely with then given `interval` (in milliseconds).
    * @param {number} interval
    * @param {A[]} values
    * @returns {EventStream<E, A>}
    * @example
    * // The following would lead to `1,2,3,1,2,3...` to be repeated indefinitely:
    * Bacon.fromArray([1, new Bacon.Error("")]);
    */
  def apply[E, A](interval: Double, values: js.Array[A]): EventStream[E, A] = js.native
}

