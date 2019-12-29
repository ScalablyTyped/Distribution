package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.List
import typings.cypress.typesLodashMod.ValueIteratee
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashDifferenceBy1x4[T2] extends js.Object {
  def apply[T1](iteratee: ValueIteratee[T1 | T2]): js.Array[T1] = js.native
  def apply[T1](iteratee: ValueIteratee[T1 | T2], array: List[T1]): js.Array[T1] = js.native
  def apply[T1](iteratee: __): LodashDifferenceBy1x6[T1, T2] = js.native
  def apply[T1](iteratee: __, array: List[T1]): LodashDifferenceBy1x6[T1, T2] = js.native
}

