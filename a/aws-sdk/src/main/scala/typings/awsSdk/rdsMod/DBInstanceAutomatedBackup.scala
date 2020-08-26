package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBInstanceAutomatedBackup extends js.Object {
  /**
    * Specifies the allocated storage size in gibibytes (GiB).
    */
  var AllocatedStorage: js.UndefOr[Integer] = js.native
  /**
    * The Availability Zone that the automated backup was created in. For information on AWS Regions and Availability Zones, see Regions and Availability Zones.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the automated backup.
    */
  var DBInstanceArn: js.UndefOr[String] = js.native
  /**
    * The customer id of the instance that is/was associated with the automated backup. 
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * The identifier for the source DB instance, which can't be changed and which is unique to an AWS Region.
    */
  var DbiResourceId: js.UndefOr[String] = js.native
  /**
    * Specifies whether the automated backup is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.native
  /**
    * The name of the database engine for this automated backup.
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The version of the database engine for the automated backup.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * True if mapping of AWS Identity and Access Management (IAM) accounts to database accounts is enabled, and otherwise false.
    */
  var IAMDatabaseAuthenticationEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Provides the date and time that the DB instance was created. 
    */
  var InstanceCreateTime: js.UndefOr[TStamp] = js.native
  /**
    * The IOPS (I/O operations per second) value for the automated backup. 
    */
  var Iops: js.UndefOr[IntegerOptional] = js.native
  /**
    * The AWS KMS key ID for an automated backup. The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS encryption key. 
    */
  var KmsKeyId: js.UndefOr[String] = js.native
  /**
    * License model information for the automated backup.
    */
  var LicenseModel: js.UndefOr[String] = js.native
  /**
    * The license model of an automated backup.
    */
  var MasterUsername: js.UndefOr[String] = js.native
  /**
    * The option group the automated backup is associated with. If omitted, the default option group for the engine specified is used.
    */
  var OptionGroupName: js.UndefOr[String] = js.native
  /**
    * The port number that the automated backup used for connections. Default: Inherits from the source DB instance Valid Values: 1150-65535 
    */
  var Port: js.UndefOr[Integer] = js.native
  /**
    * The AWS Region associated with the automated backup.
    */
  var Region: js.UndefOr[String] = js.native
  /**
    * Earliest and latest time an instance can be restored to.
    */
  var RestoreWindow: js.UndefOr[typings.awsSdk.rdsMod.RestoreWindow] = js.native
  /**
    * Provides a list of status information for an automated backup:    active - automated backups for current instances    retained - automated backups for deleted instances    creating - automated backups that are waiting for the first automated snapshot to be available.  
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * Specifies the storage type associated with the automated backup.
    */
  var StorageType: js.UndefOr[String] = js.native
  /**
    * The ARN from the key store with which the automated backup is associated for TDE encryption.
    */
  var TdeCredentialArn: js.UndefOr[String] = js.native
  /**
    * The time zone of the automated backup. In most cases, the Timezone element is empty. Timezone content appears only for Microsoft SQL Server DB instances that were created with a time zone specified.
    */
  var Timezone: js.UndefOr[String] = js.native
  /**
    * Provides the VPC ID associated with the DB instance
    */
  var VpcId: js.UndefOr[String] = js.native
}

object DBInstanceAutomatedBackup {
  @scala.inline
  def apply(): DBInstanceAutomatedBackup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBInstanceAutomatedBackup]
  }
  @scala.inline
  implicit class DBInstanceAutomatedBackupOps[Self <: DBInstanceAutomatedBackup] (val x: Self) extends AnyVal {
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
    def setDBInstanceArn(value: String): Self = this.set("DBInstanceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBInstanceArn: Self = this.set("DBInstanceArn", js.undefined)
    @scala.inline
    def setDBInstanceIdentifier(value: String): Self = this.set("DBInstanceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBInstanceIdentifier: Self = this.set("DBInstanceIdentifier", js.undefined)
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
    def setPort(value: Integer): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("Region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("Region", js.undefined)
    @scala.inline
    def setRestoreWindow(value: RestoreWindow): Self = this.set("RestoreWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestoreWindow: Self = this.set("RestoreWindow", js.undefined)
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

