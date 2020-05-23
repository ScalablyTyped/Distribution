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
}

