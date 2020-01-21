package typings.codemirror.mod

import typings.codemirror.codemirrorStrings.redraw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "off")
@js.native
object off_redraw extends js.Object {
  def apply(line: LineWidget, eventName: redraw, handler: js.Function0[Unit]): Unit = js.native
}

