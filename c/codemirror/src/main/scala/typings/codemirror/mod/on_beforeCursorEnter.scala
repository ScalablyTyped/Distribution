package typings.codemirror.mod

import typings.codemirror.codemirrorStrings.beforeCursorEnter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("codemirror", "on")
@js.native
object on_beforeCursorEnter extends js.Object {
  
  /** Fired when the cursor enters the marked range. From this event handler, the editor state may be inspected but not modified,
    with the exception that the range on which the event fires may be cleared. */
  def apply(marker: TextMarker, eventName: beforeCursorEnter, handler: js.Function0[Unit]): Unit = js.native
}
