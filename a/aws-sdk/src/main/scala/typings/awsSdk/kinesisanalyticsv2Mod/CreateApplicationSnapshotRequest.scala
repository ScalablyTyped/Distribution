package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateApplicationSnapshotRequest extends js.Object {
  /**
    * The name of an existing application
    */
  var ApplicationName: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationName = js.native
  /**
    * An identifier for the application snapshot.
    */
  var SnapshotName: typings.awsSdk.kinesisanalyticsv2Mod.SnapshotName = js.native
}

object CreateApplicationSnapshotRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, SnapshotName: SnapshotName): CreateApplicationSnapshotRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any], SnapshotName = SnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApplicationSnapshotRequest]
  }
  @scala.inline
  implicit class CreateApplicationSnapshotRequestOps[Self <: CreateApplicationSnapshotRequest] (val x: Self) extends AnyVal {
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
    def setSnapshotName(value: SnapshotName): Self = this.set("SnapshotName", value.asInstanceOf[js.Any])
  }
  
}

