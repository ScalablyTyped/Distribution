package typings.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBSnapshotMessage extends js.Object {
  /**
    * The identifier of the DB instance that you want to create the snapshot of. Constraints:   Must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: String = js.native
  /**
    * The identifier for the DB snapshot. Constraints:   Can't be null, empty, or blank   Must contain from 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-snapshot-id 
    */
  var DBSnapshotIdentifier: String = js.native
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateDBSnapshotMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String, DBSnapshotIdentifier: String): CreateDBSnapshotMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any], DBSnapshotIdentifier = DBSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBSnapshotMessage]
  }
  @scala.inline
  implicit class CreateDBSnapshotMessageOps[Self <: CreateDBSnapshotMessage] (val x: Self) extends AnyVal {
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
    def setDBInstanceIdentifier(value: String): Self = this.set("DBInstanceIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setDBSnapshotIdentifier(value: String): Self = this.set("DBSnapshotIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

