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

