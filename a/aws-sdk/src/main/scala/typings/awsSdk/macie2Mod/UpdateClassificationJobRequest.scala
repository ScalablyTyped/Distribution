package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateClassificationJobRequest extends js.Object {
  /**
    * The unique identifier for the classification job.
    */
  var jobId: string = js.native
  /**
    * The status to change the job's status to. The only supported value is CANCELLED, which cancels the job completely.
    */
  var jobStatus: JobStatus = js.native
}

object UpdateClassificationJobRequest {
  @scala.inline
  def apply(jobId: string, jobStatus: JobStatus): UpdateClassificationJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any], jobStatus = jobStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateClassificationJobRequest]
  }
  @scala.inline
  implicit class UpdateClassificationJobRequestOps[Self <: UpdateClassificationJobRequest] (val x: Self) extends AnyVal {
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
    def setJobId(value: string): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobStatus(value: JobStatus): Self = this.set("jobStatus", value.asInstanceOf[js.Any])
  }
  
}

