package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateClientVpnConnectionsResult extends StObject {
  
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the client connections.
    */
  var ConnectionStatuses: js.UndefOr[TerminateConnectionStatusSet] = js.undefined
  
  /**
    * The user who established the terminated client connections.
    */
  var Username: js.UndefOr[String] = js.undefined
}
object TerminateClientVpnConnectionsResult {
  
  inline def apply(): TerminateClientVpnConnectionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateClientVpnConnectionsResult]
  }
  
  extension [Self <: TerminateClientVpnConnectionsResult](x: Self) {
    
    inline def setClientVpnEndpointId(value: String): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    inline def setClientVpnEndpointIdUndefined: Self = StObject.set(x, "ClientVpnEndpointId", js.undefined)
    
    inline def setConnectionStatuses(value: TerminateConnectionStatusSet): Self = StObject.set(x, "ConnectionStatuses", value.asInstanceOf[js.Any])
    
    inline def setConnectionStatusesUndefined: Self = StObject.set(x, "ConnectionStatuses", js.undefined)
    
    inline def setConnectionStatusesVarargs(value: TerminateConnectionStatus*): Self = StObject.set(x, "ConnectionStatuses", js.Array(value :_*))
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
