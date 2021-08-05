package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateClientVpnEndpointResult extends StObject {
  
  /**
    * The ID of the Client VPN endpoint.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.undefined
  
  /**
    * The DNS name to be used by clients when establishing their VPN session.
    */
  var DnsName: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the Client VPN endpoint.
    */
  var Status: js.UndefOr[ClientVpnEndpointStatus] = js.undefined
}
object CreateClientVpnEndpointResult {
  
  inline def apply(): CreateClientVpnEndpointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClientVpnEndpointResult]
  }
  
  extension [Self <: CreateClientVpnEndpointResult](x: Self) {
    
    inline def setClientVpnEndpointId(value: String): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    inline def setClientVpnEndpointIdUndefined: Self = StObject.set(x, "ClientVpnEndpointId", js.undefined)
    
    inline def setDnsName(value: String): Self = StObject.set(x, "DnsName", value.asInstanceOf[js.Any])
    
    inline def setDnsNameUndefined: Self = StObject.set(x, "DnsName", js.undefined)
    
    inline def setStatus(value: ClientVpnEndpointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
