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
  
  @scala.inline
  def apply(): LaunchPermissionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchPermissionConfiguration]
  }
  
  @scala.inline
  implicit class LaunchPermissionConfigurationMutableBuilder[Self <: LaunchPermissionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUserGroups(value: StringList): Self = StObject.set(x, "userGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGroupsUndefined: Self = StObject.set(x, "userGroups", js.undefined)
    
    @scala.inline
    def setUserGroupsVarargs(value: NonEmptyString*): Self = StObject.set(x, "userGroups", js.Array(value :_*))
    
    @scala.inline
    def setUserIds(value: AccountList): Self = StObject.set(x, "userIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdsUndefined: Self = StObject.set(x, "userIds", js.undefined)
    
    @scala.inline
    def setUserIdsVarargs(value: AccountId*): Self = StObject.set(x, "userIds", js.Array(value :_*))
  }
}
