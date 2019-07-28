package typings.coreDashJs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/fn/array/filter", JSImport.Namespace)
@js.native
object fnArrayFilterMod extends js.Object {
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean]
  ): Array[T] = js.native
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Boolean],
    thisArg: js.Any
  ): Array[T] = js.native
}

