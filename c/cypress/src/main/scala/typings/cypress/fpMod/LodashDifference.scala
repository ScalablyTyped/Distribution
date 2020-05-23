package typings.cypress.fpMod

import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashDifference extends js.Object {
  def apply[T](): LodashDifference1x1[T] = js.native
  def apply[T](array: js.UndefOr[List[T] | Null], values: List[T]): js.Array[T] = js.native
  def apply[T](array: List[T]): LodashDifference1x1[T] = js.native
  def apply[T](array: __, values: List[T]): LodashDifference1x2[T] = js.native
}

