package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRelationalDatabaseFromSnapshotRequest extends js.Object {
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
  implicit class CreateRelationalDatabaseFromSnapshotRequestOps[Self <: CreateRelationalDatabaseFromSnapshotRequest] (val x: Self) extends AnyVal {
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
    def setRelationalDatabaseName(value: ResourceName): Self = this.set("relationalDatabaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    @scala.inline
    def setPubliclyAccessible(value: Boolean): Self = this.set("publiclyAccessible", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePubliclyAccessible: Self = this.set("publiclyAccessible", js.undefined)
    @scala.inline
    def setRelationalDatabaseBundleId(value: String): Self = this.set("relationalDatabaseBundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationalDatabaseBundleId: Self = this.set("relationalDatabaseBundleId", js.undefined)
    @scala.inline
    def setRelationalDatabaseSnapshotName(value: ResourceName): Self = this.set("relationalDatabaseSnapshotName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationalDatabaseSnapshotName: Self = this.set("relationalDatabaseSnapshotName", js.undefined)
    @scala.inline
    def setRestoreTime(value: IsoDate): Self = this.set("restoreTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRestoreTime: Self = this.set("restoreTime", js.undefined)
    @scala.inline
    def setSourceRelationalDatabaseName(value: ResourceName): Self = this.set("sourceRelationalDatabaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceRelationalDatabaseName: Self = this.set("sourceRelationalDatabaseName", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setUseLatestRestorableTime(value: Boolean): Self = this.set("useLatestRestorableTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLatestRestorableTime: Self = this.set("useLatestRestorableTime", js.undefined)
  }
  
}

