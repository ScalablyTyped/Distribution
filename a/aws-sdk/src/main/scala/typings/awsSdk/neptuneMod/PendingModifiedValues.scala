package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PendingModifiedValues extends StObject {
  
  /**
    *  Contains the new AllocatedStorage size for the DB instance that will be applied or is currently being applied.
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies the pending number of days for which automated backups are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies the identifier of the CA certificate for the DB instance.
    */
  var CACertificateIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    *  Contains the new DBInstanceClass for the DB instance that will be applied or is currently being applied.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    *  Contains the new DBInstanceIdentifier for the DB instance that will be applied or is currently being applied.
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The new DB subnet group for the DB instance.
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the new Provisioned IOPS value for the DB instance that will be applied or is currently being applied.
    */
  var Iops: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The license model for the DB instance. Valid values: license-included | bring-your-own-license | general-public-license 
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  
  /**
    * Contains the pending or currently-in-progress change of the master credentials for the DB instance.
    */
  var MasterUserPassword: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates that the Single-AZ DB instance is to change to a Multi-AZ deployment.
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.undefined
  
  /**
    * This PendingCloudwatchLogsExports structure specifies pending changes to which CloudWatch logs are enabled and which are disabled.
    */
  var PendingCloudwatchLogsExports: js.UndefOr[typings.awsSdk.neptuneMod.PendingCloudwatchLogsExports] = js.undefined
  
  /**
    * Specifies the pending port for the DB instance.
    */
  var Port: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Specifies the storage type to be associated with the DB instance.
    */
  var StorageType: js.UndefOr[String] = js.undefined
}
object PendingModifiedValues {
  
  inline def apply(): PendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingModifiedValues]
  }
  
  extension [Self <: PendingModifiedValues](x: Self) {
    
    inline def setAllocatedStorage(value: IntegerOptional): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    inline def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    inline def setBackupRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "BackupRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setBackupRetentionPeriodUndefined: Self = StObject.set(x, "BackupRetentionPeriod", js.undefined)
    
    inline def setCACertificateIdentifier(value: String): Self = StObject.set(x, "CACertificateIdentifier", value.asInstanceOf[js.Any])
    
    inline def setCACertificateIdentifierUndefined: Self = StObject.set(x, "CACertificateIdentifier", js.undefined)
    
    inline def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceClassUndefined: Self = StObject.set(x, "DBInstanceClass", js.undefined)
    
    inline def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceIdentifierUndefined: Self = StObject.set(x, "DBInstanceIdentifier", js.undefined)
    
    inline def setDBSubnetGroupName(value: String): Self = StObject.set(x, "DBSubnetGroupName", value.asInstanceOf[js.Any])
    
    inline def setDBSubnetGroupNameUndefined: Self = StObject.set(x, "DBSubnetGroupName", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setIops(value: IntegerOptional): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    inline def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    inline def setLicenseModel(value: String): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    inline def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    inline def setMasterUserPassword(value: String): Self = StObject.set(x, "MasterUserPassword", value.asInstanceOf[js.Any])
    
    inline def setMasterUserPasswordUndefined: Self = StObject.set(x, "MasterUserPassword", js.undefined)
    
    inline def setMultiAZ(value: BooleanOptional): Self = StObject.set(x, "MultiAZ", value.asInstanceOf[js.Any])
    
    inline def setMultiAZUndefined: Self = StObject.set(x, "MultiAZ", js.undefined)
    
    inline def setPendingCloudwatchLogsExports(value: PendingCloudwatchLogsExports): Self = StObject.set(x, "PendingCloudwatchLogsExports", value.asInstanceOf[js.Any])
    
    inline def setPendingCloudwatchLogsExportsUndefined: Self = StObject.set(x, "PendingCloudwatchLogsExports", js.undefined)
    
    inline def setPort(value: IntegerOptional): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
    
    inline def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
  }
}
