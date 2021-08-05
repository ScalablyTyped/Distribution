package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CachediSCSIVolume extends StObject {
  
  /**
    * The date the volume was created. Volumes created prior to March 28, 2017 don’t have this timestamp.
    */
  var CreatedDate: js.UndefOr[typings.awsSdk.storagegatewayMod.CreatedDate] = js.undefined
  
  var KMSKey: js.UndefOr[typings.awsSdk.storagegatewayMod.KMSKey] = js.undefined
  
  /**
    * If the cached volume was created from a snapshot, this field contains the snapshot ID used, e.g., snap-78e22663. Otherwise, this field is not included.
    */
  var SourceSnapshotId: js.UndefOr[SnapshotId] = js.undefined
  
  /**
    * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN. For example, specifying TargetName as myvolume results in the target ARN of arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The target name must be unique across all volumes on a gateway. If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new target name.
    */
  var TargetName: js.UndefOr[typings.awsSdk.storagegatewayMod.TargetName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the storage volume.
    */
  var VolumeARN: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeARN] = js.undefined
  
  /**
    * A value that indicates whether a storage volume is attached to or detached from a gateway. For more information, see Moving your volumes to a different gateway.
    */
  var VolumeAttachmentStatus: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeAttachmentStatus] = js.undefined
  
  /**
    * The unique identifier of the volume, e.g., vol-AE4B946D.
    */
  var VolumeId: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeId] = js.undefined
  
  /**
    * Represents the percentage complete if the volume is restoring or bootstrapping that represents the percent of data transferred. This field does not appear in the response if the cached volume is not restoring or bootstrapping.
    */
  var VolumeProgress: js.UndefOr[DoubleObject] = js.undefined
  
  /**
    * The size, in bytes, of the volume capacity.
    */
  var VolumeSizeInBytes: js.UndefOr[long] = js.undefined
  
  /**
    * One of the VolumeStatus values that indicates the state of the storage volume.
    */
  var VolumeStatus: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeStatus] = js.undefined
  
  /**
    * One of the VolumeType enumeration values that describes the type of the volume.
    */
  var VolumeType: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeType] = js.undefined
  
  /**
    * The size of the data stored on the volume in bytes. This value is calculated based on the number of blocks that are touched, instead of the actual amount of data written. This value can be useful for sequential write patterns but less accurate for random write patterns. VolumeUsedInBytes is different from the compressed size of the volume, which is the value that is used to calculate your bill.  This value is not available for volumes created prior to May 13, 2015, until you store data on the volume. 
    */
  var VolumeUsedInBytes: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeUsedInBytes] = js.undefined
  
  /**
    * An VolumeiSCSIAttributes object that represents a collection of iSCSI attributes for one stored volume.
    */
  var VolumeiSCSIAttributes: js.UndefOr[typings.awsSdk.storagegatewayMod.VolumeiSCSIAttributes] = js.undefined
}
object CachediSCSIVolume {
  
  inline def apply(): CachediSCSIVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CachediSCSIVolume]
  }
  
  extension [Self <: CachediSCSIVolume](x: Self) {
    
    inline def setCreatedDate(value: CreatedDate): Self = StObject.set(x, "CreatedDate", value.asInstanceOf[js.Any])
    
    inline def setCreatedDateUndefined: Self = StObject.set(x, "CreatedDate", js.undefined)
    
    inline def setKMSKey(value: KMSKey): Self = StObject.set(x, "KMSKey", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyUndefined: Self = StObject.set(x, "KMSKey", js.undefined)
    
    inline def setSourceSnapshotId(value: SnapshotId): Self = StObject.set(x, "SourceSnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSourceSnapshotIdUndefined: Self = StObject.set(x, "SourceSnapshotId", js.undefined)
    
    inline def setTargetName(value: TargetName): Self = StObject.set(x, "TargetName", value.asInstanceOf[js.Any])
    
    inline def setTargetNameUndefined: Self = StObject.set(x, "TargetName", js.undefined)
    
    inline def setVolumeARN(value: VolumeARN): Self = StObject.set(x, "VolumeARN", value.asInstanceOf[js.Any])
    
    inline def setVolumeARNUndefined: Self = StObject.set(x, "VolumeARN", js.undefined)
    
    inline def setVolumeAttachmentStatus(value: VolumeAttachmentStatus): Self = StObject.set(x, "VolumeAttachmentStatus", value.asInstanceOf[js.Any])
    
    inline def setVolumeAttachmentStatusUndefined: Self = StObject.set(x, "VolumeAttachmentStatus", js.undefined)
    
    inline def setVolumeId(value: VolumeId): Self = StObject.set(x, "VolumeId", value.asInstanceOf[js.Any])
    
    inline def setVolumeIdUndefined: Self = StObject.set(x, "VolumeId", js.undefined)
    
    inline def setVolumeProgress(value: DoubleObject): Self = StObject.set(x, "VolumeProgress", value.asInstanceOf[js.Any])
    
    inline def setVolumeProgressUndefined: Self = StObject.set(x, "VolumeProgress", js.undefined)
    
    inline def setVolumeSizeInBytes(value: long): Self = StObject.set(x, "VolumeSizeInBytes", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeInBytesUndefined: Self = StObject.set(x, "VolumeSizeInBytes", js.undefined)
    
    inline def setVolumeStatus(value: VolumeStatus): Self = StObject.set(x, "VolumeStatus", value.asInstanceOf[js.Any])
    
    inline def setVolumeStatusUndefined: Self = StObject.set(x, "VolumeStatus", js.undefined)
    
    inline def setVolumeType(value: VolumeType): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
    
    inline def setVolumeUsedInBytes(value: VolumeUsedInBytes): Self = StObject.set(x, "VolumeUsedInBytes", value.asInstanceOf[js.Any])
    
    inline def setVolumeUsedInBytesUndefined: Self = StObject.set(x, "VolumeUsedInBytes", js.undefined)
    
    inline def setVolumeiSCSIAttributes(value: VolumeiSCSIAttributes): Self = StObject.set(x, "VolumeiSCSIAttributes", value.asInstanceOf[js.Any])
    
    inline def setVolumeiSCSIAttributesUndefined: Self = StObject.set(x, "VolumeiSCSIAttributes", js.undefined)
  }
}
