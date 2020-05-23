package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopRxNormInferenceJobRequest extends js.Object {
  /**
    * The identifier of the job.
    */
  var JobId: typings.awsSdk.comprehendmedicalMod.JobId = js.native
}

object StopRxNormInferenceJobRequest {
  @scala.inline
  def apply(JobId: JobId): StopRxNormInferenceJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRxNormInferenceJobRequest]
  }
}

