package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientVpnEndpointStatus extends StObject {
  
  /**
    * The state of the Client VPN endpoint. Possible states include:    pending-associate - The Client VPN endpoint has been created but no target networks have been associated. The Client VPN endpoint cannot accept connections.    available - The Client VPN endpoint has been created and a target network has been associated. The Client VPN endpoint can accept connections.    deleting - The Client VPN endpoint is being deleted. The Client VPN endpoint cannot accept connections.    deleted - The Client VPN endpoint has been deleted. The Client VPN endpoint cannot accept connections.  
    */
  var Code: js.UndefOr[ClientVpnEndpointStatusCode] = js.native
  
  /**
    * A message about the status of the Client VPN endpoint.
    */
  var Message: js.UndefOr[String] = js.native
}
object ClientVpnEndpointStatus {
  
  @scala.inline
  def apply(): ClientVpnEndpointStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnEndpointStatus]
  }
  
  @scala.inline
  implicit class ClientVpnEndpointStatusMutableBuilder[Self <: ClientVpnEndpointStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: ClientVpnEndpointStatusCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
