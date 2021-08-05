package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignPrivateIpAddressesRequest extends StObject {
  
  /**
    * Indicates whether to allow an IP address that is already assigned to another network interface or instance to be reassigned to the specified network interface.
    */
  var AllowReassignment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.ec2Mod.NetworkInterfaceId
  
  /**
    * One or more IP addresses to be assigned as a secondary private IP address to the network interface. You can't specify this parameter when also specifying a number of secondary IP addresses. If you don't specify an IP address, Amazon EC2 automatically selects an IP address within the subnet range.
    */
  var PrivateIpAddresses: js.UndefOr[PrivateIpAddressStringList] = js.undefined
  
  /**
    * The number of secondary IP addresses to assign to the network interface. You can't specify this parameter when also specifying private IP addresses.
    */
  var SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.undefined
}
object AssignPrivateIpAddressesRequest {
  
  inline def apply(NetworkInterfaceId: NetworkInterfaceId): AssignPrivateIpAddressesRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignPrivateIpAddressesRequest]
  }
  
  extension [Self <: AssignPrivateIpAddressesRequest](x: Self) {
    
    inline def setAllowReassignment(value: Boolean): Self = StObject.set(x, "AllowReassignment", value.asInstanceOf[js.Any])
    
    inline def setAllowReassignmentUndefined: Self = StObject.set(x, "AllowReassignment", js.undefined)
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddresses(value: PrivateIpAddressStringList): Self = StObject.set(x, "PrivateIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressesUndefined: Self = StObject.set(x, "PrivateIpAddresses", js.undefined)
    
    inline def setPrivateIpAddressesVarargs(value: String*): Self = StObject.set(x, "PrivateIpAddresses", js.Array(value :_*))
    
    inline def setSecondaryPrivateIpAddressCount(value: Integer): Self = StObject.set(x, "SecondaryPrivateIpAddressCount", value.asInstanceOf[js.Any])
    
    inline def setSecondaryPrivateIpAddressCountUndefined: Self = StObject.set(x, "SecondaryPrivateIpAddressCount", js.undefined)
  }
}
