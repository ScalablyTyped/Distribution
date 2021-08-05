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
  
  inline def apply(): UserGroupsUpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserGroupsUpdateStatus]
  }
  
  extension [Self <: UserGroupsUpdateStatus](x: Self) {
    
    inline def setUserGroupIdsToAdd(value: UserGroupIdList): Self = StObject.set(x, "UserGroupIdsToAdd", value.asInstanceOf[js.Any])
    
    inline def setUserGroupIdsToAddUndefined: Self = StObject.set(x, "UserGroupIdsToAdd", js.undefined)
    
    inline def setUserGroupIdsToAddVarargs(value: UserGroupId*): Self = StObject.set(x, "UserGroupIdsToAdd", js.Array(value :_*))
    
    inline def setUserGroupIdsToRemove(value: UserGroupIdList): Self = StObject.set(x, "UserGroupIdsToRemove", value.asInstanceOf[js.Any])
    
    inline def setUserGroupIdsToRemoveUndefined: Self = StObject.set(x, "UserGroupIdsToRemove", js.undefined)
    
    inline def setUserGroupIdsToRemoveVarargs(value: UserGroupId*): Self = StObject.set(x, "UserGroupIdsToRemove", js.Array(value :_*))
  }
}
