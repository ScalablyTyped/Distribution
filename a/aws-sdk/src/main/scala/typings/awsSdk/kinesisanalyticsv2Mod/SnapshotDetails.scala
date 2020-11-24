package typings.awsSdk.kinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshotDetails extends js.Object {
  
  /**
    * The current application version ID when the snapshot was created.
    */
  var ApplicationVersionId: typings.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId = js.native
  
  /**
    * The timestamp of the application snapshot.
    */
  var SnapshotCreationTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The identifier for the application snapshot.
    */
  var SnapshotName: typings.awsSdk.kinesisanalyticsv2Mod.SnapshotName = js.native
  
  /**
    * The status of the application snapshot.
    */
  var SnapshotStatus: typings.awsSdk.kinesisanalyticsv2Mod.SnapshotStatus = js.native
}
object SnapshotDetails {
  
  @scala.inline
  def apply(
    ApplicationVersionId: ApplicationVersionId,
    SnapshotName: SnapshotName,
    SnapshotStatus: SnapshotStatus
  ): SnapshotDetails = {
    val __obj = js.Dynamic.literal(ApplicationVersionId = ApplicationVersionId.asInstanceOf[js.Any], SnapshotName = SnapshotName.asInstanceOf[js.Any], SnapshotStatus = SnapshotStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotDetails]
  }
  
  @scala.inline
  implicit class SnapshotDetailsOps[Self <: SnapshotDetails] (val x: Self) extends AnyVal {
    
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
    def setApplicationVersionId(value: ApplicationVersionId): Self = this.set("ApplicationVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotName(value: SnapshotName): Self = this.set("SnapshotName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotStatus(value: SnapshotStatus): Self = this.set("SnapshotStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotCreationTimestamp(value: Timestamp): Self = this.set("SnapshotCreationTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotCreationTimestamp: Self = this.set("SnapshotCreationTimestamp", js.undefined)
  }
}
