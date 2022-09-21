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
    * The list of user IDs to remove.
    */
  var UserIdsToRemove: js.UndefOr[UserIdList] = js.undefined
}
object UserGroupPendingChanges {
  
  inline def apply(): UserGroupPendingChanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserGroupPendingChanges]
  }
  
  extension [Self <: UserGroupPendingChanges](x: Self) {
    
    inline def setUserIdsToAdd(value: UserIdList): Self = StObject.set(x, "UserIdsToAdd", value.asInstanceOf[js.Any])
    
    inline def setUserIdsToAddUndefined: Self = StObject.set(x, "UserIdsToAdd", js.undefined)
    
    inline def setUserIdsToAddVarargs(value: UserId*): Self = StObject.set(x, "UserIdsToAdd", js.Array(value*))
    
    inline def setUserIdsToRemove(value: UserIdList): Self = StObject.set(x, "UserIdsToRemove", value.asInstanceOf[js.Any])
    
    inline def setUserIdsToRemoveUndefined: Self = StObject.set(x, "UserIdsToRemove", js.undefined)
    
    inline def setUserIdsToRemoveVarargs(value: UserId*): Self = StObject.set(x, "UserIdsToRemove", js.Array(value*))
  }
}
