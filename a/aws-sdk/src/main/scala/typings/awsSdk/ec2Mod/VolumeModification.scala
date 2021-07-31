package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeModification extends StObject {
  
  /**
    * The modification completion or failure time.
    */
  var EndTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The current modification state. The modification state is null for unmodified volumes.
    */
  var ModificationState: js.UndefOr[VolumeModificationState] = js.undefined
  
  /**
    * The original IOPS rate of the volume.
    */
  var OriginalIops: js.UndefOr[Integer] = js.undefined
  
  /**
    * The original size of the volume, in GiB.
    */
  var OriginalSize: js.UndefOr[Integer] = js.undefined
  
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
  var StartTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * A status message about the modification progress or failure.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  
  /**
    * The target IOPS rate of the volume.
    */
  var TargetIops: js.UndefOr[Integer] = js.undefined
  
  /**
    * The target size of the volume, in GiB.
    */
  var TargetSize: js.UndefOr[Integer] = js.undefined
  
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
  
  @scala.inline
  def apply(): VolumeModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeModification]
  }
  
  @scala.inline
  implicit class VolumeModificationMutableBuilder[Self <: VolumeModification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: DateTime): Self = StObject.set(x, "EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "EndTime", js.undefined)
    
    @scala.inline
    def setModificationState(value: VolumeModificationState): Self = StObject.set(x, "ModificationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModificationStateUndefined: Self = StObject.set(x, "ModificationState", js.undefined)
    
    @scala.inline
    def setOriginalIops(value: Integer): Self = StObject.set(x, "OriginalIops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalIopsUndefined: Self = StObject.set(x, "OriginalIops", js.undefined)
    
    @scala.inline
    def setOriginalSize(value: Integer): Self = StObject.set(x, "OriginalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalSizeUndefined: Self = StObject.set(x, "OriginalSize", js.undefined)
    
    @scala.inline
    def setOriginalVolumeType(value: VolumeType): Self = StObject.set(x, "OriginalVolumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginalVolumeTypeUndefined: Self = StObject.set(x, "OriginalVolumeType", js.undefined)
    
    @scala.inline
    def setProgress(value: Long): Self = StObject.set(x, "Progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "Progress", js.undefined)
    
    @scala.inline
    def setStartTime(value: DateTime): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setTargetIops(value: Integer): Self = StObject.set(x, "TargetIops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetIopsUndefined: Self = StObject.set(x, "TargetIops", js.undefined)
    
    @scala.inline
    def setTargetSize(value: Integer): Self = StObject.set(x, "TargetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSizeUndefined: Self = StObject.set(x, "TargetSize", js.undefined)
    
    @scala.inline
    def setTargetVolumeType(value: VolumeType): Self = StObject.set(x, "TargetVolumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetVolumeTypeUndefined: Self = StObject.set(x, "TargetVolumeType", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
  }
}
