package typings.awsSdk.fsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOpenZFSVolumeConfiguration extends StObject {
  
  /**
    * A Boolean value indicating whether tags for the volume should be copied to snapshots. This value defaults to false. If it's set to true, all tags for the volume are copied to snapshots where the user doesn't specify tags. If this value is true, and you specify one or more tags, only the specified tags are copied to snapshots. If you specify one or more tags when creating the snapshot, no tags are copied from the volume, regardless of this value.
    */
  var CopyTagsToSnapshots: js.UndefOr[Flag] = js.undefined
  
  /**
    * Specifies the method used to compress the data on the volume. The compression type is NONE by default.    NONE - Doesn't compress the data on the volume. NONE is the default.    ZSTD - Compresses the data in the volume using the Zstandard (ZSTD) compression algorithm. ZSTD compression provides a higher level of data compression and higher read throughput performance than LZ4 compression.    LZ4 - Compresses the data in the volume using the LZ4 compression algorithm. LZ4 compression provides a lower level of compression and higher write throughput performance than ZSTD compression.   For more information about volume compression types and the performance of your Amazon FSx for OpenZFS file system, see  Tips for maximizing performance File system and volume settings in the Amazon FSx for OpenZFS User Guide.
    */
  var DataCompressionType: js.UndefOr[OpenZFSDataCompressionType] = js.undefined
  
  /**
    * The configuration object for mounting a Network File System (NFS) file system.
    */
  var NfsExports: js.UndefOr[OpenZFSNfsExports] = js.undefined
  
  /**
    * The configuration object that specifies the snapshot to use as the origin of the data for the volume.
    */
  var OriginSnapshot: js.UndefOr[CreateOpenZFSOriginSnapshotConfiguration] = js.undefined
  
  /**
    * The ID of the volume to use as the parent volume of the volume that you are creating.
    */
  var ParentVolumeId: VolumeId
  
  /**
    * A Boolean value indicating whether the volume is read-only.
    */
  var ReadOnly: js.UndefOr[typings.awsSdk.fsxMod.ReadOnly] = js.undefined
  
  /**
    * Specifies the suggested block size for a volume in a ZFS dataset, in kibibytes (KiB). Valid values are 4, 8, 16, 32, 64, 128, 256, 512, or 1024 KiB. The default is 128 KiB. We recommend using the default setting for the majority of use cases. Generally, workloads that write in fixed small or large record sizes may benefit from setting a custom record size, like database workloads (small record size) or media streaming workloads (large record size). For additional guidance on when to set a custom record size, see  ZFS Record size in the Amazon FSx for OpenZFS User Guide.
    */
  var RecordSizeKiB: js.UndefOr[IntegerRecordSizeKiB] = js.undefined
  
  /**
    * Sets the maximum storage size in gibibytes (GiB) for the volume. You can specify a quota that is larger than the storage on the parent volume. A volume quota limits the amount of storage that the volume can consume to the configured amount, but does not guarantee the space will be available on the parent volume. To guarantee quota space, you must also set StorageCapacityReservationGiB. To not specify a storage capacity quota, set this to -1.  For more information, see Volume properties in the Amazon FSx for OpenZFS User Guide.
    */
  var StorageCapacityQuotaGiB: js.UndefOr[IntegerNoMaxFromNegativeOne] = js.undefined
  
  /**
    * Specifies the amount of storage in gibibytes (GiB) to reserve from the parent volume. Setting StorageCapacityReservationGiB guarantees that the specified amount of storage space on the parent volume will always be available for the volume. You can't reserve more storage than the parent volume has. To not specify a storage capacity reservation, set this to 0 or -1. For more information, see Volume properties in the Amazon FSx for OpenZFS User Guide.
    */
  var StorageCapacityReservationGiB: js.UndefOr[IntegerNoMaxFromNegativeOne] = js.undefined
  
  /**
    * An object specifying how much storage users or groups can use on the volume.
    */
  var UserAndGroupQuotas: js.UndefOr[OpenZFSUserAndGroupQuotas] = js.undefined
}
object CreateOpenZFSVolumeConfiguration {
  
  inline def apply(ParentVolumeId: VolumeId): CreateOpenZFSVolumeConfiguration = {
    val __obj = js.Dynamic.literal(ParentVolumeId = ParentVolumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOpenZFSVolumeConfiguration]
  }
  
  extension [Self <: CreateOpenZFSVolumeConfiguration](x: Self) {
    
    inline def setCopyTagsToSnapshots(value: Flag): Self = StObject.set(x, "CopyTagsToSnapshots", value.asInstanceOf[js.Any])
    
    inline def setCopyTagsToSnapshotsUndefined: Self = StObject.set(x, "CopyTagsToSnapshots", js.undefined)
    
    inline def setDataCompressionType(value: OpenZFSDataCompressionType): Self = StObject.set(x, "DataCompressionType", value.asInstanceOf[js.Any])
    
    inline def setDataCompressionTypeUndefined: Self = StObject.set(x, "DataCompressionType", js.undefined)
    
    inline def setNfsExports(value: OpenZFSNfsExports): Self = StObject.set(x, "NfsExports", value.asInstanceOf[js.Any])
    
    inline def setNfsExportsUndefined: Self = StObject.set(x, "NfsExports", js.undefined)
    
    inline def setNfsExportsVarargs(value: OpenZFSNfsExport*): Self = StObject.set(x, "NfsExports", js.Array(value*))
    
    inline def setOriginSnapshot(value: CreateOpenZFSOriginSnapshotConfiguration): Self = StObject.set(x, "OriginSnapshot", value.asInstanceOf[js.Any])
    
    inline def setOriginSnapshotUndefined: Self = StObject.set(x, "OriginSnapshot", js.undefined)
    
    inline def setParentVolumeId(value: VolumeId): Self = StObject.set(x, "ParentVolumeId", value.asInstanceOf[js.Any])
    
    inline def setReadOnly(value: ReadOnly): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "ReadOnly", js.undefined)
    
    inline def setRecordSizeKiB(value: IntegerRecordSizeKiB): Self = StObject.set(x, "RecordSizeKiB", value.asInstanceOf[js.Any])
    
    inline def setRecordSizeKiBUndefined: Self = StObject.set(x, "RecordSizeKiB", js.undefined)
    
    inline def setStorageCapacityQuotaGiB(value: IntegerNoMaxFromNegativeOne): Self = StObject.set(x, "StorageCapacityQuotaGiB", value.asInstanceOf[js.Any])
    
    inline def setStorageCapacityQuotaGiBUndefined: Self = StObject.set(x, "StorageCapacityQuotaGiB", js.undefined)
    
    inline def setStorageCapacityReservationGiB(value: IntegerNoMaxFromNegativeOne): Self = StObject.set(x, "StorageCapacityReservationGiB", value.asInstanceOf[js.Any])
    
    inline def setStorageCapacityReservationGiBUndefined: Self = StObject.set(x, "StorageCapacityReservationGiB", js.undefined)
    
    inline def setUserAndGroupQuotas(value: OpenZFSUserAndGroupQuotas): Self = StObject.set(x, "UserAndGroupQuotas", value.asInstanceOf[js.Any])
    
    inline def setUserAndGroupQuotasUndefined: Self = StObject.set(x, "UserAndGroupQuotas", js.undefined)
    
    inline def setUserAndGroupQuotasVarargs(value: OpenZFSUserOrGroupQuota*): Self = StObject.set(x, "UserAndGroupQuotas", js.Array(value*))
  }
}
