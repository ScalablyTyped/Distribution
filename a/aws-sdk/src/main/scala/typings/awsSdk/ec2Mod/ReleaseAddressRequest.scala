package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseAddressRequest extends js.Object {
  /**
    * [EC2-VPC] The allocation ID. Required for EC2-VPC.
    */
  var AllocationId: js.UndefOr[typings.awsSdk.ec2Mod.AllocationId] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The location that the IP address is released from. If you provide an incorrect network border group, you will receive an InvalidAddress.NotFound error. For more information, see Error Codes.  You cannot use a network border group with EC2 Classic. If you attempt this operation on EC2 classic, you will receive an InvalidParameterCombination error. For more information, see Error Codes. 
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.native
  /**
    * [EC2-Classic] The Elastic IP address. Required for EC2-Classic.
    */
  var PublicIp: js.UndefOr[String] = js.native
}

object ReleaseAddressRequest {
  @scala.inline
  def apply(
    AllocationId: AllocationId = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    NetworkBorderGroup: String = null,
    PublicIp: String = null
  ): ReleaseAddressRequest = {
    val __obj = js.Dynamic.literal()
    if (AllocationId != null) __obj.updateDynamic("AllocationId")(AllocationId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (NetworkBorderGroup != null) __obj.updateDynamic("NetworkBorderGroup")(NetworkBorderGroup.asInstanceOf[js.Any])
    if (PublicIp != null) __obj.updateDynamic("PublicIp")(PublicIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseAddressRequest]
  }
}

