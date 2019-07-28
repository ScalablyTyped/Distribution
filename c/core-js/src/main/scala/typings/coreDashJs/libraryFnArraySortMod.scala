package typings.coreDashJs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/fn/array/sort", JSImport.Namespace)
@js.native
object libraryFnArraySortMod extends js.Object {
  def apply[T](array: ArrayLike[T]): Array[T] = js.native
  def apply[T](array: ArrayLike[T], compareFn: js.Function2[/* a */ T, /* b */ T, Double]): Array[T] = js.native
}

