package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelationalDatabase extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the database.
    */
  var arn: js.UndefOr[NonEmptyString] = js.native
  /**
    * A Boolean value indicating whether automated backup retention is enabled for the database.
    */
  var backupRetentionEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The certificate associated with the database.
    */
  var caCertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * The timestamp when the database was created. Formatted in Unix time.
    */
  var createdAt: js.UndefOr[IsoDate] = js.native
  /**
    * The database software (for example, MySQL).
    */
  var engine: js.UndefOr[NonEmptyString] = js.native
  /**
    * The database engine version (for example, 5.7.23).
    */
  var engineVersion: js.UndefOr[NonEmptyString] = js.native
  /**
    * Describes the hardware of the database.
    */
  var hardware: js.UndefOr[RelationalDatabaseHardware] = js.native
  /**
    * The latest point in time to which the database can be restored. Formatted in Unix time.
    */
  var latestRestorableTime: js.UndefOr[IsoDate] = js.native
  /**
    * The Region name and Availability Zone where the database is located.
    */
  var location: js.UndefOr[ResourceLocation] = js.native
  /**
    * The name of the master database created when the Lightsail database resource is created.
    */
  var masterDatabaseName: js.UndefOr[String] = js.native
  /**
    * The master endpoint for the database.
    */
  var masterEndpoint: js.UndefOr[RelationalDatabaseEndpoint] = js.native
  /**
    * The master user name of the database.
    */
  var masterUsername: js.UndefOr[NonEmptyString] = js.native
  /**
    * The unique name of the database resource in Lightsail.
    */
  var name: js.UndefOr[ResourceName] = js.native
  /**
    * The status of parameter updates for the database.
    */
  var parameterApplyStatus: js.UndefOr[NonEmptyString] = js.native
  /**
    * Describes the pending maintenance actions for the database.
    */
  var pendingMaintenanceActions: js.UndefOr[PendingMaintenanceActionList] = js.native
  /**
    * Describes pending database value modifications.
    */
  var pendingModifiedValues: js.UndefOr[PendingModifiedRelationalDatabaseValues] = js.native
  /**
    * The daily time range during which automated backups are created for the database (for example, 16:00-16:30).
    */
  var preferredBackupWindow: js.UndefOr[NonEmptyString] = js.native
  /**
    * The weekly time range during which system maintenance can occur on the database. In the format ddd:hh24:mi-ddd:hh24:mi. For example, Tue:17:00-Tue:17:30.
    */
  var preferredMaintenanceWindow: js.UndefOr[NonEmptyString] = js.native
  /**
    * A Boolean value indicating whether the database is publicly accessible.
    */
  var publiclyAccessible: js.UndefOr[Boolean] = js.native
  /**
    * The blueprint ID for the database. A blueprint describes the major engine version of a database.
    */
  var relationalDatabaseBlueprintId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The bundle ID for the database. A bundle describes the performance specifications for your database.
    */
  var relationalDatabaseBundleId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The Lightsail resource type for the database (for example, RelationalDatabase).
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
  /**
    * Describes the secondary Availability Zone of a high availability database. The secondary database is used for failover support of a high availability database.
    */
  var secondaryAvailabilityZone: js.UndefOr[String] = js.native
  /**
    * Describes the current state of the database.
    */
  var state: js.UndefOr[NonEmptyString] = js.native
  /**
    * The support code for the database. Include this code in your email to support when you have questions about a database in Lightsail. This code enables our support team to look up your Lightsail information more easily.
    */
  var supportCode: js.UndefOr[String] = js.native
  /**
    * The tag keys and optional values for the resource. For more information about tags in Lightsail, see the Lightsail Dev Guide.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object RelationalDatabase {
  @scala.inline
  def apply(
    arn: NonEmptyString = null,
    backupRetentionEnabled: js.UndefOr[Boolean] = js.undefined,
    caCertificateIdentifier: String = null,
    createdAt: IsoDate = null,
    engine: NonEmptyString = null,
    engineVersion: NonEmptyString = null,
    hardware: RelationalDatabaseHardware = null,
    latestRestorableTime: IsoDate = null,
    location: ResourceLocation = null,
    masterDatabaseName: String = null,
    masterEndpoint: RelationalDatabaseEndpoint = null,
    masterUsername: NonEmptyString = null,
    name: ResourceName = null,
    parameterApplyStatus: NonEmptyString = null,
    pendingMaintenanceActions: PendingMaintenanceActionList = null,
    pendingModifiedValues: PendingModifiedRelationalDatabaseValues = null,
    preferredBackupWindow: NonEmptyString = null,
    preferredMaintenanceWindow: NonEmptyString = null,
    publiclyAccessible: js.UndefOr[Boolean] = js.undefined,
    relationalDatabaseBlueprintId: NonEmptyString = null,
    relationalDatabaseBundleId: NonEmptyString = null,
    resourceType: ResourceType = null,
    secondaryAvailabilityZone: String = null,
    state: NonEmptyString = null,
    supportCode: String = null,
    tags: TagList = null
  ): RelationalDatabase = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (!js.isUndefined(backupRetentionEnabled)) __obj.updateDynamic("backupRetentionEnabled")(backupRetentionEnabled.get.asInstanceOf[js.Any])
    if (caCertificateIdentifier != null) __obj.updateDynamic("caCertificateIdentifier")(caCertificateIdentifier.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (engine != null) __obj.updateDynamic("engine")(engine.asInstanceOf[js.Any])
    if (engineVersion != null) __obj.updateDynamic("engineVersion")(engineVersion.asInstanceOf[js.Any])
    if (hardware != null) __obj.updateDynamic("hardware")(hardware.asInstanceOf[js.Any])
    if (latestRestorableTime != null) __obj.updateDynamic("latestRestorableTime")(latestRestorableTime.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (masterDatabaseName != null) __obj.updateDynamic("masterDatabaseName")(masterDatabaseName.asInstanceOf[js.Any])
    if (masterEndpoint != null) __obj.updateDynamic("masterEndpoint")(masterEndpoint.asInstanceOf[js.Any])
    if (masterUsername != null) __obj.updateDynamic("masterUsername")(masterUsername.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parameterApplyStatus != null) __obj.updateDynamic("parameterApplyStatus")(parameterApplyStatus.asInstanceOf[js.Any])
    if (pendingMaintenanceActions != null) __obj.updateDynamic("pendingMaintenanceActions")(pendingMaintenanceActions.asInstanceOf[js.Any])
    if (pendingModifiedValues != null) __obj.updateDynamic("pendingModifiedValues")(pendingModifiedValues.asInstanceOf[js.Any])
    if (preferredBackupWindow != null) __obj.updateDynamic("preferredBackupWindow")(preferredBackupWindow.asInstanceOf[js.Any])
    if (preferredMaintenanceWindow != null) __obj.updateDynamic("preferredMaintenanceWindow")(preferredMaintenanceWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(publiclyAccessible)) __obj.updateDynamic("publiclyAccessible")(publiclyAccessible.get.asInstanceOf[js.Any])
    if (relationalDatabaseBlueprintId != null) __obj.updateDynamic("relationalDatabaseBlueprintId")(relationalDatabaseBlueprintId.asInstanceOf[js.Any])
    if (relationalDatabaseBundleId != null) __obj.updateDynamic("relationalDatabaseBundleId")(relationalDatabaseBundleId.asInstanceOf[js.Any])
    if (resourceType != null) __obj.updateDynamic("resourceType")(resourceType.asInstanceOf[js.Any])
    if (secondaryAvailabilityZone != null) __obj.updateDynamic("secondaryAvailabilityZone")(secondaryAvailabilityZone.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (supportCode != null) __obj.updateDynamic("supportCode")(supportCode.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationalDatabase]
  }
}

