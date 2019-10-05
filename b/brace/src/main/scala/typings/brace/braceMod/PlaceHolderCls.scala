package typings.brace.braceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("brace", "PlaceHolder")
@js.native
class PlaceHolderCls protected () extends PlaceHolder {
  def this(session: IEditSession, length: Double, pos: Position, positions: js.Array[Position]) = this()
  /**
    * - @param session (Document): The document to associate with the anchor
    * - @param length (Number): The starting row position
    * - @param pos (Number): The starting column position
    * - @param others (String):
    * - @param mainClass (String):
    * - @param othersClass (String):
    **/
  def this(
    session: Document,
    length: Double,
    pos: Double,
    others: String,
    mainClass: String,
    othersClass: String
  ) = this()
  /**
    * PlaceHolder.cancel()
    * TODO
    **/
  /* CompleteClass */
  override def cancel(): Unit = js.native
  /**
    * PlaceHolder.detach()
    * TODO
    **/
  /* CompleteClass */
  override def detach(): Unit = js.native
  /**
    * PlaceHolder.hideOtherMarkers()
    * Hides all over markers in the [[EditSession `EditSession`]] that are not the currently selected one.
    **/
  /* CompleteClass */
  override def hideOtherMarkers(): Unit = js.native
  /* CompleteClass */
  override def on(event: String, fn: js.Function1[/* e */ js.Any, _]): Unit = js.native
  /**
    * PlaceHolder@onCursorChange(e)
    * Emitted when the cursor changes.
    **/
  /* CompleteClass */
  override def onCursorChange(): Unit = js.native
  /**
    * PlaceHolder@onUpdate(e)
    * Emitted when the place holder updates.
    **/
  /* CompleteClass */
  override def onUpdate(): Unit = js.native
  /**
    * PlaceHolder.setup()
    * TODO
    **/
  /* CompleteClass */
  override def setup(): Unit = js.native
  /**
    * PlaceHolder.showOtherMarkers()
    * TODO
    **/
  /* CompleteClass */
  override def showOtherMarkers(): Unit = js.native
}

