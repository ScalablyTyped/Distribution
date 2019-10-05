package typings.codemirror.codemirrorMod

import typings.codemirror.codemirrorStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "off")
@js.native
object off_change extends js.Object {
  def apply(
    doc: Doc,
    eventName: change,
    handler: js.Function2[/* instance */ Doc, /* change */ EditorChange, Unit]
  ): Unit = js.native
  def apply(
    line: LineHandle,
    eventName: change,
    handler: js.Function2[/* line */ LineHandle, /* change */ EditorChange, Unit]
  ): Unit = js.native
}

