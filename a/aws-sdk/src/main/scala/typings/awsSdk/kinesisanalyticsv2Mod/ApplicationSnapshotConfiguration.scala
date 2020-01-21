package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationSnapshotConfiguration extends js.Object {
  /**
    * Describes whether snapshots are enabled for a Java-based Kinesis Data Analytics application.
    */
  var SnapshotsEnabled: BooleanObject = js.native
}

object ApplicationSnapshotConfiguration {
  @scala.inline
  def apply(SnapshotsEnabled: BooleanObject): ApplicationSnapshotConfiguration = {
    val __obj = js.Dynamic.literal(SnapshotsEnabled = SnapshotsEnabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApplicationSnapshotConfiguration]
  }
}

