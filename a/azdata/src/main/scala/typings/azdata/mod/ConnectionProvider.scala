package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionProvider extends DataProvider {
  var buildConnectionInfo: js.UndefOr[js.Function1[/* connectionString */ String, Thenable[ConnectionInfo]]] = js.undefined
  def cancelConnect(connectionUri: String): Thenable[Boolean]
  def changeDatabase(connectionUri: String, newDatabase: String): Thenable[Boolean]
  def connect(connectionUri: String, connectionInfo: ConnectionInfo): Thenable[Boolean]
  def disconnect(connectionUri: String): Thenable[Boolean]
  def getConnectionString(connectionUri: String, includePassword: Boolean): Thenable[String]
  def listDatabases(connectionUri: String): Thenable[ListDatabasesResult]
  def rebuildIntelliSenseCache(connectionUri: String): Thenable[Unit]
  def registerOnConnectionChanged(handler: js.Function1[/* changedConnInfo */ ChangedConnectionInfo, _]): Unit
  def registerOnConnectionComplete(handler: js.Function1[/* connSummary */ ConnectionInfoSummary, _]): Unit
  def registerOnIntelliSenseCacheComplete(handler: js.Function1[/* connectionUri */ String, _]): Unit
}

object ConnectionProvider {
  @scala.inline
  def apply(
    cancelConnect: String => Thenable[Boolean],
    changeDatabase: (String, String) => Thenable[Boolean],
    connect: (String, ConnectionInfo) => Thenable[Boolean],
    disconnect: String => Thenable[Boolean],
    getConnectionString: (String, Boolean) => Thenable[String],
    listDatabases: String => Thenable[ListDatabasesResult],
    providerId: String,
    rebuildIntelliSenseCache: String => Thenable[Unit],
    registerOnConnectionChanged: js.Function1[/* changedConnInfo */ ChangedConnectionInfo, _] => Unit,
    registerOnConnectionComplete: js.Function1[/* connSummary */ ConnectionInfoSummary, _] => Unit,
    registerOnIntelliSenseCacheComplete: js.Function1[/* connectionUri */ String, _] => Unit,
    buildConnectionInfo: /* connectionString */ String => Thenable[ConnectionInfo] = null,
    handle: js.UndefOr[Double] = js.undefined
  ): ConnectionProvider = {
    val __obj = js.Dynamic.literal(cancelConnect = js.Any.fromFunction1(cancelConnect), changeDatabase = js.Any.fromFunction2(changeDatabase), connect = js.Any.fromFunction2(connect), disconnect = js.Any.fromFunction1(disconnect), getConnectionString = js.Any.fromFunction2(getConnectionString), listDatabases = js.Any.fromFunction1(listDatabases), providerId = providerId.asInstanceOf[js.Any], rebuildIntelliSenseCache = js.Any.fromFunction1(rebuildIntelliSenseCache), registerOnConnectionChanged = js.Any.fromFunction1(registerOnConnectionChanged), registerOnConnectionComplete = js.Any.fromFunction1(registerOnConnectionComplete), registerOnIntelliSenseCacheComplete = js.Any.fromFunction1(registerOnIntelliSenseCacheComplete))
    if (buildConnectionInfo != null) __obj.updateDynamic("buildConnectionInfo")(js.Any.fromFunction1(buildConnectionInfo))
    if (!js.isUndefined(handle)) __obj.updateDynamic("handle")(handle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionProvider]
  }
}

