package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrderableDBInstanceOption extends StObject {
  
  /**
    * A list of Availability Zones for a DB instance.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
  
  /**
    * The DB instance class for a DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.undefined
  
  /**
    * The engine type of a DB instance.
    */
  var Engine: js.UndefOr[String] = js.undefined
  
  /**
    * The engine version of a DB instance.
    */
  var EngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The license model for a DB instance.
    */
  var LicenseModel: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum total provisioned IOPS for a DB instance.
    */
  var MaxIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Maximum provisioned IOPS per GiB for a DB instance.
    */
  var MaxIopsPerGib: js.UndefOr[DoubleOptional] = js.undefined
  
  /**
    * Maximum storage size for a DB instance.
    */
  var MaxStorageSize: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Minimum total provisioned IOPS for a DB instance.
    */
  var MinIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Minimum provisioned IOPS per GiB for a DB instance.
    */
  var MinIopsPerGib: js.UndefOr[DoubleOptional] = js.undefined
  
  /**
    * Minimum storage size for a DB instance.
    */
  var MinStorageSize: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * Indicates whether a DB instance is Multi-AZ capable.
    */
  var MultiAZCapable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether a DB instance can have a Read Replica.
    */
  var ReadReplicaCapable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates the storage type for a DB instance.
    */
  var StorageType: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
    */
  var SupportsEnhancedMonitoring: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A value that indicates whether you can use Neptune global databases with a specific combination of other DB engine attributes.
    */
  var SupportsGlobalDatabases: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether a DB instance supports IAM database authentication.
    */
  var SupportsIAMDatabaseAuthentication: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether a DB instance supports provisioned IOPS.
    */
  var SupportsIops: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  (Not supported by Neptune) 
    */
  var SupportsPerformanceInsights: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether a DB instance supports encrypted storage.
    */
  var SupportsStorageEncryption: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether a DB instance is in a VPC.
    */
  var Vpc: js.UndefOr[Boolean] = js.undefined
}
object OrderableDBInstanceOption {
  
  inline def apply(): OrderableDBInstanceOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderableDBInstanceOption]
  }
  
  extension [Self <: OrderableDBInstanceOption](x: Self) {
    
    inline def setAvailabilityZones(value: AvailabilityZoneList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setDBInstanceClass(value: String): Self = StObject.set(x, "DBInstanceClass", value.asInstanceOf[js.Any])
    
    inline def setDBInstanceClassUndefined: Self = StObject.set(x, "DBInstanceClass", js.undefined)
    
    inline def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    inline def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    inline def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setLicenseModel(value: String): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    inline def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    inline def setMaxIopsPerDbInstance(value: IntegerOptional): Self = StObject.set(x, "MaxIopsPerDbInstance", value.asInstanceOf[js.Any])
    
    inline def setMaxIopsPerDbInstanceUndefined: Self = StObject.set(x, "MaxIopsPerDbInstance", js.undefined)
    
    inline def setMaxIopsPerGib(value: DoubleOptional): Self = StObject.set(x, "MaxIopsPerGib", value.asInstanceOf[js.Any])
    
    inline def setMaxIopsPerGibUndefined: Self = StObject.set(x, "MaxIopsPerGib", js.undefined)
    
    inline def setMaxStorageSize(value: IntegerOptional): Self = StObject.set(x, "MaxStorageSize", value.asInstanceOf[js.Any])
    
    inline def setMaxStorageSizeUndefined: Self = StObject.set(x, "MaxStorageSize", js.undefined)
    
    inline def setMinIopsPerDbInstance(value: IntegerOptional): Self = StObject.set(x, "MinIopsPerDbInstance", value.asInstanceOf[js.Any])
    
    inline def setMinIopsPerDbInstanceUndefined: Self = StObject.set(x, "MinIopsPerDbInstance", js.undefined)
    
    inline def setMinIopsPerGib(value: DoubleOptional): Self = StObject.set(x, "MinIopsPerGib", value.asInstanceOf[js.Any])
    
    inline def setMinIopsPerGibUndefined: Self = StObject.set(x, "MinIopsPerGib", js.undefined)
    
    inline def setMinStorageSize(value: IntegerOptional): Self = StObject.set(x, "MinStorageSize", value.asInstanceOf[js.Any])
    
    inline def setMinStorageSizeUndefined: Self = StObject.set(x, "MinStorageSize", js.undefined)
    
    inline def setMultiAZCapable(value: Boolean): Self = StObject.set(x, "MultiAZCapable", value.asInstanceOf[js.Any])
    
    inline def setMultiAZCapableUndefined: Self = StObject.set(x, "MultiAZCapable", js.undefined)
    
    inline def setReadReplicaCapable(value: Boolean): Self = StObject.set(x, "ReadReplicaCapable", value.asInstanceOf[js.Any])
    
    inline def setReadReplicaCapableUndefined: Self = StObject.set(x, "ReadReplicaCapable", js.undefined)
    
    inline def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    inline def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    inline def setSupportsEnhancedMonitoring(value: Boolean): Self = StObject.set(x, "SupportsEnhancedMonitoring", value.asInstanceOf[js.Any])
    
    inline def setSupportsEnhancedMonitoringUndefined: Self = StObject.set(x, "SupportsEnhancedMonitoring", js.undefined)
    
    inline def setSupportsGlobalDatabases(value: Boolean): Self = StObject.set(x, "SupportsGlobalDatabases", value.asInstanceOf[js.Any])
    
    inline def setSupportsGlobalDatabasesUndefined: Self = StObject.set(x, "SupportsGlobalDatabases", js.undefined)
    
    inline def setSupportsIAMDatabaseAuthentication(value: Boolean): Self = StObject.set(x, "SupportsIAMDatabaseAuthentication", value.asInstanceOf[js.Any])
    
    inline def setSupportsIAMDatabaseAuthenticationUndefined: Self = StObject.set(x, "SupportsIAMDatabaseAuthentication", js.undefined)
    
    inline def setSupportsIops(value: Boolean): Self = StObject.set(x, "SupportsIops", value.asInstanceOf[js.Any])
    
    inline def setSupportsIopsUndefined: Self = StObject.set(x, "SupportsIops", js.undefined)
    
    inline def setSupportsPerformanceInsights(value: Boolean): Self = StObject.set(x, "SupportsPerformanceInsights", value.asInstanceOf[js.Any])
    
    inline def setSupportsPerformanceInsightsUndefined: Self = StObject.set(x, "SupportsPerformanceInsights", js.undefined)
    
    inline def setSupportsStorageEncryption(value: Boolean): Self = StObject.set(x, "SupportsStorageEncryption", value.asInstanceOf[js.Any])
    
    inline def setSupportsStorageEncryptionUndefined: Self = StObject.set(x, "SupportsStorageEncryption", js.undefined)
    
    inline def setVpc(value: Boolean): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
    
    inline def setVpcUndefined: Self = StObject.set(x, "Vpc", js.undefined)
  }
}
