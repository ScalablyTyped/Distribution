package typings.codemirror.mod

import typings.codemirror.codemirrorStrings.clear
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("codemirror", "on")
@js.native
object on_clear extends js.Object {
  
  /** Fired when the range is cleared, either through cursor movement in combination with clearOnEnter or through a call to its clear() method.
    Will only be fired once per handle. Note that deleting the range through text editing does not fire this event,
    because an undo action might bring the range back into existence. */
  def apply(marker: TextMarker, eventName: clear, handler: js.Function0[Unit]): Unit = js.native
}
