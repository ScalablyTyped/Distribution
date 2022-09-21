package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeModification extends StObject {
  
  /**
    * The modification completion or failure time.
    */
  var EndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current modification state. The modification state is null for unmodified volumes.
    */
  var ModificationState: js.UndefOr[VolumeModificationState] = js.undefined
  
  /**
    * The original IOPS rate of the volume.
    */
  var OriginalIops: js.UndefOr[Integer] = js.undefined
  
  /**
    * The original setting for Amazon EBS Multi-Attach.
    */
  var OriginalMultiAttachEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The original size of the volume, in GiB.
    */
  var OriginalSize: js.UndefOr[Integer] = js.undefined
  
  /**
    * The original throughput of the volume, in MiB/s.
    */
  var OriginalThroughput: js.UndefOr[Integer] = js.undefined
  
  /**
    * The original EBS volume type of the volume.
    */
  var OriginalVolumeType: js.UndefOr[VolumeType] = js.undefined
  
  /**
    * The modification progress, from 0 to 100 percent complete.
    */
  var Progress: js.UndefOr[Long] = js.undefined
  
  /**
    * The modification start time.
    */
  var StartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A status message about the modification progress or failure.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The target IOPS rate of the volume.
    */
  var TargetIops: js.UndefOr[Integer] = js.undefined
  
  /**
    * The target setting for Amazon EBS Multi-Attach.
    */
  var TargetMultiAttachEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The target size of the volume, in GiB.
    */
  var TargetSize: js.UndefOr[Integer] = js.undefined
  
  /**
    * The target throughput of the volume, in MiB/s.
    */
  var TargetThroughput: js.UndefOr[Integer] = js.undefined
  
  /**
    * The target EBS volume type of the volume.
    */
  var TargetVolumeType: js.UndefOr[VolumeType] = js.undefined
  
  /**
    * The ID of the volume.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
}
object VolumeModification {
  
  inline def apply(): VolumeModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeModification]
  }
  
  extension [Self <: VolumeModification](x: Self) {
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    inline def setModificationState(value: VolumeModificationState): Self = StObject.set(x, "ModificationState", value.asInstanceOf[js.Any])
    
    inline def setModificationStateUndefined: Self = StObject.set(x, "ModificationState", js.undefined)
    
    inline def setOriginalIops(value: Integer): Self = StObject.set(x, "OriginalIops", value.asInstanceOf[js.Any])
    
    inline def setOriginalIopsUndefined: Self = StObject.set(x, "OriginalIops", js.undefined)
    
    inline def setOriginalMultiAttachEnabled(value: Boolean): Self = StObject.set(x, "OriginalMultiAttachEnabled", value.asInstanceOf[js.Any])
    
    inline def setOriginalMultiAttachEnabledUndefined: Self = StObject.set(x, "OriginalMultiAttachEnabled", js.undefined)
    
    inline def setOriginalSize(value: Integer): Self = StObject.set(x, "OriginalSize", value.asInstanceOf[js.Any])
    
    inline def setOriginalSizeUndefined: Self = StObject.set(x, "OriginalSize", js.undefined)
    
    inline def setOriginalThroughput(value: Integer): Self = StObject.set(x, "OriginalThroughput", value.asInstanceOf[js.Any])
    
    inline def setOriginalThroughputUndefined: Self = StObject.set(x, "OriginalThroughput", js.undefined)
    
    inline def setOriginalVolumeType(value: VolumeType): Self = StObject.set(x, "OriginalVolumeType", value.asInstanceOf[js.Any])
    
    inline def setOriginalVolumeTypeUndefined: Self = StObject.set(x, "OriginalVolumeType", js.undefined)
    
    inline def setProgress(value: Long): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    inline def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    inline def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setTargetIops(value: Integer): Self = StObject.set(x, "TargetIops", value.asInstanceOf[js.Any])
    
    inline def setTargetIopsUndefined: Self = StObject.set(x, "TargetIops", js.undefined)
    
    inline def setTargetMultiAttachEnabled(value: Boolean): Self = StObject.set(x, "TargetMultiAttachEnabled", value.asInstanceOf[js.Any])
    
    inline def setTargetMultiAttachEnabledUndefined: Self = StObject.set(x, "TargetMultiAttachEnabled", js.undefined)
    
    inline def setTargetSize(value: Integer): Self = StObject.set(x, "TargetSize", value.asInstanceOf[js.Any])
    
    inline def setTargetSizeUndefined: Self = StObject.set(x, "TargetSize", js.undefined)
    
    inline def setTargetThroughput(value: Integer): Self = StObject.set(x, "TargetThroughput", value.asInstanceOf[js.Any])
    
    inline def setTargetThroughputUndefined: Self = StObject.set(x, "TargetThroughput", js.undefined)
    
    inline def setTargetVolumeType(value: VolumeType): Self = StObject.set(x, "TargetVolumeType", value.asInstanceOf[js.Any])
    
    inline def setTargetVolumeTypeUndefined: Self = StObject.set(x, "TargetVolumeType", js.undefined)
    
    inline def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
  }
}
