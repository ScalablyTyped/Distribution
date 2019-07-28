package typings.coreDashJs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/fn/array/map", JSImport.Namespace)
@js.native
object fnArrayMapMod extends js.Object {
  def apply[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], U]
  ): Array[U] = js.native
  def apply[T, U](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], U],
    thisArg: js.Any
  ): Array[U] = js.native
}

