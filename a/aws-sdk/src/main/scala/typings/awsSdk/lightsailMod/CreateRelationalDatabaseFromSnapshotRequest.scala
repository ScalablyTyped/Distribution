package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRelationalDatabaseFromSnapshotRequest extends StObject {
  
  /**
    * The Availability Zone in which to create your new database. Use the us-east-2a case-sensitive format. You can get a list of Availability Zones by using the get regions operation. Be sure to add the include relational database Availability Zones parameter to your request.
    */
  var availabilityZone: js.UndefOr[String] = js.native
  
  /**
    * Specifies the accessibility options for your new database. A value of true specifies a database that is available to resources outside of your Lightsail account. A value of false specifies a database that is available only to your Lightsail resources in the same region as your database.
    */
  var publiclyAccessible: js.UndefOr[Boolean] = js.native
  
  /**
    * The bundle ID for your new database. A bundle describes the performance specifications for your database. You can get a list of database bundle IDs by using the get relational database bundles operation. When creating a new database from a snapshot, you cannot choose a bundle that is smaller than the bundle of the source database.
    */
  var relationalDatabaseBundleId: js.UndefOr[String] = js.native
  
  /**
    * The name to use for your new database. Constraints:   Must contain from 2 to 255 alphanumeric characters, or hyphens.   The first and last character must be a letter or number.  
    */
  var relationalDatabaseName: ResourceName = js.native
  
  /**
    * The name of the database snapshot from which to create your new database.
    */
  var relationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The date and time to restore your database from. Constraints:   Must be before the latest restorable time for the database.   Cannot be specified if the use latest restorable time parameter is true.   Specified in Coordinated Universal Time (UTC).   Specified in the Unix time format. For example, if you wish to use a restore time of October 1, 2018, at 8 PM UTC, then you input 1538424000 as the restore time.  
    */
  var restoreTime: js.UndefOr[IsoDate] = js.native
  
  /**
    * The name of the source database.
    */
  var sourceRelationalDatabaseName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The tag keys and optional values to add to the resource during create. Use the TagResource action to tag a resource after it's created.
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * Specifies whether your database is restored from the latest backup time. A value of true restores from the latest backup time.  Default: false  Constraints: Cannot be specified if the restore time parameter is provided.
    */
  var useLatestRestorableTime: js.UndefOr[Boolean] = js.native
}
object CreateRelationalDatabaseFromSnapshotRequest {
  
  @scala.inline
  def apply(relationalDatabaseName: ResourceName): CreateRelationalDatabaseFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRelationalDatabaseFromSnapshotRequest]
  }
  
  @scala.inline
  implicit class CreateRelationalDatabaseFromSnapshotRequestMutableBuilder[Self <: CreateRelationalDatabaseFromSnapshotRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
    
    @scala.inline
    def setPubliclyAccessible(value: Boolean): Self = StObject.set(x, "publiclyAccessible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPubliclyAccessibleUndefined: Self = StObject.set(x, "publiclyAccessible", js.undefined)
    
    @scala.inline
    def setRelationalDatabaseBundleId(value: String): Self = StObject.set(x, "relationalDatabaseBundleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabaseBundleIdUndefined: Self = StObject.set(x, "relationalDatabaseBundleId", js.undefined)
    
    @scala.inline
    def setRelationalDatabaseName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabaseSnapshotName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseSnapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationalDatabaseSnapshotNameUndefined: Self = StObject.set(x, "relationalDatabaseSnapshotName", js.undefined)
    
    @scala.inline
    def setRestoreTime(value: IsoDate): Self = StObject.set(x, "restoreTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreTimeUndefined: Self = StObject.set(x, "restoreTime", js.undefined)
    
    @scala.inline
    def setSourceRelationalDatabaseName(value: ResourceName): Self = StObject.set(x, "sourceRelationalDatabaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceRelationalDatabaseNameUndefined: Self = StObject.set(x, "sourceRelationalDatabaseName", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setUseLatestRestorableTime(value: Boolean): Self = StObject.set(x, "useLatestRestorableTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLatestRestorableTimeUndefined: Self = StObject.set(x, "useLatestRestorableTime", js.undefined)
  }
}
