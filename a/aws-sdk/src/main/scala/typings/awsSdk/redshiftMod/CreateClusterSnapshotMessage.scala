package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterSnapshotMessage extends js.Object {
  /**
    * The cluster identifier for which you want a snapshot.
    */
  var ClusterIdentifier: String = js.native
  /**
    * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653. The default value is -1.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.native
  /**
    * A unique identifier for the snapshot that you are requesting. This identifier must be unique for all snapshots within the AWS account. Constraints:   Cannot be null, empty, or blank   Must contain from 1 to 255 alphanumeric characters or hyphens   First character must be a letter   Cannot end with a hyphen or contain two consecutive hyphens   Example: my-snapshot-id 
    */
  var SnapshotIdentifier: String = js.native
  /**
    * A list of tag instances.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateClusterSnapshotMessage {
  @scala.inline
  def apply(ClusterIdentifier: String, SnapshotIdentifier: String): CreateClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateClusterSnapshotMessage]
  }
  @scala.inline
  implicit class CreateClusterSnapshotMessageOps[Self <: CreateClusterSnapshotMessage] (val x: Self) extends AnyVal {
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
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshotIdentifier(value: String): Self = this.set("SnapshotIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setManualSnapshotRetentionPeriod(value: IntegerOptional): Self = this.set("ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualSnapshotRetentionPeriod: Self = this.set("ManualSnapshotRetentionPeriod", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

