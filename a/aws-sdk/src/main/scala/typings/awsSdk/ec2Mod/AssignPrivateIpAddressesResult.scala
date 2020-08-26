package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssignPrivateIpAddressesResult extends js.Object {
  /**
    * The private IP addresses assigned to the network interface.
    */
  var AssignedPrivateIpAddresses: js.UndefOr[AssignedPrivateIpAddressList] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
}

object AssignPrivateIpAddressesResult {
  @scala.inline
  def apply(): AssignPrivateIpAddressesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignPrivateIpAddressesResult]
  }
  @scala.inline
  implicit class AssignPrivateIpAddressesResultOps[Self <: AssignPrivateIpAddressesResult] (val x: Self) extends AnyVal {
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
    def setAssignedPrivateIpAddressesVarargs(value: AssignedPrivateIpAddress*): Self = this.set("AssignedPrivateIpAddresses", js.Array(value :_*))
    @scala.inline
    def setAssignedPrivateIpAddresses(value: AssignedPrivateIpAddressList): Self = this.set("AssignedPrivateIpAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignedPrivateIpAddresses: Self = this.set("AssignedPrivateIpAddresses", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
  }
  
}

