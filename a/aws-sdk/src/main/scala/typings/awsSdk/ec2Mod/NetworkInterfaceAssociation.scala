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
  def apply(
    AllocationId: String = null,
    AssociationId: String = null,
    IpOwnerId: String = null,
    PublicDnsName: String = null,
    PublicIp: String = null
  ): NetworkInterfaceAssociation = {
    val __obj = js.Dynamic.literal()
    if (AllocationId != null) __obj.updateDynamic("AllocationId")(AllocationId.asInstanceOf[js.Any])
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId.asInstanceOf[js.Any])
    if (IpOwnerId != null) __obj.updateDynamic("IpOwnerId")(IpOwnerId.asInstanceOf[js.Any])
    if (PublicDnsName != null) __obj.updateDynamic("PublicDnsName")(PublicDnsName.asInstanceOf[js.Any])
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfaceAssociation]
  }
}

