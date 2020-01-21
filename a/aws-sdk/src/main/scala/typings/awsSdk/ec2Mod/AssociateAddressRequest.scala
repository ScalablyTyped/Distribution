package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateAddressRequest extends js.Object {
  /**
    * [EC2-VPC] The allocation ID. This is required for EC2-VPC.
    */
  var AllocationId: js.UndefOr[typings.awsSdk.ec2Mod.AllocationId] = js.native
  /**
    * [EC2-VPC] For a VPC in an EC2-Classic account, specify true to allow an Elastic IP address that is already associated with an instance or network interface to be reassociated with the specified instance or network interface. Otherwise, the operation fails. In a VPC in an EC2-VPC-only account, reassociation is automatic, therefore you can specify false to ensure the operation fails if the Elastic IP address is already associated with another resource.
    */
  var AllowReassociation: js.UndefOr[Boolean] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the instance. This is required for EC2-Classic. For EC2-VPC, you can specify either the instance ID or the network interface ID, but not both. The operation fails if you specify an instance ID unless exactly one network interface is attached.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ec2Mod.InstanceId] = js.native
  /**
    * [EC2-VPC] The ID of the network interface. If the instance has more than one network interface, you must specify a network interface ID. For EC2-VPC, you can specify either the instance ID or the network interface ID, but not both. 
    */
  var NetworkInterfaceId: js.UndefOr[typings.awsSdk.ec2Mod.NetworkInterfaceId] = js.native
  /**
    * [EC2-VPC] The primary or secondary private IP address to associate with the Elastic IP address. If no private IP address is specified, the Elastic IP address is associated with the primary private IP address.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * The Elastic IP address to associate with the instance. This is required for EC2-Classic.
    */
  var PublicIp: js.UndefOr[String] = js.native
}

object AssociateAddressRequest {
  @scala.inline
  def apply(
    AllocationId: AllocationId = null,
    AllowReassociation: js.UndefOr[scala.Boolean] = js.undefined,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    InstanceId: InstanceId = null,
    NetworkInterfaceId: NetworkInterfaceId = null,
    PrivateIpAddress: String = null,
    PublicIp: String = null
  ): AssociateAddressRequest = {
    val __obj = js.Dynamic.literal()
    if (AllocationId != null) __obj.updateDynamic("AllocationId")(AllocationId.asInstanceOf[js.Any])
    if (!js.isUndefined(AllowReassociation)) __obj.updateDynamic("AllowReassociation")(AllowReassociation.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress.asInstanceOf[js.Any])
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateAddressRequest]
  }
}

