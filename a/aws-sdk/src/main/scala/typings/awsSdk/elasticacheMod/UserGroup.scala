package typings.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserGroup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user group.
    */
  var ARN: js.UndefOr[String] = js.native
  
  /**
    * Must be Redis. 
    */
  var Engine: js.UndefOr[EngineType] = js.native
  
  /**
    * A list of updates being applied to the user groups.
    */
  var PendingChanges: js.UndefOr[UserGroupPendingChanges] = js.native
  
  /**
    * A list of replication groups that the user group can access.
    */
  var ReplicationGroups: js.UndefOr[UGReplicationGroupIdList] = js.native
  
  /**
    * Indicates user group status. Can be "creating", "active", "modifying", "deleting".
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * The ID of the user group.
    */
  var UserGroupId: js.UndefOr[String] = js.native
  
  /**
    * The list of user IDs that belong to the user group.
    */
  var UserIds: js.UndefOr[UserIdList] = js.native
}
object UserGroup {
  
  @scala.inline
  def apply(): UserGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserGroup]
  }
  
  @scala.inline
  implicit class UserGroupMutableBuilder[Self <: UserGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setEngine(value: EngineType): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setPendingChanges(value: UserGroupPendingChanges): Self = StObject.set(x, "PendingChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingChangesUndefined: Self = StObject.set(x, "PendingChanges", js.undefined)
    
    @scala.inline
    def setReplicationGroups(value: UGReplicationGroupIdList): Self = StObject.set(x, "ReplicationGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupsUndefined: Self = StObject.set(x, "ReplicationGroups", js.undefined)
    
    @scala.inline
    def setReplicationGroupsVarargs(value: String*): Self = StObject.set(x, "ReplicationGroups", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUserGroupId(value: String): Self = StObject.set(x, "UserGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGroupIdUndefined: Self = StObject.set(x, "UserGroupId", js.undefined)
    
    @scala.inline
    def setUserIds(value: UserIdList): Self = StObject.set(x, "UserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdsUndefined: Self = StObject.set(x, "UserIds", js.undefined)
    
    @scala.inline
    def setUserIdsVarargs(value: UserId*): Self = StObject.set(x, "UserIds", js.Array(value :_*))
  }
}
