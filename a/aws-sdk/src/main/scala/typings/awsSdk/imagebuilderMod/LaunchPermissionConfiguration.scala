package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchPermissionConfiguration extends StObject {
  
  /**
    * The name of the group. 
    */
  var userGroups: js.UndefOr[StringList] = js.undefined
  
  /**
    * The AWS account ID. 
    */
  var userIds: js.UndefOr[AccountList] = js.undefined
}
object LaunchPermissionConfiguration {
  
  inline def apply(): LaunchPermissionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchPermissionConfiguration]
  }
  
  extension [Self <: LaunchPermissionConfiguration](x: Self) {
    
    inline def setUserGroups(value: StringList): Self = StObject.set(x, "userGroups", value.asInstanceOf[js.Any])
    
    inline def setUserGroupsUndefined: Self = StObject.set(x, "userGroups", js.undefined)
    
    inline def setUserGroupsVarargs(value: NonEmptyString*): Self = StObject.set(x, "userGroups", js.Array(value :_*))
    
    inline def setUserIds(value: AccountList): Self = StObject.set(x, "userIds", value.asInstanceOf[js.Any])
    
    inline def setUserIdsUndefined: Self = StObject.set(x, "userIds", js.undefined)
    
    inline def setUserIdsVarargs(value: AccountId*): Self = StObject.set(x, "userIds", js.Array(value :_*))
  }
}
