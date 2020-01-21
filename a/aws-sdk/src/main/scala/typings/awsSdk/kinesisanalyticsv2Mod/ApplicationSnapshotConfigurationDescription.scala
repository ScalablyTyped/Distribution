package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSnapshotConfigurationDescription extends js.Object {
  /**
    * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  var SnapshotsEnabled: BooleanObject = js.native
}

object ApplicationSnapshotConfigurationDescription {
  @scala.inline
  def apply(SnapshotsEnabled: BooleanObject): ApplicationSnapshotConfigurationDescription = {
    val __obj = js.Dynamic.literal(SnapshotsEnabled = SnapshotsEnabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApplicationSnapshotConfigurationDescription]
  }
}

