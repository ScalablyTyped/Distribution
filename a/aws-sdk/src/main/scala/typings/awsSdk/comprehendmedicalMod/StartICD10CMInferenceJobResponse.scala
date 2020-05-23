package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartICD10CMInferenceJobResponse extends js.Object {
  /**
    * The identifier generated for the job. To get the status of a job, use this identifier with the StartICD10CMInferenceJob operation.
    */
  var JobId: js.UndefOr[typings.awsSdk.comprehendmedicalMod.JobId] = js.native
}

object StartICD10CMInferenceJobResponse {
  @scala.inline
  def apply(JobId: JobId = null): StartICD10CMInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartICD10CMInferenceJobResponse]
  }
}

