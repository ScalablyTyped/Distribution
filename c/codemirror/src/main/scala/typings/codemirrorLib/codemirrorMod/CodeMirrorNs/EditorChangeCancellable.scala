package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

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
      /* text */ js.UndefOr[js.Array[java.lang.String]], 
      scala.Unit
    ]
  ] = js.undefined
  def cancel(): scala.Unit
}

object EditorChangeCancellable {
  @scala.inline
  def apply(
    cancel: js.Function0[scala.Unit],
    from: Position,
    text: js.Array[java.lang.String],
    to: Position,
    origin: java.lang.String = null,
    removed: js.Array[java.lang.String] = null,
    update: js.Function3[
      /* from */ js.UndefOr[Position], 
      /* to */ js.UndefOr[Position], 
      /* text */ js.UndefOr[js.Array[java.lang.String]], 
      scala.Unit
    ] = null
  ): EditorChangeCancellable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("to")(to)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (removed != null) __obj.updateDynamic("removed")(removed)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[EditorChangeCancellable]
  }
}

