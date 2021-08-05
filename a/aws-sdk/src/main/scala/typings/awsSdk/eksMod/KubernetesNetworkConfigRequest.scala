package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KubernetesNetworkConfigRequest extends StObject {
  
  /**
    * The CIDR block to assign Kubernetes service IP addresses from. If you don't specify a block, Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. We recommend that you specify a block that does not overlap with resources in other networks that are peered or connected to your VPC. The block must meet the following requirements:   Within one of the following private IP address blocks: 10.0.0.0/8, 172.16.0.0.0/12, or 192.168.0.0/16.   Doesn't overlap with any CIDR block assigned to the VPC that you selected for VPC.   Between /24 and /12.    You can only specify a custom CIDR block when you create a cluster and can't change this value once the cluster is created. 
    */
  var serviceIpv4Cidr: js.UndefOr[String] = js.undefined
}
object KubernetesNetworkConfigRequest {
  
  inline def apply(): KubernetesNetworkConfigRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KubernetesNetworkConfigRequest]
  }
  
  extension [Self <: KubernetesNetworkConfigRequest](x: Self) {
    
    inline def setServiceIpv4Cidr(value: String): Self = StObject.set(x, "serviceIpv4Cidr", value.asInstanceOf[js.Any])
    
    inline def setServiceIpv4CidrUndefined: Self = StObject.set(x, "serviceIpv4Cidr", js.undefined)
  }
}
