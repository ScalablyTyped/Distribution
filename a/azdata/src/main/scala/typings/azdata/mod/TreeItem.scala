package typings.azdata.mod

import typings.vscode.mod.TreeItemCollapsibleState
import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azdata", "TreeItem")
@js.native
class TreeItem protected ()
  extends typings.vscode.mod.TreeItem {
  /**
    * @param label A human-readable string describing this item
    * @param collapsibleState [TreeItemCollapsibleState](#TreeItemCollapsibleState) of the tree item. Default is [TreeItemCollapsibleState.None](#TreeItemCollapsibleState.None)
    */
  def this(label: String) = this()
  /**
    * @param resourceUri The [uri](#Uri) of the resource representing this item.
    * @param collapsibleState [TreeItemCollapsibleState](#TreeItemCollapsibleState) of the tree item. Default is [TreeItemCollapsibleState.None](#TreeItemCollapsibleState.None)
    */
  def this(resourceUri: Uri) = this()
  def this(label: String, collapsibleState: TreeItemCollapsibleState) = this()
  def this(resourceUri: Uri, collapsibleState: TreeItemCollapsibleState) = this()
  
  var childProvider: js.UndefOr[String] = js.native
  
  var payload: js.UndefOr[IConnectionProfile] = js.native
  
  var `type`: js.UndefOr[ExtensionNodeType] = js.native
}
