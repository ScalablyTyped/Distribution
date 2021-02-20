package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EbsInstanceBlockDeviceSpecification extends StObject {
  
  /**
    * Use to configure delete on termination of the associated device.
    */
  var deleteOnTermination: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * Use to configure device encryption.
    */
  var encrypted: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * Use to configure device IOPS.
    */
  var iops: js.UndefOr[EbsIopsInteger] = js.native
  
  /**
    * Use to configure the KMS key to use when encrypting the device.
    */
  var kmsKeyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The snapshot that defines the device contents.
    */
  var snapshotId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Use to override the device's volume size.
    */
  var volumeSize: js.UndefOr[EbsVolumeSizeInteger] = js.native
  
  /**
    * Use to override the device's volume type.
    */
  var volumeType: js.UndefOr[EbsVolumeType] = js.native
}
object EbsInstanceBlockDeviceSpecification {
  
  @scala.inline
  def apply(): EbsInstanceBlockDeviceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EbsInstanceBlockDeviceSpecification]
  }
  
  @scala.inline
  implicit class EbsInstanceBlockDeviceSpecificationMutableBuilder[Self <: EbsInstanceBlockDeviceSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeleteOnTermination(value: NullableBoolean): Self = StObject.set(x, "deleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteOnTerminationUndefined: Self = StObject.set(x, "deleteOnTermination", js.undefined)
    
    @scala.inline
    def setEncrypted(value: NullableBoolean): Self = StObject.set(x, "encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "encrypted", js.undefined)
    
    @scala.inline
    def setIops(value: EbsIopsInteger): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    
    @scala.inline
    def setSnapshotId(value: NonEmptyString): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
    
    @scala.inline
    def setVolumeSize(value: EbsVolumeSizeInteger): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeSizeUndefined: Self = StObject.set(x, "volumeSize", js.undefined)
    
    @scala.inline
    def setVolumeType(value: EbsVolumeType): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeTypeUndefined: Self = StObject.set(x, "volumeType", js.undefined)
  }
}
