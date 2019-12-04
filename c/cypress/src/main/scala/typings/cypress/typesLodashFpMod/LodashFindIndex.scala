package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.List
import typings.cypress.typesLodashMod.ValueIterateeCustom
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFindIndex extends js.Object {
  def apply[T](predicate: ValueIterateeCustom[T, Boolean]): LodashFindIndex1x1[T] = js.native
  def apply[T](predicate: ValueIterateeCustom[T, Boolean], array: List[T]): Double = js.native
  def apply[T](predicate: __): LodashFindIndex1x2[T] = js.native
  def apply[T](predicate: __, array: List[T]): LodashFindIndex1x2[T] = js.native
}

