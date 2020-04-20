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
}

