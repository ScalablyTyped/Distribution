package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectExplorerNodeProvider extends ObjectExplorerProviderBase {
  /**
  		 * Optional group name used to sort nodes in the tree. If not defined, the node order will be added in order based on provider ID, with
  		 * nodes from the main ObjectExplorerProvider for this provider type added first
  		 */
  val group: js.UndefOr[String] = js.undefined
  /**
  		 * The providerId for whichever type of ObjectExplorer connection this can add folders and objects to
  		 */
  val supportedProviderId: String
  def handleSessionClose(closeSessionInfo: ObjectExplorerCloseSessionInfo): Unit
  def handleSessionOpen(session: ObjectExplorerSession): Thenable[Boolean]
}

object ObjectExplorerNodeProvider {
  @scala.inline
  def apply(
    expandNode: ExpandNodeInfo => Thenable[Boolean],
    findNodes: FindNodesInfo => Thenable[ObjectExplorerFindNodesResponse],
    handleSessionClose: ObjectExplorerCloseSessionInfo => Unit,
    handleSessionOpen: ObjectExplorerSession => Thenable[Boolean],
    providerId: String,
    refreshNode: ExpandNodeInfo => Thenable[Boolean],
    registerOnExpandCompleted: js.Function1[/* response */ ObjectExplorerExpandInfo, _] => Unit,
    supportedProviderId: String,
    group: String = null,
    handle: Int | Double = null
  ): ObjectExplorerNodeProvider = {
    val __obj = js.Dynamic.literal(expandNode = js.Any.fromFunction1(expandNode), findNodes = js.Any.fromFunction1(findNodes), handleSessionClose = js.Any.fromFunction1(handleSessionClose), handleSessionOpen = js.Any.fromFunction1(handleSessionOpen), providerId = providerId.asInstanceOf[js.Any], refreshNode = js.Any.fromFunction1(refreshNode), registerOnExpandCompleted = js.Any.fromFunction1(registerOnExpandCompleted), supportedProviderId = supportedProviderId.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerNodeProvider]
  }
}

