package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRdsDbPendingModifiedValues extends js.Object {
  
  /**
    * 
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.native
  
  /**
    * 
    */
  var BackupRetentionPeriod: js.UndefOr[Integer] = js.native
  
  /**
    * 
    */
  var CaCertificateIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var DbInstanceClass: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var DbInstanceIdentifier: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var DbSubnetGroupName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var EngineVersion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var Iops: js.UndefOr[Integer] = js.native
  
  /**
    * 
    */
  var LicenseModel: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var MasterUserPassword: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * 
    */
  var MultiAZ: js.UndefOr[Boolean] = js.native
  
  /**
    * 
    */
  var PendingCloudWatchLogsExports: js.UndefOr[AwsRdsPendingCloudWatchLogsExports] = js.native
  
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
  var StorageType: js.UndefOr[NonEmptyString] = js.native
}
object AwsRdsDbPendingModifiedValues {
  
  @scala.inline
  def apply(): AwsRdsDbPendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbPendingModifiedValues]
  }
  
  @scala.inline
  implicit class AwsRdsDbPendingModifiedValuesOps[Self <: AwsRdsDbPendingModifiedValues] (val x: Self) extends AnyVal {
    
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
    def setBackupRetentionPeriod(value: Integer): Self = this.set("BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackupRetentionPeriod: Self = this.set("BackupRetentionPeriod", js.undefined)
    
    @scala.inline
    def setCaCertificateIdentifier(value: NonEmptyString): Self = this.set("CaCertificateIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaCertificateIdentifier: Self = this.set("CaCertificateIdentifier", js.undefined)
    
    @scala.inline
    def setDbInstanceClass(value: NonEmptyString): Self = this.set("DbInstanceClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbInstanceClass: Self = this.set("DbInstanceClass", js.undefined)
    
    @scala.inline
    def setDbInstanceIdentifier(value: NonEmptyString): Self = this.set("DbInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbInstanceIdentifier: Self = this.set("DbInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setDbSubnetGroupName(value: NonEmptyString): Self = this.set("DbSubnetGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDbSubnetGroupName: Self = this.set("DbSubnetGroupName", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: NonEmptyString): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    
    @scala.inline
    def setIops(value: Integer): Self = this.set("Iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIops: Self = this.set("Iops", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: NonEmptyString): Self = this.set("LicenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicenseModel: Self = this.set("LicenseModel", js.undefined)
    
    @scala.inline
    def setMasterUserPassword(value: NonEmptyString): Self = this.set("MasterUserPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMasterUserPassword: Self = this.set("MasterUserPassword", js.undefined)
    
    @scala.inline
    def setMultiAZ(value: Boolean): Self = this.set("MultiAZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiAZ: Self = this.set("MultiAZ", js.undefined)
    
    @scala.inline
    def setPendingCloudWatchLogsExports(value: AwsRdsPendingCloudWatchLogsExports): Self = this.set("PendingCloudWatchLogsExports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingCloudWatchLogsExports: Self = this.set("PendingCloudWatchLogsExports", js.undefined)
    
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
    def setStorageType(value: NonEmptyString): Self = this.set("StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageType: Self = this.set("StorageType", js.undefined)
  }
}
