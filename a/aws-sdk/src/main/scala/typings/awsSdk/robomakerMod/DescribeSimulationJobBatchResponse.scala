package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeSimulationJobBatchResponse extends StObject {
  
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
  def apply(): DescribeSimulationJobBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSimulationJobBatchResponse]
  }
  
  @scala.inline
  implicit class DescribeSimulationJobBatchResponseMutableBuilder[Self <: DescribeSimulationJobBatchResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setBatchPolicy(value: BatchPolicy): Self = StObject.set(x, "batchPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchPolicyUndefined: Self = StObject.set(x, "batchPolicy", js.undefined)
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: CreatedAt): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setCreatedRequests(value: SimulationJobSummaries): Self = StObject.set(x, "createdRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedRequestsUndefined: Self = StObject.set(x, "createdRequests", js.undefined)
    
    @scala.inline
    def setCreatedRequestsVarargs(value: SimulationJobSummary*): Self = StObject.set(x, "createdRequests", js.Array(value :_*))
    
    @scala.inline
    def setFailedRequests(value: FailedCreateSimulationJobRequests): Self = StObject.set(x, "failedRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedRequestsUndefined: Self = StObject.set(x, "failedRequests", js.undefined)
    
    @scala.inline
    def setFailedRequestsVarargs(value: FailedCreateSimulationJobRequest*): Self = StObject.set(x, "failedRequests", js.Array(value :_*))
    
    @scala.inline
    def setFailureCode(value: SimulationJobBatchErrorCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    @scala.inline
    def setFailureReason(value: GenericString): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: LastUpdatedAt): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setPendingRequests(value: CreateSimulationJobRequests): Self = StObject.set(x, "pendingRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingRequestsUndefined: Self = StObject.set(x, "pendingRequests", js.undefined)
    
    @scala.inline
    def setPendingRequestsVarargs(value: SimulationJobRequest*): Self = StObject.set(x, "pendingRequests", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: SimulationJobBatchStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
