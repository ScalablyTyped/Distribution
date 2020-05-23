package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorSelectionChange extends js.Object {
  var origin: js.UndefOr[String] = js.undefined
  var ranges: js.Array[Range]
  def update(ranges: js.Array[Range]): Unit
}

object EditorSelectionChange {
  @scala.inline
  def apply(ranges: js.Array[Range], update: js.Array[Range] => Unit, origin: String = null): EditorSelectionChange = {
    val __obj = js.Dynamic.literal(ranges = ranges.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorSelectionChange]
  }
}

