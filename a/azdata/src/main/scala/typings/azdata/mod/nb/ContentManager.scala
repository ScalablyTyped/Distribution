package typings.azdata.mod.nb

import typings.vscode.Thenable
import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentManager extends js.Object {
  /* Reads contents from a Uri representing a local or remote notebook and returns a
  			 * JSON object containing the cells and metadata about the notebook
  			 */
  def getNotebookContents(notebookUri: Uri): Thenable[INotebookContents]
  /**
  			 * Save a file.
  			 *
  			 * @param notebookUri - The desired file path.
  			 *
  			 * @param notebook - notebook to be saved.
  			 *
  			 * @returns A thenable which resolves with the file content model when the
  			 *   file is saved.
  			 */
  def save(notebookUri: Uri, notebook: INotebookContents): Thenable[INotebookContents]
}

object ContentManager {
  @scala.inline
  def apply(
    getNotebookContents: Uri => Thenable[INotebookContents],
    save: (Uri, INotebookContents) => Thenable[INotebookContents]
  ): ContentManager = {
    val __obj = js.Dynamic.literal(getNotebookContents = js.Any.fromFunction1(getNotebookContents), save = js.Any.fromFunction2(save))
    __obj.asInstanceOf[ContentManager]
  }
}

