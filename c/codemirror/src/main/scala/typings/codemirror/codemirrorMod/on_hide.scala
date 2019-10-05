package typings.codemirror.codemirrorMod

import typings.codemirror.codemirrorStrings.hide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", "on")
@js.native
object on_hide extends js.Object {
  /** Fired when the last part of the marker is removed from the document by editing operations. */
  def apply(marker: TextMarker, eventName: hide, handler: js.Function0[Unit]): Unit = js.native
}

