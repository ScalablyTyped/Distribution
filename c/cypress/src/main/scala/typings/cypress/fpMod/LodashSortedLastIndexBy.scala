package typings.cypress.fpMod

import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.ValueIteratee
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashSortedLastIndexBy extends js.Object {
  def apply[T](iteratee: ValueIteratee[T]): LodashSortedLastIndexBy1x1[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], value: T): LodashSortedLastIndexBy1x3[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], value: T, array: List[T]): Double = js.native
  def apply[T](iteratee: ValueIteratee[T], value: __): LodashSortedLastIndexBy1x5[T] = js.native
  def apply[T](iteratee: ValueIteratee[T], value: __, array: List[T]): LodashSortedLastIndexBy1x5[T] = js.native
  def apply[T](iteratee: __, value: T): LodashSortedLastIndexBy1x6[T] = js.native
  def apply[T](iteratee: __, value: T, array: List[T]): LodashSortedLastIndexBy1x6[T] = js.native
  def apply[T](iteratee: __, value: __): LodashSortedLastIndexBy1x4[T] = js.native
  def apply[T](iteratee: __, value: __, array: List[T]): LodashSortedLastIndexBy1x4[T] = js.native
}

