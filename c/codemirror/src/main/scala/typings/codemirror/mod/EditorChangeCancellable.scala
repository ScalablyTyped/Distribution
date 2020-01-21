package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorChangeCancellable extends EditorChange {
  /** may be used to modify the change. All three arguments to update are optional, and can be left off to leave the existing value for that field intact.
    If the change came from undo/redo, `update` is undefined and the change cannot be modified. */
  var update: js.UndefOr[
    js.Function3[
      /* from */ js.UndefOr[Position], 
      /* to */ js.UndefOr[Position], 
      /* text */ js.UndefOr[js.Array[String]], 
      Unit
    ]
  ] = js.undefined
  def cancel(): Unit
}

object EditorChangeCancellable {
  @scala.inline
  def apply(
    cancel: () => Unit,
    from: Position,
    text: js.Array[String],
    to: Position,
    origin: String = null,
    removed: js.Array[String] = null,
    update: (/* from */ js.UndefOr[Position], /* to */ js.UndefOr[Position], /* text */ js.UndefOr[js.Array[String]]) => Unit = null
  ): EditorChangeCancellable = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), from = from.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (removed != null) __obj.updateDynamic("removed")(removed.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction3(update))
    __obj.asInstanceOf[EditorChangeCancellable]
  }
}

