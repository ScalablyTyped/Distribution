package typings.cypress.fpMod

import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.ValueIterateeCustom
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindLastIndex extends js.Object {
  def apply[T](predicate: ValueIterateeCustom[T, Boolean]): Double = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], array: List[T]): Double = js.native
  def apply[T](predicate: __): LodashFindLastIndex1x2[T] = js.native
  def apply[T](predicate: __, array: List[T]): LodashFindLastIndex1x2[T] = js.native
}

