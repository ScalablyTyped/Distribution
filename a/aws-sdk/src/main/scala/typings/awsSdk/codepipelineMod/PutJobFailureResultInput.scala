package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutJobFailureResultInput extends js.Object {
  /**
    * The details about the failure of a job.
    */
  var failureDetails: FailureDetails = js.native
  /**
    * The unique system-generated ID of the job that failed. This is the same ID returned from PollForJobs.
    */
  var jobId: JobId = js.native
}

object PutJobFailureResultInput {
  @scala.inline
  def apply(failureDetails: FailureDetails, jobId: JobId): PutJobFailureResultInput = {
    val __obj = js.Dynamic.literal(failureDetails = failureDetails.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutJobFailureResultInput]
  }
  @scala.inline
  implicit class PutJobFailureResultInputOps[Self <: PutJobFailureResultInput] (val x: Self) extends AnyVal {
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
    def setFailureDetails(value: FailureDetails): Self = this.set("failureDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
  }
  
}

