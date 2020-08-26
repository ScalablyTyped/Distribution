package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRelationalDatabaseSnapshotRequest extends js.Object {
  /**
    * The name of the database on which to base your new snapshot.
    */
  var relationalDatabaseName: ResourceName = js.native
  /**
    * The name for your new database snapshot. Constraints:   Must contain from 2 to 255 alphanumeric characters, or hyphens.   The first and last character must be a letter or number.  
    */
  var relationalDatabaseSnapshotName: ResourceName = js.native
  /**
    * The tag keys and optional values to add to the resource during create. Use the TagResource action to tag a resource after it's created.
    */
  var tags: js.UndefOr[TagList] = js.native
}

object CreateRelationalDatabaseSnapshotRequest {
  @scala.inline
  def apply(relationalDatabaseName: ResourceName, relationalDatabaseSnapshotName: ResourceName): CreateRelationalDatabaseSnapshotRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any], relationalDatabaseSnapshotName = relationalDatabaseSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRelationalDatabaseSnapshotRequest]
  }
  @scala.inline
  implicit class CreateRelationalDatabaseSnapshotRequestOps[Self <: CreateRelationalDatabaseSnapshotRequest] (val x: Self) extends AnyVal {
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
    def setRelationalDatabaseSnapshotName(value: ResourceName): Self = this.set("relationalDatabaseSnapshotName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

