package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNetworkInterfacePermissionResult extends js.Object {
  /**
    * Information about the permission for the network interface.
    */
  var InterfacePermission: js.UndefOr[NetworkInterfacePermission] = js.native
}

object CreateNetworkInterfacePermissionResult {
  @scala.inline
  def apply(InterfacePermission: NetworkInterfacePermission = null): CreateNetworkInterfacePermissionResult = {
    val __obj = js.Dynamic.literal()
    if (InterfacePermission != null) __obj.updateDynamic("InterfacePermission")(InterfacePermission.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkInterfacePermissionResult]
  }
}

