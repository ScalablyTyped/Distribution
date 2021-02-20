package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifySnapshotAttributeRequest extends StObject {
  
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
  implicit class ModifySnapshotAttributeRequestMutableBuilder[Self <: ModifySnapshotAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: SnapshotAttributeName): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeUndefined: Self = StObject.set(x, "Attribute", js.undefined)
    
    @scala.inline
    def setCreateVolumePermission(value: CreateVolumePermissionModifications): Self = StObject.set(x, "CreateVolumePermission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateVolumePermissionUndefined: Self = StObject.set(x, "CreateVolumePermission", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setGroupNames(value: GroupNameStringList): Self = StObject.set(x, "GroupNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupNamesUndefined: Self = StObject.set(x, "GroupNames", js.undefined)
    
    @scala.inline
    def setGroupNamesVarargs(value: SecurityGroupName*): Self = StObject.set(x, "GroupNames", js.Array(value :_*))
    
    @scala.inline
    def setOperationType(value: OperationType): Self = StObject.set(x, "OperationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationTypeUndefined: Self = StObject.set(x, "OperationType", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIds(value: UserIdStringList): Self = StObject.set(x, "UserIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdsUndefined: Self = StObject.set(x, "UserIds", js.undefined)
    
    @scala.inline
    def setUserIdsVarargs(value: String*): Self = StObject.set(x, "UserIds", js.Array(value :_*))
  }
}
