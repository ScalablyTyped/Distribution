package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotTierStatus extends StObject {
  
  /**
    * The date and time when the last archive process was completed.
    */
  var ArchivalCompleteTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the last archive or restore process.
    */
  var LastTieringOperationStatus: js.UndefOr[TieringOperationStatus] = js.undefined
  
  /**
    * A message describing the status of the last archive or restore process.
    */
  var LastTieringOperationStatusDetail: js.UndefOr[String] = js.undefined
  
  /**
    * The progress of the last archive or restore process, as a percentage.
    */
  var LastTieringProgress: js.UndefOr[Integer] = js.undefined
  
  /**
    * The date and time when the last archive or restore process was started.
    */
  var LastTieringStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the snapshot.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  
  /**
    * Only for archived snapshots that are temporarily restored. Indicates the date and time when a temporarily restored snapshot will be automatically re-archived.
    */
  var RestoreExpiryTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.ec2Mod.SnapshotId] = js.undefined
  
  /**
    * The state of the snapshot.
    */
  var Status: js.UndefOr[SnapshotState] = js.undefined
  
  /**
    * The storage tier in which the snapshot is stored. standard indicates that the snapshot is stored in the standard snapshot storage tier and that it is ready for use. archive indicates that the snapshot is currently archived and that it must be restored before it can be used.
    */
  var StorageTier: js.UndefOr[typings.awsSdk.ec2Mod.StorageTier] = js.undefined
  
  /**
    * The tags that are assigned to the snapshot.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the volume from which the snapshot was created.
    */
  var VolumeId: js.UndefOr[typings.awsSdk.ec2Mod.VolumeId] = js.undefined
}
object SnapshotTierStatus {
  
  inline def apply(): SnapshotTierStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotTierStatus]
  }
  
  extension [Self <: SnapshotTierStatus](x: Self) {
    
    inline def setArchivalCompleteTime(value: js.Date): Self = StObject.set(x, "ArchivalCompleteTime", value.asInstanceOf[js.Any])
    
    inline def setArchivalCompleteTimeUndefined: Self = StObject.set(x, "ArchivalCompleteTime", js.undefined)
    
    inline def setLastTieringOperationStatus(value: TieringOperationStatus): Self = StObject.set(x, "LastTieringOperationStatus", value.asInstanceOf[js.Any])
    
    inline def setLastTieringOperationStatusDetail(value: String): Self = StObject.set(x, "LastTieringOperationStatusDetail", value.asInstanceOf[js.Any])
    
    inline def setLastTieringOperationStatusDetailUndefined: Self = StObject.set(x, "LastTieringOperationStatusDetail", js.undefined)
    
    inline def setLastTieringOperationStatusUndefined: Self = StObject.set(x, "LastTieringOperationStatus", js.undefined)
    
    inline def setLastTieringProgress(value: Integer): Self = StObject.set(x, "LastTieringProgress", value.asInstanceOf[js.Any])
    
    inline def setLastTieringProgressUndefined: Self = StObject.set(x, "LastTieringProgress", js.undefined)
    
    inline def setLastTieringStartTime(value: js.Date): Self = StObject.set(x, "LastTieringStartTime", value.asInstanceOf[js.Any])
    
    inline def setLastTieringStartTimeUndefined: Self = StObject.set(x, "LastTieringStartTime", js.undefined)
    
    inline def setOwnerId(value: String): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
    
    inline def setRestoreExpiryTime(value: js.Date): Self = StObject.set(x, "RestoreExpiryTime", value.asInstanceOf[js.Any])
    
    inline def setRestoreExpiryTimeUndefined: Self = StObject.set(x, "RestoreExpiryTime", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setStatus(value: SnapshotState): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStorageTier(value: StorageTier): Self = StObject.set(x, "StorageTier", value.asInstanceOf[js.Any])
    
    inline def setStorageTierUndefined: Self = StObject.set(x, "StorageTier", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
  }
}
