package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EbsInstanceBlockDeviceSpecification extends StObject {
  
  /**
    * Use to configure delete on termination of the associated device.
    */
  var deleteOnTermination: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Use to configure device encryption.
    */
  var encrypted: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Use to configure device IOPS.
    */
  var iops: js.UndefOr[EbsIopsInteger] = js.undefined
  
  /**
    * Use to configure the KMS key to use when encrypting the device.
    */
  var kmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The snapshot that defines the device contents.
    */
  var snapshotId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Use to override the device's volume size.
    */
  var volumeSize: js.UndefOr[EbsVolumeSizeInteger] = js.undefined
  
  /**
    * Use to override the device's volume type.
    */
  var volumeType: js.UndefOr[EbsVolumeType] = js.undefined
}
object EbsInstanceBlockDeviceSpecification {
  
  inline def apply(): EbsInstanceBlockDeviceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsInstanceBlockDeviceSpecification]
  }
  
  extension [Self <: EbsInstanceBlockDeviceSpecification](x: Self) {
    
    inline def setDeleteOnTermination(value: NullableBoolean): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    inline def setDeleteOnTerminationUndefined: Self = StObject.set(x, "deleteOnTermination", js.undefined)
    
    inline def setEncrypted(value: NullableBoolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
    
    inline def setIops(value: EbsIopsInteger): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
    
    inline def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    inline def setSnapshotId(value: NonEmptyString): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
    
    inline def setVolumeSize(value: EbsVolumeSizeInteger): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeUndefined: Self = StObject.set(x, "volumeSize", js.undefined)
    
    inline def setVolumeType(value: EbsVolumeType): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "volumeType", js.undefined)
  }
}
