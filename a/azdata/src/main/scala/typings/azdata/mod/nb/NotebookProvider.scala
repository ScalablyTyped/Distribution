package typings.azdata.mod.nb

import typings.vscode.Thenable
import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotebookProvider extends js.Object {
  val providerId: String
  val standardKernels: js.Array[IStandardKernel]
  def getNotebookManager(notebookUri: Uri): Thenable[NotebookManager]
  def handleNotebookClosed(notebookUri: Uri): Unit
}

object NotebookProvider {
  @scala.inline
  def apply(
    getNotebookManager: Uri => Thenable[NotebookManager],
    handleNotebookClosed: Uri => Unit,
    providerId: String,
    standardKernels: js.Array[IStandardKernel]
  ): NotebookProvider = {
    val __obj = js.Dynamic.literal(getNotebookManager = js.Any.fromFunction1(getNotebookManager), handleNotebookClosed = js.Any.fromFunction1(handleNotebookClosed), providerId = providerId.asInstanceOf[js.Any], standardKernels = standardKernels.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NotebookProvider]
  }
}

