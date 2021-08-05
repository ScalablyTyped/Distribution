package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbSnapshotDetails extends StObject {
  
  /**
    * 
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.undefined
  
  /**
    * 
    */
  var AvailabilityZone: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var DbInstanceIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var DbSnapshotIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var DbiResourceId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 
    */
  var Engine: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var EngineVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var IamDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 
    */
  var InstanceCreateTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  
  /**
    * 
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var LicenseModel: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var MasterUsername: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var OptionGroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var PercentProgress: js.UndefOr[Integer] = js.undefined
  
  /**
    * 
    */
  var Port: js.UndefOr[Integer] = js.undefined
  
  /**
    * 
    */
  var ProcessorFeatures: js.UndefOr[AwsRdsDbProcessorFeatures] = js.undefined
  
  /**
    * 
    */
  var SnapshotCreateTime: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var SnapshotType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var SourceDbSnapshotIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var SourceRegion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var StorageType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var TdeCredentialArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var Timezone: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbSnapshotDetails {
  
  inline def apply(): AwsRdsDbSnapshotDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbSnapshotDetails]
  }
  
  extension [Self <: AwsRdsDbSnapshotDetails](x: Self) {
    
    inline def setAllocatedStorage(value: Integer): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    inline def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    inline def setAvailabilityZone(value: NonEmptyString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    inline def setDbInstanceIdentifier(value: NonEmptyString): Self = StObject.set(x, "DbInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDbInstanceIdentifierUndefined: Self = StObject.set(x, "DbInstanceIdentifier", js.undefined)
    
    inline def setDbSnapshotIdentifier(value: NonEmptyString): Self = StObject.set(x, "DbSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDbSnapshotIdentifierUndefined: Self = StObject.set(x, "DbSnapshotIdentifier", js.undefined)
    
    inline def setDbiResourceId(value: NonEmptyString): Self = StObject.set(x, "DbiResourceId", value.asInstanceOf[js.Any])
    
    inline def setDbiResourceIdUndefined: Self = StObject.set(x, "DbiResourceId", js.undefined)
    
    inline def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    inline def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    inline def setEngine(value: NonEmptyString): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: NonEmptyString): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setIamDatabaseAuthenticationEnabled(value: Boolean): Self = StObject.set(x, "IamDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    inline def setIamDatabaseAuthenticationEnabledUndefined: Self = StObject.set(x, "IamDatabaseAuthenticationEnabled", js.undefined)
    
    inline def setInstanceCreateTime(value: NonEmptyString): Self = StObject.set(x, "InstanceCreateTime", value.asInstanceOf[js.Any])
    
    inline def setInstanceCreateTimeUndefined: Self = StObject.set(x, "InstanceCreateTime", js.undefined)
    
    inline def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    inline def setLicenseModel(value: NonEmptyString): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    inline def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    inline def setMasterUsername(value: NonEmptyString): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    inline def setMasterUsernameUndefined: Self = StObject.set(x, "MasterUsername", js.undefined)
    
    inline def setOptionGroupName(value: NonEmptyString): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    inline def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
    inline def setPercentProgress(value: Integer): Self = StObject.set(x, "PercentProgress", value.asInstanceOf[js.Any])
    
    inline def setPercentProgressUndefined: Self = StObject.set(x, "PercentProgress", js.undefined)
    
    inline def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setProcessorFeatures(value: AwsRdsDbProcessorFeatures): Self = StObject.set(x, "ProcessorFeatures", value.asInstanceOf[js.Any])
    
    inline def setProcessorFeaturesUndefined: Self = StObject.set(x, "ProcessorFeatures", js.undefined)
    
    inline def setProcessorFeaturesVarargs(value: AwsRdsDbProcessorFeature*): Self = StObject.set(x, "ProcessorFeatures", js.Array(value :_*))
    
    inline def setSnapshotCreateTime(value: NonEmptyString): Self = StObject.set(x, "SnapshotCreateTime", value.asInstanceOf[js.Any])
    
    inline def setSnapshotCreateTimeUndefined: Self = StObject.set(x, "SnapshotCreateTime", js.undefined)
    
    inline def setSnapshotType(value: NonEmptyString): Self = StObject.set(x, "SnapshotType", value.asInstanceOf[js.Any])
    
    inline def setSnapshotTypeUndefined: Self = StObject.set(x, "SnapshotType", js.undefined)
    
    inline def setSourceDbSnapshotIdentifier(value: NonEmptyString): Self = StObject.set(x, "SourceDbSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSourceDbSnapshotIdentifierUndefined: Self = StObject.set(x, "SourceDbSnapshotIdentifier", js.undefined)
    
    inline def setSourceRegion(value: NonEmptyString): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
    
    inline def setSourceRegionUndefined: Self = StObject.set(x, "SourceRegion", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setStorageType(value: NonEmptyString): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    inline def setTdeCredentialArn(value: NonEmptyString): Self = StObject.set(x, "TdeCredentialArn", value.asInstanceOf[js.Any])
    
    inline def setTdeCredentialArnUndefined: Self = StObject.set(x, "TdeCredentialArn", js.undefined)
    
    inline def setTimezone(value: NonEmptyString): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
    
    inline def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    inline def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
