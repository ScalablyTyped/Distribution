package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorChangeLinkedList extends EditorChange {
  /** Points to another change object (which may point to another, etc). */
  var next: js.UndefOr[EditorChangeLinkedList] = js.undefined
}

object EditorChangeLinkedList {
  @scala.inline
  def apply(
    from: Position,
    text: js.Array[java.lang.String],
    to: Position,
    next: EditorChangeLinkedList = null,
    origin: java.lang.String = null,
    removed: js.Array[java.lang.String] = null
  ): EditorChangeLinkedList = {
    val __obj = js.Dynamic.literal(from = from, text = text, to = to)
    if (next != null) __obj.updateDynamic("next")(next)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (removed != null) __obj.updateDynamic("removed")(removed)
    __obj.asInstanceOf[EditorChangeLinkedList]
  }
}

