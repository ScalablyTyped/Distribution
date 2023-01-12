package typings.azdata.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionProvider
  extends StObject
     with DataProvider {
  
  var buildConnectionInfo: js.UndefOr[js.Function1[/* connectionString */ String, Thenable[ConnectionInfo]]] = js.undefined
  
  def cancelConnect(connectionUri: String): Thenable[Boolean]
  
  def changeDatabase(connectionUri: String, newDatabase: String): Thenable[Boolean]
  
  def connect(connectionUri: String, connectionInfo: ConnectionInfo): Thenable[Boolean]
  
  def disconnect(connectionUri: String): Thenable[Boolean]
  
  def getConnectionString(connectionUri: String, includePassword: Boolean): Thenable[String]
  
  def listDatabases(connectionUri: String): Thenable[ListDatabasesResult]
  
  def rebuildIntelliSenseCache(connectionUri: String): Thenable[Unit]
  
  /**
    * Registers a handler for ConnectionChanged events.
    *
    * **WARNING** This should only ever be called by the extension creating the provider. Any other extensions calling this
    * will overwrite the handler registered by the provider extension which will likely break this functionality.
    */
  def registerOnConnectionChanged(handler: js.Function1[/* changedConnInfo */ ChangedConnectionInfo, Any]): Unit
  
  /**
    * Registers a handler for ConnectionComplete events.
    *
    * **WARNING** This should only ever be called by the extension creating the provider. Any other extensions calling this
    * will overwrite the handler registered by the provider extension which will likely break this functionality.
    */
  def registerOnConnectionComplete(handler: js.Function1[/* connSummary */ ConnectionInfoSummary, Any]): Unit
  
  /**
    * Registers a handler for IntellisenseCacheComplete events.
    *
    * **WARNING** This should only ever be called by the extension creating the provider. Any other extensions calling this
    * will overwrite the handler registered by the provider extension which will likely break this functionality.
    */
  def registerOnIntelliSenseCacheComplete(handler: js.Function1[/* connectionUri */ String, Any]): Unit
}
object ConnectionProvider {
  
  inline def apply(
    cancelConnect: String => Thenable[Boolean],
    changeDatabase: (String, String) => Thenable[Boolean],
    connect: (String, ConnectionInfo) => Thenable[Boolean],
    disconnect: String => Thenable[Boolean],
    getConnectionString: (String, Boolean) => Thenable[String],
    listDatabases: String => Thenable[ListDatabasesResult],
    providerId: String,
    rebuildIntelliSenseCache: String => Thenable[Unit],
    registerOnConnectionChanged: js.Function1[/* changedConnInfo */ ChangedConnectionInfo, Any] => Unit,
    registerOnConnectionComplete: js.Function1[/* connSummary */ ConnectionInfoSummary, Any] => Unit,
    registerOnIntelliSenseCacheComplete: js.Function1[/* connectionUri */ String, Any] => Unit
  ): ConnectionProvider = {
    val __obj = js.Dynamic.literal(cancelConnect = js.Any.fromFunction1(cancelConnect), changeDatabase = js.Any.fromFunction2(changeDatabase), connect = js.Any.fromFunction2(connect), disconnect = js.Any.fromFunction1(disconnect), getConnectionString = js.Any.fromFunction2(getConnectionString), listDatabases = js.Any.fromFunction1(listDatabases), providerId = providerId.asInstanceOf[js.Any], rebuildIntelliSenseCache = js.Any.fromFunction1(rebuildIntelliSenseCache), registerOnConnectionChanged = js.Any.fromFunction1(registerOnConnectionChanged), registerOnConnectionComplete = js.Any.fromFunction1(registerOnConnectionComplete), registerOnIntelliSenseCacheComplete = js.Any.fromFunction1(registerOnIntelliSenseCacheComplete))
    __obj.asInstanceOf[ConnectionProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionProvider] (val x: Self) extends AnyVal {
    
    inline def setBuildConnectionInfo(value: /* connectionString */ String => Thenable[ConnectionInfo]): Self = StObject.set(x, "buildConnectionInfo", js.Any.fromFunction1(value))
    
    inline def setBuildConnectionInfoUndefined: Self = StObject.set(x, "buildConnectionInfo", js.undefined)
    
    inline def setCancelConnect(value: String => Thenable[Boolean]): Self = StObject.set(x, "cancelConnect", js.Any.fromFunction1(value))
    
    inline def setChangeDatabase(value: (String, String) => Thenable[Boolean]): Self = StObject.set(x, "changeDatabase", js.Any.fromFunction2(value))
    
    inline def setConnect(value: (String, ConnectionInfo) => Thenable[Boolean]): Self = StObject.set(x, "connect", js.Any.fromFunction2(value))
    
    inline def setDisconnect(value: String => Thenable[Boolean]): Self = StObject.set(x, "disconnect", js.Any.fromFunction1(value))
    
    inline def setGetConnectionString(value: (String, Boolean) => Thenable[String]): Self = StObject.set(x, "getConnectionString", js.Any.fromFunction2(value))
    
    inline def setListDatabases(value: String => Thenable[ListDatabasesResult]): Self = StObject.set(x, "listDatabases", js.Any.fromFunction1(value))
    
    inline def setRebuildIntelliSenseCache(value: String => Thenable[Unit]): Self = StObject.set(x, "rebuildIntelliSenseCache", js.Any.fromFunction1(value))
    
    inline def setRegisterOnConnectionChanged(value: js.Function1[/* changedConnInfo */ ChangedConnectionInfo, Any] => Unit): Self = StObject.set(x, "registerOnConnectionChanged", js.Any.fromFunction1(value))
    
    inline def setRegisterOnConnectionComplete(value: js.Function1[/* connSummary */ ConnectionInfoSummary, Any] => Unit): Self = StObject.set(x, "registerOnConnectionComplete", js.Any.fromFunction1(value))
    
    inline def setRegisterOnIntelliSenseCacheComplete(value: js.Function1[/* connectionUri */ String, Any] => Unit): Self = StObject.set(x, "registerOnIntelliSenseCacheComplete", js.Any.fromFunction1(value))
  }
}
