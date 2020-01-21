package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateAddressResult extends js.Object {
  /**
    * [EC2-VPC] The ID that AWS assigns to represent the allocation of the Elastic IP address for use with instances in a VPC.
    */
  var AllocationId: js.UndefOr[String] = js.native
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
    * The location from which the IP address is advertised.
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.native
  /**
    * The Elastic IP address.
    */
  var PublicIp: js.UndefOr[String] = js.native
  /**
    * The ID of an address pool.
    */
  var PublicIpv4Pool: js.UndefOr[String] = js.native
}

object AllocateAddressResult {
  @scala.inline
  def apply(
    AllocationId: String = null,
    CustomerOwnedIp: String = null,
    CustomerOwnedIpv4Pool: String = null,
    Domain: DomainType = null,
    NetworkBorderGroup: String = null,
    PublicIp: String = null,
    PublicIpv4Pool: String = null
  ): AllocateAddressResult = {
    val __obj = js.Dynamic.literal()
    if (AllocationId != null) __obj.updateDynamic("AllocationId")(AllocationId.asInstanceOf[js.Any])
    if (CustomerOwnedIp != null) __obj.updateDynamic("CustomerOwnedIp")(CustomerOwnedIp.asInstanceOf[js.Any])
    if (CustomerOwnedIpv4Pool != null) __obj.updateDynamic("CustomerOwnedIpv4Pool")(CustomerOwnedIpv4Pool.asInstanceOf[js.Any])
    if (Domain != null) __obj.updateDynamic("Domain")(Domain.asInstanceOf[js.Any])
    if (NetworkBorderGroup != null) __obj.updateDynamic("NetworkBorderGroup")(NetworkBorderGroup.asInstanceOf[js.Any])
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp.asInstanceOf[js.Any])
    if (PublicIpv4Pool != null) __obj.updateDynamic("PublicIpv4Pool")(PublicIpv4Pool.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateAddressResult]
  }
}

