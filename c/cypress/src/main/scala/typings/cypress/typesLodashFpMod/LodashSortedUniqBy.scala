package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.List
import typings.cypress.typesLodashMod.ValueIteratee
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSortedUniqBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): LodashSortedUniqBy1x1[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], array: List[T]): js.Array[T] = js.native
  def apply[T](iteratee: __): LodashSortedUniqBy1x2[T] = js.native
  def apply[T](iteratee: __, array: List[T]): LodashSortedUniqBy1x2[T] = js.native
}

