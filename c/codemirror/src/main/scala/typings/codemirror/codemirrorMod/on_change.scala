package typings.codemirror.codemirrorMod

import typings.codemirror.codemirrorStrings.change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "on")
@js.native
object on_change extends js.Object {
  /** Fired whenever a change occurs to the document. changeObj has a similar type as the object passed to the editor's "change" event,
    but it never has a next property, because document change events are not batched (whereas editor change events are). */
  def apply(
    doc: Doc,
    eventName: change,
    handler: js.Function2[/* instance */ Doc, /* change */ EditorChange, Unit]
  ): Unit = js.native
  /** Fires when the line's text content is changed in any way (but the line is not deleted outright).
    The change object is similar to the one passed to change event on the editor object. */
  def apply(
    line: LineHandle,
    eventName: change,
    handler: js.Function2[/* line */ LineHandle, /* change */ EditorChange, Unit]
  ): Unit = js.native
}

