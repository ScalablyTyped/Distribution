package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNetworkInterfacePermissionRequest extends js.Object {
  
  /**
    * The AWS account ID.
    */
  var AwsAccountId: js.UndefOr[String] = js.native
  
  /**
    * The AWS service. Currently not supported.
    */
  var AwsService: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.ec2Mod.NetworkInterfaceId = js.native
  
  /**
    * The type of permission to grant.
    */
  var Permission: InterfacePermissionType = js.native
}
object CreateNetworkInterfacePermissionRequest {
  
  @scala.inline
  def apply(NetworkInterfaceId: NetworkInterfaceId, Permission: InterfacePermissionType): CreateNetworkInterfacePermissionRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any], Permission = Permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkInterfacePermissionRequest]
  }
  
  @scala.inline
  implicit class CreateNetworkInterfacePermissionRequestOps[Self <: CreateNetworkInterfacePermissionRequest] (val x: Self) extends AnyVal {
    
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
    def setPermission(value: InterfacePermissionType): Self = this.set("Permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsAccountId(value: String): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsAccountId: Self = this.set("AwsAccountId", js.undefined)
    
    @scala.inline
    def setAwsService(value: String): Self = this.set("AwsService", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsService: Self = this.set("AwsService", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
}
