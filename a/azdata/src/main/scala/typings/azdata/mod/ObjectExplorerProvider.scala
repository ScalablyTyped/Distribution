package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectExplorerProvider extends ObjectExplorerProviderBase {
  var registerOnSessionDisconnected: js.UndefOr[
    js.Function1[/* handler */ js.Function1[/* response */ ObjectExplorerSession, _], Unit]
  ] = js.undefined
  def closeSession(closeSessionInfo: ObjectExplorerCloseSessionInfo): Thenable[ObjectExplorerCloseSessionResponse]
  def createNewSession(connInfo: ConnectionInfo): Thenable[ObjectExplorerSessionResponse]
  def registerOnSessionCreated(handler: js.Function1[/* response */ ObjectExplorerSession, _]): Unit
}

object ObjectExplorerProvider {
  @scala.inline
  def apply(
    closeSession: ObjectExplorerCloseSessionInfo => Thenable[ObjectExplorerCloseSessionResponse],
    createNewSession: ConnectionInfo => Thenable[ObjectExplorerSessionResponse],
    expandNode: ExpandNodeInfo => Thenable[Boolean],
    findNodes: FindNodesInfo => Thenable[ObjectExplorerFindNodesResponse],
    providerId: String,
    refreshNode: ExpandNodeInfo => Thenable[Boolean],
    registerOnExpandCompleted: js.Function1[/* response */ ObjectExplorerExpandInfo, _] => Unit,
    registerOnSessionCreated: js.Function1[/* response */ ObjectExplorerSession, _] => Unit,
    handle: Int | Double = null,
    registerOnSessionDisconnected: /* handler */ js.Function1[/* response */ ObjectExplorerSession, _] => Unit = null
  ): ObjectExplorerProvider = {
    val __obj = js.Dynamic.literal(closeSession = js.Any.fromFunction1(closeSession), createNewSession = js.Any.fromFunction1(createNewSession), expandNode = js.Any.fromFunction1(expandNode), findNodes = js.Any.fromFunction1(findNodes), providerId = providerId.asInstanceOf[js.Any], refreshNode = js.Any.fromFunction1(refreshNode), registerOnExpandCompleted = js.Any.fromFunction1(registerOnExpandCompleted), registerOnSessionCreated = js.Any.fromFunction1(registerOnSessionCreated))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (registerOnSessionDisconnected != null) __obj.updateDynamic("registerOnSessionDisconnected")(js.Any.fromFunction1(registerOnSessionDisconnected))
    __obj.asInstanceOf[ObjectExplorerProvider]
  }
}

