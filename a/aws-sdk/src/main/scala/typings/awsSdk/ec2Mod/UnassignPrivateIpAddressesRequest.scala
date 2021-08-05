package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnassignPrivateIpAddressesRequest extends StObject {
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.ec2Mod.NetworkInterfaceId
  
  /**
    * The secondary private IP addresses to unassign from the network interface. You can specify this option multiple times to unassign more than one IP address.
    */
  var PrivateIpAddresses: PrivateIpAddressStringList
}
object UnassignPrivateIpAddressesRequest {
  
  inline def apply(NetworkInterfaceId: NetworkInterfaceId, PrivateIpAddresses: PrivateIpAddressStringList): UnassignPrivateIpAddressesRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any], PrivateIpAddresses = PrivateIpAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnassignPrivateIpAddressesRequest]
  }
  
  extension [Self <: UnassignPrivateIpAddressesRequest](x: Self) {
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddresses(value: PrivateIpAddressStringList): Self = StObject.set(x, "PrivateIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressesVarargs(value: String*): Self = StObject.set(x, "PrivateIpAddresses", js.Array(value :_*))
  }
}
