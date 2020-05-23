package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNetworkInterfacePermissionRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * Specify true to remove the permission even if the network interface is attached to an instance.
    */
  var Force: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the network interface permission.
    */
  var NetworkInterfacePermissionId: typings.awsSdk.ec2Mod.NetworkInterfacePermissionId = js.native
}

object DeleteNetworkInterfacePermissionRequest {
  @scala.inline
  def apply(
    NetworkInterfacePermissionId: NetworkInterfacePermissionId,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Force: js.UndefOr[Boolean] = js.undefined
  ): DeleteNetworkInterfacePermissionRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfacePermissionId = NetworkInterfacePermissionId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Force)) __obj.updateDynamic("Force")(Force.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkInterfacePermissionRequest]
  }
}

