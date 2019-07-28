package typings.coreDashJs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/fn/array/for-each", JSImport.Namespace)
@js.native
object libraryFnArrayForDashEachMod extends js.Object {
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Unit]
  ): Unit = js.native
  def apply[T](
    array: ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ Double, /* array */ Array[T], Unit],
    thisArg: js.Any
  ): Unit = js.native
}

