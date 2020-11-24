package typings.d3Array.mod

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bisector_[T, U] extends js.Object {
  
  def center(array: ArrayLike[T], x: U): Double = js.native
  def center(array: ArrayLike[T], x: U, lo: js.UndefOr[scala.Nothing], hi: Double): Double = js.native
  def center(array: ArrayLike[T], x: U, lo: Double): Double = js.native
  def center(array: ArrayLike[T], x: U, lo: Double, hi: Double): Double = js.native
  
  def left(array: ArrayLike[T], x: U): Double = js.native
  def left(array: ArrayLike[T], x: U, lo: js.UndefOr[scala.Nothing], hi: Double): Double = js.native
  def left(array: ArrayLike[T], x: U, lo: Double): Double = js.native
  def left(array: ArrayLike[T], x: U, lo: Double, hi: Double): Double = js.native
  
  def right(array: ArrayLike[T], x: U): Double = js.native
  def right(array: ArrayLike[T], x: U, lo: js.UndefOr[scala.Nothing], hi: Double): Double = js.native
  def right(array: ArrayLike[T], x: U, lo: Double): Double = js.native
  def right(array: ArrayLike[T], x: U, lo: Double, hi: Double): Double = js.native
}
