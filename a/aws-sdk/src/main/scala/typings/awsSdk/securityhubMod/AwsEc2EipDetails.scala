package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEc2EipDetails extends StObject {
  
  /**
    * The identifier that AWS assigns to represent the allocation of the Elastic IP address for use with Amazon VPC.
    */
  var AllocationId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier that represents the association of the Elastic IP address with an EC2 instance.
    */
  var AssociationId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The domain in which to allocate the address. If the address is for use with EC2 instances in a VPC, then Domain is vpc. Otherwise, Domain is standard. 
    */
  var Domain: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the EC2 instance.
    */
  var InstanceId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The name of the location from which the Elastic IP address is advertised.
    */
  var NetworkBorderGroup: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The AWS account ID of the owner of the network interface.
    */
  var NetworkInterfaceOwnerId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The private IP address that is associated with the Elastic IP address.
    */
  var PrivateIpAddress: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A public IP address that is associated with the EC2 instance.
    */
  var PublicIp: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of an IP address pool. This parameter allows Amazon EC2 to select an IP address from the address pool.
    */
  var PublicIpv4Pool: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsEc2EipDetails {
  
  @scala.inline
  def apply(): AwsEc2EipDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2EipDetails]
  }
  
  @scala.inline
  implicit class AwsEc2EipDetailsMutableBuilder[Self <: AwsEc2EipDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationId(value: NonEmptyString): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    @scala.inline
    def setAssociationId(value: NonEmptyString): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    @scala.inline
    def setDomain(value: NonEmptyString): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainUndefined: Self = StObject.set(x, "Domain", js.undefined)
    
    @scala.inline
    def setInstanceId(value: NonEmptyString): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setNetworkBorderGroup(value: NonEmptyString): Self = StObject.set(x, "NetworkBorderGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkBorderGroupUndefined: Self = StObject.set(x, "NetworkBorderGroup", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: NonEmptyString): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceOwnerId(value: NonEmptyString): Self = StObject.set(x, "NetworkInterfaceOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceOwnerIdUndefined: Self = StObject.set(x, "NetworkInterfaceOwnerId", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: NonEmptyString): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
    
    @scala.inline
    def setPublicIp(value: NonEmptyString): Self = StObject.set(x, "PublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpUndefined: Self = StObject.set(x, "PublicIp", js.undefined)
    
    @scala.inline
    def setPublicIpv4Pool(value: NonEmptyString): Self = StObject.set(x, "PublicIpv4Pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicIpv4PoolUndefined: Self = StObject.set(x, "PublicIpv4Pool", js.undefined)
  }
}
