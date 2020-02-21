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
  def apply(
    arn: Arn = null,
    createdAt: CreatedAt = null,
    createdRequestCount: Int | Double = null,
    failedRequestCount: Int | Double = null,
    lastUpdatedAt: LastUpdatedAt = null,
    pendingRequestCount: Int | Double = null,
    status: SimulationJobBatchStatus = null
  ): SimulationJobBatchSummary = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (createdRequestCount != null) __obj.updateDynamic("createdRequestCount")(createdRequestCount.asInstanceOf[js.Any])
    if (failedRequestCount != null) __obj.updateDynamic("failedRequestCount")(failedRequestCount.asInstanceOf[js.Any])
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.asInstanceOf[js.Any])
    if (pendingRequestCount != null) __obj.updateDynamic("pendingRequestCount")(pendingRequestCount.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulationJobBatchSummary]
  }
}

