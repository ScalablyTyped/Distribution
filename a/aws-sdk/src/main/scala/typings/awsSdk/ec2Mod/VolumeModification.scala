package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VolumeModification extends js.Object {
  
  /**
    * The modification completion or failure time.
    */
  var EndTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The current modification state. The modification state is null for unmodified volumes.
    */
  var ModificationState: js.UndefOr[VolumeModificationState] = js.native
  
  /**
    * The original IOPS rate of the volume.
    */
  var OriginalIops: js.UndefOr[Integer] = js.native
  
  /**
    * The original size of the volume, in GiB.
    */
  var OriginalSize: js.UndefOr[Integer] = js.native
  
  /**
    * The original EBS volume type of the volume.
    */
  var OriginalVolumeType: js.UndefOr[VolumeType] = js.native
  
  /**
    * The modification progress, from 0 to 100 percent complete.
    */
  var Progress: js.UndefOr[Long] = js.native
  
  /**
    * The modification start time.
    */
  var StartTime: js.UndefOr[DateTime] = js.native
  
  /**
    * A status message about the modification progress or failure.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  
  /**
    * The target IOPS rate of the volume.
    */
  var TargetIops: js.UndefOr[Integer] = js.native
  
  /**
    * The target size of the volume, in GiB.
    */
  var TargetSize: js.UndefOr[Integer] = js.native
  
  /**
    * The target EBS volume type of the volume.
    */
  var TargetVolumeType: js.UndefOr[VolumeType] = js.native
  
  /**
    * The ID of the volume.
    */
  var VolumeId: js.UndefOr[String] = js.native
}
object VolumeModification {
  
  @scala.inline
  def apply(): VolumeModification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeModification]
  }
  
  @scala.inline
  implicit class VolumeModificationOps[Self <: VolumeModification] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: DateTime): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setModificationState(value: VolumeModificationState): Self = this.set("ModificationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModificationState: Self = this.set("ModificationState", js.undefined)
    
    @scala.inline
    def setOriginalIops(value: Integer): Self = this.set("OriginalIops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalIops: Self = this.set("OriginalIops", js.undefined)
    
    @scala.inline
    def setOriginalSize(value: Integer): Self = this.set("OriginalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalSize: Self = this.set("OriginalSize", js.undefined)
    
    @scala.inline
    def setOriginalVolumeType(value: VolumeType): Self = this.set("OriginalVolumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginalVolumeType: Self = this.set("OriginalVolumeType", js.undefined)
    
    @scala.inline
    def setProgress(value: Long): Self = this.set("Progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgress: Self = this.set("Progress", js.undefined)
    
    @scala.inline
    def setStartTime(value: DateTime): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusMessage: Self = this.set("StatusMessage", js.undefined)
    
    @scala.inline
    def setTargetIops(value: Integer): Self = this.set("TargetIops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetIops: Self = this.set("TargetIops", js.undefined)
    
    @scala.inline
    def setTargetSize(value: Integer): Self = this.set("TargetSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetSize: Self = this.set("TargetSize", js.undefined)
    
    @scala.inline
    def setTargetVolumeType(value: VolumeType): Self = this.set("TargetVolumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetVolumeType: Self = this.set("TargetVolumeType", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = this.set("VolumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeId: Self = this.set("VolumeId", js.undefined)
  }
}
