package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspaceSnapshotsResult extends StObject {
  
  /**
    * Information about the snapshots that can be used to rebuild a WorkSpace. These snapshots include the user volume.
    */
  var RebuildSnapshots: js.UndefOr[SnapshotList] = js.undefined
  
  /**
    * Information about the snapshots that can be used to restore a WorkSpace. These snapshots include both the root volume and the user volume.
    */
  var RestoreSnapshots: js.UndefOr[SnapshotList] = js.undefined
}
object DescribeWorkspaceSnapshotsResult {
  
  inline def apply(): DescribeWorkspaceSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceSnapshotsResult]
  }
  
  extension [Self <: DescribeWorkspaceSnapshotsResult](x: Self) {
    
    inline def setRebuildSnapshots(value: SnapshotList): Self = StObject.set(x, "RebuildSnapshots", value.asInstanceOf[js.Any])
    
    inline def setRebuildSnapshotsUndefined: Self = StObject.set(x, "RebuildSnapshots", js.undefined)
    
    inline def setRebuildSnapshotsVarargs(value: Snapshot*): Self = StObject.set(x, "RebuildSnapshots", js.Array(value*))
    
    inline def setRestoreSnapshots(value: SnapshotList): Self = StObject.set(x, "RestoreSnapshots", value.asInstanceOf[js.Any])
    
    inline def setRestoreSnapshotsUndefined: Self = StObject.set(x, "RestoreSnapshots", js.undefined)
    
    inline def setRestoreSnapshotsVarargs(value: Snapshot*): Self = StObject.set(x, "RestoreSnapshots", js.Array(value*))
  }
}
