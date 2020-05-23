package typings.cypress.fpMod

import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.ValueIterateeCustom
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindIndexFrom extends js.Object {
  def apply(predicate: __, fromIndex: Double): LodashFindIndexFrom1x2 = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindIndexFrom1x1[T] = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): LodashFindIndexFrom1x3[T] = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double, array: List[T]): Double = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __): LodashFindIndexFrom1x5 = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], fromIndex: __, array: List[T]): LodashFindIndexFrom1x5 = js.native
  def apply[T](predicate: __, fromIndex: Double, array: List[T]): LodashFindIndexFrom1x6[T] = js.native
  def apply[T](predicate: __, fromIndex: __): LodashFindIndexFrom1x4[T] = js.native
  def apply[T](predicate: __, fromIndex: __, array: List[T]): LodashFindIndexFrom1x4[T] = js.native
}

