package typings.cypress.fpMod

import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashChunk extends js.Object {
  def apply(size: Double): LodashChunk1x1 = js.native
  def apply[T](size: Double, array: List[T]): js.Array[js.Array[T]] = js.native
  def apply[T](size: __): LodashChunk1x2[T] = js.native
  def apply[T](size: __, array: List[T]): LodashChunk1x2[T] = js.native
}

