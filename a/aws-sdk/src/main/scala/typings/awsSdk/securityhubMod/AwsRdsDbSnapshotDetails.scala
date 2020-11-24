package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbSnapshotDetails extends js.Object {
  
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
  implicit class AwsRdsDbSnapshotDetailsOps[Self <: AwsRdsDbSnapshotDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllocatedStorage(value: Integer): Self = this.set("AllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocatedStorage: Self = this.set("AllocatedStorage", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: NonEmptyString): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    
    @scala.inline
    def setDbInstanceIdentifier(value: NonEmptyString): Self = this.set("DbInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbInstanceIdentifier: Self = this.set("DbInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setDbSnapshotIdentifier(value: NonEmptyString): Self = this.set("DbSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbSnapshotIdentifier: Self = this.set("DbSnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setDbiResourceId(value: NonEmptyString): Self = this.set("DbiResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbiResourceId: Self = this.set("DbiResourceId", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncrypted: Self = this.set("Encrypted", js.undefined)
    
    @scala.inline
    def setEngine(value: NonEmptyString): Self = this.set("Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: NonEmptyString): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    
    @scala.inline
    def setIamDatabaseAuthenticationEnabled(value: Boolean): Self = this.set("IamDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamDatabaseAuthenticationEnabled: Self = this.set("IamDatabaseAuthenticationEnabled", js.undefined)
    
    @scala.inline
    def setInstanceCreateTime(value: NonEmptyString): Self = this.set("InstanceCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceCreateTime: Self = this.set("InstanceCreateTime", js.undefined)
    
    @scala.inline
    def setIops(value: Integer): Self = this.set("Iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIops: Self = this.set("Iops", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: NonEmptyString): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: NonEmptyString): Self = this.set("LicenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseModel: Self = this.set("LicenseModel", js.undefined)
    
    @scala.inline
    def setMasterUsername(value: NonEmptyString): Self = this.set("MasterUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterUsername: Self = this.set("MasterUsername", js.undefined)
    
    @scala.inline
    def setOptionGroupName(value: NonEmptyString): Self = this.set("OptionGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionGroupName: Self = this.set("OptionGroupName", js.undefined)
    
    @scala.inline
    def setPercentProgress(value: Integer): Self = this.set("PercentProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePercentProgress: Self = this.set("PercentProgress", js.undefined)
    
    @scala.inline
    def setPort(value: Integer): Self = this.set("Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    
    @scala.inline
    def setProcessorFeaturesVarargs(value: AwsRdsDbProcessorFeature*): Self = this.set("ProcessorFeatures", js.Array(value :_*))
    
    @scala.inline
    def setProcessorFeatures(value: AwsRdsDbProcessorFeatures): Self = this.set("ProcessorFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessorFeatures: Self = this.set("ProcessorFeatures", js.undefined)
    
    @scala.inline
    def setSnapshotCreateTime(value: NonEmptyString): Self = this.set("SnapshotCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotCreateTime: Self = this.set("SnapshotCreateTime", js.undefined)
    
    @scala.inline
    def setSnapshotType(value: NonEmptyString): Self = this.set("SnapshotType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotType: Self = this.set("SnapshotType", js.undefined)
    
    @scala.inline
    def setSourceDbSnapshotIdentifier(value: NonEmptyString): Self = this.set("SourceDbSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDbSnapshotIdentifier: Self = this.set("SourceDbSnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setSourceRegion(value: NonEmptyString): Self = this.set("SourceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceRegion: Self = this.set("SourceRegion", js.undefined)
    
    @scala.inline
    def setStatus(value: NonEmptyString): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStorageType(value: NonEmptyString): Self = this.set("StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageType: Self = this.set("StorageType", js.undefined)
    
    @scala.inline
    def setTdeCredentialArn(value: NonEmptyString): Self = this.set("TdeCredentialArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTdeCredentialArn: Self = this.set("TdeCredentialArn", js.undefined)
    
    @scala.inline
    def setTimezone(value: NonEmptyString): Self = this.set("Timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimezone: Self = this.set("Timezone", js.undefined)
    
    @scala.inline
    def setVpcId(value: NonEmptyString): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
}
