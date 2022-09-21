package typings.awsSdk.finspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionGroup extends StObject {
  
  /**
    * Indicates the permissions that are granted to a specific group for accessing the FinSpace application.  When assigning application permissions, be aware that the permission ManageUsersAndGroups allows users to grant themselves or others access to any functionality in their FinSpace environment's application. It should only be granted to trusted users.     CreateDataset – Group members can create new datasets.    ManageClusters – Group members can manage Apache Spark clusters from FinSpace notebooks.    ManageUsersAndGroups – Group members can manage users and permission groups. This is a privileged permission that allows users to grant themselves or others access to any functionality in the application. It should only be granted to trusted users.    ManageAttributeSets – Group members can manage attribute sets.    ViewAuditData – Group members can view audit data.    AccessNotebooks – Group members will have access to FinSpace notebooks.    GetTemporaryCredentials – Group members can get temporary API credentials.  
    */
  var applicationPermissions: js.UndefOr[ApplicationPermissionList] = js.undefined
  
  /**
    * The timestamp at which the group was created in FinSpace. The value is determined as epoch time in milliseconds. 
    */
  var createTime: js.UndefOr[TimestampEpoch] = js.undefined
  
  /**
    *  A brief description for the permission group.
    */
  var description: js.UndefOr[PermissionGroupDescription] = js.undefined
  
  /**
    * Describes the last time the permission group was updated. The value is determined as epoch time in milliseconds. 
    */
  var lastModifiedTime: js.UndefOr[TimestampEpoch] = js.undefined
  
  /**
    * Indicates the status of the user account within a permission group.    ADDITION_IN_PROGRESS – The user account is currently being added to the permission group.    ADDITION_SUCCESS – The user account is successfully added to the permission group.    REMOVAL_IN_PROGRESS – The user is currently being removed from the permission group.  
    */
  var membershipStatus: js.UndefOr[PermissionGroupMembershipStatus] = js.undefined
  
  /**
    * The name of the permission group.
    */
  var name: js.UndefOr[PermissionGroupName] = js.undefined
  
  /**
    *  The unique identifier for the permission group.
    */
  var permissionGroupId: js.UndefOr[PermissionGroupId] = js.undefined
}
object PermissionGroup {
  
  inline def apply(): PermissionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PermissionGroup]
  }
  
  extension [Self <: PermissionGroup](x: Self) {
    
    inline def setApplicationPermissions(value: ApplicationPermissionList): Self = StObject.set(x, "applicationPermissions", value.asInstanceOf[js.Any])
    
    inline def setApplicationPermissionsUndefined: Self = StObject.set(x, "applicationPermissions", js.undefined)
    
    inline def setApplicationPermissionsVarargs(value: ApplicationPermission*): Self = StObject.set(x, "applicationPermissions", js.Array(value*))
    
    inline def setCreateTime(value: TimestampEpoch): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setDescription(value: PermissionGroupDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setLastModifiedTime(value: TimestampEpoch): Self = StObject.set(x, "lastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "lastModifiedTime", js.undefined)
    
    inline def setMembershipStatus(value: PermissionGroupMembershipStatus): Self = StObject.set(x, "membershipStatus", value.asInstanceOf[js.Any])
    
    inline def setMembershipStatusUndefined: Self = StObject.set(x, "membershipStatus", js.undefined)
    
    inline def setName(value: PermissionGroupName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPermissionGroupId(value: PermissionGroupId): Self = StObject.set(x, "permissionGroupId", value.asInstanceOf[js.Any])
    
    inline def setPermissionGroupIdUndefined: Self = StObject.set(x, "permissionGroupId", js.undefined)
  }
}
