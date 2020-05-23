package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileBrowserProvider extends DataProvider {
  def closeFileBrowser(ownerUri: String): Thenable[FileBrowserCloseResponse]
  def expandFolderNode(ownerUri: String, expandPath: String): Thenable[Boolean]
  def openFileBrowser(ownerUri: String, expandPath: String, fileFilters: js.Array[String], changeFilter: Boolean): Thenable[Boolean]
  def registerOnFileBrowserOpened(handler: js.Function1[/* response */ FileBrowserOpenedParams, _]): Unit
  def registerOnFilePathsValidated(handler: js.Function1[/* response */ FileBrowserValidatedParams, _]): Unit
  def registerOnFolderNodeExpanded(handler: js.Function1[/* response */ FileBrowserExpandedParams, _]): Unit
  def validateFilePaths(ownerUri: String, serviceType: String, selectedFiles: js.Array[String]): Thenable[Boolean]
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
    validateFilePaths: (String, String, js.Array[String]) => Thenable[Boolean],
    handle: js.UndefOr[Double] = js.undefined
  ): FileBrowserProvider = {
    val __obj = js.Dynamic.literal(closeFileBrowser = js.Any.fromFunction1(closeFileBrowser), expandFolderNode = js.Any.fromFunction2(expandFolderNode), openFileBrowser = js.Any.fromFunction4(openFileBrowser), providerId = providerId.asInstanceOf[js.Any], registerOnFileBrowserOpened = js.Any.fromFunction1(registerOnFileBrowserOpened), registerOnFilePathsValidated = js.Any.fromFunction1(registerOnFilePathsValidated), registerOnFolderNodeExpanded = js.Any.fromFunction1(registerOnFolderNodeExpanded), validateFilePaths = js.Any.fromFunction3(validateFilePaths))
    if (!js.isUndefined(handle)) __obj.updateDynamic("handle")(handle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBrowserProvider]
  }
}

