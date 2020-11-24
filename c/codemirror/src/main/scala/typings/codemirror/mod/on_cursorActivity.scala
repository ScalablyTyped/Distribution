package typings.codemirror.mod

import typings.codemirror.codemirrorStrings.cursorActivity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("codemirror", "on")
@js.native
object on_cursorActivity extends js.Object {
  
  /** Fired whenever the cursor or selection in this document changes. */
  def apply(doc: Doc, eventName: cursorActivity, handler: js.Function1[/* instance */ Editor, Unit]): Unit = js.native
}
