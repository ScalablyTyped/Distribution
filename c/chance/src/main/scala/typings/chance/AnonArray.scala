package typings.chance

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArray[T] extends js.Object {
  var comparator: js.UndefOr[js.Function2[/* array */ js.Array[T], /* value */ T, Boolean]] = js.undefined
}

object AnonArray {
  @scala.inline
  def apply[T](comparator: (/* array */ js.Array[T], /* value */ T) => Boolean = null): AnonArray[T] = {
    val __obj = js.Dynamic.literal()
    if (comparator != null) __obj.updateDynamic("comparator")(js.Any.fromFunction2(comparator))
    __obj.asInstanceOf[AnonArray[T]]
  }
}

