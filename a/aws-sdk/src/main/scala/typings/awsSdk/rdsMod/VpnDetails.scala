package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VpnDetails extends StObject {
  
  /**
    * The IP address of network traffic from AWS to your on-premises data center.
    */
  var VpnGatewayIp: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the VPN.
    */
  var VpnId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the VPN.
    */
  var VpnName: js.UndefOr[String] = js.undefined
  
  /**
    * The preshared key (PSK) for the VPN.
    */
  var VpnPSK: js.UndefOr[StringSensitive] = js.undefined
  
  /**
    * The state of the VPN.
    */
  var VpnState: js.UndefOr[String] = js.undefined
  
  /**
    * The IP address of network traffic from your on-premises data center. A custom AZ receives the network traffic.
    */
  var VpnTunnelOriginatorIP: js.UndefOr[String] = js.undefined
}
object VpnDetails {
  
  inline def apply(): VpnDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpnDetails]
  }
  
  extension [Self <: VpnDetails](x: Self) {
    
    inline def setVpnGatewayIp(value: String): Self = StObject.set(x, "VpnGatewayIp", value.asInstanceOf[js.Any])
    
    inline def setVpnGatewayIpUndefined: Self = StObject.set(x, "VpnGatewayIp", js.undefined)
    
    inline def setVpnId(value: String): Self = StObject.set(x, "VpnId", value.asInstanceOf[js.Any])
    
    inline def setVpnIdUndefined: Self = StObject.set(x, "VpnId", js.undefined)
    
    inline def setVpnName(value: String): Self = StObject.set(x, "VpnName", value.asInstanceOf[js.Any])
    
    inline def setVpnNameUndefined: Self = StObject.set(x, "VpnName", js.undefined)
    
    inline def setVpnPSK(value: StringSensitive): Self = StObject.set(x, "VpnPSK", value.asInstanceOf[js.Any])
    
    inline def setVpnPSKUndefined: Self = StObject.set(x, "VpnPSK", js.undefined)
    
    inline def setVpnState(value: String): Self = StObject.set(x, "VpnState", value.asInstanceOf[js.Any])
    
    inline def setVpnStateUndefined: Self = StObject.set(x, "VpnState", js.undefined)
    
    inline def setVpnTunnelOriginatorIP(value: String): Self = StObject.set(x, "VpnTunnelOriginatorIP", value.asInstanceOf[js.Any])
    
    inline def setVpnTunnelOriginatorIPUndefined: Self = StObject.set(x, "VpnTunnelOriginatorIP", js.undefined)
  }
}
