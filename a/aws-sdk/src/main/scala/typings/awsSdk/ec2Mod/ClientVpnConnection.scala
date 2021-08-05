package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientVpnConnection extends StObject {
  
  /**
    * The IP address of the client.
    */
  var ClientIp: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Client VPN endpoint to which the client is connected.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.undefined
  
  /**
    * The common name associated with the client. This is either the name of the client certificate, or the Active Directory user name.
    */
  var CommonName: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time the client connection was terminated.
    */
  var ConnectionEndTime: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time the client connection was established.
    */
  var ConnectionEstablishedTime: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the client connection.
    */
  var ConnectionId: js.UndefOr[String] = js.undefined
  
  /**
    * The number of bytes received by the client.
    */
  var EgressBytes: js.UndefOr[String] = js.undefined
  
  /**
    * The number of packets received by the client.
    */
  var EgressPackets: js.UndefOr[String] = js.undefined
  
  /**
    * The number of bytes sent by the client.
    */
  var IngressBytes: js.UndefOr[String] = js.undefined
  
  /**
    * The number of packets sent by the client.
    */
  var IngressPackets: js.UndefOr[String] = js.undefined
  
  /**
    * The statuses returned by the client connect handler for posture compliance, if applicable.
    */
  var PostureComplianceStatuses: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The current state of the client connection.
    */
  var Status: js.UndefOr[ClientVpnConnectionStatus] = js.undefined
  
  /**
    * The current date and time.
    */
  var Timestamp: js.UndefOr[String] = js.undefined
  
  /**
    * The username of the client who established the client connection. This information is only provided if Active Directory client authentication is used.
    */
  var Username: js.UndefOr[String] = js.undefined
}
object ClientVpnConnection {
  
  inline def apply(): ClientVpnConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientVpnConnection]
  }
  
  extension [Self <: ClientVpnConnection](x: Self) {
    
    inline def setClientIp(value: String): Self = StObject.set(x, "ClientIp", value.asInstanceOf[js.Any])
    
    inline def setClientIpUndefined: Self = StObject.set(x, "ClientIp", js.undefined)
    
    inline def setClientVpnEndpointId(value: String): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    inline def setClientVpnEndpointIdUndefined: Self = StObject.set(x, "ClientVpnEndpointId", js.undefined)
    
    inline def setCommonName(value: String): Self = StObject.set(x, "CommonName", value.asInstanceOf[js.Any])
    
    inline def setCommonNameUndefined: Self = StObject.set(x, "CommonName", js.undefined)
    
    inline def setConnectionEndTime(value: String): Self = StObject.set(x, "ConnectionEndTime", value.asInstanceOf[js.Any])
    
    inline def setConnectionEndTimeUndefined: Self = StObject.set(x, "ConnectionEndTime", js.undefined)
    
    inline def setConnectionEstablishedTime(value: String): Self = StObject.set(x, "ConnectionEstablishedTime", value.asInstanceOf[js.Any])
    
    inline def setConnectionEstablishedTimeUndefined: Self = StObject.set(x, "ConnectionEstablishedTime", js.undefined)
    
    inline def setConnectionId(value: String): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "ConnectionId", js.undefined)
    
    inline def setEgressBytes(value: String): Self = StObject.set(x, "EgressBytes", value.asInstanceOf[js.Any])
    
    inline def setEgressBytesUndefined: Self = StObject.set(x, "EgressBytes", js.undefined)
    
    inline def setEgressPackets(value: String): Self = StObject.set(x, "EgressPackets", value.asInstanceOf[js.Any])
    
    inline def setEgressPacketsUndefined: Self = StObject.set(x, "EgressPackets", js.undefined)
    
    inline def setIngressBytes(value: String): Self = StObject.set(x, "IngressBytes", value.asInstanceOf[js.Any])
    
    inline def setIngressBytesUndefined: Self = StObject.set(x, "IngressBytes", js.undefined)
    
    inline def setIngressPackets(value: String): Self = StObject.set(x, "IngressPackets", value.asInstanceOf[js.Any])
    
    inline def setIngressPacketsUndefined: Self = StObject.set(x, "IngressPackets", js.undefined)
    
    inline def setPostureComplianceStatuses(value: ValueStringList): Self = StObject.set(x, "PostureComplianceStatuses", value.asInstanceOf[js.Any])
    
    inline def setPostureComplianceStatusesUndefined: Self = StObject.set(x, "PostureComplianceStatuses", js.undefined)
    
    inline def setPostureComplianceStatusesVarargs(value: String*): Self = StObject.set(x, "PostureComplianceStatuses", js.Array(value :_*))
    
    inline def setStatus(value: ClientVpnConnectionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
