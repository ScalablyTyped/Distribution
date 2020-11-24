package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(NetworkInterfacePermissionId: NetworkInterfacePermissionId): DeleteNetworkInterfacePermissionRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfacePermissionId = NetworkInterfacePermissionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNetworkInterfacePermissionRequest]
  }
  
  @scala.inline
  implicit class DeleteNetworkInterfacePermissionRequestOps[Self <: DeleteNetworkInterfacePermissionRequest] (val x: Self) extends AnyVal {
    
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
    def setNetworkInterfacePermissionId(value: NetworkInterfacePermissionId): Self = this.set("NetworkInterfacePermissionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("Force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("Force", js.undefined)
  }
}
