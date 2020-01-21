package typings.brace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("brace", "Anchor")
@js.native
class AnchorCls protected () extends Anchor {
  /**
    * Creates a new `Anchor` and associates it with a document.
    * @param doc The document to associate with the anchor
    * @param row The starting row position
    * @param column The starting column position
    **/
  def this(doc: Document, row: Double, column: Double) = this()
  /**
    * When called, the `'change'` event listener is removed.
    **/
  /* CompleteClass */
  override def detach(): Unit = js.native
  /**
    * Returns the current document.
    **/
  /* CompleteClass */
  override def getDocument(): Document = js.native
  /**
    * Returns an object identifying the `row` and `column` position of the current anchor.
    **/
  /* CompleteClass */
  override def getPosition(): Position = js.native
  /* CompleteClass */
  override def on(event: String, fn: js.Function1[/* e */ js.Any, _]): Unit = js.native
  /**
    * Fires whenever the anchor position changes.
    * Both of these objects have a `row` and `column` property corresponding to the position.
    * Events that can trigger this function include [[Anchor.setPosition `setPosition()`]].
    * @param e An object containing information about the anchor position. It has two properties:
    * - `old`: An object describing the old Anchor position
    * - `value`: An object describing the new Anchor position
    **/
  /* CompleteClass */
  override def onChange(e: js.Any): Unit = js.native
  /**
    * Sets the anchor position to the specified row and column. If `noClip` is `true`, the position is not clipped.
    * @param row The row index to move the anchor to
    * @param column The column index to move the anchor to
    * @param noClip Identifies if you want the position to be clipped
    **/
  /* CompleteClass */
  override def setPosition(row: Double, column: Double, noClip: Boolean): Unit = js.native
}

