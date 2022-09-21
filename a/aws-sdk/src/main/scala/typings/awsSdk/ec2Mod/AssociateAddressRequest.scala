package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateAddressRequest extends StObject {
  
  /**
    * [EC2-VPC] The allocation ID. This is required for EC2-VPC.
    */
  var AllocationId: js.UndefOr[typings.awsSdk.ec2Mod.AllocationId] = js.undefined
  
  /**
    * [EC2-VPC] For a VPC in an EC2-Classic account, specify true to allow an Elastic IP address that is already associated with an instance or network interface to be reassociated with the specified instance or network interface. Otherwise, the operation fails. In a VPC in an EC2-VPC-only account, reassociation is automatic, therefore you can specify false to ensure the operation fails if the Elastic IP address is already associated with another resource.
    */
  var AllowReassociation: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the instance. The instance must have exactly one attached network interface. For EC2-VPC, you can specify either the instance ID or the network interface ID, but not both. For EC2-Classic, you must specify an instance ID and the instance must be in the running state.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ec2Mod.InstanceId] = js.undefined
  
  /**
    * [EC2-VPC] The ID of the network interface. If the instance has more than one network interface, you must specify a network interface ID. For EC2-VPC, you can specify either the instance ID or the network interface ID, but not both. 
    */
  var NetworkInterfaceId: js.UndefOr[typings.awsSdk.ec2Mod.NetworkInterfaceId] = js.undefined
  
  /**
    * [EC2-VPC] The primary or secondary private IP address to associate with the Elastic IP address. If no private IP address is specified, the Elastic IP address is associated with the primary private IP address.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * [EC2-Classic] The Elastic IP address to associate with the instance. This is required for EC2-Classic.
    */
  var PublicIp: js.UndefOr[String] = js.undefined
}
object AssociateAddressRequest {
  
  inline def apply(): AssociateAddressRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateAddressRequest]
  }
  
  extension [Self <: AssociateAddressRequest](x: Self) {
    
    inline def setAllocationId(value: AllocationId): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    inline def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    inline def setAllowReassociation(value: Boolean): Self = StObject.set(x, "AllowReassociation", value.asInstanceOf[js.Any])
    
    inline def setAllowReassociationUndefined: Self = StObject.set(x, "AllowReassociation", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
    
    inline def setPublicIp(value: String): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    inline def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
  }
}
