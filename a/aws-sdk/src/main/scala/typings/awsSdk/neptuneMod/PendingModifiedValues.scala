package typings.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingModifiedValues extends js.Object {
  /**
    *  Contains the new AllocatedStorage size for the DB instance that will be applied or is currently being applied.
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.native
  /**
    * Specifies the pending number of days for which automated backups are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * Specifies the identifier of the CA certificate for the DB instance.
    */
  var CACertificateIdentifier: js.UndefOr[String] = js.native
  /**
    *  Contains the new DBInstanceClass for the DB instance that will be applied or is currently being applied.
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  /**
    *  Contains the new DBInstanceIdentifier for the DB instance that will be applied or is currently being applied.
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * The new DB subnet group for the DB instance.
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * Specifies the new Provisioned IOPS value for the DB instance that will be applied or is currently being applied.
    */
  var Iops: js.UndefOr[IntegerOptional] = js.native
  /**
    * The license model for the DB instance. Valid values: license-included | bring-your-own-license | general-public-license 
    */
  var LicenseModel: js.UndefOr[String] = js.native
  /**
    * Contains the pending or currently-in-progress change of the master credentials for the DB instance.
    */
  var MasterUserPassword: js.UndefOr[String] = js.native
  /**
    * Indicates that the Single-AZ DB instance is to change to a Multi-AZ deployment.
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.native
  /**
    * This PendingCloudwatchLogsExports structure specifies pending changes to which CloudWatch logs are enabled and which are disabled.
    */
  var PendingCloudwatchLogsExports: js.UndefOr[typings.awsSdk.neptuneMod.PendingCloudwatchLogsExports] = js.native
  /**
    * Specifies the pending port for the DB instance.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * Specifies the storage type to be associated with the DB instance.
    */
  var StorageType: js.UndefOr[String] = js.native
}

object PendingModifiedValues {
  @scala.inline
  def apply(): PendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PendingModifiedValues]
  }
  @scala.inline
  implicit class PendingModifiedValuesOps[Self <: PendingModifiedValues] (val x: Self) extends AnyVal {
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
    def setAllocatedStorage(value: IntegerOptional): Self = this.set("AllocatedStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllocatedStorage: Self = this.set("AllocatedStorage", js.undefined)
    @scala.inline
    def setBackupRetentionPeriod(value: IntegerOptional): Self = this.set("BackupRetentionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupRetentionPeriod: Self = this.set("BackupRetentionPeriod", js.undefined)
    @scala.inline
    def setCACertificateIdentifier(value: String): Self = this.set("CACertificateIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCACertificateIdentifier: Self = this.set("CACertificateIdentifier", js.undefined)
    @scala.inline
    def setDBInstanceClass(value: String): Self = this.set("DBInstanceClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBInstanceClass: Self = this.set("DBInstanceClass", js.undefined)
    @scala.inline
    def setDBInstanceIdentifier(value: String): Self = this.set("DBInstanceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBInstanceIdentifier: Self = this.set("DBInstanceIdentifier", js.undefined)
    @scala.inline
    def setDBSubnetGroupName(value: String): Self = this.set("DBSubnetGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDBSubnetGroupName: Self = this.set("DBSubnetGroupName", js.undefined)
    @scala.inline
    def setEngineVersion(value: String): Self = this.set("EngineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("EngineVersion", js.undefined)
    @scala.inline
    def setIops(value: IntegerOptional): Self = this.set("Iops", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIops: Self = this.set("Iops", js.undefined)
    @scala.inline
    def setLicenseModel(value: String): Self = this.set("LicenseModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLicenseModel: Self = this.set("LicenseModel", js.undefined)
    @scala.inline
    def setMasterUserPassword(value: String): Self = this.set("MasterUserPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterUserPassword: Self = this.set("MasterUserPassword", js.undefined)
    @scala.inline
    def setMultiAZ(value: BooleanOptional): Self = this.set("MultiAZ", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiAZ: Self = this.set("MultiAZ", js.undefined)
    @scala.inline
    def setPendingCloudwatchLogsExports(value: PendingCloudwatchLogsExports): Self = this.set("PendingCloudwatchLogsExports", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingCloudwatchLogsExports: Self = this.set("PendingCloudwatchLogsExports", js.undefined)
    @scala.inline
    def setPort(value: IntegerOptional): Self = this.set("Port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("Port", js.undefined)
    @scala.inline
    def setStorageType(value: String): Self = this.set("StorageType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStorageType: Self = this.set("StorageType", js.undefined)
  }
  
}

