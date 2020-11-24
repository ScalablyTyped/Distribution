package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminateClientVpnConnectionsResult extends js.Object {
  
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.native
  
  /**
    * The current state of the client connections.
    */
  var ConnectionStatuses: js.UndefOr[TerminateConnectionStatusSet] = js.native
  
  /**
    * The user who established the terminated client connections.
    */
  var Username: js.UndefOr[String] = js.native
}
object TerminateClientVpnConnectionsResult {
  
  @scala.inline
  def apply(): TerminateClientVpnConnectionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateClientVpnConnectionsResult]
  }
  
  @scala.inline
  implicit class TerminateClientVpnConnectionsResultOps[Self <: TerminateClientVpnConnectionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientVpnEndpointId(value: String): Self = this.set("ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientVpnEndpointId: Self = this.set("ClientVpnEndpointId", js.undefined)
    
    @scala.inline
    def setConnectionStatusesVarargs(value: TerminateConnectionStatus*): Self = this.set("ConnectionStatuses", js.Array(value :_*))
    
    @scala.inline
    def setConnectionStatuses(value: TerminateConnectionStatusSet): Self = this.set("ConnectionStatuses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionStatuses: Self = this.set("ConnectionStatuses", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = this.set("Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsername: Self = this.set("Username", js.undefined)
  }
}
