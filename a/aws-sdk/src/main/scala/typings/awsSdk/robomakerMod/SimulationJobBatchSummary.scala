package typings.awsSdk.robomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimulationJobBatchSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the batch.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the simulation job batch was created.
    */
  var createdAt: js.UndefOr[CreatedAt] = js.undefined
  
  /**
    * The number of created simulation job requests.
    */
  var createdRequestCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The number of failed simulation job requests.
    */
  var failedRequestCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the simulation job batch was last updated.
    */
  var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
  
  /**
    * The number of pending simulation job requests.
    */
  var pendingRequestCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The status of the simulation job batch.  Pending  The simulation job batch request is pending.  InProgress  The simulation job batch is in progress.   Failed  The simulation job batch failed. One or more simulation job requests could not be completed due to an internal failure (like InternalServiceError). See failureCode and failureReason for more information.  Completed  The simulation batch job completed. A batch is complete when (1) there are no pending simulation job requests in the batch and none of the failed simulation job requests are due to InternalServiceError and (2) when all created simulation jobs have reached a terminal state (for example, Completed or Failed).   Canceled  The simulation batch job was cancelled.  Canceling  The simulation batch job is being cancelled.  Completing  The simulation batch job is completing.  TimingOut  The simulation job batch is timing out. If a batch timing out, and there are pending requests that were failing due to an internal failure (like InternalServiceError), the batch status will be Failed. If there are no such failing request, the batch status will be TimedOut.   TimedOut  The simulation batch job timed out.  
    */
  var status: js.UndefOr[SimulationJobBatchStatus] = js.undefined
}
object SimulationJobBatchSummary {
  
  @scala.inline
  def apply(): SimulationJobBatchSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SimulationJobBatchSummary]
  }
  
  @scala.inline
  implicit class SimulationJobBatchSummaryMutableBuilder[Self <: SimulationJobBatchSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: CreatedAt): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setCreatedRequestCount(value: Integer): Self = StObject.set(x, "createdRequestCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedRequestCountUndefined: Self = StObject.set(x, "createdRequestCount", js.undefined)
    
    @scala.inline
    def setFailedRequestCount(value: Integer): Self = StObject.set(x, "failedRequestCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedRequestCountUndefined: Self = StObject.set(x, "failedRequestCount", js.undefined)
    
    @scala.inline
    def setLastUpdatedAt(value: LastUpdatedAt): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    @scala.inline
    def setPendingRequestCount(value: Integer): Self = StObject.set(x, "pendingRequestCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPendingRequestCountUndefined: Self = StObject.set(x, "pendingRequestCount", js.undefined)
    
    @scala.inline
    def setStatus(value: SimulationJobBatchStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
