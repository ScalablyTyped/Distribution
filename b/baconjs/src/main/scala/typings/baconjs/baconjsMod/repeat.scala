package typings.baconjs.baconjsMod

import typings.baconjs.Bacon.EventStream
import typings.baconjs.Bacon.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "repeat")
@js.native
object repeat extends js.Object {
  /**
    * @callback Bacon.repeat~f
    * @param {number} iteration
    * @returns {boolean|Observable<E, A>}
    */
  /**
    * @function Bacon.repeat
    * @description Calls generator function `f` which is expected to return an [Observable]{@link Bacon.Observable}. The returned [EventStream]{@link Bacon.EventStream} contains values and errors from the spawned observable. When the spawned Observable ends, the generator `f` is called again to spawn a new Observable. This is repeated until the generator `f` returns a falsy value (such as `undefined` or `false`). The generator `f` is called with one argument — `iteration` number starting from `0`.
    * @param {Bacon.repeat~f} f
    * @returns {EventStream<E, A>}
    * @example
    * // The following will produce values `0,1,2`.
    * Bacon.repeat(i => {
    *     if (i < 3) {
    *         return Bacon.once(i);
    *     } else {
    *         return false;
    *     }
    * }).log();
    */
  def apply[E, A](f: js.Function1[/* iteration */ Double, Boolean | (Observable[E, A])]): EventStream[E, A] = js.native
}

