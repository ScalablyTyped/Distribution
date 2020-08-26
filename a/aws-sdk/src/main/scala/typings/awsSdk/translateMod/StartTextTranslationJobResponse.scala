package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTextTranslationJobResponse extends js.Object {
  /**
    * The identifier generated for the job. To get the status of a job, use this ID with the DescribeTextTranslationJob operation.
    */
  var JobId: js.UndefOr[typings.awsSdk.translateMod.JobId] = js.native
  /**
    * The status of the job. Possible values include:    SUBMITTED - The job has been received and is queued for processing.    IN_PROGRESS - Amazon Translate is processing the job.    COMPLETED - The job was successfully completed and the output is available.    COMPLETED_WITH_ERRORS - The job was completed with errors. The errors can be analyzed in the job's output.    FAILED - The job did not complete. To get details, use the DescribeTextTranslationJob operation.    STOP_REQUESTED - The user who started the job has requested that it be stopped.    STOPPED - The job has been stopped.  
    */
  var JobStatus: js.UndefOr[typings.awsSdk.translateMod.JobStatus] = js.native
}

object StartTextTranslationJobResponse {
  @scala.inline
  def apply(): StartTextTranslationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartTextTranslationJobResponse]
  }
  @scala.inline
  implicit class StartTextTranslationJobResponseOps[Self <: StartTextTranslationJobResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
    @scala.inline
    def setJobStatus(value: JobStatus): Self = this.set("JobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobStatus: Self = this.set("JobStatus", js.undefined)
  }
  
}

