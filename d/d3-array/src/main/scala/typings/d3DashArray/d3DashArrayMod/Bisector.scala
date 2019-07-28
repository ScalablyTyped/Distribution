package typings.d3DashArray.d3DashArrayMod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bisector[T, U] extends js.Object {
  def left(array: ArrayLike[T], x: U): Double = js.native
  def left(array: ArrayLike[T], x: U, lo: Double): Double = js.native
  def left(array: ArrayLike[T], x: U, lo: Double, hi: Double): Double = js.native
  def right(array: ArrayLike[T], x: U): Double = js.native
  def right(array: ArrayLike[T], x: U, lo: Double): Double = js.native
  def right(array: ArrayLike[T], x: U, lo: Double, hi: Double): Double = js.native
}

