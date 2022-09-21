package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetIpAddressTypeInput extends StObject {
  
  /**
    * The IP address type. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses). You can’t specify dualstack for a load balancer with a UDP or TCP_UDP listener.
    */
  var IpAddressType: typings.awsSdk.elbv2Mod.IpAddressType
  
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: typings.awsSdk.elbv2Mod.LoadBalancerArn
}
object SetIpAddressTypeInput {
  
  inline def apply(IpAddressType: IpAddressType, LoadBalancerArn: LoadBalancerArn): SetIpAddressTypeInput = {
    val __obj = js.Dynamic.literal(IpAddressType = IpAddressType.asInstanceOf[js.Any], LoadBalancerArn = LoadBalancerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetIpAddressTypeInput]
  }
  
  extension [Self <: SetIpAddressTypeInput](x: Self) {
    
    inline def setIpAddressType(value: IpAddressType): Self = StObject.set(x, "IpAddressType", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerArn(value: LoadBalancerArn): Self = StObject.set(x, "LoadBalancerArn", value.asInstanceOf[js.Any])
  }
}
