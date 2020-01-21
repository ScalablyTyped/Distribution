package typings.cypress.fpMod

import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.ValueIteratee
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashPullAllBy1x2[T] extends js.Object {
  def apply(iteratee: ValueIteratee[T]): LodashPullAllBy1x3[T] = js.native
  def apply(iteratee: ValueIteratee[T], array: js.Array[T]): js.Array[T] = js.native
  def apply(iteratee: ValueIteratee[T], array: List[T]): List[T] = js.native
  def apply(iteratee: __, array: js.Array[T]): LodashPullAllBy1x6[T] = js.native
  def apply(iteratee: __, array: List[T]): LodashPullAllBy2x6[T] = js.native
}

