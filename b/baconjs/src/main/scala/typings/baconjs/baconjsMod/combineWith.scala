package typings.baconjs.baconjsMod

import typings.baconjs.Bacon.Observable
import typings.baconjs.Bacon.Property
import typings.std.ErrorEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baconjs", "combineWith")
@js.native
object combineWith extends js.Object {
  /**
    * @callback Property#combineWith~f
    * @param {...A} args
    * @returns {B}
    */
  /**
    * @function Property#combineWith
    * @description Combines given n [Property]{@link Bacon.Property}s, [EventStream]{@link Bacon.EventStream}s and constant values using the given n-ary function `f`.
    * @param {Property#combineWith~f} f
    * @param {...(A|Observable<E, A>)} streams
    * @returns {Property<E, B>}
    */
  def apply[A, B](f: js.Function1[/* repeated */ A, B], streams: (A | (Observable[ErrorEvent, A]))*): Property[ErrorEvent, B] = js.native
}

