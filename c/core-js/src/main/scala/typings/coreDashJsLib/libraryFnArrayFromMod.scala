package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("core-js/library/fn/array/from", JSImport.Namespace)
@js.native
object libraryFnArrayFromMod extends js.Object {
  def apply[T](arrayLike: stdLib.ArrayLike[T]): coreDashJsLib.Array[T] = js.native
  def apply[T](arrayLike: stdLib.Iterable[T]): coreDashJsLib.Array[T] = js.native
  def apply[T, U](arrayLike: stdLib.ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U]): coreDashJsLib.Array[U] = js.native
  def apply[T, U](
    arrayLike: stdLib.ArrayLike[T],
    mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U],
    thisArg: js.Any
  ): coreDashJsLib.Array[U] = js.native
  def apply[T, U](arrayLike: stdLib.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U]): coreDashJsLib.Array[U] = js.native
  def apply[T, U](
    arrayLike: stdLib.Iterable[T],
    mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U],
    thisArg: js.Any
  ): coreDashJsLib.Array[U] = js.native
}

