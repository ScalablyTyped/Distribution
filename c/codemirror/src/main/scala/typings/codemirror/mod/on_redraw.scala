package typings.codemirror.mod

import typings.codemirror.codemirrorStrings.redraw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("codemirror", "on")
@js.native
object on_redraw extends js.Object {
  
  /** Fired whenever the editor re-adds the widget to the DOM. This will happen once right after the widget is added (if it is scrolled into view),
    and then again whenever it is scrolled out of view and back in again, or when changes to the editor options
    or the line the widget is on require the widget to be redrawn. */
  def apply(line: LineWidget, eventName: redraw, handler: js.Function0[Unit]): Unit = js.native
}
