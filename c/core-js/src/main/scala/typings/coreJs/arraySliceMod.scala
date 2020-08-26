package typings.coreJs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/fn/array/slice", JSImport.Namespace)
@js.native
object arraySliceMod extends js.Object {
  def apply[T](array: ArrayLike[T]): Array[T] = js.native
  def apply[T](array: ArrayLike[T], start: js.UndefOr[scala.Nothing], end: Double): Array[T] = js.native
  def apply[T](array: ArrayLike[T], start: Double): Array[T] = js.native
  def apply[T](array: ArrayLike[T], start: Double, end: Double): Array[T] = js.native
}

