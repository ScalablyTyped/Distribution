package typings.coreJs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("core-js/fn/array/fill", JSImport.Namespace)
@js.native
object fillMod extends js.Object {
  def apply[T](array: ArrayLike[T], value: T): Array[T] = js.native
  def apply[T](array: ArrayLike[T], value: T, start: js.UndefOr[scala.Nothing], end: Double): Array[T] = js.native
  def apply[T](array: ArrayLike[T], value: T, start: Double): Array[T] = js.native
  def apply[T](array: ArrayLike[T], value: T, start: Double, end: Double): Array[T] = js.native
}

