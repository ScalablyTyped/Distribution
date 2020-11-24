package typings.codemirror.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("codemirror", "changeEnd")
@js.native
object changeEnd extends js.Object {
  
  /** Utility function that computes an end position from a change (an object with from, to, and text properties, as passed to various event handlers).
    The returned position will be the end of the changed range, after the change is applied. */
  def apply(change: EditorChange): Position = js.native
}
