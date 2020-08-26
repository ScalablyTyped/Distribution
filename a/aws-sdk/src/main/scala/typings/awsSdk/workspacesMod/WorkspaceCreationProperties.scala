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
  def apply(): WorkspaceCreationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkspaceCreationProperties]
  }
  @scala.inline
  implicit class WorkspaceCreationPropertiesOps[Self <: WorkspaceCreationProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomSecurityGroupId(value: SecurityGroupId): Self = this.set("CustomSecurityGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomSecurityGroupId: Self = this.set("CustomSecurityGroupId", js.undefined)
    @scala.inline
    def setDefaultOu(value: DefaultOu): Self = this.set("DefaultOu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultOu: Self = this.set("DefaultOu", js.undefined)
    @scala.inline
    def setEnableInternetAccess(value: BooleanObject): Self = this.set("EnableInternetAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableInternetAccess: Self = this.set("EnableInternetAccess", js.undefined)
    @scala.inline
    def setEnableMaintenanceMode(value: BooleanObject): Self = this.set("EnableMaintenanceMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableMaintenanceMode: Self = this.set("EnableMaintenanceMode", js.undefined)
    @scala.inline
    def setUserEnabledAsLocalAdministrator(value: BooleanObject): Self = this.set("UserEnabledAsLocalAdministrator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserEnabledAsLocalAdministrator: Self = this.set("UserEnabledAsLocalAdministrator", js.undefined)
  }
  
}

