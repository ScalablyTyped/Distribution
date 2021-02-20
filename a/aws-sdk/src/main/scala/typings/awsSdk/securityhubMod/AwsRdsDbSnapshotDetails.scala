package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbSnapshotDetails extends StObject {
  
  /**
    * 
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.native
  
  /**
    * 
    */
  var AvailabilityZone: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var DbInstanceIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var DbSnapshotIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var DbiResourceId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  
  /**
    * 
    */
  var Engine: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var EngineVersion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var IamDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * 
    */
  var InstanceCreateTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var Iops: js.UndefOr[Integer] = js.native
  
  /**
    * 
    */
  var KmsKeyId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var LicenseModel: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var MasterUsername: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var OptionGroupName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var PercentProgress: js.UndefOr[Integer] = js.native
  
  /**
    * 
    */
  var Port: js.UndefOr[Integer] = js.native
  
  /**
    * 
    */
  var ProcessorFeatures: js.UndefOr[AwsRdsDbProcessorFeatures] = js.native
  
  /**
    * 
    */
  var SnapshotCreateTime: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var SnapshotType: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var SourceDbSnapshotIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var SourceRegion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var Status: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var StorageType: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var TdeCredentialArn: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var Timezone: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
}
object AwsRdsDbSnapshotDetails {
  
  @scala.inline
  def apply(): AwsRdsDbSnapshotDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbSnapshotDetails]
  }
  
  @scala.inline
  implicit class AwsRdsDbSnapshotDetailsMutableBuilder[Self <: AwsRdsDbSnapshotDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocatedStorage(value: Integer): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: NonEmptyString): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setDbInstanceIdentifier(value: NonEmptyString): Self = StObject.set(x, "DbInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbInstanceIdentifierUndefined: Self = StObject.set(x, "DbInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setDbSnapshotIdentifier(value: NonEmptyString): Self = StObject.set(x, "DbSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbSnapshotIdentifierUndefined: Self = StObject.set(x, "DbSnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setDbiResourceId(value: NonEmptyString): Self = StObject.set(x, "DbiResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbiResourceIdUndefined: Self = StObject.set(x, "DbiResourceId", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    @scala.inline
    def setEngine(value: NonEmptyString): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: NonEmptyString): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setIamDatabaseAuthenticationEnabled(value: Boolean): Self = StObject.set(x, "IamDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIamDatabaseAuthenticationEnabledUndefined: Self = StObject.set(x, "IamDatabaseAuthenticationEnabled", js.undefined)
    
    @scala.inline
    def setInstanceCreateTime(value: NonEmptyString): Self = StObject.set(x, "InstanceCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCreateTimeUndefined: Self = StObject.set(x, "InstanceCreateTime", js.undefined)
    
    @scala.inline
    def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: NonEmptyString): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    @scala.inline
    def setMasterUsername(value: NonEmptyString): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUsernameUndefined: Self = StObject.set(x, "MasterUsername", js.undefined)
    
    @scala.inline
    def setOptionGroupName(value: NonEmptyString): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionGroupNameUndefined: Self = StObject.set(x, "OptionGroupName", js.undefined)
    
    @scala.inline
    def setPercentProgress(value: Integer): Self = StObject.set(x, "PercentProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentProgressUndefined: Self = StObject.set(x, "PercentProgress", js.undefined)
    
    @scala.inline
    def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    @scala.inline
    def setProcessorFeatures(value: AwsRdsDbProcessorFeatures): Self = StObject.set(x, "ProcessorFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessorFeaturesUndefined: Self = StObject.set(x, "ProcessorFeatures", js.undefined)
    
    @scala.inline
    def setProcessorFeaturesVarargs(value: AwsRdsDbProcessorFeature*): Self = StObject.set(x, "ProcessorFeatures", js.Array(value :_*))
    
    @scala.inline
    def setSnapshotCreateTime(value: NonEmptyString): Self = StObject.set(x, "SnapshotCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotCreateTimeUndefined: Self = StObject.set(x, "SnapshotCreateTime", js.undefined)
    
    @scala.inline
    def setSnapshotType(value: NonEmptyString): Self = StObject.set(x, "SnapshotType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotTypeUndefined: Self = StObject.set(x, "SnapshotType", js.undefined)
    
    @scala.inline
    def setSourceDbSnapshotIdentifier(value: NonEmptyString): Self = StObject.set(x, "SourceDbSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDbSnapshotIdentifierUndefined: Self = StObject.set(x, "SourceDbSnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setSourceRegion(value: NonEmptyString): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRegionUndefined: Self = StObject.set(x, "SourceRegion", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setStorageType(value: NonEmptyString): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    @scala.inline
    def setTdeCredentialArn(value: NonEmptyString): Self = StObject.set(x, "TdeCredentialArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTdeCredentialArnUndefined: Self = StObject.set(x, "TdeCredentialArn", js.undefined)
    
    @scala.inline
    def setTimezone(value: NonEmptyString): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
    
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
