package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListJobExecutionsForJobRequest extends js.Object {
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId = js.native
  /**
    * The maximum number of results to be returned per request.
    */
  var maxResults: js.UndefOr[LaserMaxResults] = js.native
  /**
    * The token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The status of the job.
    */
  var status: js.UndefOr[JobExecutionStatus] = js.native
}

object ListJobExecutionsForJobRequest {
  @scala.inline
  def apply(jobId: JobId): ListJobExecutionsForJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListJobExecutionsForJobRequest]
  }
  @scala.inline
  implicit class ListJobExecutionsForJobRequestOps[Self <: ListJobExecutionsForJobRequest] (val x: Self) extends AnyVal {
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
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: LaserMaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setStatus(value: JobExecutionStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

