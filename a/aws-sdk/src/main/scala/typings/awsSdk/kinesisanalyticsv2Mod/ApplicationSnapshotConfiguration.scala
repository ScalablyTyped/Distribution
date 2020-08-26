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
  @scala.inline
  implicit class ApplicationSnapshotConfigurationOps[Self <: ApplicationSnapshotConfiguration] (val x: Self) extends AnyVal {
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
    def setSnapshotsEnabled(value: BooleanObject): Self = this.set("SnapshotsEnabled", value.asInstanceOf[js.Any])
  }
  
}

