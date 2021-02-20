package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connection {
  
  @JSImport("azdata", "connection.ConnectionProfile")
  @js.native
  class ConnectionProfile () extends StObject {
    
    var authenticationType: String = js.native
    
    var azureTenantId: js.UndefOr[String] = js.native
    
    var connectionId: String = js.native
    
    var connectionName: String = js.native
    
    var databaseName: String = js.native
    
    var groupFullName: String = js.native
    
    var groupId: String = js.native
    
    var options: StringDictionary[js.Any] = js.native
    
    var password: String = js.native
    
    var providerId: String = js.native
    
    var savePassword: Boolean = js.native
    
    var saveProfile: Boolean = js.native
    
    var serverName: String = js.native
    
    var userName: String = js.native
  }
  /* static members */
  object ConnectionProfile {
    
    @JSImport("azdata", "connection.ConnectionProfile.createFrom")
    @js.native
    def createFrom(options: StringDictionary[js.Any]): ConnectionProfile = js.native
  }
  
  @JSImport("azdata", "connection.connect")
  @js.native
  def connect(connectionProfile: IConnectionProfile): Thenable[ConnectionResult] = js.native
  @JSImport("azdata", "connection.connect")
  @js.native
  def connect(
    connectionProfile: IConnectionProfile,
    saveConnection: js.UndefOr[scala.Nothing],
    showDashboard: Boolean
  ): Thenable[ConnectionResult] = js.native
  @JSImport("azdata", "connection.connect")
  @js.native
  def connect(connectionProfile: IConnectionProfile, saveConnection: Boolean): Thenable[ConnectionResult] = js.native
  @JSImport("azdata", "connection.connect")
  @js.native
  def connect(connectionProfile: IConnectionProfile, saveConnection: Boolean, showDashboard: Boolean): Thenable[ConnectionResult] = js.native
  
  @JSImport("azdata", "connection.getActiveConnections")
  @js.native
  def getActiveConnections(): Thenable[js.Array[Connection]] = js.native
  
  @JSImport("azdata", "connection.getConnectionString")
  @js.native
  def getConnectionString(connectionId: String, includePassword: Boolean): Thenable[String] = js.native
  
  @JSImport("azdata", "connection.getConnections")
  @js.native
  def getConnections(): Thenable[js.Array[ConnectionProfile]] = js.native
  @JSImport("azdata", "connection.getConnections")
  @js.native
  def getConnections(activeConnectionsOnly: Boolean): Thenable[js.Array[ConnectionProfile]] = js.native
  
  @JSImport("azdata", "connection.getCredentials")
  @js.native
  def getCredentials(connectionId: String): Thenable[StringDictionary[String]] = js.native
  
  @JSImport("azdata", "connection.getCurrentConnection")
  @js.native
  def getCurrentConnection(): Thenable[ConnectionProfile] = js.native
  
  @JSImport("azdata", "connection.getServerInfo")
  @js.native
  def getServerInfo(connectionId: String): Thenable[ServerInfo] = js.native
  
  @JSImport("azdata", "connection.getUriForConnection")
  @js.native
  def getUriForConnection(connectionId: String): Thenable[String] = js.native
  
  @JSImport("azdata", "connection.listDatabases")
  @js.native
  def listDatabases(connectionId: String): Thenable[js.Array[String]] = js.native
  
  @JSImport("azdata", "connection.openConnectionDialog")
  @js.native
  def openConnectionDialog(): Thenable[Connection] = js.native
  @JSImport("azdata", "connection.openConnectionDialog")
  @js.native
  def openConnectionDialog(
    providers: js.UndefOr[scala.Nothing],
    initialConnectionProfile: js.UndefOr[scala.Nothing],
    connectionCompletionOptions: IConnectionCompletionOptions
  ): Thenable[Connection] = js.native
  @JSImport("azdata", "connection.openConnectionDialog")
  @js.native
  def openConnectionDialog(providers: js.UndefOr[scala.Nothing], initialConnectionProfile: IConnectionProfile): Thenable[Connection] = js.native
  @JSImport("azdata", "connection.openConnectionDialog")
  @js.native
  def openConnectionDialog(
    providers: js.UndefOr[scala.Nothing],
    initialConnectionProfile: IConnectionProfile,
    connectionCompletionOptions: IConnectionCompletionOptions
  ): Thenable[Connection] = js.native
  @JSImport("azdata", "connection.openConnectionDialog")
  @js.native
  def openConnectionDialog(providers: js.Array[String]): Thenable[Connection] = js.native
  @JSImport("azdata", "connection.openConnectionDialog")
  @js.native
  def openConnectionDialog(
    providers: js.Array[String],
    initialConnectionProfile: js.UndefOr[scala.Nothing],
    connectionCompletionOptions: IConnectionCompletionOptions
  ): Thenable[Connection] = js.native
  @JSImport("azdata", "connection.openConnectionDialog")
  @js.native
  def openConnectionDialog(providers: js.Array[String], initialConnectionProfile: IConnectionProfile): Thenable[Connection] = js.native
  @JSImport("azdata", "connection.openConnectionDialog")
  @js.native
  def openConnectionDialog(
    providers: js.Array[String],
    initialConnectionProfile: IConnectionProfile,
    connectionCompletionOptions: IConnectionCompletionOptions
  ): Thenable[Connection] = js.native
  
  @js.native
  trait Connection extends ConnectionInfo {
    
    /**
      * A unique identifier for the connection
      */
    var connectionId: String = js.native
    
    /**
      * The name of the provider managing the connection (e.g. MSSQL)
      */
    var providerName: String = js.native
  }
  object Connection {
    
    @scala.inline
    def apply(connectionId: String, options: StringDictionary[js.Any], providerName: String): Connection = {
      val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    @scala.inline
    implicit class ConnectionMutableBuilder[Self <: Connection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
    }
  }
}
