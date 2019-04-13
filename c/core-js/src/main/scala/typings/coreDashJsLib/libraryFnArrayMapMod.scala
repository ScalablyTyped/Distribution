package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/fn/array/map", JSImport.Namespace)
@js.native
object libraryFnArrayMapMod extends js.Object {
  def apply[T, U](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ coreDashJsLib.Array[T], U]
  ): coreDashJsLib.Array[U] = js.native
  def apply[T, U](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ coreDashJsLib.Array[T], U],
    thisArg: js.Any
  ): coreDashJsLib.Array[U] = js.native
}

