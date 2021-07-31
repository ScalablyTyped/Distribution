package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbsBlockDevice extends StObject {
  
  /**
    * Whether the volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of I/O operations per second (IOPS) that the volume supports. For more information, see EbsBlockDevice.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  
  /**
    * The snapshot ID.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
  
  /**
    * The volume size, in GiB. For more information, see EbsBlockDevice.
    */
  var VolumeSize: js.UndefOr[Integer] = js.undefined
  
  /**
    * The volume type. gp2 for General Purpose (SSD) volumes, io1 for Provisioned IOPS (SSD) volumes, st1 for Throughput Optimized hard disk drives (HDD), sc1 for Cold HDD,and standard for Magnetic volumes. If you specify the io1 volume type, you must also specify a value for the Iops attribute. The maximum ratio of provisioned IOPS to requested volume size (in GiB) is 50:1. AWS uses the default volume size (in GiB) specified in the AMI attributes to set IOPS to 50 x (volume size).
    */
  var VolumeType: js.UndefOr[typings.awsSdk.opsworksMod.VolumeType] = js.undefined
}
object EbsBlockDevice {
  
  @scala.inline
  def apply(): EbsBlockDevice = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsBlockDevice]
  }
  
  @scala.inline
  implicit class EbsBlockDeviceMutableBuilder[Self <: EbsBlockDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
    
    @scala.inline
    def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: String): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    @scala.inline
    def setVolumeSize(value: Integer): Self = StObject.set(x, "VolumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeUndefined: Self = StObject.set(x, "VolumeSize", js.undefined)
    
    @scala.inline
    def setVolumeType(value: VolumeType): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
