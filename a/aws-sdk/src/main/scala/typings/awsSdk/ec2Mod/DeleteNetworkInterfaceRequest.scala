package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteNetworkInterfaceRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.ec2Mod.NetworkInterfaceId = js.native
}

object DeleteNetworkInterfaceRequest {
  @scala.inline
  def apply(NetworkInterfaceId: NetworkInterfaceId): DeleteNetworkInterfaceRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkInterfaceRequest]
  }
  @scala.inline
  implicit class DeleteNetworkInterfaceRequestOps[Self <: DeleteNetworkInterfaceRequest] (val x: Self) extends AnyVal {
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
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
  
}

