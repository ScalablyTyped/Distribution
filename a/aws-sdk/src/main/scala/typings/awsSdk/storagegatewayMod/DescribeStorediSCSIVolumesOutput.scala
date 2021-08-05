package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeStorediSCSIVolumesOutput extends StObject {
  
  /**
    * Describes a single unit of output from DescribeStorediSCSIVolumes. The following fields are returned:    ChapEnabled: Indicates whether mutual CHAP is enabled for the iSCSI target.    LunNumber: The logical disk number.    NetworkInterfaceId: The network interface ID of the stored volume that initiator use to map the stored volume as an iSCSI target.    NetworkInterfacePort: The port used to communicate with iSCSI targets.    PreservedExistingData: Indicates when the stored volume was created, existing data on the underlying local disk was preserved.    SourceSnapshotId: If the stored volume was created from a snapshot, this field contains the snapshot ID used, e.g. snap-1122aabb. Otherwise, this field is not included.    StorediSCSIVolumes: An array of StorediSCSIVolume objects where each object contains metadata about one stored volume.    TargetARN: The Amazon Resource Name (ARN) of the volume target.    VolumeARN: The Amazon Resource Name (ARN) of the stored volume.    VolumeDiskId: The disk ID of the local disk that was specified in the CreateStorediSCSIVolume operation.    VolumeId: The unique identifier of the storage volume, e.g. vol-1122AABB.    VolumeiSCSIAttributes: An VolumeiSCSIAttributes object that represents a collection of iSCSI attributes for one stored volume.    VolumeProgress: Represents the percentage complete if the volume is restoring or bootstrapping that represents the percent of data transferred. This field does not appear in the response if the stored volume is not restoring or bootstrapping.    VolumeSizeInBytes: The size of the volume in bytes.    VolumeStatus: One of the VolumeStatus values that indicates the state of the volume.    VolumeType: One of the enumeration values describing the type of the volume. Currently, only STORED volumes are supported.  
    */
  var StorediSCSIVolumes: js.UndefOr[typings.awsSdk.storagegatewayMod.StorediSCSIVolumes] = js.undefined
}
object DescribeStorediSCSIVolumesOutput {
  
  inline def apply(): DescribeStorediSCSIVolumesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStorediSCSIVolumesOutput]
  }
  
  extension [Self <: DescribeStorediSCSIVolumesOutput](x: Self) {
    
    inline def setStorediSCSIVolumes(value: StorediSCSIVolumes): Self = StObject.set(x, "StorediSCSIVolumes", value.asInstanceOf[js.Any])
    
    inline def setStorediSCSIVolumesUndefined: Self = StObject.set(x, "StorediSCSIVolumes", js.undefined)
    
    inline def setStorediSCSIVolumesVarargs(value: StorediSCSIVolume*): Self = StObject.set(x, "StorediSCSIVolumes", js.Array(value :_*))
  }
}
