package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionInfoSummary extends StObject {
  
  /**
    * Connection id returned from service host, if the connection was successful.
    */
  var connectionId: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the actual connection established, if the connection was successful.
    */
  var connectionSummary: js.UndefOr[ConnectionSummary] = js.undefined
  
  /**
    * Error message returned from the engine or service host, if an error occurred.
    */
  var errorMessage: js.UndefOr[String] = js.undefined
  
  /**
    * Error number returned from the engine or server host, if an error occurred.
    */
  var errorNumber: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the server version is supported by the provider. Default is to assume true. If the value is false, Azure Data Studio
    * will show a warning message.
    */
  var isSupportedVersion: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Additional optional detailed error messages from the engine or service host, if an error occurred.
    */
  var messages: js.UndefOr[String] = js.undefined
  
  /**
    * URI identifying the owner of the connection
    */
  var ownerUri: String
  
  /**
    * Information about the connected server, if the connection was successful.
    */
  var serverInfo: js.UndefOr[ServerInfo] = js.undefined
  
  /**
    * Additional optional message with details about why the version isn't supported. This will be appended to the warning message Azure Data Studio
    * displays about unsupported versions.
    */
  var unsupportedVersionMessage: js.UndefOr[String] = js.undefined
}
object ConnectionInfoSummary {
  
  inline def apply(ownerUri: String): ConnectionInfoSummary = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionInfoSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConnectionInfoSummary] (val x: Self) extends AnyVal {
    
    inline def setConnectionId(value: String): Self = StObject.set(x, "connectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "connectionId", js.undefined)
    
    inline def setConnectionSummary(value: ConnectionSummary): Self = StObject.set(x, "connectionSummary", value.asInstanceOf[js.Any])
    
    inline def setConnectionSummaryUndefined: Self = StObject.set(x, "connectionSummary", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setErrorNumber(value: Double): Self = StObject.set(x, "errorNumber", value.asInstanceOf[js.Any])
    
    inline def setErrorNumberUndefined: Self = StObject.set(x, "errorNumber", js.undefined)
    
    inline def setIsSupportedVersion(value: Boolean): Self = StObject.set(x, "isSupportedVersion", value.asInstanceOf[js.Any])
    
    inline def setIsSupportedVersionUndefined: Self = StObject.set(x, "isSupportedVersion", js.undefined)
    
    inline def setMessages(value: String): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setOwnerUri(value: String): Self = StObject.set(x, "ownerUri", value.asInstanceOf[js.Any])
    
    inline def setServerInfo(value: ServerInfo): Self = StObject.set(x, "serverInfo", value.asInstanceOf[js.Any])
    
    inline def setServerInfoUndefined: Self = StObject.set(x, "serverInfo", js.undefined)
    
    inline def setUnsupportedVersionMessage(value: String): Self = StObject.set(x, "unsupportedVersionMessage", value.asInstanceOf[js.Any])
    
    inline def setUnsupportedVersionMessageUndefined: Self = StObject.set(x, "unsupportedVersionMessage", js.undefined)
  }
}
