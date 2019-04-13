package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/fn/array/sort", JSImport.Namespace)
@js.native
object fnArraySortMod extends js.Object {
  def apply[T](array: stdLib.ArrayLike[T]): coreDashJsLib.Array[T] = js.native
  def apply[T](array: stdLib.ArrayLike[T], compareFn: js.Function2[/* a */ T, /* b */ T, scala.Double]): coreDashJsLib.Array[T] = js.native
}

