package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileBrowserProvider extends DataProvider {
  
  def closeFileBrowser(ownerUri: String): Thenable[FileBrowserCloseResponse] = js.native
  
  def expandFolderNode(ownerUri: String, expandPath: String): Thenable[Boolean] = js.native
  
  def openFileBrowser(ownerUri: String, expandPath: String, fileFilters: js.Array[String], changeFilter: Boolean): Thenable[Boolean] = js.native
  
  def registerOnFileBrowserOpened(handler: js.Function1[/* response */ FileBrowserOpenedParams, _]): Unit = js.native
  
  def registerOnFilePathsValidated(handler: js.Function1[/* response */ FileBrowserValidatedParams, _]): Unit = js.native
  
  def registerOnFolderNodeExpanded(handler: js.Function1[/* response */ FileBrowserExpandedParams, _]): Unit = js.native
  
  def validateFilePaths(ownerUri: String, serviceType: String, selectedFiles: js.Array[String]): Thenable[Boolean] = js.native
}
object FileBrowserProvider {
  
  @scala.inline
  def apply(
    closeFileBrowser: String => Thenable[FileBrowserCloseResponse],
    expandFolderNode: (String, String) => Thenable[Boolean],
    openFileBrowser: (String, String, js.Array[String], Boolean) => Thenable[Boolean],
    providerId: String,
    registerOnFileBrowserOpened: js.Function1[/* response */ FileBrowserOpenedParams, _] => Unit,
    registerOnFilePathsValidated: js.Function1[/* response */ FileBrowserValidatedParams, _] => Unit,
    registerOnFolderNodeExpanded: js.Function1[/* response */ FileBrowserExpandedParams, _] => Unit,
    validateFilePaths: (String, String, js.Array[String]) => Thenable[Boolean]
  ): FileBrowserProvider = {
    val __obj = js.Dynamic.literal(closeFileBrowser = js.Any.fromFunction1(closeFileBrowser), expandFolderNode = js.Any.fromFunction2(expandFolderNode), openFileBrowser = js.Any.fromFunction4(openFileBrowser), providerId = providerId.asInstanceOf[js.Any], registerOnFileBrowserOpened = js.Any.fromFunction1(registerOnFileBrowserOpened), registerOnFilePathsValidated = js.Any.fromFunction1(registerOnFilePathsValidated), registerOnFolderNodeExpanded = js.Any.fromFunction1(registerOnFolderNodeExpanded), validateFilePaths = js.Any.fromFunction3(validateFilePaths))
    __obj.asInstanceOf[FileBrowserProvider]
  }
  
  @scala.inline
  implicit class FileBrowserProviderOps[Self <: FileBrowserProvider] (val x: Self) extends AnyVal {
    
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
    def setCloseFileBrowser(value: String => Thenable[FileBrowserCloseResponse]): Self = this.set("closeFileBrowser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandFolderNode(value: (String, String) => Thenable[Boolean]): Self = this.set("expandFolderNode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOpenFileBrowser(value: (String, String, js.Array[String], Boolean) => Thenable[Boolean]): Self = this.set("openFileBrowser", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRegisterOnFileBrowserOpened(value: js.Function1[/* response */ FileBrowserOpenedParams, _] => Unit): Self = this.set("registerOnFileBrowserOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterOnFilePathsValidated(value: js.Function1[/* response */ FileBrowserValidatedParams, _] => Unit): Self = this.set("registerOnFilePathsValidated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterOnFolderNodeExpanded(value: js.Function1[/* response */ FileBrowserExpandedParams, _] => Unit): Self = this.set("registerOnFolderNodeExpanded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateFilePaths(value: (String, String, js.Array[String]) => Thenable[Boolean]): Self = this.set("validateFilePaths", js.Any.fromFunction3(value))
  }
}
