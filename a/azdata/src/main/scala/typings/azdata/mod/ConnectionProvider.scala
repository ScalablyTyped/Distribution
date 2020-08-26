package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionProvider extends DataProvider {
  var buildConnectionInfo: js.UndefOr[js.Function1[/* connectionString */ String, Thenable[ConnectionInfo]]] = js.native
  def cancelConnect(connectionUri: String): Thenable[Boolean] = js.native
  def changeDatabase(connectionUri: String, newDatabase: String): Thenable[Boolean] = js.native
  def connect(connectionUri: String, connectionInfo: ConnectionInfo): Thenable[Boolean] = js.native
  def disconnect(connectionUri: String): Thenable[Boolean] = js.native
  def getConnectionString(connectionUri: String, includePassword: Boolean): Thenable[String] = js.native
  def listDatabases(connectionUri: String): Thenable[ListDatabasesResult] = js.native
  def rebuildIntelliSenseCache(connectionUri: String): Thenable[Unit] = js.native
  def registerOnConnectionChanged(handler: js.Function1[/* changedConnInfo */ ChangedConnectionInfo, _]): Unit = js.native
  def registerOnConnectionComplete(handler: js.Function1[/* connSummary */ ConnectionInfoSummary, _]): Unit = js.native
  def registerOnIntelliSenseCacheComplete(handler: js.Function1[/* connectionUri */ String, _]): Unit = js.native
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
    registerOnIntelliSenseCacheComplete: js.Function1[/* connectionUri */ String, _] => Unit
  ): ConnectionProvider = {
    val __obj = js.Dynamic.literal(cancelConnect = js.Any.fromFunction1(cancelConnect), changeDatabase = js.Any.fromFunction2(changeDatabase), connect = js.Any.fromFunction2(connect), disconnect = js.Any.fromFunction1(disconnect), getConnectionString = js.Any.fromFunction2(getConnectionString), listDatabases = js.Any.fromFunction1(listDatabases), providerId = providerId.asInstanceOf[js.Any], rebuildIntelliSenseCache = js.Any.fromFunction1(rebuildIntelliSenseCache), registerOnConnectionChanged = js.Any.fromFunction1(registerOnConnectionChanged), registerOnConnectionComplete = js.Any.fromFunction1(registerOnConnectionComplete), registerOnIntelliSenseCacheComplete = js.Any.fromFunction1(registerOnIntelliSenseCacheComplete))
    __obj.asInstanceOf[ConnectionProvider]
  }
  @scala.inline
  implicit class ConnectionProviderOps[Self <: ConnectionProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCancelConnect(value: String => Thenable[Boolean]): Self = this.set("cancelConnect", js.Any.fromFunction1(value))
    @scala.inline
    def setChangeDatabase(value: (String, String) => Thenable[Boolean]): Self = this.set("changeDatabase", js.Any.fromFunction2(value))
    @scala.inline
    def setConnect(value: (String, ConnectionInfo) => Thenable[Boolean]): Self = this.set("connect", js.Any.fromFunction2(value))
    @scala.inline
    def setDisconnect(value: String => Thenable[Boolean]): Self = this.set("disconnect", js.Any.fromFunction1(value))
    @scala.inline
    def setGetConnectionString(value: (String, Boolean) => Thenable[String]): Self = this.set("getConnectionString", js.Any.fromFunction2(value))
    @scala.inline
    def setListDatabases(value: String => Thenable[ListDatabasesResult]): Self = this.set("listDatabases", js.Any.fromFunction1(value))
    @scala.inline
    def setRebuildIntelliSenseCache(value: String => Thenable[Unit]): Self = this.set("rebuildIntelliSenseCache", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterOnConnectionChanged(value: js.Function1[/* changedConnInfo */ ChangedConnectionInfo, _] => Unit): Self = this.set("registerOnConnectionChanged", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterOnConnectionComplete(value: js.Function1[/* connSummary */ ConnectionInfoSummary, _] => Unit): Self = this.set("registerOnConnectionComplete", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterOnIntelliSenseCacheComplete(value: js.Function1[/* connectionUri */ String, _] => Unit): Self = this.set("registerOnIntelliSenseCacheComplete", js.Any.fromFunction1(value))
    @scala.inline
    def setBuildConnectionInfo(value: /* connectionString */ String => Thenable[ConnectionInfo]): Self = this.set("buildConnectionInfo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBuildConnectionInfo: Self = this.set("buildConnectionInfo", js.undefined)
  }
  
}

