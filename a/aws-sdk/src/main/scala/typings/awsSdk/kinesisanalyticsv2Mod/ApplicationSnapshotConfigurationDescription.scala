package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationSnapshotConfigurationDescription extends js.Object {
  
  /**
    * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
    */
  var SnapshotsEnabled: BooleanObject = js.native
}
object ApplicationSnapshotConfigurationDescription {
  
  @scala.inline
  def apply(SnapshotsEnabled: BooleanObject): ApplicationSnapshotConfigurationDescription = {
    val __obj = js.Dynamic.literal(SnapshotsEnabled = SnapshotsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSnapshotConfigurationDescription]
  }
  
  @scala.inline
  implicit class ApplicationSnapshotConfigurationDescriptionOps[Self <: ApplicationSnapshotConfigurationDescription] (val x: Self) extends AnyVal {
    
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
