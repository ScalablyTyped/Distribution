package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobResponse extends js.Object {
  /**
    * The job description.
    */
  var description: js.UndefOr[JobDescription] = js.native
  /**
    * The job ARN.
    */
  var jobArn: js.UndefOr[JobArn] = js.native
  /**
    * The unique identifier you assigned to this job.
    */
  var jobId: js.UndefOr[JobId] = js.native
}

object CreateJobResponse {
  @scala.inline
  def apply(description: JobDescription = null, jobArn: JobArn = null, jobId: JobId = null): CreateJobResponse = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (jobArn != null) __obj.updateDynamic("jobArn")(jobArn.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateJobResponse]
  }
}

