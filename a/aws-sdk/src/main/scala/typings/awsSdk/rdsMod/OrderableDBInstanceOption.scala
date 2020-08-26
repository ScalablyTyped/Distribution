package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderableDBInstanceOption extends js.Object {
  /**
    * The Availability Zone group for a DB instance.
    */
  var AvailabilityZoneGroup: js.UndefOr[String] = js.native
  /**
    * A list of Availability Zones for a DB instance.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.native
  /**
    * A list of the available processor features for the DB instance class of a DB instance.
    */
  var AvailableProcessorFeatures: js.UndefOr[AvailableProcessorFeatureList] = js.native
  /**
    * The DB instance class for a DB instance.
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  /**
    * The engine type of a DB instance.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The engine version of a DB instance.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The license model for a DB instance.
    */
  var LicenseModel: js.UndefOr[String] = js.native
  /**
    * Maximum total provisioned IOPS for a DB instance.
    */
  var MaxIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.native
  /**
    * Maximum provisioned IOPS per GiB for a DB instance.
    */
  var MaxIopsPerGib: js.UndefOr[DoubleOptional] = js.native
  /**
    * Maximum storage size for a DB instance.
    */
  var MaxStorageSize: js.UndefOr[IntegerOptional] = js.native
  /**
    * Minimum total provisioned IOPS for a DB instance.
    */
  var MinIopsPerDbInstance: js.UndefOr[IntegerOptional] = js.native
  /**
    * Minimum provisioned IOPS per GiB for a DB instance.
    */
  var MinIopsPerGib: js.UndefOr[DoubleOptional] = js.native
  /**
    * Minimum storage size for a DB instance.
    */
  var MinStorageSize: js.UndefOr[IntegerOptional] = js.native
  /**
    * Indicates whether a DB instance is Multi-AZ capable.
    */
  var MultiAZCapable: js.UndefOr[Boolean] = js.native
  /**
    * Whether a DB instance supports RDS on Outposts. For more information about RDS on Outposts, see Amazon RDS on AWS Outposts in the Amazon RDS User Guide. 
    */
  var OutpostCapable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a DB instance can have a read replica.
    */
  var ReadReplicaCapable: js.UndefOr[Boolean] = js.native
  /**
    * Indicates the storage type for a DB instance.
    */
  var StorageType: js.UndefOr[String] = js.native
  /**
    * A list of the supported DB engine modes.   global engine mode only applies for global database clusters created with Aurora MySQL version 5.6.10a. For higher Aurora MySQL versions, the clusters in a global database use provisioned engine mode.  
    */
  var SupportedEngineModes: js.UndefOr[EngineModeList] = js.native
  /**
    * Indicates whether a DB instance supports Enhanced Monitoring at intervals from 1 to 60 seconds.
    */
  var SupportsEnhancedMonitoring: js.UndefOr[Boolean] = js.native
  /**
    * A value that indicates whether you can use Aurora global databases with a specific combination of other DB engine attributes.
    */
  var SupportsGlobalDatabases: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a DB instance supports IAM database authentication.
    */
  var SupportsIAMDatabaseAuthentication: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a DB instance supports provisioned IOPS.
    */
  var SupportsIops: js.UndefOr[Boolean] = js.native
  /**
    * Whether a DB instance supports Kerberos Authentication.
    */
  var SupportsKerberosAuthentication: js.UndefOr[BooleanOptional] = js.native
  /**
    * True if a DB instance supports Performance Insights, otherwise false.
    */
  var SupportsPerformanceInsights: js.UndefOr[Boolean] = js.native
  /**
    * Whether Amazon RDS can automatically scale storage for DB instances that use the specified DB instance class.
    */
  var SupportsStorageAutoscaling: js.UndefOr[BooleanOptional] = js.native
  /**
    * Indicates whether a DB instance supports encrypted storage.
    */
  var SupportsStorageEncryption: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a DB instance is in a VPC.
    */
  var Vpc: js.UndefOr[Boolean] = js.native
}

object OrderableDBInstanceOption {
  @scala.inline
  def apply(): OrderableDBInstanceOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderableDBInstanceOption]
  }
  @scala.inline
  implicit class OrderableDBInstanceOptionOps[Self <: OrderableDBInstanceOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAvailabilityZoneGroup(value: String): Self = this.set("AvailabilityZoneGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZoneGroup: Self = this.set("AvailabilityZoneGroup", js.undefined)
    @scala.inline
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZoneList): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    @scala.inline
    def setAvailableProcessorFeaturesVarargs(value: AvailableProcessorFeature*): Self = this.set("AvailableProcessorFeatures", js.Array(value :_*))
    @scala.inline
    def setAvailableProcessorFeatures(value: AvailableProcessorFeatureList): Self = this.set("AvailableProcessorFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailableProcessorFeatures: Self = this.set("AvailableProcessorFeatures", js.undefined)
    @scala.inline
    def setDBInstanceClass(value: String): Self = this.set("DBInstanceClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBInstanceClass: Self = this.set("DBInstanceClass", js.undefined)
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    @scala.inline
    def setLicenseModel(value: String): Self = this.set("LicenseModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseModel: Self = this.set("LicenseModel", js.undefined)
    @scala.inline
    def setMaxIopsPerDbInstance(value: IntegerOptional): Self = this.set("MaxIopsPerDbInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxIopsPerDbInstance: Self = this.set("MaxIopsPerDbInstance", js.undefined)
    @scala.inline
    def setMaxIopsPerGib(value: DoubleOptional): Self = this.set("MaxIopsPerGib", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxIopsPerGib: Self = this.set("MaxIopsPerGib", js.undefined)
    @scala.inline
    def setMaxStorageSize(value: IntegerOptional): Self = this.set("MaxStorageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxStorageSize: Self = this.set("MaxStorageSize", js.undefined)
    @scala.inline
    def setMinIopsPerDbInstance(value: IntegerOptional): Self = this.set("MinIopsPerDbInstance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinIopsPerDbInstance: Self = this.set("MinIopsPerDbInstance", js.undefined)
    @scala.inline
    def setMinIopsPerGib(value: DoubleOptional): Self = this.set("MinIopsPerGib", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinIopsPerGib: Self = this.set("MinIopsPerGib", js.undefined)
    @scala.inline
    def setMinStorageSize(value: IntegerOptional): Self = this.set("MinStorageSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinStorageSize: Self = this.set("MinStorageSize", js.undefined)
    @scala.inline
    def setMultiAZCapable(value: Boolean): Self = this.set("MultiAZCapable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiAZCapable: Self = this.set("MultiAZCapable", js.undefined)
    @scala.inline
    def setOutpostCapable(value: Boolean): Self = this.set("OutpostCapable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutpostCapable: Self = this.set("OutpostCapable", js.undefined)
    @scala.inline
    def setReadReplicaCapable(value: Boolean): Self = this.set("ReadReplicaCapable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadReplicaCapable: Self = this.set("ReadReplicaCapable", js.undefined)
    @scala.inline
    def setStorageType(value: String): Self = this.set("StorageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageType: Self = this.set("StorageType", js.undefined)
    @scala.inline
    def setSupportedEngineModesVarargs(value: String*): Self = this.set("SupportedEngineModes", js.Array(value :_*))
    @scala.inline
    def setSupportedEngineModes(value: EngineModeList): Self = this.set("SupportedEngineModes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedEngineModes: Self = this.set("SupportedEngineModes", js.undefined)
    @scala.inline
    def setSupportsEnhancedMonitoring(value: Boolean): Self = this.set("SupportsEnhancedMonitoring", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsEnhancedMonitoring: Self = this.set("SupportsEnhancedMonitoring", js.undefined)
    @scala.inline
    def setSupportsGlobalDatabases(value: Boolean): Self = this.set("SupportsGlobalDatabases", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsGlobalDatabases: Self = this.set("SupportsGlobalDatabases", js.undefined)
    @scala.inline
    def setSupportsIAMDatabaseAuthentication(value: Boolean): Self = this.set("SupportsIAMDatabaseAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsIAMDatabaseAuthentication: Self = this.set("SupportsIAMDatabaseAuthentication", js.undefined)
    @scala.inline
    def setSupportsIops(value: Boolean): Self = this.set("SupportsIops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsIops: Self = this.set("SupportsIops", js.undefined)
    @scala.inline
    def setSupportsKerberosAuthentication(value: BooleanOptional): Self = this.set("SupportsKerberosAuthentication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsKerberosAuthentication: Self = this.set("SupportsKerberosAuthentication", js.undefined)
    @scala.inline
    def setSupportsPerformanceInsights(value: Boolean): Self = this.set("SupportsPerformanceInsights", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsPerformanceInsights: Self = this.set("SupportsPerformanceInsights", js.undefined)
    @scala.inline
    def setSupportsStorageAutoscaling(value: BooleanOptional): Self = this.set("SupportsStorageAutoscaling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsStorageAutoscaling: Self = this.set("SupportsStorageAutoscaling", js.undefined)
    @scala.inline
    def setSupportsStorageEncryption(value: Boolean): Self = this.set("SupportsStorageEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsStorageEncryption: Self = this.set("SupportsStorageEncryption", js.undefined)
    @scala.inline
    def setVpc(value: Boolean): Self = this.set("Vpc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpc: Self = this.set("Vpc", js.undefined)
  }
  
}

