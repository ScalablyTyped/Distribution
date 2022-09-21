package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionDetails extends StObject {
  
  /**
    *  The allowed IP addresses. 
    */
  var AllowedIps: js.UndefOr[CIDRList] = js.undefined
  
  /**
    *  The public key of the client. 
    */
  var ClientPublicKey: js.UndefOr[WireGuardPublicKey] = js.undefined
  
  /**
    *  The client tunnel address. 
    */
  var ClientTunnelAddress: js.UndefOr[CIDR] = js.undefined
  
  /**
    *  The endpoint for the server. 
    */
  var ServerEndpoint: js.UndefOr[typings.awsSdk.outpostsMod.ServerEndpoint] = js.undefined
  
  /**
    *  The public key of the server. 
    */
  var ServerPublicKey: js.UndefOr[WireGuardPublicKey] = js.undefined
  
  /**
    *  The server tunnel address. 
    */
  var ServerTunnelAddress: js.UndefOr[CIDR] = js.undefined
}
object ConnectionDetails {
  
  inline def apply(): ConnectionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionDetails]
  }
  
  extension [Self <: ConnectionDetails](x: Self) {
    
    inline def setAllowedIps(value: CIDRList): Self = StObject.set(x, "AllowedIps", value.asInstanceOf[js.Any])
    
    inline def setAllowedIpsUndefined: Self = StObject.set(x, "AllowedIps", js.undefined)
    
    inline def setAllowedIpsVarargs(value: CIDR*): Self = StObject.set(x, "AllowedIps", js.Array(value*))
    
    inline def setClientPublicKey(value: WireGuardPublicKey): Self = StObject.set(x, "ClientPublicKey", value.asInstanceOf[js.Any])
    
    inline def setClientPublicKeyUndefined: Self = StObject.set(x, "ClientPublicKey", js.undefined)
    
    inline def setClientTunnelAddress(value: CIDR): Self = StObject.set(x, "ClientTunnelAddress", value.asInstanceOf[js.Any])
    
    inline def setClientTunnelAddressUndefined: Self = StObject.set(x, "ClientTunnelAddress", js.undefined)
    
    inline def setServerEndpoint(value: ServerEndpoint): Self = StObject.set(x, "ServerEndpoint", value.asInstanceOf[js.Any])
    
    inline def setServerEndpointUndefined: Self = StObject.set(x, "ServerEndpoint", js.undefined)
    
    inline def setServerPublicKey(value: WireGuardPublicKey): Self = StObject.set(x, "ServerPublicKey", value.asInstanceOf[js.Any])
    
    inline def setServerPublicKeyUndefined: Self = StObject.set(x, "ServerPublicKey", js.undefined)
    
    inline def setServerTunnelAddress(value: CIDR): Self = StObject.set(x, "ServerTunnelAddress", value.asInstanceOf[js.Any])
    
    inline def setServerTunnelAddressUndefined: Self = StObject.set(x, "ServerTunnelAddress", js.undefined)
  }
}
