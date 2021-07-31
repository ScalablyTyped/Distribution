package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotFromVolumeRecoveryPointOutput extends StObject {
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[typings.awsSdk.storagegatewayMod.SnapshotId] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the iSCSI volume target. Use the DescribeStorediSCSIVolumes operation to return to retrieve the TargetARN for specified VolumeARN.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeARN] = js.undefined
  
  /**
    * The time the volume was created from the recovery point.
    */
  var VolumeRecoveryPointTime: js.UndefOr[String] = js.undefined
}
object CreateSnapshotFromVolumeRecoveryPointOutput {
  
  @scala.inline
  def apply(): CreateSnapshotFromVolumeRecoveryPointOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotFromVolumeRecoveryPointOutput]
  }
  
  @scala.inline
  implicit class CreateSnapshotFromVolumeRecoveryPointOutputMutableBuilder[Self <: CreateSnapshotFromVolumeRecoveryPointOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    @scala.inline
    def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeARNUndefined: Self = StObject.set(x, "VolumeARN", js.undefined)
    
    @scala.inline
    def setVolumeRecoveryPointTime(value: String): Self = StObject.set(x, "VolumeRecoveryPointTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeRecoveryPointTimeUndefined: Self = StObject.set(x, "VolumeRecoveryPointTime", js.undefined)
  }
}
