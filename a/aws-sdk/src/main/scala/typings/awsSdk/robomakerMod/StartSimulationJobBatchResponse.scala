package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSimulationJobBatchResponse extends StObject {
  
  /**
    * The Amazon Resource Name (arn) of the batch.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The batch policy.
    */
  var batchPolicy: js.UndefOr[BatchPolicy] = js.undefined
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the simulation job batch was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A list of created simulation job request summaries.
    */
  var createdRequests: js.UndefOr[SimulationJobSummaries] = js.undefined
  
  /**
    * A list of failed simulation job requests. The request failed to be created into a simulation job. Failed requests do not have a simulation job ID. 
    */
  var failedRequests: js.UndefOr[FailedCreateSimulationJobRequests] = js.undefined
  
  /**
    * The failure code if the simulation job batch failed.
    */
  var failureCode: js.UndefOr[SimulationJobBatchErrorCode] = js.undefined
  
  /**
    * The reason the simulation job batch failed.
    */
  var failureReason: js.UndefOr[GenericString] = js.undefined
  
  /**
    * A list of pending simulation job requests. These requests have not yet been created into simulation jobs.
    */
  var pendingRequests: js.UndefOr[CreateSimulationJobRequests] = js.undefined
  
  /**
    * The status of the simulation job batch.  Pending  The simulation job batch request is pending.  InProgress  The simulation job batch is in progress.   Failed  The simulation job batch failed. One or more simulation job requests could not be completed due to an internal failure (like InternalServiceError). See failureCode and failureReason for more information.  Completed  The simulation batch job completed. A batch is complete when (1) there are no pending simulation job requests in the batch and none of the failed simulation job requests are due to InternalServiceError and (2) when all created simulation jobs have reached a terminal state (for example, Completed or Failed).   Canceled  The simulation batch job was cancelled.  Canceling  The simulation batch job is being cancelled.  Completing  The simulation batch job is completing.  TimingOut  The simulation job batch is timing out. If a batch timing out, and there are pending requests that were failing due to an internal failure (like InternalServiceError), the batch status will be Failed. If there are no such failing request, the batch status will be TimedOut.   TimedOut  The simulation batch job timed out.  
    */
  var status: js.UndefOr[SimulationJobBatchStatus] = js.undefined
  
  /**
    * A map that contains tag keys and tag values that are attached to the deployment job batch.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object StartSimulationJobBatchResponse {
  
  inline def apply(): StartSimulationJobBatchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSimulationJobBatchResponse]
  }
  
  extension [Self <: StartSimulationJobBatchResponse](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setBatchPolicy(value: BatchPolicy): Self = StObject.set(x, "batchPolicy", value.asInstanceOf[js.Any])
    
    inline def setBatchPolicyUndefined: Self = StObject.set(x, "batchPolicy", js.undefined)
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setCreatedRequests(value: SimulationJobSummaries): Self = StObject.set(x, "createdRequests", value.asInstanceOf[js.Any])
    
    inline def setCreatedRequestsUndefined: Self = StObject.set(x, "createdRequests", js.undefined)
    
    inline def setCreatedRequestsVarargs(value: SimulationJobSummary*): Self = StObject.set(x, "createdRequests", js.Array(value*))
    
    inline def setFailedRequests(value: FailedCreateSimulationJobRequests): Self = StObject.set(x, "failedRequests", value.asInstanceOf[js.Any])
    
    inline def setFailedRequestsUndefined: Self = StObject.set(x, "failedRequests", js.undefined)
    
    inline def setFailedRequestsVarargs(value: FailedCreateSimulationJobRequest*): Self = StObject.set(x, "failedRequests", js.Array(value*))
    
    inline def setFailureCode(value: SimulationJobBatchErrorCode): Self = StObject.set(x, "failureCode", value.asInstanceOf[js.Any])
    
    inline def setFailureCodeUndefined: Self = StObject.set(x, "failureCode", js.undefined)
    
    inline def setFailureReason(value: GenericString): Self = StObject.set(x, "failureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "failureReason", js.undefined)
    
    inline def setPendingRequests(value: CreateSimulationJobRequests): Self = StObject.set(x, "pendingRequests", value.asInstanceOf[js.Any])
    
    inline def setPendingRequestsUndefined: Self = StObject.set(x, "pendingRequests", js.undefined)
    
    inline def setPendingRequestsVarargs(value: SimulationJobRequest*): Self = StObject.set(x, "pendingRequests", js.Array(value*))
    
    inline def setStatus(value: SimulationJobBatchStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
