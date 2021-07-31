package typings.azdata.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileBrowserProvider
  extends StObject
     with DataProvider {
  
  def closeFileBrowser(ownerUri: String): Thenable[FileBrowserCloseResponse]
  
  def expandFolderNode(ownerUri: String, expandPath: String): Thenable[Boolean]
  
  def openFileBrowser(ownerUri: String, expandPath: String, fileFilters: js.Array[String], changeFilter: Boolean): Thenable[Boolean]
  
  def registerOnFileBrowserOpened(handler: js.Function1[/* response */ FileBrowserOpenedParams, js.Any]): Unit
  
  def registerOnFilePathsValidated(handler: js.Function1[/* response */ FileBrowserValidatedParams, js.Any]): Unit
  
  def registerOnFolderNodeExpanded(handler: js.Function1[/* response */ FileBrowserExpandedParams, js.Any]): Unit
  
  def validateFilePaths(ownerUri: String, serviceType: String, selectedFiles: js.Array[String]): Thenable[Boolean]
}
object FileBrowserProvider {
  
  @scala.inline
  def apply(
    closeFileBrowser: String => Thenable[FileBrowserCloseResponse],
    expandFolderNode: (String, String) => Thenable[Boolean],
    openFileBrowser: (String, String, js.Array[String], Boolean) => Thenable[Boolean],
    providerId: String,
    registerOnFileBrowserOpened: js.Function1[/* response */ FileBrowserOpenedParams, js.Any] => Unit,
    registerOnFilePathsValidated: js.Function1[/* response */ FileBrowserValidatedParams, js.Any] => Unit,
    registerOnFolderNodeExpanded: js.Function1[/* response */ FileBrowserExpandedParams, js.Any] => Unit,
    validateFilePaths: (String, String, js.Array[String]) => Thenable[Boolean]
  ): FileBrowserProvider = {
    val __obj = js.Dynamic.literal(closeFileBrowser = js.Any.fromFunction1(closeFileBrowser), expandFolderNode = js.Any.fromFunction2(expandFolderNode), openFileBrowser = js.Any.fromFunction4(openFileBrowser), providerId = providerId.asInstanceOf[js.Any], registerOnFileBrowserOpened = js.Any.fromFunction1(registerOnFileBrowserOpened), registerOnFilePathsValidated = js.Any.fromFunction1(registerOnFilePathsValidated), registerOnFolderNodeExpanded = js.Any.fromFunction1(registerOnFolderNodeExpanded), validateFilePaths = js.Any.fromFunction3(validateFilePaths))
    __obj.asInstanceOf[FileBrowserProvider]
  }
  
  @scala.inline
  implicit class FileBrowserProviderMutableBuilder[Self <: FileBrowserProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloseFileBrowser(value: String => Thenable[FileBrowserCloseResponse]): Self = StObject.set(x, "closeFileBrowser", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExpandFolderNode(value: (String, String) => Thenable[Boolean]): Self = StObject.set(x, "expandFolderNode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOpenFileBrowser(value: (String, String, js.Array[String], Boolean) => Thenable[Boolean]): Self = StObject.set(x, "openFileBrowser", js.Any.fromFunction4(value))
    
    @scala.inline
    def setRegisterOnFileBrowserOpened(value: js.Function1[/* response */ FileBrowserOpenedParams, js.Any] => Unit): Self = StObject.set(x, "registerOnFileBrowserOpened", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterOnFilePathsValidated(value: js.Function1[/* response */ FileBrowserValidatedParams, js.Any] => Unit): Self = StObject.set(x, "registerOnFilePathsValidated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterOnFolderNodeExpanded(value: js.Function1[/* response */ FileBrowserExpandedParams, js.Any] => Unit): Self = StObject.set(x, "registerOnFolderNodeExpanded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidateFilePaths(value: (String, String, js.Array[String]) => Thenable[Boolean]): Self = StObject.set(x, "validateFilePaths", js.Any.fromFunction3(value))
  }
}
