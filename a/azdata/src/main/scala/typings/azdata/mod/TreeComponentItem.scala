package typings.azdata.mod

import typings.vscode.mod.TreeItemCollapsibleState
import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azdata", "TreeComponentItem")
@js.native
class TreeComponentItem protected ()
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
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var enabled: js.UndefOr[Boolean] = js.native
}
