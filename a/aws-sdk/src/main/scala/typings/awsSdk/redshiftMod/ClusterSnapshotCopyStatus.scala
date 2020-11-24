package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterSnapshotCopyStatus extends js.Object {
  
  /**
    * The destination region that snapshots are automatically copied to when cross-region snapshot copy is enabled.
    */
  var DestinationRegion: js.UndefOr[String] = js.native
  
  /**
    * The number of days that automated snapshots are retained in the destination region after they are copied from a source region. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[Integer] = js.native
  
  /**
    * The number of days that automated snapshots are retained in the destination region after they are copied from a source region.
    */
  var RetentionPeriod: js.UndefOr[Long] = js.native
  
  /**
    * The name of the snapshot copy grant.
    */
  var SnapshotCopyGrantName: js.UndefOr[String] = js.native
}
object ClusterSnapshotCopyStatus {
  
  @scala.inline
  def apply(): ClusterSnapshotCopyStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterSnapshotCopyStatus]
  }
  
  @scala.inline
  implicit class ClusterSnapshotCopyStatusOps[Self <: ClusterSnapshotCopyStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestinationRegion(value: String): Self = this.set("DestinationRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationRegion: Self = this.set("DestinationRegion", js.undefined)
    
    @scala.inline
    def setManualSnapshotRetentionPeriod(value: Integer): Self = this.set("ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualSnapshotRetentionPeriod: Self = this.set("ManualSnapshotRetentionPeriod", js.undefined)
    
    @scala.inline
    def setRetentionPeriod(value: Long): Self = this.set("RetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionPeriod: Self = this.set("RetentionPeriod", js.undefined)
    
    @scala.inline
    def setSnapshotCopyGrantName(value: String): Self = this.set("SnapshotCopyGrantName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotCopyGrantName: Self = this.set("SnapshotCopyGrantName", js.undefined)
  }
}
