package typings.cypress.fpMod

import typings.cypress.lodashMod.List
import typings.cypress.lodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFill1x4[T] extends js.Object {
  def apply(start: Double): LodashFill1x5[T] = js.native
  def apply(start: Double, end: Double): LodashFill1x7[T] = js.native
  def apply(start: __, end: Double): LodashFill1x6[T] = js.native
  def apply[U](start: Double, end: Double, array: js.Array[U]): js.Array[T | U] = js.native
  def apply[U](start: Double, end: Double, array: List[U]): List[T | U] = js.native
  def apply[U](start: Double, end: __): LodashFill2x13[T, U] = js.native
  def apply[U](start: Double, end: __, array: js.Array[U]): LodashFill1x13[T, U] = js.native
  def apply[U](start: Double, end: __, array: List[U]): LodashFill2x13[T, U] = js.native
  def apply[U](start: __, end: Double, array: js.Array[U]): LodashFill1x14[T, U] = js.native
  def apply[U](start: __, end: Double, array: List[U]): LodashFill2x14[T, U] = js.native
  def apply[U](start: __, end: __): LodashFill2x12[T, U] = js.native
  def apply[U](start: __, end: __, array: js.Array[U]): LodashFill1x12[T, U] = js.native
  def apply[U](start: __, end: __, array: List[U]): LodashFill2x12[T, U] = js.native
}

