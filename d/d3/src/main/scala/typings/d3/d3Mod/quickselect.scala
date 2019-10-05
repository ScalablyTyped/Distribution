package typings.d3.d3Mod

import typings.d3DashArray.d3DashArrayMod.Primitive
import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "quickselect")
@js.native
object quickselect extends js.Object {
  def apply[T](array: ArrayLike[T], k: Double): js.Array[T] = js.native
  def apply[T](array: ArrayLike[T], k: Double, left: Double): js.Array[T] = js.native
  def apply[T](array: ArrayLike[T], k: Double, left: Double, right: Double): js.Array[T] = js.native
  def apply[T](
    array: ArrayLike[T],
    k: Double,
    left: Double,
    right: Double,
    compare: js.Function2[/* a */ js.UndefOr[Primitive], /* b */ js.UndefOr[Primitive], Double]
  ): js.Array[T] = js.native
}

