package typings.coreJs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/fn/array/fill", JSImport.Namespace)
@js.native
object arrayFillMod extends js.Object {
  def apply[T](array: ArrayLike[T], value: T): Array[T] = js.native
  def apply[T](array: ArrayLike[T], value: T, start: Double): Array[T] = js.native
  def apply[T](array: ArrayLike[T], value: T, start: Double, end: Double): Array[T] = js.native
}

