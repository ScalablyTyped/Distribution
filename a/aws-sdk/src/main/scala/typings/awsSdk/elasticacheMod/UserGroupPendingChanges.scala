package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserGroupPendingChanges extends StObject {
  
  /**
    * The list of user IDs to add.
    */
  var UserIdsToAdd: js.UndefOr[UserIdList] = js.undefined
  
  /**
    * The list of user group IDs ro remove.
    */
  var UserIdsToRemove: js.UndefOr[UserIdList] = js.undefined
}
object UserGroupPendingChanges {
  
  @scala.inline
  def apply(): UserGroupPendingChanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserGroupPendingChanges]
  }
  
  @scala.inline
  implicit class UserGroupPendingChangesMutableBuilder[Self <: UserGroupPendingChanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserIdsToAdd(value: UserIdList): Self = StObject.set(x, "UserIdsToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdsToAddUndefined: Self = StObject.set(x, "UserIdsToAdd", js.undefined)
    
    @scala.inline
    def setUserIdsToAddVarargs(value: UserId*): Self = StObject.set(x, "UserIdsToAdd", js.Array(value :_*))
    
    @scala.inline
    def setUserIdsToRemove(value: UserIdList): Self = StObject.set(x, "UserIdsToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdsToRemoveUndefined: Self = StObject.set(x, "UserIdsToRemove", js.undefined)
    
    @scala.inline
    def setUserIdsToRemoveVarargs(value: UserId*): Self = StObject.set(x, "UserIdsToRemove", js.Array(value :_*))
  }
}
