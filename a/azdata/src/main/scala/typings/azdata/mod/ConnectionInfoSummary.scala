package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionInfoSummary extends js.Object {
  
  /**
    * connection id returned from service host.
    */
  var connectionId: String = js.native
  
  /**
    * information about the actual connection established
    */
  var connectionSummary: ConnectionSummary = js.native
  
  /**
    * Error message returned from the engine, if any.
    */
  var errorMessage: String = js.native
  
  /**
    * Error number returned from the engine, if any.
    */
  var errorNumber: Double = js.native
  
  /**
    * any diagnostic messages return from the service host.
    */
  var messages: String = js.native
  
  /**
    * URI identifying the owner of the connection
    */
  var ownerUri: String = js.native
  
  /**
    * Information about the connected server.
    */
  var serverInfo: ServerInfo = js.native
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
  implicit class ConnectionInfoSummaryOps[Self <: ConnectionInfoSummary] (val x: Self) extends AnyVal {
    
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
    def setConnectionId(value: String): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionSummary(value: ConnectionSummary): Self = this.set("connectionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorNumber(value: Double): Self = this.set("errorNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessages(value: String): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerUri(value: String): Self = this.set("ownerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerInfo(value: ServerInfo): Self = this.set("serverInfo", value.asInstanceOf[js.Any])
  }
}
