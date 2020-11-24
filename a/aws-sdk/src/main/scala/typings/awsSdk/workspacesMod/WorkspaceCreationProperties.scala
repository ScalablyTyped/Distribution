package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceCreationProperties extends js.Object {
  
  /**
    * The identifier of your custom security group.
    */
  var CustomSecurityGroupId: js.UndefOr[SecurityGroupId] = js.native
  
  /**
    * The default organizational unit (OU) for your WorkSpaces directories. This string must be the full Lightweight Directory Access Protocol (LDAP) distinguished name for the target domain and OU. It must be in the form "OU=value,DC=value,DC=value", where value is any string of characters, and the number of domain components (DCs) is two or more. For example, OU=WorkSpaces_machines,DC=machines,DC=example,DC=com.     To avoid errors, certain characters in the distinguished name must be escaped. For more information, see  Distinguished Names in the Microsoft documentation.   The API doesn't validate whether the OU exists.   
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
    * Indicates whether Amazon WorkDocs is enabled for your WorkSpaces.  If WorkDocs is already enabled for a WorkSpaces directory and you disable it, new WorkSpaces launched in the directory will not have WorkDocs enabled. However, WorkDocs remains enabled for any existing WorkSpaces, unless you either disable users' access to WorkDocs or you delete the WorkDocs site. To disable users' access to WorkDocs, see Disabling Users in the Amazon WorkDocs Administration Guide. To delete a WorkDocs site, see Deleting a Site in the Amazon WorkDocs Administration Guide. If you enable WorkDocs on a directory that already has existing WorkSpaces, the existing WorkSpaces and any new WorkSpaces that are launched in the directory will have WorkDocs enabled. 
    */
  var EnableWorkDocs: js.UndefOr[BooleanObject] = js.native
  
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
    def setEnableWorkDocs(value: BooleanObject): Self = this.set("EnableWorkDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableWorkDocs: Self = this.set("EnableWorkDocs", js.undefined)
    
    @scala.inline
    def setUserEnabledAsLocalAdministrator(value: BooleanObject): Self = this.set("UserEnabledAsLocalAdministrator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserEnabledAsLocalAdministrator: Self = this.set("UserEnabledAsLocalAdministrator", js.undefined)
  }
}
