package typings.azdata.mod

import typings.vscode.mod.TreeItemCollapsibleState
import typings.vscode.mod.TreeItemLabel
import typings.vscode.mod.Uri
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("azdata", "TreeItem")
@js.native
open class TreeItem protected ()
  extends typings.vscode.mod.TreeItem {
  /**
  		 * @param label A human-readable string describing this item
  		 * @param collapsibleState {@link TreeItemCollapsibleState} of the tree item. Default is {@link TreeItemCollapsibleState.None}
  		 */
  def this(label: String) = this()
  def this(label: TreeItemLabel) = this()
  /**
  		 * @param resourceUri The {@link Uri} of the resource representing this item.
  		 * @param collapsibleState {@link TreeItemCollapsibleState} of the tree item. Default is {@link TreeItemCollapsibleState.None}
  		 */
  def this(resourceUri: Uri) = this()
  def this(label: String, collapsibleState: TreeItemCollapsibleState) = this()
  def this(label: TreeItemLabel, collapsibleState: TreeItemCollapsibleState) = this()
  def this(resourceUri: Uri, collapsibleState: TreeItemCollapsibleState) = this()
  
  /**
    * Indicates that the children for this node should be retrieved from the specified provider if set, this will retrieve
    * all child nodes from the {@link ObjectExplorerProvider}, in addition to any nodes provided by {@link ObjectExplorerNodeProvider}
    * with the same provider ID.
    */
  var childProvider: js.UndefOr[String] = js.native
  
  /**
    * The connection profile that will be used to create the session with the provider for retrieving children.
    * No child nodes will be created if not specified.
    */
  var payload: js.UndefOr[IConnectionProfile] = js.native
  
  /**
    * The type of node this is, used as a context key value for the node if set.
    */
  var `type`: js.UndefOr[ExtensionNodeType] = js.native
}
