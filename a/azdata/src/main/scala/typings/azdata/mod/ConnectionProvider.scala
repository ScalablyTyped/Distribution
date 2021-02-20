package typings.azdata.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class ConnectionProviderMutableBuilder[Self <: ConnectionProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuildConnectionInfo(value: /* connectionString */ String => Thenable[ConnectionInfo]): Self = StObject.set(x, "buildConnectionInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBuildConnectionInfoUndefined: Self = StObject.set(x, "buildConnectionInfo", js.undefined)
    
    @scala.inline
    def setCancelConnect(value: String => Thenable[Boolean]): Self = StObject.set(x, "cancelConnect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeDatabase(value: (String, String) => Thenable[Boolean]): Self = StObject.set(x, "changeDatabase", js.Any.fromFunction2(value))
    
    @scala.inline
    def setConnect(value: (String, ConnectionInfo) => Thenable[Boolean]): Self = StObject.set(x, "connect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDisconnect(value: String => Thenable[Boolean]): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetConnectionString(value: (String, Boolean) => Thenable[String]): Self = StObject.set(x, "getConnectionString", js.Any.fromFunction2(value))
    
    @scala.inline
    def setListDatabases(value: String => Thenable[ListDatabasesResult]): Self = StObject.set(x, "listDatabases", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRebuildIntelliSenseCache(value: String => Thenable[Unit]): Self = StObject.set(x, "rebuildIntelliSenseCache", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterOnConnectionChanged(value: js.Function1[/* changedConnInfo */ ChangedConnectionInfo, _] => Unit): Self = StObject.set(x, "registerOnConnectionChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterOnConnectionComplete(value: js.Function1[/* connSummary */ ConnectionInfoSummary, _] => Unit): Self = StObject.set(x, "registerOnConnectionComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterOnIntelliSenseCacheComplete(value: js.Function1[/* connectionUri */ String, _] => Unit): Self = StObject.set(x, "registerOnIntelliSenseCacheComplete", js.Any.fromFunction1(value))
  }
}
