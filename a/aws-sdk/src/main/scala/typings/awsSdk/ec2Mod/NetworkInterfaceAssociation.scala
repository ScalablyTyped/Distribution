package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfaceAssociation extends js.Object {
  /**
    * The allocation ID.
    */
  var AllocationId: js.UndefOr[String] = js.native
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[String] = js.native
  /**
    * The ID of the Elastic IP address owner.
    */
  var IpOwnerId: js.UndefOr[String] = js.native
  /**
    * The public DNS name.
    */
  var PublicDnsName: js.UndefOr[String] = js.native
  /**
    * The address of the Elastic IP address bound to the network interface.
    */
  var PublicIp: js.UndefOr[String] = js.native
}

object NetworkInterfaceAssociation {
  @scala.inline
  def apply(): NetworkInterfaceAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfaceAssociation]
  }
  @scala.inline
  implicit class NetworkInterfaceAssociationOps[Self <: NetworkInterfaceAssociation] (val x: Self) extends AnyVal {
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
    def setIpOwnerId(value: String): Self = this.set("IpOwnerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpOwnerId: Self = this.set("IpOwnerId", js.undefined)
    @scala.inline
    def setPublicDnsName(value: String): Self = this.set("PublicDnsName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicDnsName: Self = this.set("PublicDnsName", js.undefined)
    @scala.inline
    def setPublicIp(value: String): Self = this.set("PublicIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublicIp: Self = this.set("PublicIp", js.undefined)
  }
  
}

