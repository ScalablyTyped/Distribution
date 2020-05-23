package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartRxNormInferenceJobResponse extends js.Object {
  /**
    * The identifier of the job.
    */
  var JobId: js.UndefOr[typings.awsSdk.comprehendmedicalMod.JobId] = js.native
}

object StartRxNormInferenceJobResponse {
  @scala.inline
  def apply(JobId: JobId = null): StartRxNormInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartRxNormInferenceJobResponse]
  }
}

