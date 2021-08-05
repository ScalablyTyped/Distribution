package typings.awsSdk.eksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KubernetesNetworkConfigResponse extends StObject {
  
  /**
    * The CIDR block that Kubernetes service IP addresses are assigned from. If you didn't specify a CIDR block, then Kubernetes assigns addresses from either the 10.100.0.0/16 or 172.20.0.0/16 CIDR blocks. If this was specified, then it was specified when the cluster was created and it cannot be changed.
    */
  var serviceIpv4Cidr: js.UndefOr[String] = js.undefined
}
object KubernetesNetworkConfigResponse {
  
  inline def apply(): KubernetesNetworkConfigResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KubernetesNetworkConfigResponse]
  }
  
  extension [Self <: KubernetesNetworkConfigResponse](x: Self) {
    
    inline def setServiceIpv4Cidr(value: String): Self = StObject.set(x, "serviceIpv4Cidr", value.asInstanceOf[js.Any])
    
    inline def setServiceIpv4CidrUndefined: Self = StObject.set(x, "serviceIpv4Cidr", js.undefined)
  }
}
