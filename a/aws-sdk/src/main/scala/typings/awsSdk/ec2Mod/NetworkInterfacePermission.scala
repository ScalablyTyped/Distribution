package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfacePermission extends js.Object {
  /**
    * The AWS account ID.
    */
  var AwsAccountId: js.UndefOr[String] = js.native
  /**
    * The AWS service.
    */
  var AwsService: js.UndefOr[String] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The ID of the network interface permission.
    */
  var NetworkInterfacePermissionId: js.UndefOr[String] = js.native
  /**
    * The type of permission.
    */
  var Permission: js.UndefOr[InterfacePermissionType] = js.native
  /**
    * Information about the state of the permission.
    */
  var PermissionState: js.UndefOr[NetworkInterfacePermissionState] = js.native
}

object NetworkInterfacePermission {
  @scala.inline
  def apply(): NetworkInterfacePermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfacePermission]
  }
  @scala.inline
  implicit class NetworkInterfacePermissionOps[Self <: NetworkInterfacePermission] (val x: Self) extends AnyVal {
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
    def setAwsAccountId(value: String): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsAccountId: Self = this.set("AwsAccountId", js.undefined)
    @scala.inline
    def setAwsService(value: String): Self = this.set("AwsService", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAwsService: Self = this.set("AwsService", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
    @scala.inline
    def setNetworkInterfacePermissionId(value: String): Self = this.set("NetworkInterfacePermissionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfacePermissionId: Self = this.set("NetworkInterfacePermissionId", js.undefined)
    @scala.inline
    def setPermission(value: InterfacePermissionType): Self = this.set("Permission", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermission: Self = this.set("Permission", js.undefined)
    @scala.inline
    def setPermissionState(value: NetworkInterfacePermissionState): Self = this.set("PermissionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionState: Self = this.set("PermissionState", js.undefined)
  }
  
}

