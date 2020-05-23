package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopRxNormInferenceJobResponse extends js.Object {
  /**
    * The identifier generated for the job. To get the status of job, use this identifier with the DescribeRxNormInferenceJob operation.
    */
  var JobId: js.UndefOr[typings.awsSdk.comprehendmedicalMod.JobId] = js.native
}

object StopRxNormInferenceJobResponse {
  @scala.inline
  def apply(JobId: JobId = null): StopRxNormInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRxNormInferenceJobResponse]
  }
}

