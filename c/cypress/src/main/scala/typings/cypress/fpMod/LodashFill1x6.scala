package typings.cypress.fpMod

import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFill1x6[T] extends js.Object {
  def apply(start: Double): LodashFill1x7[T] = js.native
  def apply[U](start: Double, array: js.Array[U]): js.Array[T | U] = js.native
  def apply[U](start: Double, array: List[U]): List[T | U] = js.native
  def apply[U](start: __): LodashFill2x14[T, U] = js.native
  def apply[U](start: __, array: js.Array[U]): LodashFill1x14[T, U] = js.native
  def apply[U](start: __, array: List[U]): LodashFill2x14[T, U] = js.native
}

