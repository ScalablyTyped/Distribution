package typings.cypress.fpMod

import typings.cypress.lodashMod.Comparator
import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPullAllWith extends js.Object {
  def apply[T](comparator: Comparator[T]): LodashPullAllWith1x1[T] = js.native
  def apply[T](comparator: Comparator[T], values: List[T]): LodashPullAllWith1x3[T] = js.native
  def apply[T](comparator: Comparator[T], values: List[T], array: js.Array[T]): js.Array[T] = js.native
  def apply[T](comparator: Comparator[T], values: List[T], array: List[T]): List[T] = js.native
  def apply[T](comparator: Comparator[T], values: __, array: js.Array[T]): LodashPullAllWith1x5[T] = js.native
  def apply[T](comparator: Comparator[T], values: __, array: List[T]): LodashPullAllWith2x5[T] = js.native
  def apply[T](comparator: __, values: List[T]): LodashPullAllWith1x2[T] = js.native
  def apply[T](comparator: __, values: List[T], array: js.Array[T]): LodashPullAllWith1x6[T] = js.native
  def apply[T](comparator: __, values: List[T], array: List[T]): LodashPullAllWith2x6[T] = js.native
  def apply[T1](comparator: __, values: __, array: js.Array[T1]): LodashPullAllWith3x4[T1] = js.native
  def apply[T](comparator: __, values: __, array: List[T]): LodashPullAllWith2x4[T] = js.native
}

