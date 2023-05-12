package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetGroupConfig extends StObject {
  
  /**
    * The health check configuration.
    */
  var healthCheck: js.UndefOr[HealthCheckConfig] = js.undefined
  
  /**
    * The type of IP address used for the target group. The possible values are ipv4 and ipv6. This is an optional parameter. If not specified, the IP address type defaults to ipv4.
    */
  var ipAddressType: js.UndefOr[IpAddressType] = js.undefined
  
  /**
    * The port on which the targets are listening. For HTTP, the default is 80. For HTTPS, the default is 443 
    */
  var port: Port
  
  /**
    * The protocol to use for routing traffic to the targets. Default is the protocol of a target group.
    */
  var protocol: TargetGroupProtocol
  
  /**
    * The protocol version. Default value is HTTP1.
    */
  var protocolVersion: js.UndefOr[TargetGroupProtocolVersion] = js.undefined
  
  /**
    * The ID of the VPC.
    */
  var vpcIdentifier: VpcId
}
object TargetGroupConfig {
  
  inline def apply(port: Port, protocol: TargetGroupProtocol, vpcIdentifier: VpcId): TargetGroupConfig = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], vpcIdentifier = vpcIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGroupConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetGroupConfig] (val x: Self) extends AnyVal {
    
    inline def setHealthCheck(value: HealthCheckConfig): Self = StObject.set(x, "healthCheck", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckUndefined: Self = StObject.set(x, "healthCheck", js.undefined)
    
    inline def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "ipAddressType", value.asInstanceOf[js.Any])
    
    inline def setIpAddressTypeUndefined: Self = StObject.set(x, "ipAddressType", js.undefined)
    
    inline def setPort(value: Port): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: TargetGroupProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolVersion(value: TargetGroupProtocolVersion): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    inline def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
    
    inline def setVpcIdentifier(value: VpcId): Self = StObject.set(x, "vpcIdentifier", value.asInstanceOf[js.Any])
  }
}
