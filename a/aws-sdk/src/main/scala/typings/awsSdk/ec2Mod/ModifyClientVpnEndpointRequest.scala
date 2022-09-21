package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyClientVpnEndpointRequest extends StObject {
  
  /**
    * The options for managing connection authorization for new client connections.
    */
  var ClientConnectOptions: js.UndefOr[typings.awsSdk.ec2Mod.ClientConnectOptions] = js.undefined
  
  /**
    * Options for enabling a customizable text banner that will be displayed on Amazon Web Services provided clients when a VPN session is established.
    */
  var ClientLoginBannerOptions: js.UndefOr[typings.awsSdk.ec2Mod.ClientLoginBannerOptions] = js.undefined
  
  /**
    * The ID of the Client VPN endpoint to modify.
    */
  var ClientVpnEndpointId: typings.awsSdk.ec2Mod.ClientVpnEndpointId
  
  /**
    * Information about the client connection logging options. If you enable client connection logging, data about client connections is sent to a Cloudwatch Logs log stream. The following information is logged:   Client connection requests   Client connection results (successful and unsuccessful)   Reasons for unsuccessful client connection requests   Client connection termination time  
    */
  var ConnectionLogOptions: js.UndefOr[typings.awsSdk.ec2Mod.ConnectionLogOptions] = js.undefined
  
  /**
    * A brief description of the Client VPN endpoint.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the DNS servers to be used by Client VPN connections. A Client VPN endpoint can have up to two DNS servers.
    */
  var DnsServers: js.UndefOr[DnsServersOptionsModifyStructure] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of one or more security groups to apply to the target network.
    */
  var SecurityGroupIds: js.UndefOr[ClientVpnSecurityGroupIdSet] = js.undefined
  
  /**
    * Specify whether to enable the self-service portal for the Client VPN endpoint.
    */
  var SelfServicePortal: js.UndefOr[typings.awsSdk.ec2Mod.SelfServicePortal] = js.undefined
  
  /**
    * The ARN of the server certificate to be used. The server certificate must be provisioned in Certificate Manager (ACM).
    */
  var ServerCertificateArn: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum VPN session duration time in hours. Valid values: 8 | 10 | 12 | 24  Default value: 24 
    */
  var SessionTimeoutHours: js.UndefOr[Integer] = js.undefined
  
  /**
    * Indicates whether the VPN is split-tunnel. For information about split-tunnel VPN endpoints, see Split-tunnel Client VPN endpoint in the Client VPN Administrator Guide.
    */
  var SplitTunnel: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the VPC to associate with the Client VPN endpoint.
    */
  var VpcId: js.UndefOr[typings.awsSdk.ec2Mod.VpcId] = js.undefined
  
  /**
    * The port number to assign to the Client VPN endpoint for TCP and UDP traffic. Valid Values: 443 | 1194  Default Value: 443 
    */
  var VpnPort: js.UndefOr[Integer] = js.undefined
}
object ModifyClientVpnEndpointRequest {
  
  inline def apply(ClientVpnEndpointId: ClientVpnEndpointId): ModifyClientVpnEndpointRequest = {
    val __obj = js.Dynamic.literal(ClientVpnEndpointId = ClientVpnEndpointId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClientVpnEndpointRequest]
  }
  
  extension [Self <: ModifyClientVpnEndpointRequest](x: Self) {
    
    inline def setClientConnectOptions(value: ClientConnectOptions): Self = StObject.set(x, "ClientConnectOptions", value.asInstanceOf[js.Any])
    
    inline def setClientConnectOptionsUndefined: Self = StObject.set(x, "ClientConnectOptions", js.undefined)
    
    inline def setClientLoginBannerOptions(value: ClientLoginBannerOptions): Self = StObject.set(x, "ClientLoginBannerOptions", value.asInstanceOf[js.Any])
    
    inline def setClientLoginBannerOptionsUndefined: Self = StObject.set(x, "ClientLoginBannerOptions", js.undefined)
    
    inline def setClientVpnEndpointId(value: ClientVpnEndpointId): Self = StObject.set(x, "ClientVpnEndpointId", value.asInstanceOf[js.Any])
    
    inline def setConnectionLogOptions(value: ConnectionLogOptions): Self = StObject.set(x, "ConnectionLogOptions", value.asInstanceOf[js.Any])
    
    inline def setConnectionLogOptionsUndefined: Self = StObject.set(x, "ConnectionLogOptions", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDnsServers(value: DnsServersOptionsModifyStructure): Self = StObject.set(x, "DnsServers", value.asInstanceOf[js.Any])
    
    inline def setDnsServersUndefined: Self = StObject.set(x, "DnsServers", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setSecurityGroupIds(value: ClientVpnSecurityGroupIdSet): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
    
    inline def setSelfServicePortal(value: SelfServicePortal): Self = StObject.set(x, "SelfServicePortal", value.asInstanceOf[js.Any])
    
    inline def setSelfServicePortalUndefined: Self = StObject.set(x, "SelfServicePortal", js.undefined)
    
    inline def setServerCertificateArn(value: String): Self = StObject.set(x, "ServerCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateArnUndefined: Self = StObject.set(x, "ServerCertificateArn", js.undefined)
    
    inline def setSessionTimeoutHours(value: Integer): Self = StObject.set(x, "SessionTimeoutHours", value.asInstanceOf[js.Any])
    
    inline def setSessionTimeoutHoursUndefined: Self = StObject.set(x, "SessionTimeoutHours", js.undefined)
    
    inline def setSplitTunnel(value: Boolean): Self = StObject.set(x, "SplitTunnel", value.asInstanceOf[js.Any])
    
    inline def setSplitTunnelUndefined: Self = StObject.set(x, "SplitTunnel", js.undefined)
    
    inline def setVpcId(value: VpcId): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
    
    inline def setVpnPort(value: Integer): Self = StObject.set(x, "VpnPort", value.asInstanceOf[js.Any])
    
    inline def setVpnPortUndefined: Self = StObject.set(x, "VpnPort", js.undefined)
  }
}
