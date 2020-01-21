package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DefaultWorkspaceCreationProperties extends js.Object {
  /**
    * The identifier of any security groups to apply to WorkSpaces when they are created.
    */
  var CustomSecurityGroupId: js.UndefOr[SecurityGroupId] = js.native
  /**
    * The organizational unit (OU) in the directory for the WorkSpace machine accounts.
    */
  var DefaultOu: js.UndefOr[typings.awsSdk.workspacesMod.DefaultOu] = js.native
  /**
    * Specifies whether to automatically assign an Elastic public IP address to WorkSpaces in this directory by default. If enabled, the Elastic public IP address allows outbound internet access from your WorkSpaces when you’re using an internet gateway in the Amazon VPC in which your WorkSpaces are located. If you're using a Network Address Translation (NAT) gateway for outbound internet access from your VPC, or if your WorkSpaces are in public subnets and you manually assign them Elastic IP addresses, you should disable this setting. This setting applies to new WorkSpaces that you launch or to existing WorkSpaces that you rebuild. For more information, see  Configure a VPC for Amazon WorkSpaces.
    */
  var EnableInternetAccess: js.UndefOr[BooleanObject] = js.native
  /**
    * Specifies whether maintenance mode is enabled for WorkSpaces. For more information, see WorkSpace Maintenance.
    */
  var EnableMaintenanceMode: js.UndefOr[BooleanObject] = js.native
  /**
    * Specifies whether the directory is enabled for Amazon WorkDocs.
    */
  var EnableWorkDocs: js.UndefOr[BooleanObject] = js.native
  /**
    * Specifies whether WorkSpace users are local administrators on their WorkSpaces.
    */
  var UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject] = js.native
}

object DefaultWorkspaceCreationProperties {
  @scala.inline
  def apply(
    CustomSecurityGroupId: SecurityGroupId = null,
    DefaultOu: DefaultOu = null,
    EnableInternetAccess: js.UndefOr[Boolean] = js.undefined,
    EnableMaintenanceMode: js.UndefOr[Boolean] = js.undefined,
    EnableWorkDocs: js.UndefOr[Boolean] = js.undefined,
    UserEnabledAsLocalAdministrator: js.UndefOr[Boolean] = js.undefined
  ): DefaultWorkspaceCreationProperties = {
    val __obj = js.Dynamic.literal()
    if (CustomSecurityGroupId != null) __obj.updateDynamic("CustomSecurityGroupId")(CustomSecurityGroupId.asInstanceOf[js.Any])
    if (DefaultOu != null) __obj.updateDynamic("DefaultOu")(DefaultOu.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableInternetAccess)) __obj.updateDynamic("EnableInternetAccess")(EnableInternetAccess.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableMaintenanceMode)) __obj.updateDynamic("EnableMaintenanceMode")(EnableMaintenanceMode.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableWorkDocs)) __obj.updateDynamic("EnableWorkDocs")(EnableWorkDocs.asInstanceOf[js.Any])
    if (!js.isUndefined(UserEnabledAsLocalAdministrator)) __obj.updateDynamic("UserEnabledAsLocalAdministrator")(UserEnabledAsLocalAdministrator.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultWorkspaceCreationProperties]
  }
}

