package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSnapshotConfigurationUpdate extends js.Object {
  /**
    * Describes updates to whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  var SnapshotsEnabledUpdate: BooleanObject = js.native
}

object ApplicationSnapshotConfigurationUpdate {
  @scala.inline
  def apply(SnapshotsEnabledUpdate: BooleanObject): ApplicationSnapshotConfigurationUpdate = {
    val __obj = js.Dynamic.literal(SnapshotsEnabledUpdate = SnapshotsEnabledUpdate.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApplicationSnapshotConfigurationUpdate]
  }
}

