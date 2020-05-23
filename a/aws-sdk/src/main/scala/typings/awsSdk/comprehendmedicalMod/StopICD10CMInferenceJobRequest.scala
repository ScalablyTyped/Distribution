package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopICD10CMInferenceJobRequest extends js.Object {
  /**
    * The identifier of the job.
    */
  var JobId: typings.awsSdk.comprehendmedicalMod.JobId = js.native
}

object StopICD10CMInferenceJobRequest {
  @scala.inline
  def apply(JobId: JobId): StopICD10CMInferenceJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopICD10CMInferenceJobRequest]
  }
}

