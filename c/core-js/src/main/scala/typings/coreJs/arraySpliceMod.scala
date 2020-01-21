package typings.coreJs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/fn/array/splice", JSImport.Namespace)
@js.native
object arraySpliceMod extends js.Object {
  def apply[T](array: ArrayLike[T], start: Double): Array[T] = js.native
  def apply[T](array: ArrayLike[T], start: Double, deleteCount: Double, items: T*): Array[T] = js.native
}

