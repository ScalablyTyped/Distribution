package typings.cypress.fpMod

import typings.cypress.lodashMod.Comparator
import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashUniqWith extends js.Object {
  def apply[T](comparator: Comparator[T]): js.Array[T] = js.native
  def apply[T](comparator: Comparator[T], array: List[T]): js.Array[T] = js.native
  def apply[T](comparator: __): LodashUniqWith1x2[T] = js.native
  def apply[T](comparator: __, array: List[T]): LodashUniqWith1x2[T] = js.native
}

