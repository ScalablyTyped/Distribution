package typings.awsSdk.iotjobsdataplaneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPendingJobExecutionsResponse extends StObject {
  
  /**
    * A list of JobExecutionSummary objects with status IN_PROGRESS.
    */
  var inProgressJobs: js.UndefOr[JobExecutionSummaryList] = js.undefined
  
  /**
    * A list of JobExecutionSummary objects with status QUEUED.
    */
  var queuedJobs: js.UndefOr[JobExecutionSummaryList] = js.undefined
}
object GetPendingJobExecutionsResponse {
  
  inline def apply(): GetPendingJobExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPendingJobExecutionsResponse]
  }
  
  extension [Self <: GetPendingJobExecutionsResponse](x: Self) {
    
    inline def setInProgressJobs(value: JobExecutionSummaryList): Self = StObject.set(x, "inProgressJobs", value.asInstanceOf[js.Any])
    
    inline def setInProgressJobsUndefined: Self = StObject.set(x, "inProgressJobs", js.undefined)
    
    inline def setInProgressJobsVarargs(value: JobExecutionSummary*): Self = StObject.set(x, "inProgressJobs", js.Array(value*))
    
    inline def setQueuedJobs(value: JobExecutionSummaryList): Self = StObject.set(x, "queuedJobs", value.asInstanceOf[js.Any])
    
    inline def setQueuedJobsUndefined: Self = StObject.set(x, "queuedJobs", js.undefined)
    
    inline def setQueuedJobsVarargs(value: JobExecutionSummary*): Self = StObject.set(x, "queuedJobs", js.Array(value*))
  }
}
