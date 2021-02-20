package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DBSnapshot extends StObject {
  
  /**
    * Specifies the allocated storage size in gibibytes (GiB).
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.native
  
  /**
    * Specifies the name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  
  /**
    * Specifies the DB instance identifier of the DB instance this DB snapshot was created from.
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the DB snapshot.
    */
  var DBSnapshotArn: js.UndefOr[String] = js.native
  
  /**
    * Specifies the identifier for the DB snapshot.
    */
  var DBSnapshotIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
    */
  var DbiResourceId: js.UndefOr[String] = js.native
  
  /**
    * Specifies whether the DB snapshot is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the name of the database engine.
    */
  var Engine: js.UndefOr[String] = js.native
  
  /**
    * Specifies the version of the database engine.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  
  /**
    * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false.
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Specifies the time in Coordinated Universal Time (UTC) when the DB instance, from which the snapshot was taken, was created.
    */
  var InstanceCreateTime: js.UndefOr[TStamp] = js.native
  
  /**
    * Specifies the Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
    */
  var Iops: js.UndefOr[IntegerOptional] = js.native
  
  /**
    *  If Encrypted is true, the AWS KMS key identifier for the encrypted DB snapshot. 
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  
  /**
    * License model information for the restored DB instance.
    */
  var LicenseModel: js.UndefOr[String] = js.native
  
  /**
    * Provides the master username for the DB snapshot.
    */
  var MasterUsername: js.UndefOr[String] = js.native
  
  /**
    * Provides the option group name for the DB snapshot.
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  
  /**
    * The percentage of the estimated data that has been transferred.
    */
  var PercentProgress: js.UndefOr[Integer] = js.native
  
  /**
    * Specifies the port that the database engine was listening on at the time of the snapshot.
    */
  var Port: js.UndefOr[Integer] = js.native
  
  /**
    * The number of CPU cores and the number of threads per core for the DB instance class of the DB instance when the DB snapshot was created.
    */
  var ProcessorFeatures: js.UndefOr[ProcessorFeatureList] = js.native
  
  /**
    * Specifies when the snapshot was taken in Coordinated Universal Time (UTC).
    */
  var SnapshotCreateTime: js.UndefOr[TStamp] = js.native
  
  /**
    * Provides the type of the DB snapshot.
    */
  var SnapshotType: js.UndefOr[String] = js.native
  
  /**
    * The DB snapshot Amazon Resource Name (ARN) that the DB snapshot was copied from. It only has value in case of cross-customer or cross-region copy.
    */
  var SourceDBSnapshotIdentifier: js.UndefOr[String] = js.native
  
  /**
    * The AWS Region that the DB snapshot was created in or copied from.
    */
  var SourceRegion: js.UndefOr[String] = js.native
  
  /**
    * Specifies the status of this DB snapshot.
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * Specifies the storage type associated with DB snapshot.
    */
  var StorageType: js.UndefOr[String] = js.native
  
  var TagList: js.UndefOr[typings.awsSdk.rdsMod.TagList] = js.native
  
  /**
    * The ARN from the key store with which to associate the instance for TDE encryption.
    */
  var TdeCredentialArn: js.UndefOr[String] = js.native
  
  /**
    * The time zone of the DB snapshot. In most cases, the Timezone element is empty. Timezone content appears only for snapshots taken from Microsoft SQL Server DB instances that were created with a time zone specified. 
    */
  var Timezone: js.UndefOr[String] = js.native
  
  /**
    * Provides the VPC ID associated with the DB snapshot.
    */
  var VpcId: js.UndefOr[String] = js.native
}
object DBSnapshot {
  
  @scala.inline
  def apply(): DBSnapshot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBSnapshot]
  }
  
  @scala.inline
  implicit class DBSnapshotMutableBuilder[Self <: DBSnapshot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocatedStorage(value: Integer): Self = StObject.set(x, "AllocatedStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocatedStorageUndefined: Self = StObject.set(x, "AllocatedStorage", js.undefined)
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "AvailabilityZone", js.undefined)
    
    @scala.inline
    def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBInstanceIdentifierUndefined: Self = StObject.set(x, "DBInstanceIdentifier", js.undefined)
    
    @scala.inline
    def setDBSnapshotArn(value: String): Self = StObject.set(x, "DBSnapshotArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSnapshotArnUndefined: Self = StObject.set(x, "DBSnapshotArn", js.undefined)
    
    @scala.inline
    def setDBSnapshotIdentifier(value: String): Self = StObject.set(x, "DBSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSnapshotIdentifierUndefined: Self = StObject.set(x, "DBSnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setDbiResourceId(value: String): Self = StObject.set(x, "DbiResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbiResourceIdUndefined: Self = StObject.set(x, "DbiResourceId", js.undefined)
    
    @scala.inline
    def setEncrypted(value: Boolean): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedUndefined: Self = StObject.set(x, "Encrypted", js.undefined)
    
    @scala.inline
    def setEngine(value: String): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: String): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    @scala.inline
    def setIAMDatabaseAuthenticationEnabled(value: Boolean): Self = StObject.set(x, "IAMDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIAMDatabaseAuthenticationEnabledUndefined: Self = StObject.set(x, "IAMDatabaseAuthenticationEnabled", js.undefined)
    
    @scala.inline
    def setInstanceCreateTime(value: TStamp): Self = StObject.set(x, "InstanceCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceCreateTimeUndefined: Self = StObject.set(x, "InstanceCreateTime", js.undefined)
    
    @scala.inline
    def setIops(value: IntegerOptional): Self = StObject.set(x, "Iops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIopsUndefined: Self = StObject.set(x, "Iops", js.undefined)
    
    @scala.inline
    def setKmsKeyId(value: String): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
    
    @scala.inline
    def setLicenseModel(value: String): Self = StObject.set(x, "LicenseModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLicenseModelUndefined: Self = StObject.set(x, "LicenseModel", js.undefined)
    
    @scala.inline
    def setMasterUsername(value: String): Self = StObject.set(x, "MasterUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUsernameUndefined: Self = StObject.set(x, "MasterUsername", js.undefined)
    
    @scala.inline
    def setOptionGroupName(value: String): Self = StObject.set(x, "OptionGroupName", value.asInstanceOf[js.Any])
    
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
    def setProcessorFeatures(value: ProcessorFeatureList): Self = StObject.set(x, "ProcessorFeatures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessorFeaturesUndefined: Self = StObject.set(x, "ProcessorFeatures", js.undefined)
    
    @scala.inline
    def setProcessorFeaturesVarargs(value: ProcessorFeature*): Self = StObject.set(x, "ProcessorFeatures", js.Array(value :_*))
    
    @scala.inline
    def setSnapshotCreateTime(value: TStamp): Self = StObject.set(x, "SnapshotCreateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotCreateTimeUndefined: Self = StObject.set(x, "SnapshotCreateTime", js.undefined)
    
    @scala.inline
    def setSnapshotType(value: String): Self = StObject.set(x, "SnapshotType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotTypeUndefined: Self = StObject.set(x, "SnapshotType", js.undefined)
    
    @scala.inline
    def setSourceDBSnapshotIdentifier(value: String): Self = StObject.set(x, "SourceDBSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDBSnapshotIdentifierUndefined: Self = StObject.set(x, "SourceDBSnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setSourceRegion(value: String): Self = StObject.set(x, "SourceRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRegionUndefined: Self = StObject.set(x, "SourceRegion", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setStorageType(value: String): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStorageTypeUndefined: Self = StObject.set(x, "StorageType", js.undefined)
    
    @scala.inline
    def setTagList(value: TagList): Self = StObject.set(x, "TagList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagListUndefined: Self = StObject.set(x, "TagList", js.undefined)
    
    @scala.inline
    def setTagListVarargs(value: Tag*): Self = StObject.set(x, "TagList", js.Array(value :_*))
    
    @scala.inline
    def setTdeCredentialArn(value: String): Self = StObject.set(x, "TdeCredentialArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTdeCredentialArnUndefined: Self = StObject.set(x, "TdeCredentialArn", js.undefined)
    
    @scala.inline
    def setTimezone(value: String): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
    
    @scala.inline
    def setVpcId(value: String): Self = StObject.set(x, "VpcId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcIdUndefined: Self = StObject.set(x, "VpcId", js.undefined)
  }
}
