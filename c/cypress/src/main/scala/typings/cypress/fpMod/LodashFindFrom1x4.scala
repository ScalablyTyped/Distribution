package typings.cypress.fpMod

import typings.cypress.lodashMod.ValueIterateeCustom
import typings.cypress.lodashMod.ValueIteratorTypeGuard
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindFrom1x4[T] extends js.Object {
  def apply(predicate: ValueIterateeCustom[T, Boolean]): LodashFindFrom2x5[T] = js.native
  def apply(predicate: ValueIterateeCustom[T, Boolean], fromIndex: Double): js.UndefOr[T] = js.native
  def apply(predicate: __, fromIndex: Double): LodashFindFrom1x6[T] = js.native
  def apply[S /* <: T */](predicate: ValueIteratorTypeGuard[T, S]): LodashFindFrom1x5[S] = js.native
  def apply[S /* <: T */](predicate: ValueIteratorTypeGuard[T, S], fromIndex: Double): js.UndefOr[S] = js.native
}

