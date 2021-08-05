package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsRdsDbPendingModifiedValues extends StObject {
  
  /**
    * 
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.undefined
  
  /**
    * 
    */
  var BackupRetentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * 
    */
  var CaCertificateIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var DbInstanceClass: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var DbInstanceIdentifier: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var DbSubnetGroupName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var EngineVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  
  /**
    * 
    */
  var LicenseModel: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var MasterUserPassword: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * 
    */
  var MultiAZ: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 
    */
  var PendingCloudWatchLogsExports: js.UndefOr[AwsRdsPendingCloudWatchLogsExports] = js.undefined
  
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
  var StorageType: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsRdsDbPendingModifiedValues {
  
  inline def apply(): AwsRdsDbPendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRdsDbPendingModifiedValues]
  }
  
  extension [Self <: AwsRdsDbPendingModifiedValues](x: Self) {
    
    inline def setAllocatedStorage(value: Integer): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    inline def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    inline def setBackupRetentionPeriod(value: Integer): Self = StObject.set(x, "BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "BackupRetentionPeriod", js.undefined)
    
    inline def setCaCertificateIdentifier(value: NonEmptyString): Self = StObject.set(x, "CaCertificateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCaCertificateIdentifierUndefined: Self = StObject.set(x, "CaCertificateIdentifier", js.undefined)
    
    inline def setDbInstanceClass(value: NonEmptyString): Self = StObject.set(x, "DbInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setDbInstanceClassUndefined: Self = StObject.set(x, "DbInstanceClass", js.undefined)
    
    inline def setDbInstanceIdentifier(value: NonEmptyString): Self = StObject.set(x, "DbInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDbInstanceIdentifierUndefined: Self = StObject.set(x, "DbInstanceIdentifier", js.undefined)
    
    inline def setDbSubnetGroupName(value: NonEmptyString): Self = StObject.set(x, "DbSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setDbSubnetGroupNameUndefined: Self = StObject.set(x, "DbSubnetGroupName", js.undefined)
    
    inline def setEngineVersion(value: NonEmptyString): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setIops(value: Integer): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setLicenseModel(value: NonEmptyString): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    inline def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    inline def setMasterUserPassword(value: NonEmptyString): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    inline def setMasterUserPasswordUndefined: Self = StObject.set(x, "MasterUserPassword", js.undefined)
    
    inline def setMultiAZ(value: Boolean): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
    
    inline def setMultiAZUndefined: Self = StObject.set(x, "MultiAZ", js.undefined)
    
    inline def setPendingCloudWatchLogsExports(value: AwsRdsPendingCloudWatchLogsExports): Self = StObject.set(x, "PendingCloudWatchLogsExports", value.asInstanceOf[js.Any])
    
    inline def setPendingCloudWatchLogsExportsUndefined: Self = StObject.set(x, "PendingCloudWatchLogsExports", js.undefined)
    
    inline def setPort(value: Integer): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setProcessorFeatures(value: AwsRdsDbProcessorFeatures): Self = StObject.set(x, "ProcessorFeatures", value.asInstanceOf[js.Any])
    
    inline def setProcessorFeaturesUndefined: Self = StObject.set(x, "ProcessorFeatures", js.undefined)
    
    inline def setProcessorFeaturesVarargs(value: AwsRdsDbProcessorFeature*): Self = StObject.set(x, "ProcessorFeatures", js.Array(value :_*))
    
    inline def setStorageType(value: NonEmptyString): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
  }
}
