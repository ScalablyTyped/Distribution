package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApplicationSnapshotRequest extends js.Object {
  /**
    * The name of an existing application.
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * The creation timestamp of the application snapshot to delete. You can retrieve this value using or .
    */
  var SnapshotCreationTimestamp: Timestamp = js.native
  /**
    * The identifier for the snapshot delete.
    */
  var SnapshotName: typings.awsSdk.kinesisanalyticsv2Mod.SnapshotName = js.native
}

object DeleteApplicationSnapshotRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, SnapshotCreationTimestamp: Timestamp, SnapshotName: SnapshotName): DeleteApplicationSnapshotRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], SnapshotCreationTimestamp = SnapshotCreationTimestamp.asInstanceOf[js.Any], SnapshotName = SnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApplicationSnapshotRequest]
  }
  @scala.inline
  implicit class DeleteApplicationSnapshotRequestOps[Self <: DeleteApplicationSnapshotRequest] (val x: Self) extends AnyVal {
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
    def setApplicationName(value: ApplicationName): Self = this.set("ApplicationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshotCreationTimestamp(value: Timestamp): Self = this.set("SnapshotCreationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshotName(value: SnapshotName): Self = this.set("SnapshotName", value.asInstanceOf[js.Any])
  }
  
}

