package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotebookCellChangeEvent extends js.Object {
  /**
  			 * The new value for the [notebook document's cells](#NotebookDocument.cells).
  			 */
  var cells: js.Array[NotebookCell]
  /**
  			 * The [change kind](#NotebookChangeKind) which has triggered this
  			 * event. Can be `undefined`.
  			 */
  var kind: js.UndefOr[NotebookChangeKind] = js.undefined
  /**
  			 * The [notebook document](#NotebookDocument) for which the selections have changed.
  			 */
  var notebook: NotebookDocument
}

object NotebookCellChangeEvent {
  @scala.inline
  def apply(cells: js.Array[NotebookCell], notebook: NotebookDocument, kind: NotebookChangeKind = null): NotebookCellChangeEvent = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], notebook = notebook.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookCellChangeEvent]
  }
}

