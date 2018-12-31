package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrayCallbackfnValueIndex extends js.Object {
  def apply[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Unit]
  ): scala.Unit = js.native
  def apply[T](
    array: stdLib.ArrayLike[T],
    callbackfn: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ Array[T], scala.Unit],
    thisArg: js.Any
  ): scala.Unit = js.native
}

