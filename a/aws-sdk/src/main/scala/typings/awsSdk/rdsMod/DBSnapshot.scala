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
    * Specifies the time when the snapshot was taken, in Universal Coordinated Time (UTC).
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
    * Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
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
  def apply(
    AllocatedStorage: Int | scala.Double = null,
    AvailabilityZone: String = null,
    DBInstanceIdentifier: String = null,
    DBSnapshotArn: String = null,
    DBSnapshotIdentifier: String = null,
    DbiResourceId: String = null,
    Encrypted: js.UndefOr[scala.Boolean] = js.undefined,
    Engine: String = null,
    EngineVersion: String = null,
    IAMDatabaseAuthenticationEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    InstanceCreateTime: TStamp = null,
    Iops: Int | scala.Double = null,
    KmsKeyId: String = null,
    LicenseModel: String = null,
    MasterUsername: String = null,
    OptionGroupName: String = null,
    PercentProgress: Int | scala.Double = null,
    Port: Int | scala.Double = null,
    ProcessorFeatures: ProcessorFeatureList = null,
    SnapshotCreateTime: TStamp = null,
    SnapshotType: String = null,
    SourceDBSnapshotIdentifier: String = null,
    SourceRegion: String = null,
    Status: String = null,
    StorageType: String = null,
    TdeCredentialArn: String = null,
    Timezone: String = null,
    VpcId: String = null
  ): DBSnapshot = {
    val __obj = js.Dynamic.literal()
    if (AllocatedStorage != null) __obj.updateDynamic("AllocatedStorage")(AllocatedStorage.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (DBInstanceIdentifier != null) __obj.updateDynamic("DBInstanceIdentifier")(DBInstanceIdentifier.asInstanceOf[js.Any])
    if (DBSnapshotArn != null) __obj.updateDynamic("DBSnapshotArn")(DBSnapshotArn.asInstanceOf[js.Any])
    if (DBSnapshotIdentifier != null) __obj.updateDynamic("DBSnapshotIdentifier")(DBSnapshotIdentifier.asInstanceOf[js.Any])
    if (DbiResourceId != null) __obj.updateDynamic("DbiResourceId")(DbiResourceId.asInstanceOf[js.Any])
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted.asInstanceOf[js.Any])
    if (Engine != null) __obj.updateDynamic("Engine")(Engine.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(IAMDatabaseAuthenticationEnabled)) __obj.updateDynamic("IAMDatabaseAuthenticationEnabled")(IAMDatabaseAuthenticationEnabled.asInstanceOf[js.Any])
    if (InstanceCreateTime != null) __obj.updateDynamic("InstanceCreateTime")(InstanceCreateTime.asInstanceOf[js.Any])
    if (Iops != null) __obj.updateDynamic("Iops")(Iops.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel.asInstanceOf[js.Any])
    if (MasterUsername != null) __obj.updateDynamic("MasterUsername")(MasterUsername.asInstanceOf[js.Any])
    if (OptionGroupName != null) __obj.updateDynamic("OptionGroupName")(OptionGroupName.asInstanceOf[js.Any])
    if (PercentProgress != null) __obj.updateDynamic("PercentProgress")(PercentProgress.asInstanceOf[js.Any])
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    if (ProcessorFeatures != null) __obj.updateDynamic("ProcessorFeatures")(ProcessorFeatures.asInstanceOf[js.Any])
    if (SnapshotCreateTime != null) __obj.updateDynamic("SnapshotCreateTime")(SnapshotCreateTime.asInstanceOf[js.Any])
    if (SnapshotType != null) __obj.updateDynamic("SnapshotType")(SnapshotType.asInstanceOf[js.Any])
    if (SourceDBSnapshotIdentifier != null) __obj.updateDynamic("SourceDBSnapshotIdentifier")(SourceDBSnapshotIdentifier.asInstanceOf[js.Any])
    if (SourceRegion != null) __obj.updateDynamic("SourceRegion")(SourceRegion.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType.asInstanceOf[js.Any])
    if (TdeCredentialArn != null) __obj.updateDynamic("TdeCredentialArn")(TdeCredentialArn.asInstanceOf[js.Any])
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBSnapshot]
  }
}

