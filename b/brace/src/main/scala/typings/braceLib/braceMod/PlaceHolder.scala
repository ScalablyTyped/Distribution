package typings
package braceLib.braceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("brace", "PlaceHolder")
@js.native
class PlaceHolderCls protected ()
  extends braceLib.braceMod.AceAjaxNs.PlaceHolder {
  def this(session: braceLib.braceMod.AceAjaxNs.IEditSession, length: scala.Double, pos: braceLib.braceMod.AceAjaxNs.Position, positions: js.Array[braceLib.braceMod.AceAjaxNs.Position]) = this()
  /**
    * - @param session (Document): The document to associate with the anchor
    * - @param length (Number): The starting row position
    * - @param pos (Number): The starting column position
    * - @param others (String):
    * - @param mainClass (String):
    * - @param othersClass (String):
    **/
  def this(session: braceLib.braceMod.AceAjaxNs.Document, length: scala.Double, pos: scala.Double, others: java.lang.String, mainClass: java.lang.String, othersClass: java.lang.String) = this()
  /**
    * PlaceHolder.cancel()
    * TODO
    **/
  /* CompleteClass */
  override def cancel(): scala.Unit = js.native
  /**
    * PlaceHolder.detach()
    * TODO
    **/
  /* CompleteClass */
  override def detach(): scala.Unit = js.native
  /**
    * PlaceHolder.hideOtherMarkers()
    * Hides all over markers in the [[EditSession `EditSession`]] that are not the currently selected one.
    **/
  /* CompleteClass */
  override def hideOtherMarkers(): scala.Unit = js.native
  /* CompleteClass */
  override def on(event: java.lang.String, fn: js.Function1[/* e */ js.Any, _]): scala.Unit = js.native
  /**
    * PlaceHolder@onCursorChange(e)
    * Emitted when the cursor changes.
    **/
  /* CompleteClass */
  override def onCursorChange(): scala.Unit = js.native
  /**
    * PlaceHolder@onUpdate(e)
    * Emitted when the place holder updates.
    **/
  /* CompleteClass */
  override def onUpdate(): scala.Unit = js.native
  /**
    * PlaceHolder.setup()
    * TODO
    **/
  /* CompleteClass */
  override def setup(): scala.Unit = js.native
  /**
    * PlaceHolder.showOtherMarkers()
    * TODO
    **/
  /* CompleteClass */
  override def showOtherMarkers(): scala.Unit = js.native
}

