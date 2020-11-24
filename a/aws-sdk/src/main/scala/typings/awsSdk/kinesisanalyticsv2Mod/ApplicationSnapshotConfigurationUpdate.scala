package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationSnapshotConfigurationUpdate extends js.Object {
  
  /**
    * Describes updates to whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
    */
  var SnapshotsEnabledUpdate: BooleanObject = js.native
}
object ApplicationSnapshotConfigurationUpdate {
  
  @scala.inline
  def apply(SnapshotsEnabledUpdate: BooleanObject): ApplicationSnapshotConfigurationUpdate = {
    val __obj = js.Dynamic.literal(SnapshotsEnabledUpdate = SnapshotsEnabledUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSnapshotConfigurationUpdate]
  }
  
  @scala.inline
  implicit class ApplicationSnapshotConfigurationUpdateOps[Self <: ApplicationSnapshotConfigurationUpdate] (val x: Self) extends AnyVal {
    
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
    def setSnapshotsEnabledUpdate(value: BooleanObject): Self = this.set("SnapshotsEnabledUpdate", value.asInstanceOf[js.Any])
  }
}
