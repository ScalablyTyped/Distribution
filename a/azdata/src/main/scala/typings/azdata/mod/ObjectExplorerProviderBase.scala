package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectExplorerProviderBase extends DataProvider {
  def expandNode(nodeInfo: ExpandNodeInfo): Thenable[Boolean]
  def findNodes(findNodesInfo: FindNodesInfo): Thenable[ObjectExplorerFindNodesResponse]
  def refreshNode(nodeInfo: ExpandNodeInfo): Thenable[Boolean]
  def registerOnExpandCompleted(handler: js.Function1[/* response */ ObjectExplorerExpandInfo, _]): Unit
}

object ObjectExplorerProviderBase {
  @scala.inline
  def apply(
    expandNode: ExpandNodeInfo => Thenable[Boolean],
    findNodes: FindNodesInfo => Thenable[ObjectExplorerFindNodesResponse],
    providerId: String,
    refreshNode: ExpandNodeInfo => Thenable[Boolean],
    registerOnExpandCompleted: js.Function1[/* response */ ObjectExplorerExpandInfo, _] => Unit,
    handle: js.UndefOr[Double] = js.undefined
  ): ObjectExplorerProviderBase = {
    val __obj = js.Dynamic.literal(expandNode = js.Any.fromFunction1(expandNode), findNodes = js.Any.fromFunction1(findNodes), providerId = providerId.asInstanceOf[js.Any], refreshNode = js.Any.fromFunction1(refreshNode), registerOnExpandCompleted = js.Any.fromFunction1(registerOnExpandCompleted))
    if (!js.isUndefined(handle)) __obj.updateDynamic("handle")(handle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectExplorerProviderBase]
  }
}

