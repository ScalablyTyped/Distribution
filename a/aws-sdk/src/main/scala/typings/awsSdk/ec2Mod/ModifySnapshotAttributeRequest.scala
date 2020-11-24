package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifySnapshotAttributeRequest extends js.Object {
  
  /**
    * The snapshot attribute to modify. Only volume creation permissions can be modified.
    */
  var Attribute: js.UndefOr[SnapshotAttributeName] = js.native
  
  /**
    * A JSON representation of the snapshot attribute modification.
    */
  var CreateVolumePermission: js.UndefOr[CreateVolumePermissionModifications] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The group to modify for the snapshot.
    */
  var GroupNames: js.UndefOr[GroupNameStringList] = js.native
  
  /**
    * The type of operation to perform to the attribute.
    */
  var OperationType: js.UndefOr[typings.awsSdk.ec2Mod.OperationType] = js.native
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: typings.awsSdk.ec2Mod.SnapshotId = js.native
  
  /**
    * The account ID to modify for the snapshot.
    */
  var UserIds: js.UndefOr[UserIdStringList] = js.native
}
object ModifySnapshotAttributeRequest {
  
  @scala.inline
  def apply(SnapshotId: SnapshotId): ModifySnapshotAttributeRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySnapshotAttributeRequest]
  }
  
  @scala.inline
  implicit class ModifySnapshotAttributeRequestOps[Self <: ModifySnapshotAttributeRequest] (val x: Self) extends AnyVal {
    
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
    def setSnapshotId(value: SnapshotId): Self = this.set("SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttribute(value: SnapshotAttributeName): Self = this.set("Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttribute: Self = this.set("Attribute", js.undefined)
    
    @scala.inline
    def setCreateVolumePermission(value: CreateVolumePermissionModifications): Self = this.set("CreateVolumePermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateVolumePermission: Self = this.set("CreateVolumePermission", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setGroupNamesVarargs(value: SecurityGroupName*): Self = this.set("GroupNames", js.Array(value :_*))
    
    @scala.inline
    def setGroupNames(value: GroupNameStringList): Self = this.set("GroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroupNames: Self = this.set("GroupNames", js.undefined)
    
    @scala.inline
    def setOperationType(value: OperationType): Self = this.set("OperationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationType: Self = this.set("OperationType", js.undefined)
    
    @scala.inline
    def setUserIdsVarargs(value: String*): Self = this.set("UserIds", js.Array(value :_*))
    
    @scala.inline
    def setUserIds(value: UserIdStringList): Self = this.set("UserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserIds: Self = this.set("UserIds", js.undefined)
  }
}
