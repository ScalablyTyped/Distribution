package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBSnapshot extends js.Object {
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
    * Specifies when the snapshot was taken in Coodinated Universal Time (UTC).
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
  implicit class DBSnapshotOps[Self <: DBSnapshot] (val x: Self) extends AnyVal {
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
    def setAllocatedStorage(value: Integer): Self = this.set("AllocatedStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocatedStorage: Self = this.set("AllocatedStorage", js.undefined)
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setDBInstanceIdentifier(value: String): Self = this.set("DBInstanceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBInstanceIdentifier: Self = this.set("DBInstanceIdentifier", js.undefined)
    @scala.inline
    def setDBSnapshotArn(value: String): Self = this.set("DBSnapshotArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSnapshotArn: Self = this.set("DBSnapshotArn", js.undefined)
    @scala.inline
    def setDBSnapshotIdentifier(value: String): Self = this.set("DBSnapshotIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSnapshotIdentifier: Self = this.set("DBSnapshotIdentifier", js.undefined)
    @scala.inline
    def setDbiResourceId(value: String): Self = this.set("DbiResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDbiResourceId: Self = this.set("DbiResourceId", js.undefined)
    @scala.inline
    def setEncrypted(value: Boolean): Self = this.set("Encrypted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncrypted: Self = this.set("Encrypted", js.undefined)
    @scala.inline
    def setEngine(value: String): Self = this.set("Engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("Engine", js.undefined)
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    @scala.inline
    def setIAMDatabaseAuthenticationEnabled(value: Boolean): Self = this.set("IAMDatabaseAuthenticationEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIAMDatabaseAuthenticationEnabled: Self = this.set("IAMDatabaseAuthenticationEnabled", js.undefined)
    @scala.inline
    def setInstanceCreateTime(value: TStamp): Self = this.set("InstanceCreateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceCreateTime: Self = this.set("InstanceCreateTime", js.undefined)
    @scala.inline
    def setIops(value: IntegerOptional): Self = this.set("Iops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIops: Self = this.set("Iops", js.undefined)
    @scala.inline
    def setKmsKeyId(value: String): Self = this.set("KmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("KmsKeyId", js.undefined)
    @scala.inline
    def setLicenseModel(value: String): Self = this.set("LicenseModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseModel: Self = this.set("LicenseModel", js.undefined)
    @scala.inline
    def setMasterUsername(value: String): Self = this.set("MasterUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterUsername: Self = this.set("MasterUsername", js.undefined)
    @scala.inline
    def setOptionGroupName(value: String): Self = this.set("OptionGroupName", value.asInstanceOf[js.Any])
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
    def setProcessorFeaturesVarargs(value: ProcessorFeature*): Self = this.set("ProcessorFeatures", js.Array(value :_*))
    @scala.inline
    def setProcessorFeatures(value: ProcessorFeatureList): Self = this.set("ProcessorFeatures", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessorFeatures: Self = this.set("ProcessorFeatures", js.undefined)
    @scala.inline
    def setSnapshotCreateTime(value: TStamp): Self = this.set("SnapshotCreateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotCreateTime: Self = this.set("SnapshotCreateTime", js.undefined)
    @scala.inline
    def setSnapshotType(value: String): Self = this.set("SnapshotType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotType: Self = this.set("SnapshotType", js.undefined)
    @scala.inline
    def setSourceDBSnapshotIdentifier(value: String): Self = this.set("SourceDBSnapshotIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceDBSnapshotIdentifier: Self = this.set("SourceDBSnapshotIdentifier", js.undefined)
    @scala.inline
    def setSourceRegion(value: String): Self = this.set("SourceRegion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceRegion: Self = this.set("SourceRegion", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStorageType(value: String): Self = this.set("StorageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageType: Self = this.set("StorageType", js.undefined)
    @scala.inline
    def setTdeCredentialArn(value: String): Self = this.set("TdeCredentialArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTdeCredentialArn: Self = this.set("TdeCredentialArn", js.undefined)
    @scala.inline
    def setTimezone(value: String): Self = this.set("Timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("Timezone", js.undefined)
    @scala.inline
    def setVpcId(value: String): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcId: Self = this.set("VpcId", js.undefined)
  }
  
}

