package typings
package coreDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArrayIndex extends js.Object {
  def apply[T](
    array: stdLib.ArrayLike[T],
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* obj */ Array[T], scala.Boolean]
  ): T = js.native
  def apply[T](
    array: stdLib.ArrayLike[T],
    predicate: js.Function3[/* value */ T, /* index */ scala.Double, /* obj */ Array[T], scala.Boolean],
    thisArg: js.Any
  ): T = js.native
}

