package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifySnapshotCopyRetentionPeriodMessage extends js.Object {
  
  /**
    * The unique identifier of the cluster for which you want to change the retention period for either automated or manual snapshots that are copied to a destination AWS Region. Constraints: Must be the valid name of an existing cluster that has cross-region snapshot copy enabled.
    */
  var ClusterIdentifier: String = js.native
  
  /**
    * Indicates whether to apply the snapshot retention period to newly copied manual snapshots instead of automated snapshots.
    */
  var Manual: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of days to retain automated snapshots in the destination AWS Region after they are copied from the source AWS Region. By default, this only changes the retention period of copied automated snapshots.  If you decrease the retention period for automated snapshots that are copied to a destination AWS Region, Amazon Redshift deletes any existing automated snapshots that were copied to the destination AWS Region and that fall outside of the new retention period. Constraints: Must be at least 1 and no more than 35 for automated snapshots.  If you specify the manual option, only newly copied manual snapshots will have the new retention period.  If you specify the value of -1 newly copied manual snapshots are retained indefinitely. Constraints: The number of days must be either -1 or an integer between 1 and 3,653 for manual snapshots.
    */
  var RetentionPeriod: Integer = js.native
}
object ModifySnapshotCopyRetentionPeriodMessage {
  
  @scala.inline
  def apply(ClusterIdentifier: String, RetentionPeriod: Integer): ModifySnapshotCopyRetentionPeriodMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], RetentionPeriod = RetentionPeriod.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySnapshotCopyRetentionPeriodMessage]
  }
  
  @scala.inline
  implicit class ModifySnapshotCopyRetentionPeriodMessageOps[Self <: ModifySnapshotCopyRetentionPeriodMessage] (val x: Self) extends AnyVal {
    
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
    def setClusterIdentifier(value: String): Self = this.set("ClusterIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionPeriod(value: Integer): Self = this.set("RetentionPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManual(value: Boolean): Self = this.set("Manual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManual: Self = this.set("Manual", js.undefined)
  }
}
