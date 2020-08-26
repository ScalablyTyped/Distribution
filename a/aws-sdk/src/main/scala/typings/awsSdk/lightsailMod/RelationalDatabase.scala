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
  def apply(): RelationalDatabase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelationalDatabase]
  }
  @scala.inline
  implicit class RelationalDatabaseOps[Self <: RelationalDatabase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setArn(value: NonEmptyString): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setBackupRetentionEnabled(value: Boolean): Self = this.set("backupRetentionEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupRetentionEnabled: Self = this.set("backupRetentionEnabled", js.undefined)
    @scala.inline
    def setCaCertificateIdentifier(value: String): Self = this.set("caCertificateIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaCertificateIdentifier: Self = this.set("caCertificateIdentifier", js.undefined)
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setEngine(value: NonEmptyString): Self = this.set("engine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngine: Self = this.set("engine", js.undefined)
    @scala.inline
    def setEngineVersion(value: NonEmptyString): Self = this.set("engineVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEngineVersion: Self = this.set("engineVersion", js.undefined)
    @scala.inline
    def setHardware(value: RelationalDatabaseHardware): Self = this.set("hardware", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHardware: Self = this.set("hardware", js.undefined)
    @scala.inline
    def setLatestRestorableTime(value: IsoDate): Self = this.set("latestRestorableTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatestRestorableTime: Self = this.set("latestRestorableTime", js.undefined)
    @scala.inline
    def setLocation(value: ResourceLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMasterDatabaseName(value: String): Self = this.set("masterDatabaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterDatabaseName: Self = this.set("masterDatabaseName", js.undefined)
    @scala.inline
    def setMasterEndpoint(value: RelationalDatabaseEndpoint): Self = this.set("masterEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterEndpoint: Self = this.set("masterEndpoint", js.undefined)
    @scala.inline
    def setMasterUsername(value: NonEmptyString): Self = this.set("masterUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterUsername: Self = this.set("masterUsername", js.undefined)
    @scala.inline
    def setName(value: ResourceName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParameterApplyStatus(value: NonEmptyString): Self = this.set("parameterApplyStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterApplyStatus: Self = this.set("parameterApplyStatus", js.undefined)
    @scala.inline
    def setPendingMaintenanceActionsVarargs(value: PendingMaintenanceAction*): Self = this.set("pendingMaintenanceActions", js.Array(value :_*))
    @scala.inline
    def setPendingMaintenanceActions(value: PendingMaintenanceActionList): Self = this.set("pendingMaintenanceActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingMaintenanceActions: Self = this.set("pendingMaintenanceActions", js.undefined)
    @scala.inline
    def setPendingModifiedValues(value: PendingModifiedRelationalDatabaseValues): Self = this.set("pendingModifiedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingModifiedValues: Self = this.set("pendingModifiedValues", js.undefined)
    @scala.inline
    def setPreferredBackupWindow(value: NonEmptyString): Self = this.set("preferredBackupWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredBackupWindow: Self = this.set("preferredBackupWindow", js.undefined)
    @scala.inline
    def setPreferredMaintenanceWindow(value: NonEmptyString): Self = this.set("preferredMaintenanceWindow", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreferredMaintenanceWindow: Self = this.set("preferredMaintenanceWindow", js.undefined)
    @scala.inline
    def setPubliclyAccessible(value: Boolean): Self = this.set("publiclyAccessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("publiclyAccessible", js.undefined)
    @scala.inline
    def setRelationalDatabaseBlueprintId(value: NonEmptyString): Self = this.set("relationalDatabaseBlueprintId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationalDatabaseBlueprintId: Self = this.set("relationalDatabaseBlueprintId", js.undefined)
    @scala.inline
    def setRelationalDatabaseBundleId(value: NonEmptyString): Self = this.set("relationalDatabaseBundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationalDatabaseBundleId: Self = this.set("relationalDatabaseBundleId", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
    @scala.inline
    def setSecondaryAvailabilityZone(value: String): Self = this.set("secondaryAvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryAvailabilityZone: Self = this.set("secondaryAvailabilityZone", js.undefined)
    @scala.inline
    def setState(value: NonEmptyString): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setSupportCode(value: String): Self = this.set("supportCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportCode: Self = this.set("supportCode", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

