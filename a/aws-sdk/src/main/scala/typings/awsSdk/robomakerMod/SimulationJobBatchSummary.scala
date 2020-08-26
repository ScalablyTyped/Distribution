package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SimulationJobBatchSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the batch.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The time, in milliseconds since the epoch, when the simulation job batch was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.native
  /**
    * The number of created simulation job requests.
    */
  var createdRequestCount: js.UndefOr[Integer] = js.native
  /**
    * The number of failed simulation job requests.
    */
  var failedRequestCount: js.UndefOr[Integer] = js.native
  /**
    * The time, in milliseconds since the epoch, when the simulation job batch was last updated.
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.native
  /**
    * The number of pending simulation job requests.
    */
  var pendingRequestCount: js.UndefOr[Integer] = js.native
  /**
    * The status of the simulation job batch.  Pending  The simulation job batch request is pending.  InProgress  The simulation job batch is in progress.   Failed  The simulation job batch failed. One or more simulation job requests could not be completed due to an internal failure (like InternalServiceError). See failureCode and failureReason for more information.  Completed  The simulation batch job completed. A batch is complete when (1) there are no pending simulation job requests in the batch and none of the failed simulation job requests are due to InternalServiceError and (2) when all created simulation jobs have reached a terminal state (for example, Completed or Failed).   Canceled  The simulation batch job was cancelled.  Canceling  The simulation batch job is being cancelled.  Completing  The simulation batch job is completing.  TimingOut  The simulation job batch is timing out. If a batch timing out, and there are pending requests that were failing due to an internal failure (like InternalServiceError), the batch status will be Failed. If there are no such failing request, the batch status will be TimedOut.   TimedOut  The simulation batch job timed out.  
    */
  var status: js.UndefOr[SimulationJobBatchStatus] = js.native
}

object SimulationJobBatchSummary {
  @scala.inline
  def apply(): SimulationJobBatchSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationJobBatchSummary]
  }
  @scala.inline
  implicit class SimulationJobBatchSummaryOps[Self <: SimulationJobBatchSummary] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setCreatedAt(value: CreatedAt): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setCreatedRequestCount(value: Integer): Self = this.set("createdRequestCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedRequestCount: Self = this.set("createdRequestCount", js.undefined)
    @scala.inline
    def setFailedRequestCount(value: Integer): Self = this.set("failedRequestCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedRequestCount: Self = this.set("failedRequestCount", js.undefined)
    @scala.inline
    def setLastUpdatedAt(value: LastUpdatedAt): Self = this.set("lastUpdatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastUpdatedAt: Self = this.set("lastUpdatedAt", js.undefined)
    @scala.inline
    def setPendingRequestCount(value: Integer): Self = this.set("pendingRequestCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingRequestCount: Self = this.set("pendingRequestCount", js.undefined)
    @scala.inline
    def setStatus(value: SimulationJobBatchStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

