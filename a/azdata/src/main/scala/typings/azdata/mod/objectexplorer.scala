package typings.azdata.mod

import typings.vscode.Thenable
import typings.vscode.mod.TreeItemCollapsibleState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azdata", "objectexplorer")
@js.native
object objectexplorer extends js.Object {
  @js.native
  trait ObjectExplorerNode extends NodeInfo {
    /**
    			 * The id of the connection that the node exists under
    			 */
    var connectionId: String = js.native
    /**
    			 * Get all the child nodes. Returns an empty list if there are no children.
    			 */
    def getChildren(): Thenable[js.Array[ObjectExplorerNode]] = js.native
    /**
    			 * Get the parent node. Returns undefined if there is none.
    			 */
    def getParent(): Thenable[ObjectExplorerNode] = js.native
    /**
    			 * Whether the node is currently expanded in Object Explorer
    			 */
    def isExpanded(): Thenable[Boolean] = js.native
    /**
    			 * Refresh the node, expanding it if it has children
    			 */
    def refresh(): Thenable[Unit] = js.native
    /**
    			 * Set whether the node is expanded or collapsed
    			 * @param expandedState The new state of the node. If 'None', the node will not be changed
    			 */
    def setExpandedState(expandedState: TreeItemCollapsibleState): Thenable[Unit] = js.native
    /**
    			 * Set whether the node is selected
    			 * @param selected Whether the node should be selected
    			 * @param clearOtherSelections If true, clear any other selections. If false, leave any existing selections.
    			 * Defaults to true when selected is true and false when selected is false.
    			 */
    def setSelected(selected: Boolean): Thenable[Unit] = js.native
    def setSelected(selected: Boolean, clearOtherSelections: Boolean): Thenable[Unit] = js.native
  }
  
  def findNodes(
    connectionId: String,
    `type`: String,
    schema: String,
    name: String,
    database: String,
    parentObjectNames: js.Array[String]
  ): Thenable[js.Array[ObjectExplorerNode]] = js.native
  def getActiveConnectionNodes(): Thenable[js.Array[ObjectExplorerNode]] = js.native
  def getNode(connectionId: String): Thenable[ObjectExplorerNode] = js.native
  def getNode(connectionId: String, nodePath: String): Thenable[ObjectExplorerNode] = js.native
  def getSessionConnectionProfile(sessionId: String): Thenable[IConnectionProfile] = js.native
}

