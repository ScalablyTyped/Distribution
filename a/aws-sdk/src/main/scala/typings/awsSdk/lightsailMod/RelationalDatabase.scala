package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RelationalDatabase extends StObject {
  
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
  implicit class RelationalDatabaseMutableBuilder[Self <: RelationalDatabase] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setBackupRetentionEnabled(value: Boolean): Self = StObject.set(x, "backupRetentionEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupRetentionEnabledUndefined: Self = StObject.set(x, "backupRetentionEnabled", js.undefined)
    
    @scala.inline
    def setCaCertificateIdentifier(value: String): Self = StObject.set(x, "caCertificateIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaCertificateIdentifierUndefined: Self = StObject.set(x, "caCertificateIdentifier", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: IsoDate): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setEngine(value: NonEmptyString): Self = StObject.set(x, "engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "engine", js.undefined)
    
    @scala.inline
    def setEngineVersion(value: NonEmptyString): Self = StObject.set(x, "engineVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineVersionUndefined: Self = StObject.set(x, "engineVersion", js.undefined)
    
    @scala.inline
    def setHardware(value: RelationalDatabaseHardware): Self = StObject.set(x, "hardware", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHardwareUndefined: Self = StObject.set(x, "hardware", js.undefined)
    
    @scala.inline
    def setLatestRestorableTime(value: IsoDate): Self = StObject.set(x, "latestRestorableTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestRestorableTimeUndefined: Self = StObject.set(x, "latestRestorableTime", js.undefined)
    
    @scala.inline
    def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMasterDatabaseName(value: String): Self = StObject.set(x, "masterDatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterDatabaseNameUndefined: Self = StObject.set(x, "masterDatabaseName", js.undefined)
    
    @scala.inline
    def setMasterEndpoint(value: RelationalDatabaseEndpoint): Self = StObject.set(x, "masterEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterEndpointUndefined: Self = StObject.set(x, "masterEndpoint", js.undefined)
    
    @scala.inline
    def setMasterUsername(value: NonEmptyString): Self = StObject.set(x, "masterUsername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMasterUsernameUndefined: Self = StObject.set(x, "masterUsername", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParameterApplyStatus(value: NonEmptyString): Self = StObject.set(x, "parameterApplyStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameterApplyStatusUndefined: Self = StObject.set(x, "parameterApplyStatus", js.undefined)
    
    @scala.inline
    def setPendingMaintenanceActions(value: PendingMaintenanceActionList): Self = StObject.set(x, "pendingMaintenanceActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingMaintenanceActionsUndefined: Self = StObject.set(x, "pendingMaintenanceActions", js.undefined)
    
    @scala.inline
    def setPendingMaintenanceActionsVarargs(value: PendingMaintenanceAction*): Self = StObject.set(x, "pendingMaintenanceActions", js.Array(value :_*))
    
    @scala.inline
    def setPendingModifiedValues(value: PendingModifiedRelationalDatabaseValues): Self = StObject.set(x, "pendingModifiedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingModifiedValuesUndefined: Self = StObject.set(x, "pendingModifiedValues", js.undefined)
    
    @scala.inline
    def setPreferredBackupWindow(value: NonEmptyString): Self = StObject.set(x, "preferredBackupWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredBackupWindowUndefined: Self = StObject.set(x, "preferredBackupWindow", js.undefined)
    
    @scala.inline
    def setPreferredMaintenanceWindow(value: NonEmptyString): Self = StObject.set(x, "preferredMaintenanceWindow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferredMaintenanceWindowUndefined: Self = StObject.set(x, "preferredMaintenanceWindow", js.undefined)
    
    @scala.inline
    def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
    
    @scala.inline
    def setRelationalDatabaseBlueprintId(value: NonEmptyString): Self = StObject.set(x, "relationalDatabaseBlueprintId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabaseBlueprintIdUndefined: Self = StObject.set(x, "relationalDatabaseBlueprintId", js.undefined)
    
    @scala.inline
    def setRelationalDatabaseBundleId(value: NonEmptyString): Self = StObject.set(x, "relationalDatabaseBundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabaseBundleIdUndefined: Self = StObject.set(x, "relationalDatabaseBundleId", js.undefined)
    
    @scala.inline
    def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    @scala.inline
    def setSecondaryAvailabilityZone(value: String): Self = StObject.set(x, "secondaryAvailabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryAvailabilityZoneUndefined: Self = StObject.set(x, "secondaryAvailabilityZone", js.undefined)
    
    @scala.inline
    def setState(value: NonEmptyString): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setSupportCode(value: String): Self = StObject.set(x, "supportCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportCodeUndefined: Self = StObject.set(x, "supportCode", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
