package typings.codemirror.codemirrorMod

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
    text: js.Array[String],
    to: Position,
    next: EditorChangeLinkedList = null,
    origin: String = null,
    removed: js.Array[String] = null
  ): EditorChangeLinkedList = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorChangeLinkedList]
  }
}

