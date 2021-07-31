package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionInfoSummary extends StObject {
  
  /**
    * connection id returned from service host.
    */
  var connectionId: String
  
  /**
    * information about the actual connection established
    */
  var connectionSummary: ConnectionSummary
  
  /**
    * Error message returned from the engine, if any.
    */
  var errorMessage: String
  
  /**
    * Error number returned from the engine, if any.
    */
  var errorNumber: Double
  
  /**
    * any diagnostic messages return from the service host.
    */
  var messages: String
  
  /**
    * URI identifying the owner of the connection
    */
  var ownerUri: String
  
  /**
    * Information about the connected server.
    */
  var serverInfo: ServerInfo
}
object ConnectionInfoSummary {
  
  @scala.inline
  def apply(
    connectionId: String,
    connectionSummary: ConnectionSummary,
    errorMessage: String,
    errorNumber: Double,
    messages: String,
    ownerUri: String,
    serverInfo: ServerInfo
  ): ConnectionInfoSummary = {
    val __obj = js.Dynamic.literal(connectionId = connectionId.asInstanceOf[js.Any], connectionSummary = connectionSummary.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], errorNumber = errorNumber.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], serverInfo = serverInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInfoSummary]
  }
  
  @scala.inline
  implicit class ConnectionInfoSummaryMutableBuilder[Self <: ConnectionInfoSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionSummary(value: ConnectionSummary): Self = StObject.set(x, "connectionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNumber(value: Double): Self = StObject.set(x, "errorNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessages(value: String): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerInfo(value: ServerInfo): Self = StObject.set(x, "serverInfo", value.asInstanceOf[js.Any])
  }
}
