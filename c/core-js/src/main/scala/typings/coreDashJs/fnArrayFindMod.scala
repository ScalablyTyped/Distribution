package typings.coreDashJs

import typings.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/fn/array/find", JSImport.Namespace)
@js.native
object fnArrayFindMod extends js.Object {
  def apply[T](
    array: ArrayLike[T],
    predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ Array[T], Boolean]
  ): T = js.native
  def apply[T](
    array: ArrayLike[T],
    predicate: js.Function3[/* value */ T, /* index */ Double, /* obj */ Array[T], Boolean],
    thisArg: js.Any
  ): T = js.native
}

