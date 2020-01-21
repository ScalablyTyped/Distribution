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
  def apply(
    AwsAccountId: String = null,
    AwsService: String = null,
    NetworkInterfaceId: String = null,
    NetworkInterfacePermissionId: String = null,
    Permission: InterfacePermissionType = null,
    PermissionState: NetworkInterfacePermissionState = null
  ): NetworkInterfacePermission = {
    val __obj = js.Dynamic.literal()
    if (AwsAccountId != null) __obj.updateDynamic("AwsAccountId")(AwsAccountId.asInstanceOf[js.Any])
    if (AwsService != null) __obj.updateDynamic("AwsService")(AwsService.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (NetworkInterfacePermissionId != null) __obj.updateDynamic("NetworkInterfacePermissionId")(NetworkInterfacePermissionId.asInstanceOf[js.Any])
    if (Permission != null) __obj.updateDynamic("Permission")(Permission.asInstanceOf[js.Any])
    if (PermissionState != null) __obj.updateDynamic("PermissionState")(PermissionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInterfacePermission]
  }
}

