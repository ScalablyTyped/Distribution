package typings.azdata.mod.nb

import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotebookCell extends js.Object {
  var contents: ICellContents
  var uri: js.UndefOr[Uri] = js.undefined
}

object NotebookCell {
  @scala.inline
  def apply(contents: ICellContents, uri: Uri = null): NotebookCell = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any])
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotebookCell]
  }
}

