package typings.awsSdk.clientsTimestreamqueryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledQueryRunSummary extends StObject {
  
  /**
    * S3 location for error report.
    */
  var ErrorReportLocation: js.UndefOr[typings.awsSdk.clientsTimestreamqueryMod.ErrorReportLocation] = js.undefined
  
  /**
    * Runtime statistics for a scheduled run.
    */
  var ExecutionStats: js.UndefOr[typings.awsSdk.clientsTimestreamqueryMod.ExecutionStats] = js.undefined
  
  /**
    * Error message for the scheduled query in case of failure. You might have to look at the error report to get more detailed error reasons. 
    */
  var FailureReason: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * InvocationTime for this run. This is the time at which the query is scheduled to run. Parameter @scheduled_runtime can be used in the query to get the value. 
    */
  var InvocationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status of a scheduled query run.
    */
  var RunStatus: js.UndefOr[ScheduledQueryRunStatus] = js.undefined
  
  /**
    * The actual time when the query was run.
    */
  var TriggerTime: js.UndefOr[js.Date] = js.undefined
}
object ScheduledQueryRunSummary {
  
  inline def apply(): ScheduledQueryRunSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledQueryRunSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduledQueryRunSummary] (val x: Self) extends AnyVal {
    
    inline def setErrorReportLocation(value: ErrorReportLocation): Self = StObject.set(x, "ErrorReportLocation", value.asInstanceOf[js.Any])
    
    inline def setErrorReportLocationUndefined: Self = StObject.set(x, "ErrorReportLocation", js.undefined)
    
    inline def setExecutionStats(value: ExecutionStats): Self = StObject.set(x, "ExecutionStats", value.asInstanceOf[js.Any])
    
    inline def setExecutionStatsUndefined: Self = StObject.set(x, "ExecutionStats", js.undefined)
    
    inline def setFailureReason(value: ErrorMessage): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setInvocationTime(value: js.Date): Self = StObject.set(x, "InvocationTime", value.asInstanceOf[js.Any])
    
    inline def setInvocationTimeUndefined: Self = StObject.set(x, "InvocationTime", js.undefined)
    
    inline def setRunStatus(value: ScheduledQueryRunStatus): Self = StObject.set(x, "RunStatus", value.asInstanceOf[js.Any])
    
    inline def setRunStatusUndefined: Self = StObject.set(x, "RunStatus", js.undefined)
    
    inline def setTriggerTime(value: js.Date): Self = StObject.set(x, "TriggerTime", value.asInstanceOf[js.Any])
    
    inline def setTriggerTimeUndefined: Self = StObject.set(x, "TriggerTime", js.undefined)
  }
}
