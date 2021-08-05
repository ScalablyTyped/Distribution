package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceNetworkInterfaceSpecification extends StObject {
  
  /**
    * Indicates whether to assign a carrier IP address to the network interface. You can only assign a carrier IP address to a network interface that is in a subnet in a Wavelength Zone. For more information about carrier IP addresses, see Carrier IP addresses in the AWS Wavelength Developer Guide.
    */
  var AssociateCarrierIpAddress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to assign a public IPv4 address to an instance you launch in a VPC. The public IP address can only be assigned to a network interface for eth0, and can only be assigned to a new network interface, not an existing one. You cannot specify more than one network interface in the request. If launching into a default subnet, the default value is true.
    */
  var AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If set to true, the interface is deleted when the instance is terminated. You can specify true only if creating a new network interface when launching an instance.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The description of the network interface. Applies only if creating a network interface when launching an instance.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The position of the network interface in the attachment order. A primary network interface has a device index of 0. If you specify a network interface when launching an instance, you must specify the device index.
    */
  var DeviceIndex: js.UndefOr[Integer] = js.undefined
  
  /**
    * The IDs of the security groups for the network interface. Applies only if creating a network interface when launching an instance.
    */
  var Groups: js.UndefOr[SecurityGroupIdStringList] = js.undefined
  
  /**
    * The type of network interface. To create an Elastic Fabric Adapter (EFA), specify efa. For more information, see Elastic Fabric Adapter in the Amazon Elastic Compute Cloud User Guide. If you are not creating an EFA, specify interface or omit this parameter. Valid values: interface | efa 
    */
  var InterfaceType: js.UndefOr[String] = js.undefined
  
  /**
    * A number of IPv6 addresses to assign to the network interface. Amazon EC2 chooses the IPv6 addresses from the range of the subnet. You cannot specify this option and the option to assign specific IPv6 addresses in the same request. You can specify this option if you've specified a minimum number of instances to launch.
    */
  var Ipv6AddressCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * One or more IPv6 addresses to assign to the network interface. You cannot specify this option and the option to assign a number of IPv6 addresses in the same request. You cannot specify this option if you've specified a minimum number of instances to launch.
    */
  var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.undefined
  
  /**
    * The index of the network card. Some instance types support multiple network cards. The primary network interface must be assigned to network card index 0. The default is network card index 0.
    */
  var NetworkCardIndex: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the network interface. If you are creating a Spot Fleet, omit this parameter because you can’t specify a network interface ID in a launch specification.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  
  /**
    * The private IPv4 address of the network interface. Applies only if creating a network interface when launching an instance. You cannot specify this option if you're launching more than one instance in a RunInstances request.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * One or more private IPv4 addresses to assign to the network interface. Only one private IPv4 address can be designated as primary. You cannot specify this option if you're launching more than one instance in a RunInstances request.
    */
  var PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList] = js.undefined
  
  /**
    * The number of secondary private IPv4 addresses. You can't specify this option and specify more than one private IP address using the private IP addresses option. You cannot specify this option if you're launching more than one instance in a RunInstances request.
    */
  var SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the subnet associated with the network interface. Applies only if creating a network interface when launching an instance.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
}
object InstanceNetworkInterfaceSpecification {
  
  inline def apply(): InstanceNetworkInterfaceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceNetworkInterfaceSpecification]
  }
  
  extension [Self <: InstanceNetworkInterfaceSpecification](x: Self) {
    
    inline def setAssociateCarrierIpAddress(value: Boolean): Self = StObject.set(x, "AssociateCarrierIpAddress", value.asInstanceOf[js.Any])
    
    inline def setAssociateCarrierIpAddressUndefined: Self = StObject.set(x, "AssociateCarrierIpAddress", js.undefined)
    
    inline def setAssociatePublicIpAddress(value: Boolean): Self = StObject.set(x, "AssociatePublicIpAddress", value.asInstanceOf[js.Any])
    
    inline def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "AssociatePublicIpAddress", js.undefined)
    
    inline def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setDeviceIndex(value: Integer): Self = StObject.set(x, "DeviceIndex", value.asInstanceOf[js.Any])
    
    inline def setDeviceIndexUndefined: Self = StObject.set(x, "DeviceIndex", js.undefined)
    
    inline def setGroups(value: SecurityGroupIdStringList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    inline def setGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    inline def setInterfaceType(value: String): Self = StObject.set(x, "InterfaceType", value.asInstanceOf[js.Any])
    
    inline def setInterfaceTypeUndefined: Self = StObject.set(x, "InterfaceType", js.undefined)
    
    inline def setIpv6AddressCount(value: Integer): Self = StObject.set(x, "Ipv6AddressCount", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressCountUndefined: Self = StObject.set(x, "Ipv6AddressCount", js.undefined)
    
    inline def setIpv6Addresses(value: InstanceIpv6AddressList): Self = StObject.set(x, "Ipv6Addresses", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressesUndefined: Self = StObject.set(x, "Ipv6Addresses", js.undefined)
    
    inline def setIpv6AddressesVarargs(value: InstanceIpv6Address*): Self = StObject.set(x, "Ipv6Addresses", js.Array(value :_*))
    
    inline def setNetworkCardIndex(value: Integer): Self = StObject.set(x, "NetworkCardIndex", value.asInstanceOf[js.Any])
    
    inline def setNetworkCardIndexUndefined: Self = StObject.set(x, "NetworkCardIndex", js.undefined)
    
    inline def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
    
    inline def setPrivateIpAddresses(value: PrivateIpAddressSpecificationList): Self = StObject.set(x, "PrivateIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressesUndefined: Self = StObject.set(x, "PrivateIpAddresses", js.undefined)
    
    inline def setPrivateIpAddressesVarargs(value: PrivateIpAddressSpecification*): Self = StObject.set(x, "PrivateIpAddresses", js.Array(value :_*))
    
    inline def setSecondaryPrivateIpAddressCount(value: Integer): Self = StObject.set(x, "SecondaryPrivateIpAddressCount", value.asInstanceOf[js.Any])
    
    inline def setSecondaryPrivateIpAddressCountUndefined: Self = StObject.set(x, "SecondaryPrivateIpAddressCount", js.undefined)
    
    inline def setSubnetId(value: String): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
