package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkspaceCreationProperties extends StObject {
  
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
  implicit class WorkspaceCreationPropertiesMutableBuilder[Self <: WorkspaceCreationProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomSecurityGroupId(value: SecurityGroupId): Self = StObject.set(x, "CustomSecurityGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomSecurityGroupIdUndefined: Self = StObject.set(x, "CustomSecurityGroupId", js.undefined)
    
    @scala.inline
    def setDefaultOu(value: DefaultOu): Self = StObject.set(x, "DefaultOu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultOuUndefined: Self = StObject.set(x, "DefaultOu", js.undefined)
    
    @scala.inline
    def setEnableInternetAccess(value: BooleanObject): Self = StObject.set(x, "EnableInternetAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableInternetAccessUndefined: Self = StObject.set(x, "EnableInternetAccess", js.undefined)
    
    @scala.inline
    def setEnableMaintenanceMode(value: BooleanObject): Self = StObject.set(x, "EnableMaintenanceMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableMaintenanceModeUndefined: Self = StObject.set(x, "EnableMaintenanceMode", js.undefined)
    
    @scala.inline
    def setEnableWorkDocs(value: BooleanObject): Self = StObject.set(x, "EnableWorkDocs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableWorkDocsUndefined: Self = StObject.set(x, "EnableWorkDocs", js.undefined)
    
    @scala.inline
    def setUserEnabledAsLocalAdministrator(value: BooleanObject): Self = StObject.set(x, "UserEnabledAsLocalAdministrator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEnabledAsLocalAdministratorUndefined: Self = StObject.set(x, "UserEnabledAsLocalAdministrator", js.undefined)
  }
}
