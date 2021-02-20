package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorkspaceSnapshotsResult extends StObject {
  
  /**
    * Information about the snapshots that can be used to rebuild a WorkSpace. These snapshots include the user volume.
    */
  var RebuildSnapshots: js.UndefOr[SnapshotList] = js.native
  
  /**
    * Information about the snapshots that can be used to restore a WorkSpace. These snapshots include both the root volume and the user volume.
    */
  var RestoreSnapshots: js.UndefOr[SnapshotList] = js.native
}
object DescribeWorkspaceSnapshotsResult {
  
  @scala.inline
  def apply(): DescribeWorkspaceSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceSnapshotsResult]
  }
  
  @scala.inline
  implicit class DescribeWorkspaceSnapshotsResultMutableBuilder[Self <: DescribeWorkspaceSnapshotsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRebuildSnapshots(value: SnapshotList): Self = StObject.set(x, "RebuildSnapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRebuildSnapshotsUndefined: Self = StObject.set(x, "RebuildSnapshots", js.undefined)
    
    @scala.inline
    def setRebuildSnapshotsVarargs(value: Snapshot*): Self = StObject.set(x, "RebuildSnapshots", js.Array(value :_*))
    
    @scala.inline
    def setRestoreSnapshots(value: SnapshotList): Self = StObject.set(x, "RestoreSnapshots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreSnapshotsUndefined: Self = StObject.set(x, "RestoreSnapshots", js.undefined)
    
    @scala.inline
    def setRestoreSnapshotsVarargs(value: Snapshot*): Self = StObject.set(x, "RestoreSnapshots", js.Array(value :_*))
  }
}
