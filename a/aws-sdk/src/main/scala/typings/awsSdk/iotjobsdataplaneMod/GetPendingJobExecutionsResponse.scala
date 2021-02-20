package typings.awsSdk.iotjobsdataplaneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPendingJobExecutionsResponse extends StObject {
  
  /**
    * A list of JobExecutionSummary objects with status IN_PROGRESS.
    */
  var inProgressJobs: js.UndefOr[JobExecutionSummaryList] = js.native
  
  /**
    * A list of JobExecutionSummary objects with status QUEUED.
    */
  var queuedJobs: js.UndefOr[JobExecutionSummaryList] = js.native
}
object GetPendingJobExecutionsResponse {
  
  @scala.inline
  def apply(): GetPendingJobExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPendingJobExecutionsResponse]
  }
  
  @scala.inline
  implicit class GetPendingJobExecutionsResponseMutableBuilder[Self <: GetPendingJobExecutionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInProgressJobs(value: JobExecutionSummaryList): Self = StObject.set(x, "inProgressJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInProgressJobsUndefined: Self = StObject.set(x, "inProgressJobs", js.undefined)
    
    @scala.inline
    def setInProgressJobsVarargs(value: JobExecutionSummary*): Self = StObject.set(x, "inProgressJobs", js.Array(value :_*))
    
    @scala.inline
    def setQueuedJobs(value: JobExecutionSummaryList): Self = StObject.set(x, "queuedJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueuedJobsUndefined: Self = StObject.set(x, "queuedJobs", js.undefined)
    
    @scala.inline
    def setQueuedJobsVarargs(value: JobExecutionSummary*): Self = StObject.set(x, "queuedJobs", js.Array(value :_*))
  }
}
