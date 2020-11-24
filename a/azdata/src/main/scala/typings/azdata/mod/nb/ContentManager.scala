package typings.azdata.mod.nb

import typings.vscode.Thenable
import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentManager extends js.Object {
  
  /* Reads contents from a Uri representing a local or remote notebook and returns a
    * JSON object containing the cells and metadata about the notebook
    */
  def getNotebookContents(notebookUri: Uri): Thenable[INotebookContents] = js.native
  
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
  def save(notebookUri: Uri, notebook: INotebookContents): Thenable[INotebookContents] = js.native
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
  
  @scala.inline
  implicit class ContentManagerOps[Self <: ContentManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetNotebookContents(value: Uri => Thenable[INotebookContents]): Self = this.set("getNotebookContents", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSave(value: (Uri, INotebookContents) => Thenable[INotebookContents]): Self = this.set("save", js.Any.fromFunction2(value))
  }
}
