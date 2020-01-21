package typings.awsSdk.signerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartSigningJobResponse extends js.Object {
  /**
    * The ID of your signing job.
    */
  var jobId: js.UndefOr[JobId] = js.native
}

object StartSigningJobResponse {
  @scala.inline
  def apply(jobId: JobId = null): StartSigningJobResponse = {
    val __obj = js.Dynamic.literal()
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSigningJobResponse]
  }
}

