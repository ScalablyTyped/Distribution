package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorChange extends js.Object {
  /** Position (in the pre-change coordinate system) where the change started. */
  var from: Position
  /**  String representing the origin of the change event and wether it can be merged with history */
  var origin: js.UndefOr[java.lang.String] = js.undefined
  /**  Text that used to be between from and to, which is overwritten by this change. */
  var removed: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Array of strings representing the text that replaced the changed range (split by line). */
  var text: js.Array[java.lang.String]
  /** Position (in the pre-change coordinate system) where the change ended. */
  var to: Position
}

object EditorChange {
  @scala.inline
  def apply(
    from: Position,
    text: js.Array[java.lang.String],
    to: Position,
    origin: java.lang.String = null,
    removed: js.Array[java.lang.String] = null
  ): EditorChange = {
    val __obj = js.Dynamic.literal(from = from, text = text, to = to)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (removed != null) __obj.updateDynamic("removed")(removed)
    __obj.asInstanceOf[EditorChange]
  }
}

