package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrayLike extends js.Object {
  def apply[T](arrayLike: stdLib.ArrayLike[T]): Array[T] = js.native
  def apply[T](arrayLike: stdLib.Iterable[T]): Array[T] = js.native
  def apply[T, U](arrayLike: stdLib.ArrayLike[T], mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U]): Array[U] = js.native
  def apply[T, U](
    arrayLike: stdLib.ArrayLike[T],
    mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U],
    thisArg: js.Any
  ): Array[U] = js.native
  def apply[T, U](arrayLike: stdLib.Iterable[T], mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U]): Array[U] = js.native
  def apply[T, U](
    arrayLike: stdLib.Iterable[T],
    mapfn: js.Function2[/* v */ T, /* k */ scala.Double, U],
    thisArg: js.Any
  ): Array[U] = js.native
}

