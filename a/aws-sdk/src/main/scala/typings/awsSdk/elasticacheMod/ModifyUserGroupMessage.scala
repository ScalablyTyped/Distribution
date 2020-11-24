package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyUserGroupMessage extends js.Object {
  
  /**
    * The ID of the user group.
    */
  var UserGroupId: String = js.native
  
  /**
    * The list of user IDs to add to the user group.
    */
  var UserIdsToAdd: js.UndefOr[UserIdListInput] = js.native
  
  /**
    * The list of user IDs to remove from the user group.
    */
  var UserIdsToRemove: js.UndefOr[UserIdListInput] = js.native
}
object ModifyUserGroupMessage {
  
  @scala.inline
  def apply(UserGroupId: String): ModifyUserGroupMessage = {
    val __obj = js.Dynamic.literal(UserGroupId = UserGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyUserGroupMessage]
  }
  
  @scala.inline
  implicit class ModifyUserGroupMessageOps[Self <: ModifyUserGroupMessage] (val x: Self) extends AnyVal {
    
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
    def setUserGroupId(value: String): Self = this.set("UserGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdsToAddVarargs(value: UserId*): Self = this.set("UserIdsToAdd", js.Array(value :_*))
    
    @scala.inline
    def setUserIdsToAdd(value: UserIdListInput): Self = this.set("UserIdsToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIdsToAdd: Self = this.set("UserIdsToAdd", js.undefined)
    
    @scala.inline
    def setUserIdsToRemoveVarargs(value: UserId*): Self = this.set("UserIdsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setUserIdsToRemove(value: UserIdListInput): Self = this.set("UserIdsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIdsToRemove: Self = this.set("UserIdsToRemove", js.undefined)
  }
}
