package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSimulationJobBatchResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the batch.
    */
  var arn: js.UndefOr[Arn] = js.native
  /**
    * The batch policy.
    */
  var batchPolicy: js.UndefOr[BatchPolicy] = js.native
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The time, in milliseconds since the epoch, when the simulation job batch was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.native
  /**
    * A list of created simulation job summaries.
    */
  var createdRequests: js.UndefOr[SimulationJobSummaries] = js.native
  /**
    * A list of failed create simulation job requests. The request failed to be created into a simulation job. Failed requests do not have a simulation job ID. 
    */
  var failedRequests: js.UndefOr[FailedCreateSimulationJobRequests] = js.native
  /**
    * The failure code of the simulation job batch.
    */
  var failureCode: js.UndefOr[SimulationJobBatchErrorCode] = js.native
  /**
    * The reason the simulation job batch failed.
    */
  var failureReason: js.UndefOr[GenericString] = js.native
  /**
    * The time, in milliseconds since the epoch, when the simulation job batch was last updated.
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.native
  /**
    * A list of pending simulation job requests. These requests have not yet been created into simulation jobs.
    */
  var pendingRequests: js.UndefOr[CreateSimulationJobRequests] = js.native
  /**
    * The status of the batch.  Pending  The simulation job batch request is pending.  InProgress  The simulation job batch is in progress.   Failed  The simulation job batch failed. One or more simulation job requests could not be completed due to an internal failure (like InternalServiceError). See failureCode and failureReason for more information.  Completed  The simulation batch job completed. A batch is complete when (1) there are no pending simulation job requests in the batch and none of the failed simulation job requests are due to InternalServiceError and (2) when all created simulation jobs have reached a terminal state (for example, Completed or Failed).   Canceled  The simulation batch job was cancelled.  Canceling  The simulation batch job is being cancelled.  Completing  The simulation batch job is completing.  TimingOut  The simulation job batch is timing out. If a batch timing out, and there are pending requests that were failing due to an internal failure (like InternalServiceError), the batch status will be Failed. If there are no such failing request, the batch status will be TimedOut.   TimedOut  The simulation batch job timed out.  
    */
  var status: js.UndefOr[SimulationJobBatchStatus] = js.native
  /**
    * A map that contains tag keys and tag values that are attached to the simulation job batch.
    */
  var tags: js.UndefOr[TagMap] = js.native
}

object DescribeSimulationJobBatchResponse {
  @scala.inline
  def apply(
    arn: Arn = null,
    batchPolicy: BatchPolicy = null,
    clientRequestToken: ClientRequestToken = null,
    createdAt: CreatedAt = null,
    createdRequests: SimulationJobSummaries = null,
    failedRequests: FailedCreateSimulationJobRequests = null,
    failureCode: SimulationJobBatchErrorCode = null,
    failureReason: GenericString = null,
    lastUpdatedAt: LastUpdatedAt = null,
    pendingRequests: CreateSimulationJobRequests = null,
    status: SimulationJobBatchStatus = null,
    tags: TagMap = null
  ): DescribeSimulationJobBatchResponse = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (batchPolicy != null) __obj.updateDynamic("batchPolicy")(batchPolicy.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (createdAt != null) __obj.updateDynamic("createdAt")(createdAt.asInstanceOf[js.Any])
    if (createdRequests != null) __obj.updateDynamic("createdRequests")(createdRequests.asInstanceOf[js.Any])
    if (failedRequests != null) __obj.updateDynamic("failedRequests")(failedRequests.asInstanceOf[js.Any])
    if (failureCode != null) __obj.updateDynamic("failureCode")(failureCode.asInstanceOf[js.Any])
    if (failureReason != null) __obj.updateDynamic("failureReason")(failureReason.asInstanceOf[js.Any])
    if (lastUpdatedAt != null) __obj.updateDynamic("lastUpdatedAt")(lastUpdatedAt.asInstanceOf[js.Any])
    if (pendingRequests != null) __obj.updateDynamic("pendingRequests")(pendingRequests.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSimulationJobBatchResponse]
  }
}

