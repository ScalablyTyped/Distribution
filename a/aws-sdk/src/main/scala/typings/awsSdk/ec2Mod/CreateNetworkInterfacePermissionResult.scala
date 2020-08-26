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
  def apply(): CreateNetworkInterfacePermissionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkInterfacePermissionResult]
  }
  @scala.inline
  implicit class CreateNetworkInterfacePermissionResultOps[Self <: CreateNetworkInterfacePermissionResult] (val x: Self) extends AnyVal {
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
    def setInterfacePermission(value: NetworkInterfacePermission): Self = this.set("InterfacePermission", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfacePermission: Self = this.set("InterfacePermission", js.undefined)
  }
  
}

