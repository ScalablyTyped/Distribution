package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails extends StObject {
  
  /**
    * Whether to delete the volume when the instance is terminated.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to encrypt the volume.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of input/output (I/O) operations per second (IOPS) to provision for the volume. Only supported for gp3 or io1 volumes. Required for io1 volumes. Not used with standard, gp2, st1, or sc1 volumes.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  
  /**
    * The snapshot ID of the volume to use. You must specify either VolumeSize or SnapshotId.
    */
  var SnapshotId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The volume size, in GiBs. The following are the supported volumes sizes for each volume type:   gp2 and gp3: 1-16,384   io1: 4-16,384   st1 and sc1: 125-16,384   standard: 1-1,024   You must specify either SnapshotId or VolumeSize. If you specify both SnapshotId and VolumeSize, the volume size must be equal or greater than the size of the snapshot.
    */
  var VolumeSize: js.UndefOr[Integer] = js.undefined
  
  /**
    * The volume type. Valid values are as follows:    gp2     gp3     io1     sc1     st1     standard   
    */
  var VolumeType: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails {
  
  inline def apply(): AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails]
  }
  
  extension [Self <: AwsAutoScalingLaunchConfigurationBlockDeviceMappingsEbsDetails](x: Self) {
    
    inline def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setSnapshotId(value: NonEmptyString): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setVolumeSize(value: Integer): Self = StObject.set(x, "VolumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeUndefined: Self = StObject.set(x, "VolumeSize", js.undefined)
    
    inline def setVolumeType(value: NonEmptyString): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
