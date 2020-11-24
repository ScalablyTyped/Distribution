package typings.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserGroup extends js.Object {
  
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
  implicit class UserGroupOps[Self <: UserGroup] (val x: Self) extends AnyVal {
    
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
    def setARN(value: String): Self = this.set("ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteARN: Self = this.set("ARN", js.undefined)
    
    @scala.inline
    def setEngine(value: EngineType): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    
    @scala.inline
    def setPendingChanges(value: UserGroupPendingChanges): Self = this.set("PendingChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingChanges: Self = this.set("PendingChanges", js.undefined)
    
    @scala.inline
    def setReplicationGroupsVarargs(value: String*): Self = this.set("ReplicationGroups", js.Array(value :_*))
    
    @scala.inline
    def setReplicationGroups(value: UGReplicationGroupIdList): Self = this.set("ReplicationGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplicationGroups: Self = this.set("ReplicationGroups", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setUserGroupId(value: String): Self = this.set("UserGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserGroupId: Self = this.set("UserGroupId", js.undefined)
    
    @scala.inline
    def setUserIdsVarargs(value: UserId*): Self = this.set("UserIds", js.Array(value :_*))
    
    @scala.inline
    def setUserIds(value: UserIdList): Self = this.set("UserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIds: Self = this.set("UserIds", js.undefined)
  }
}
