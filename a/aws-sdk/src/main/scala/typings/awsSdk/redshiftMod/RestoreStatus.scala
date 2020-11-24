package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestoreStatus extends js.Object {
  
  /**
    * The number of megabytes per second being transferred from the backup storage. Returns the average rate for a completed backup. This field is only updated when you restore to DC2 and DS2 node types. 
    */
  var CurrentRestoreRateInMegaBytesPerSecond: js.UndefOr[Double] = js.native
  
  /**
    * The amount of time an in-progress restore has been running, or the amount of time it took a completed restore to finish. This field is only updated when you restore to DC2 and DS2 node types. 
    */
  var ElapsedTimeInSeconds: js.UndefOr[Long] = js.native
  
  /**
    * The estimate of the time remaining before the restore will complete. Returns 0 for a completed restore. This field is only updated when you restore to DC2 and DS2 node types. 
    */
  var EstimatedTimeToCompletionInSeconds: js.UndefOr[Long] = js.native
  
  /**
    * The number of megabytes that have been transferred from snapshot storage. This field is only updated when you restore to DC2 and DS2 node types. 
    */
  var ProgressInMegaBytes: js.UndefOr[Long] = js.native
  
  /**
    * The size of the set of snapshot data used to restore the cluster. This field is only updated when you restore to DC2 and DS2 node types. 
    */
  var SnapshotSizeInMegaBytes: js.UndefOr[Long] = js.native
  
  /**
    * The status of the restore action. Returns starting, restoring, completed, or failed.
    */
  var Status: js.UndefOr[String] = js.native
}
object RestoreStatus {
  
  @scala.inline
  def apply(): RestoreStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreStatus]
  }
  
  @scala.inline
  implicit class RestoreStatusOps[Self <: RestoreStatus] (val x: Self) extends AnyVal {
    
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
    def setCurrentRestoreRateInMegaBytesPerSecond(value: Double): Self = this.set("CurrentRestoreRateInMegaBytesPerSecond", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentRestoreRateInMegaBytesPerSecond: Self = this.set("CurrentRestoreRateInMegaBytesPerSecond", js.undefined)
    
    @scala.inline
    def setElapsedTimeInSeconds(value: Long): Self = this.set("ElapsedTimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElapsedTimeInSeconds: Self = this.set("ElapsedTimeInSeconds", js.undefined)
    
    @scala.inline
    def setEstimatedTimeToCompletionInSeconds(value: Long): Self = this.set("EstimatedTimeToCompletionInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedTimeToCompletionInSeconds: Self = this.set("EstimatedTimeToCompletionInSeconds", js.undefined)
    
    @scala.inline
    def setProgressInMegaBytes(value: Long): Self = this.set("ProgressInMegaBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgressInMegaBytes: Self = this.set("ProgressInMegaBytes", js.undefined)
    
    @scala.inline
    def setSnapshotSizeInMegaBytes(value: Long): Self = this.set("SnapshotSizeInMegaBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotSizeInMegaBytes: Self = this.set("SnapshotSizeInMegaBytes", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
