package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsRedshiftClusterClusterSnapshotCopyStatus extends js.Object {
  
  /**
    * The destination Region that snapshots are automatically copied to when cross-Region snapshot copy is enabled.
    */
  var DestinationRegion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The number of days that manual snapshots are retained in the destination region after they are copied from a source region. If the value is -1, then the manual snapshot is retained indefinitely. Valid values: Either -1 or an integer between 1 and 3,653
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[Integer] = js.native
  
  /**
    * The number of days to retain automated snapshots in the destination Region after they are copied from a source Region.
    */
  var RetentionPeriod: js.UndefOr[Integer] = js.native
  
  /**
    * The name of the snapshot copy grant.
    */
  var SnapshotCopyGrantName: js.UndefOr[NonEmptyString] = js.native
}
object AwsRedshiftClusterClusterSnapshotCopyStatus {
  
  @scala.inline
  def apply(): AwsRedshiftClusterClusterSnapshotCopyStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsRedshiftClusterClusterSnapshotCopyStatus]
  }
  
  @scala.inline
  implicit class AwsRedshiftClusterClusterSnapshotCopyStatusOps[Self <: AwsRedshiftClusterClusterSnapshotCopyStatus] (val x: Self) extends AnyVal {
    
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
    def setDestinationRegion(value: NonEmptyString): Self = this.set("DestinationRegion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationRegion: Self = this.set("DestinationRegion", js.undefined)
    
    @scala.inline
    def setManualSnapshotRetentionPeriod(value: Integer): Self = this.set("ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualSnapshotRetentionPeriod: Self = this.set("ManualSnapshotRetentionPeriod", js.undefined)
    
    @scala.inline
    def setRetentionPeriod(value: Integer): Self = this.set("RetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetentionPeriod: Self = this.set("RetentionPeriod", js.undefined)
    
    @scala.inline
    def setSnapshotCopyGrantName(value: NonEmptyString): Self = this.set("SnapshotCopyGrantName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotCopyGrantName: Self = this.set("SnapshotCopyGrantName", js.undefined)
  }
}
