package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.ValueIteratee
import typings.cypress.typesLodashMod.ValueIteratorTypeGuard
import typings.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPartition1x2[T] extends js.Object {
  def apply(callback: ValueIteratee[T]): js.Tuple2[js.Array[T], js.Array[T]] = js.native
  def apply[U /* <: T */](callback: ValueIteratorTypeGuard[T, U]): js.Tuple2[js.Array[U], js.Array[Exclude[T, U]]] = js.native
}

