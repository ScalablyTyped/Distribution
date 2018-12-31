package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrayCallbackfnValueIndexThisArgT extends js.Object {
  def apply[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Boolean]
  ): Array[T] = js.native
  def apply[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Boolean],
    thisArg: js.Any
  ): Array[T] = js.native
}

