package typings.azdata.mod.nb

import typings.vscode.Thenable
import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azdata", "nb.showNotebookDocument")
@js.native
object showNotebookDocument extends js.Object {
  
  def apply(uri: Uri): Thenable[NotebookEditor] = js.native
  def apply(uri: Uri, showOptions: NotebookShowOptions): Thenable[NotebookEditor] = js.native
}
