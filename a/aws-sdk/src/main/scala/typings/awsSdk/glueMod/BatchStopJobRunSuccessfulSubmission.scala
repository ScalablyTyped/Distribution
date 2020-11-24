package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchStopJobRunSuccessfulSubmission extends js.Object {
  
  /**
    * The name of the job definition used in the job run that was stopped.
    */
  var JobName: js.UndefOr[NameString] = js.native
  
  /**
    * The JobRunId of the job run that was stopped.
    */
  var JobRunId: js.UndefOr[IdString] = js.native
}
object BatchStopJobRunSuccessfulSubmission {
  
  @scala.inline
  def apply(): BatchStopJobRunSuccessfulSubmission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStopJobRunSuccessfulSubmission]
  }
  
  @scala.inline
  implicit class BatchStopJobRunSuccessfulSubmissionOps[Self <: BatchStopJobRunSuccessfulSubmission] (val x: Self) extends AnyVal {
    
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
    def setJobName(value: NameString): Self = this.set("JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobName: Self = this.set("JobName", js.undefined)
    
    @scala.inline
    def setJobRunId(value: IdString): Self = this.set("JobRunId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobRunId: Self = this.set("JobRunId", js.undefined)
  }
}
