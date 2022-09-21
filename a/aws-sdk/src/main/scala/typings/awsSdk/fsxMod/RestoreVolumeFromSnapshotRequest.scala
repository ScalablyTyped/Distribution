package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreVolumeFromSnapshotRequest extends StObject {
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.fsxMod.ClientRequestToken] = js.undefined
  
  /**
    * The settings used when restoring the specified volume from snapshot.     DELETE_INTERMEDIATE_SNAPSHOTS - Deletes snapshots between the current state and the specified snapshot. If there are intermediate snapshots and this option isn't used, RestoreVolumeFromSnapshot fails.    DELETE_CLONED_VOLUMES - Deletes any dependent clone volumes created from intermediate snapshots. If there are any dependent clone volumes and this option isn't used, RestoreVolumeFromSnapshot fails.  
    */
  var Options: js.UndefOr[RestoreOpenZFSVolumeOptions] = js.undefined
  
  /**
    * The ID of the source snapshot. Specifies the snapshot that you are restoring from.
    */
  var SnapshotId: typings.awsSdk.fsxMod.SnapshotId
  
  /**
    * The ID of the volume that you are restoring.
    */
  var VolumeId: typings.awsSdk.fsxMod.VolumeId
}
object RestoreVolumeFromSnapshotRequest {
  
  inline def apply(SnapshotId: SnapshotId, VolumeId: VolumeId): RestoreVolumeFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any], VolumeId = VolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreVolumeFromSnapshotRequest]
  }
  
  extension [Self <: RestoreVolumeFromSnapshotRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setOptions(value: RestoreOpenZFSVolumeOptions): Self = StObject.set(x, "Options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "Options", js.undefined)
    
    inline def setOptionsVarargs(value: RestoreOpenZFSVolumeOption*): Self = StObject.set(x, "Options", js.Array(value*))
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
  }
}
