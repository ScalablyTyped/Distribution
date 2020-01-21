package typings.codemirror.mod

import typings.codemirror.codemirrorStrings.cursorActivity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "off")
@js.native
object off_cursorActivity extends js.Object {
  def apply(doc: Doc, eventName: cursorActivity, handler: js.Function1[/* instance */ Editor, Unit]): Unit = js.native
}

