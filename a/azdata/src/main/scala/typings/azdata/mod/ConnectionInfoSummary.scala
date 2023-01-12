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
    * Indicates whether the server version is supported by ADS. The default value is true. If the value is false, ADS will show a warning message.
    */
  var isSupportedVersion: js.UndefOr[Boolean] = js.undefined
  
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
  
  /**
    * The messages that will be appended to the Azure Data Studio's warning message about unsupported versions.
    */
  var unsupportedVersionMessage: js.UndefOr[String] = js.undefined
}
object ConnectionInfoSummary {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: ConnectionInfoSummary] (val x: Self) extends AnyVal {
    
    inline def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionSummary(value: ConnectionSummary): Self = StObject.set(x, "connectionSummary", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorNumber(value: Double): Self = StObject.set(x, "errorNumber", value.asInstanceOf[js.Any])
    
    inline def setIsSupportedVersion(value: Boolean): Self = StObject.set(x, "isSupportedVersion", value.asInstanceOf[js.Any])
    
    inline def setIsSupportedVersionUndefined: Self = StObject.set(x, "isSupportedVersion", js.undefined)
    
    inline def setMessages(value: String): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
    
    inline def setServerInfo(value: ServerInfo): Self = StObject.set(x, "serverInfo", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedVersionMessage(value: String): Self = StObject.set(x, "unsupportedVersionMessage", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedVersionMessageUndefined: Self = StObject.set(x, "unsupportedVersionMessage", js.undefined)
  }
}
