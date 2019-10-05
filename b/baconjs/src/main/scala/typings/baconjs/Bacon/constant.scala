package typings.baconjs.Bacon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Bacon.constant")
@js.native
object constant extends js.Object {
  /**
    * @function
    * @description Creates a constant [Property]{@link Bacon.Property} with value `x`.
    * @param {A} x
    * @returns {Property<E, A>}
    */
  def apply[E, A](x: A): Property[E, A] = js.native
}

