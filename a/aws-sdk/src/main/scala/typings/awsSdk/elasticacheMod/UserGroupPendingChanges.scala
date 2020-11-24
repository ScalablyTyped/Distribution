package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserGroupPendingChanges extends js.Object {
  
  /**
    * The list of user IDs to add.
    */
  var UserIdsToAdd: js.UndefOr[UserIdList] = js.native
  
  /**
    * The list of user group IDs ro remove.
    */
  var UserIdsToRemove: js.UndefOr[UserIdList] = js.native
}
object UserGroupPendingChanges {
  
  @scala.inline
  def apply(): UserGroupPendingChanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserGroupPendingChanges]
  }
  
  @scala.inline
  implicit class UserGroupPendingChangesOps[Self <: UserGroupPendingChanges] (val x: Self) extends AnyVal {
    
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
    def setUserIdsToAddVarargs(value: UserId*): Self = this.set("UserIdsToAdd", js.Array(value :_*))
    
    @scala.inline
    def setUserIdsToAdd(value: UserIdList): Self = this.set("UserIdsToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIdsToAdd: Self = this.set("UserIdsToAdd", js.undefined)
    
    @scala.inline
    def setUserIdsToRemoveVarargs(value: UserId*): Self = this.set("UserIdsToRemove", js.Array(value :_*))
    
    @scala.inline
    def setUserIdsToRemove(value: UserIdList): Self = this.set("UserIdsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIdsToRemove: Self = this.set("UserIdsToRemove", js.undefined)
  }
}
