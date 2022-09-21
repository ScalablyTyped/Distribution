package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeDetail extends StObject {
  
  /**
    * The device name for the EBS volume.
    */
  var DeviceName: js.UndefOr[String] = js.undefined
  
  /**
    * EBS volume encryption type.
    */
  var EncryptionType: js.UndefOr[String] = js.undefined
  
  /**
    * KMS key Arn used to encrypt the EBS volume.
    */
  var KmsKeyArn: js.UndefOr[String] = js.undefined
  
  /**
    * Snapshot Arn of the EBS volume.
    */
  var SnapshotArn: js.UndefOr[String] = js.undefined
  
  /**
    * EBS volume Arn information.
    */
  var VolumeArn: js.UndefOr[String] = js.undefined
  
  /**
    * EBS volume size in GB.
    */
  var VolumeSizeInGB: js.UndefOr[Integer] = js.undefined
  
  /**
    * The EBS volume type.
    */
  var VolumeType: js.UndefOr[String] = js.undefined
}
object VolumeDetail {
  
  inline def apply(): VolumeDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeDetail]
  }
  
  extension [Self <: VolumeDetail](x: Self) {
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    inline def setEncryptionType(value: String): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
    
    inline def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
    
    inline def setKmsKeyArn(value: String): Self = StObject.set(x, "KmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "KmsKeyArn", js.undefined)
    
    inline def setSnapshotArn(value: String): Self = StObject.set(x, "SnapshotArn", value.asInstanceOf[js.Any])
    
    inline def setSnapshotArnUndefined: Self = StObject.set(x, "SnapshotArn", js.undefined)
    
    inline def setVolumeArn(value: String): Self = StObject.set(x, "VolumeArn", value.asInstanceOf[js.Any])
    
    inline def setVolumeArnUndefined: Self = StObject.set(x, "VolumeArn", js.undefined)
    
    inline def setVolumeSizeInGB(value: Integer): Self = StObject.set(x, "VolumeSizeInGB", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeInGBUndefined: Self = StObject.set(x, "VolumeSizeInGB", js.undefined)
    
    inline def setVolumeType(value: String): Self = StObject.set(x, "VolumeType", value.asInstanceOf[js.Any])
    
    inline def setVolumeTypeUndefined: Self = StObject.set(x, "VolumeType", js.undefined)
  }
}
