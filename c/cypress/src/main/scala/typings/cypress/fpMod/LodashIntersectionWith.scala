package typings.cypress.fpMod

import typings.cypress.lodashMod.Comparator2
import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashIntersectionWith extends js.Object {
  def apply[T1](comparator: __): LodashIntersectionWith1x2[T1] = js.native
  def apply[T1](comparator: __, array: List[T1]): LodashIntersectionWith1x2[T1] = js.native
  def apply[T2](comparator: __, array: __, values: List[T2]): LodashIntersectionWith1x4[T2] = js.native
  def apply[T1, T2](comparator: Comparator2[T1, T2]): LodashIntersectionWith1x1[T1, T2] = js.native
  def apply[T1, T2](comparator: Comparator2[T1, T2], array: js.UndefOr[List[T1] | Null], values: List[T2]): js.Array[T1] = js.native
  def apply[T1, T2](comparator: Comparator2[T1, T2], array: List[T1]): LodashIntersectionWith1x3[T1, T2] = js.native
  def apply[T1, T2](comparator: Comparator2[T1, T2], array: __, values: List[T2]): LodashIntersectionWith1x5[T1] = js.native
  def apply[T1, T2](comparator: __, array: js.UndefOr[List[T1] | Null], values: List[T2]): LodashIntersectionWith1x6[T1, T2] = js.native
}

