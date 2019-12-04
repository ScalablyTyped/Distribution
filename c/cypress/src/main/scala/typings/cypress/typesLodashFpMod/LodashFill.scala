package typings.cypress.typesLodashFpMod

import typings.cypress.typesLodashMod.List
import typings.cypress.typesLodashMod.__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LodashFill extends js.Object {
  def apply(start: Double): LodashFill1x1 = js.native
  def apply(start: Double, end: Double): LodashFill1x3 = js.native
  def apply(start: __, end: Double): LodashFill1x2 = js.native
  def apply[T](start: Double, end: Double, value: T): LodashFill1x7[T] = js.native
  def apply[U](start: Double, end: Double, value: __): LodashFill2x11[U] = js.native
  def apply[U](start: Double, end: Double, value: __, array: js.Array[U]): LodashFill1x11[U] = js.native
  def apply[U](start: Double, end: Double, value: __, array: List[U]): LodashFill2x11[U] = js.native
  def apply[T](start: Double, end: __, value: T): LodashFill1x5[T] = js.native
  def apply[U](start: Double, end: __, value: __): LodashFill2x9[U] = js.native
  def apply[U](start: Double, end: __, value: __, array: js.Array[U]): LodashFill1x9[U] = js.native
  def apply[U](start: Double, end: __, value: __, array: List[U]): LodashFill2x9[U] = js.native
  def apply[T](start: __, end: Double, value: T): LodashFill1x6[T] = js.native
  def apply[U](start: __, end: Double, value: __): LodashFill2x10[U] = js.native
  def apply[U](start: __, end: Double, value: __, array: js.Array[U]): LodashFill1x10[U] = js.native
  def apply[U](start: __, end: Double, value: __, array: List[U]): LodashFill2x10[U] = js.native
  def apply[T](start: __, end: __, value: T): LodashFill1x4[T] = js.native
  def apply[U](start: __, end: __, value: __): LodashFill2x8[U] = js.native
  def apply[U](start: __, end: __, value: __, array: js.Array[U]): LodashFill1x8[U] = js.native
  def apply[U](start: __, end: __, value: __, array: List[U]): LodashFill2x8[U] = js.native
  def apply[T, U](start: Double, end: Double, value: T, array: js.Array[U]): js.Array[T | U] = js.native
  def apply[T, U](start: Double, end: Double, value: T, array: List[U]): List[T | U] = js.native
  def apply[T, U](start: Double, end: __, value: T, array: js.Array[U]): LodashFill1x13[T, U] = js.native
  def apply[T, U](start: Double, end: __, value: T, array: List[U]): LodashFill2x13[T, U] = js.native
  def apply[T, U](start: __, end: Double, value: T, array: js.Array[U]): LodashFill1x14[T, U] = js.native
  def apply[T, U](start: __, end: Double, value: T, array: List[U]): LodashFill2x14[T, U] = js.native
  def apply[T, U](start: __, end: __, value: T, array: js.Array[U]): LodashFill1x12[T, U] = js.native
  def apply[T, U](start: __, end: __, value: T, array: List[U]): LodashFill2x12[T, U] = js.native
}

