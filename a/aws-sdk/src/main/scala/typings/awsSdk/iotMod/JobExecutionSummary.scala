package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobExecutionSummary extends StObject {
  
  /**
    * A string (consisting of the digits "0" through "9") which identifies this particular job execution on this particular device. It can be used later in commands which return or update job execution information.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
  
  /**
    * The time, in seconds since the epoch, when the job execution was last updated.
    */
  var lastUpdatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time, in seconds since the epoch, when the job execution was queued.
    */
  var queuedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The number that indicates how many retry attempts have been completed for this job on this device.
    */
  var retryAttempt: js.UndefOr[RetryAttempt] = js.undefined
  
  /**
    * The time, in seconds since the epoch, when the job execution started.
    */
  var startedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of the job execution.
    */
  var status: js.UndefOr[JobExecutionStatus] = js.undefined
}
object JobExecutionSummary {
  
  inline def apply(): JobExecutionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionSummary]
  }
  
  extension [Self <: JobExecutionSummary](x: Self) {
    
    inline def setExecutionNumber(value: ExecutionNumber): Self = StObject.set(x, "executionNumber", value.asInstanceOf[js.Any])
    
    inline def setExecutionNumberUndefined: Self = StObject.set(x, "executionNumber", js.undefined)
    
    inline def setLastUpdatedAt(value: js.Date): Self = StObject.set(x, "lastUpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedAtUndefined: Self = StObject.set(x, "lastUpdatedAt", js.undefined)
    
    inline def setQueuedAt(value: js.Date): Self = StObject.set(x, "queuedAt", value.asInstanceOf[js.Any])
    
    inline def setQueuedAtUndefined: Self = StObject.set(x, "queuedAt", js.undefined)
    
    inline def setRetryAttempt(value: RetryAttempt): Self = StObject.set(x, "retryAttempt", value.asInstanceOf[js.Any])
    
    inline def setRetryAttemptUndefined: Self = StObject.set(x, "retryAttempt", js.undefined)
    
    inline def setStartedAt(value: js.Date): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    
    inline def setStartedAtUndefined: Self = StObject.set(x, "startedAt", js.undefined)
    
    inline def setStatus(value: JobExecutionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
