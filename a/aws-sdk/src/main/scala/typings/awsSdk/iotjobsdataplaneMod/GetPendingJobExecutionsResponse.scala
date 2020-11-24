package typings.awsSdk.iotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPendingJobExecutionsResponse extends js.Object {
  
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
  implicit class GetPendingJobExecutionsResponseOps[Self <: GetPendingJobExecutionsResponse] (val x: Self) extends AnyVal {
    
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
    def setInProgressJobsVarargs(value: JobExecutionSummary*): Self = this.set("inProgressJobs", js.Array(value :_*))
    
    @scala.inline
    def setInProgressJobs(value: JobExecutionSummaryList): Self = this.set("inProgressJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInProgressJobs: Self = this.set("inProgressJobs", js.undefined)
    
    @scala.inline
    def setQueuedJobsVarargs(value: JobExecutionSummary*): Self = this.set("queuedJobs", js.Array(value :_*))
    
    @scala.inline
    def setQueuedJobs(value: JobExecutionSummaryList): Self = this.set("queuedJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueuedJobs: Self = this.set("queuedJobs", js.undefined)
  }
}
