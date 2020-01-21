package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkspaceCreationProperties extends js.Object {
  /**
    * The identifier of your custom security group.
    */
  var CustomSecurityGroupId: js.UndefOr[SecurityGroupId] = js.native
  /**
    * The default organizational unit (OU) for your WorkSpace directories.
    */
  var DefaultOu: js.UndefOr[typings.awsSdk.workspacesMod.DefaultOu] = js.native
  /**
    * Indicates whether internet access is enabled for your WorkSpaces.
    */
  var EnableInternetAccess: js.UndefOr[BooleanObject] = js.native
  /**
    * Indicates whether maintenance mode is enabled for your WorkSpaces. For more information, see WorkSpace Maintenance. 
    */
  var EnableMaintenanceMode: js.UndefOr[BooleanObject] = js.native
  /**
    * Indicates whether users are local administrators of their WorkSpaces.
    */
  var UserEnabledAsLocalAdministrator: js.UndefOr[BooleanObject] = js.native
}

object WorkspaceCreationProperties {
  @scala.inline
  def apply(
    CustomSecurityGroupId: SecurityGroupId = null,
    DefaultOu: DefaultOu = null,
    EnableInternetAccess: js.UndefOr[Boolean] = js.undefined,
    EnableMaintenanceMode: js.UndefOr[Boolean] = js.undefined,
    UserEnabledAsLocalAdministrator: js.UndefOr[Boolean] = js.undefined
  ): WorkspaceCreationProperties = {
    val __obj = js.Dynamic.literal()
    if (CustomSecurityGroupId != null) __obj.updateDynamic("CustomSecurityGroupId")(CustomSecurityGroupId.asInstanceOf[js.Any])
    if (DefaultOu != null) __obj.updateDynamic("DefaultOu")(DefaultOu.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableInternetAccess)) __obj.updateDynamic("EnableInternetAccess")(EnableInternetAccess.asInstanceOf[js.Any])
    if (!js.isUndefined(EnableMaintenanceMode)) __obj.updateDynamic("EnableMaintenanceMode")(EnableMaintenanceMode.asInstanceOf[js.Any])
    if (!js.isUndefined(UserEnabledAsLocalAdministrator)) __obj.updateDynamic("UserEnabledAsLocalAdministrator")(UserEnabledAsLocalAdministrator.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkspaceCreationProperties]
  }
}

