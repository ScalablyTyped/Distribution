package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.Cancelable
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashThrottle extends js.Object {
  def apply(wait: Double): LodashThrottle1x1 = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](wait: Double, func: T): T with Cancelable = js.native
  def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](wait: __, func: T): LodashThrottle1x2[T] = js.native
}

