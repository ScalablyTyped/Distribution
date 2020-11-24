package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserGroupsUpdateStatus extends js.Object {
  
  /**
    * The list of user group IDs to add.
    */
  var UserGroupIdsToAdd: js.UndefOr[UserGroupIdList] = js.native
  
  /**
    * The list of user group IDs to remove.
    */
  var UserGroupIdsToRemove: js.UndefOr[UserGroupIdList] = js.native
}
object UserGroupsUpdateStatus {
  
  @scala.inline
  def apply(): UserGroupsUpdateStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserGroupsUpdateStatus]
  }
  
  @scala.inline
  implicit class UserGroupsUpdateStatusOps[Self <: UserGroupsUpdateStatus] (val x: Self) extends AnyVal {
    
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
    def setUserGroupIdsToAddVarargs(value: UserGroupId*): Self = this.set("UserGroupIdsToAdd", js.Array(value :_*))
    
    @scala.inline
    def setUserGroupIdsToAdd(value: UserGroupIdList): Self = this.set("UserGroupIdsToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserGroupIdsToAdd: Self = this.set("UserGroupIdsToAdd", js.undefined)
    
    @scala.inline
    def setUserGroupIdsToRemoveVarargs(value: UserGroupId*): Self = this.set("UserGroupIdsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setUserGroupIdsToRemove(value: UserGroupIdList): Self = this.set("UserGroupIdsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserGroupIdsToRemove: Self = this.set("UserGroupIdsToRemove", js.undefined)
  }
}
