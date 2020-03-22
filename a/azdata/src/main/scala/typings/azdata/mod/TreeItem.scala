package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "TreeItem")
@js.native
class TreeItem ()
  extends typings.vscode.mod.TreeItem {
  var childProvider: js.UndefOr[String] = js.native
  var payload: js.UndefOr[IConnectionProfile] = js.native
  var `type`: js.UndefOr[ExtensionNodeType] = js.native
}

