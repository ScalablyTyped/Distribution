package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsEc2EipDetails extends js.Object {
  
  /**
    * The identifier that AWS assigns to represent the allocation of the Elastic IP address for use with Amazon VPC.
    */
  var AllocationId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifier that represents the association of the Elastic IP address with an EC2 instance.
    */
  var AssociationId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The domain in which to allocate the address. If the address is for use with EC2 instances in a VPC, then Domain is vpc. Otherwise, Domain is standard. 
    */
  var Domain: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifier of the EC2 instance.
    */
  var InstanceId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The name of the location from which the Elastic IP address is advertised.
    */
  var NetworkBorderGroup: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifier of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The AWS account ID of the owner of the network interface.
    */
  var NetworkInterfaceOwnerId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The private IP address that is associated with the Elastic IP address.
    */
  var PrivateIpAddress: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * A public IP address that is associated with the EC2 instance.
    */
  var PublicIp: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The identifier of an IP address pool. This parameter allows Amazon EC2 to select an IP address from the address pool.
    */
  var PublicIpv4Pool: js.UndefOr[NonEmptyString] = js.native
}
object AwsEc2EipDetails {
  
  @scala.inline
  def apply(): AwsEc2EipDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEc2EipDetails]
  }
  
  @scala.inline
  implicit class AwsEc2EipDetailsOps[Self <: AwsEc2EipDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllocationId(value: NonEmptyString): Self = this.set("AllocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocationId: Self = this.set("AllocationId", js.undefined)
    
    @scala.inline
    def setAssociationId(value: NonEmptyString): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationId: Self = this.set("AssociationId", js.undefined)
    
    @scala.inline
    def setDomain(value: NonEmptyString): Self = this.set("Domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("Domain", js.undefined)
    
    @scala.inline
    def setInstanceId(value: NonEmptyString): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setNetworkBorderGroup(value: NonEmptyString): Self = this.set("NetworkBorderGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkBorderGroup: Self = this.set("NetworkBorderGroup", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceId(value: NonEmptyString): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setNetworkInterfaceOwnerId(value: NonEmptyString): Self = this.set("NetworkInterfaceOwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkInterfaceOwnerId: Self = this.set("NetworkInterfaceOwnerId", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: NonEmptyString): Self = this.set("PrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("PrivateIpAddress", js.undefined)
    
    @scala.inline
    def setPublicIp(value: NonEmptyString): Self = this.set("PublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicIp: Self = this.set("PublicIp", js.undefined)
    
    @scala.inline
    def setPublicIpv4Pool(value: NonEmptyString): Self = this.set("PublicIpv4Pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicIpv4Pool: Self = this.set("PublicIpv4Pool", js.undefined)
  }
}
