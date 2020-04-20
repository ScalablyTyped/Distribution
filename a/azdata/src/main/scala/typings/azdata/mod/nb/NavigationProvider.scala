package typings.azdata.mod.nb

import typings.vscode.Thenable
import typings.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationProvider extends js.Object {
  val providerId: String
  def getNavigation(notebookUri: Uri): Thenable[NavigationResult]
}

object NavigationProvider {
  @scala.inline
  def apply(getNavigation: Uri => Thenable[NavigationResult], providerId: String): NavigationProvider = {
    val __obj = js.Dynamic.literal(getNavigation = js.Any.fromFunction1(getNavigation), providerId = providerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationProvider]
  }
}

