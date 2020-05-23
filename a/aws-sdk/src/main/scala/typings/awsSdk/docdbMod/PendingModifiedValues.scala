package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PendingModifiedValues extends js.Object {
  /**
    *  Contains the new AllocatedStorage size for then instance that will be applied or is currently being applied. 
    */
  var AllocatedStorage: js.UndefOr[IntegerOptional] = js.native
  /**
    * Specifies the pending number of days for which automated backups are retained.
    */
  var BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * Specifies the identifier of the certificate authority (CA) certificate for the DB instance.
    */
  var CACertificateIdentifier: js.UndefOr[String] = js.native
  /**
    *  Contains the new DBInstanceClass for the instance that will be applied or is currently being applied. 
    */
  var DBInstanceClass: js.UndefOr[String] = js.native
  /**
    *  Contains the new DBInstanceIdentifier for the instance that will be applied or is currently being applied. 
    */
  var DBInstanceIdentifier: js.UndefOr[String] = js.native
  /**
    * The new subnet group for the instance. 
    */
  var DBSubnetGroupName: js.UndefOr[String] = js.native
  /**
    * Indicates the database engine version.
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * Specifies the new Provisioned IOPS value for the instance that will be applied or is currently being applied.
    */
  var Iops: js.UndefOr[IntegerOptional] = js.native
  /**
    * The license model for the instance. Valid values: license-included, bring-your-own-license, general-public-license 
    */
  var LicenseModel: js.UndefOr[String] = js.native
  /**
    * Contains the pending or currently in-progress change of the master credentials for the instance.
    */
  var MasterUserPassword: js.UndefOr[String] = js.native
  /**
    * Indicates that the Single-AZ instance is to change to a Multi-AZ deployment.
    */
  var MultiAZ: js.UndefOr[BooleanOptional] = js.native
  /**
    * A list of the log types whose configuration is still pending. These log types are in the process of being activated or deactivated.
    */
  var PendingCloudwatchLogsExports: js.UndefOr[typings.awsSdk.docdbMod.PendingCloudwatchLogsExports] = js.native
  /**
    * Specifies the pending port for the instance.
    */
  var Port: js.UndefOr[IntegerOptional] = js.native
  /**
    * Specifies the storage type to be associated with the instance.
    */
  var StorageType: js.UndefOr[String] = js.native
}

object PendingModifiedValues {
  @scala.inline
  def apply(
    AllocatedStorage: js.UndefOr[IntegerOptional] = js.undefined,
    BackupRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined,
    CACertificateIdentifier: String = null,
    DBInstanceClass: String = null,
    DBInstanceIdentifier: String = null,
    DBSubnetGroupName: String = null,
    EngineVersion: String = null,
    Iops: js.UndefOr[IntegerOptional] = js.undefined,
    LicenseModel: String = null,
    MasterUserPassword: String = null,
    MultiAZ: js.UndefOr[BooleanOptional] = js.undefined,
    PendingCloudwatchLogsExports: PendingCloudwatchLogsExports = null,
    Port: js.UndefOr[IntegerOptional] = js.undefined,
    StorageType: String = null
  ): PendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllocatedStorage)) __obj.updateDynamic("AllocatedStorage")(AllocatedStorage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(BackupRetentionPeriod)) __obj.updateDynamic("BackupRetentionPeriod")(BackupRetentionPeriod.get.asInstanceOf[js.Any])
    if (CACertificateIdentifier != null) __obj.updateDynamic("CACertificateIdentifier")(CACertificateIdentifier.asInstanceOf[js.Any])
    if (DBInstanceClass != null) __obj.updateDynamic("DBInstanceClass")(DBInstanceClass.asInstanceOf[js.Any])
    if (DBInstanceIdentifier != null) __obj.updateDynamic("DBInstanceIdentifier")(DBInstanceIdentifier.asInstanceOf[js.Any])
    if (DBSubnetGroupName != null) __obj.updateDynamic("DBSubnetGroupName")(DBSubnetGroupName.asInstanceOf[js.Any])
    if (EngineVersion != null) __obj.updateDynamic("EngineVersion")(EngineVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops.get.asInstanceOf[js.Any])
    if (LicenseModel != null) __obj.updateDynamic("LicenseModel")(LicenseModel.asInstanceOf[js.Any])
    if (MasterUserPassword != null) __obj.updateDynamic("MasterUserPassword")(MasterUserPassword.asInstanceOf[js.Any])
    if (!js.isUndefined(MultiAZ)) __obj.updateDynamic("MultiAZ")(MultiAZ.get.asInstanceOf[js.Any])
    if (PendingCloudwatchLogsExports != null) __obj.updateDynamic("PendingCloudwatchLogsExports")(PendingCloudwatchLogsExports.asInstanceOf[js.Any])
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port.get.asInstanceOf[js.Any])
    if (StorageType != null) __obj.updateDynamic("StorageType")(StorageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PendingModifiedValues]
  }
}

