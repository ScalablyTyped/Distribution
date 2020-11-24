package typings.azdata.mod.nb

import typings.vscode.Thenable
import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NotebookProvider extends js.Object {
  
  def getNotebookManager(notebookUri: Uri): Thenable[NotebookManager] = js.native
  
  def handleNotebookClosed(notebookUri: Uri): Unit = js.native
  
  val providerId: String = js.native
  
  /**
    * @deprecated standardKernels will be removed in an upcoming release. Standard kernel contribution
    * should happen via JSON for extensions. Until this is removed, notebook providers can safely return an empty array.
    */
  val standardKernels: js.Array[IStandardKernel] = js.native
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
  
  @scala.inline
  implicit class NotebookProviderOps[Self <: NotebookProvider] (val x: Self) extends AnyVal {
    
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
    def setGetNotebookManager(value: Uri => Thenable[NotebookManager]): Self = this.set("getNotebookManager", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHandleNotebookClosed(value: Uri => Unit): Self = this.set("handleNotebookClosed", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProviderId(value: String): Self = this.set("providerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStandardKernelsVarargs(value: IStandardKernel*): Self = this.set("standardKernels", js.Array(value :_*))
    
    @scala.inline
    def setStandardKernels(value: js.Array[IStandardKernel]): Self = this.set("standardKernels", value.asInstanceOf[js.Any])
  }
}
