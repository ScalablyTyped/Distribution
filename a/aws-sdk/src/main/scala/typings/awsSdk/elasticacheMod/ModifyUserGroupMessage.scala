package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyUserGroupMessage extends StObject {
  
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
  implicit class ModifyUserGroupMessageMutableBuilder[Self <: ModifyUserGroupMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserGroupId(value: String): Self = StObject.set(x, "UserGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdsToAdd(value: UserIdListInput): Self = StObject.set(x, "UserIdsToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdsToAddUndefined: Self = StObject.set(x, "UserIdsToAdd", js.undefined)
    
    @scala.inline
    def setUserIdsToAddVarargs(value: UserId*): Self = StObject.set(x, "UserIdsToAdd", js.Array(value :_*))
    
    @scala.inline
    def setUserIdsToRemove(value: UserIdListInput): Self = StObject.set(x, "UserIdsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdsToRemoveUndefined: Self = StObject.set(x, "UserIdsToRemove", js.undefined)
    
    @scala.inline
    def setUserIdsToRemoveVarargs(value: UserId*): Self = StObject.set(x, "UserIdsToRemove", js.Array(value :_*))
  }
}
