package typings.cometd.mod

import typings.cometd.cometdBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuccessfulHandshakeMessage
  extends BaseMessage
     with HandshakeMessage {
  
  var authSuccessful: js.UndefOr[`true`] = js.native
  
  @JSName("clientId")
  var clientId_SuccessfulHandshakeMessage: String = js.native
  
  var reestablish: Boolean = js.native
  
  @JSName("successful")
  var successful_SuccessfulHandshakeMessage: `true` = js.native
  
  var supportedConnectionTypes: js.Array[ConnectionType] = js.native
  
  @JSName("version")
  var version_SuccessfulHandshakeMessage: String = js.native
}
object SuccessfulHandshakeMessage {
  
  @scala.inline
  def apply(
    channel: String,
    clientId: String,
    reestablish: Boolean,
    successful: `true`,
    supportedConnectionTypes: js.Array[ConnectionType],
    version: String
  ): SuccessfulHandshakeMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], reestablish = reestablish.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any], supportedConnectionTypes = supportedConnectionTypes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessfulHandshakeMessage]
  }
  
  @scala.inline
  implicit class SuccessfulHandshakeMessageOps[Self <: SuccessfulHandshakeMessage] (val x: Self) extends AnyVal {
    
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReestablish(value: Boolean): Self = this.set("reestablish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessful(value: `true`): Self = this.set("successful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedConnectionTypesVarargs(value: ConnectionType*): Self = this.set("supportedConnectionTypes", js.Array(value :_*))
    
    @scala.inline
    def setSupportedConnectionTypes(value: js.Array[ConnectionType]): Self = this.set("supportedConnectionTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthSuccessful(value: `true`): Self = this.set("authSuccessful", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthSuccessful: Self = this.set("authSuccessful", js.undefined)
  }
}
