package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserGroupsUpdateStatus extends StObject {
  
  /**
    * The list of user group IDs to add.
    */
  var UserGroupIdsToAdd: js.UndefOr[UserGroupIdList] = js.undefined
  
  /**
    * The list of user group IDs to remove.
    */
  var UserGroupIdsToRemove: js.UndefOr[UserGroupIdList] = js.undefined
}
object UserGroupsUpdateStatus {
  
  @scala.inline
  def apply(): UserGroupsUpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserGroupsUpdateStatus]
  }
  
  @scala.inline
  implicit class UserGroupsUpdateStatusMutableBuilder[Self <: UserGroupsUpdateStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserGroupIdsToAdd(value: UserGroupIdList): Self = StObject.set(x, "UserGroupIdsToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGroupIdsToAddUndefined: Self = StObject.set(x, "UserGroupIdsToAdd", js.undefined)
    
    @scala.inline
    def setUserGroupIdsToAddVarargs(value: UserGroupId*): Self = StObject.set(x, "UserGroupIdsToAdd", js.Array(value :_*))
    
    @scala.inline
    def setUserGroupIdsToRemove(value: UserGroupIdList): Self = StObject.set(x, "UserGroupIdsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGroupIdsToRemoveUndefined: Self = StObject.set(x, "UserGroupIdsToRemove", js.undefined)
    
    @scala.inline
    def setUserGroupIdsToRemoveVarargs(value: UserGroupId*): Self = StObject.set(x, "UserGroupIdsToRemove", js.Array(value :_*))
  }
}
