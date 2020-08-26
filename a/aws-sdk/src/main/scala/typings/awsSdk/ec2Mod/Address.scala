package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  /**
    * The ID representing the allocation of the address for use with EC2-VPC.
    */
  var AllocationId: js.UndefOr[String] = js.native
  /**
    * The ID representing the association of the address with an instance in a VPC.
    */
  var AssociationId: js.UndefOr[String] = js.native
  /**
    * The customer-owned IP address.
    */
  var CustomerOwnedIp: js.UndefOr[String] = js.native
  /**
    * The ID of the customer-owned address pool.
    */
  var CustomerOwnedIpv4Pool: js.UndefOr[String] = js.native
  /**
    * Indicates whether this Elastic IP address is for use with instances in EC2-Classic (standard) or instances in a VPC (vpc).
    */
  var Domain: js.UndefOr[DomainType] = js.native
  /**
    * The ID of the instance that the address is associated with (if any).
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The name of the location from which the IP address is advertised.
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that owns the network interface.
    */
  var NetworkInterfaceOwnerId: js.UndefOr[String] = js.native
  /**
    * The private IP address associated with the Elastic IP address.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * The Elastic IP address.
    */
  var PublicIp: js.UndefOr[String] = js.native
  /**
    * The ID of an address pool.
    */
  var PublicIpv4Pool: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the Elastic IP address.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object Address {
  @scala.inline
  def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllocationId(value: String): Self = this.set("AllocationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocationId: Self = this.set("AllocationId", js.undefined)
    @scala.inline
    def setAssociationId(value: String): Self = this.set("AssociationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociationId: Self = this.set("AssociationId", js.undefined)
    @scala.inline
    def setCustomerOwnedIp(value: String): Self = this.set("CustomerOwnedIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerOwnedIp: Self = this.set("CustomerOwnedIp", js.undefined)
    @scala.inline
    def setCustomerOwnedIpv4Pool(value: String): Self = this.set("CustomerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerOwnedIpv4Pool: Self = this.set("CustomerOwnedIpv4Pool", js.undefined)
    @scala.inline
    def setDomain(value: DomainType): Self = this.set("Domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("Domain", js.undefined)
    @scala.inline
    def setInstanceId(value: String): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setNetworkBorderGroup(value: String): Self = this.set("NetworkBorderGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkBorderGroup: Self = this.set("NetworkBorderGroup", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
    @scala.inline
    def setNetworkInterfaceOwnerId(value: String): Self = this.set("NetworkInterfaceOwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceOwnerId: Self = this.set("NetworkInterfaceOwnerId", js.undefined)
    @scala.inline
    def setPrivateIpAddress(value: String): Self = this.set("PrivateIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("PrivateIpAddress", js.undefined)
    @scala.inline
    def setPublicIp(value: String): Self = this.set("PublicIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicIp: Self = this.set("PublicIp", js.undefined)
    @scala.inline
    def setPublicIpv4Pool(value: String): Self = this.set("PublicIpv4Pool", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicIpv4Pool: Self = this.set("PublicIpv4Pool", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

