package typings.awsSdk.comprehendmedicalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopICD10CMInferenceJobResponse extends js.Object {
  /**
    * The identifier generated for the job. To get the status of job, use this identifier with the DescribeICD10CMInferenceJob operation.
    */
  var JobId: js.UndefOr[typings.awsSdk.comprehendmedicalMod.JobId] = js.native
}

object StopICD10CMInferenceJobResponse {
  @scala.inline
  def apply(JobId: JobId = null): StopICD10CMInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    if (JobId != null) __obj.updateDynamic("JobId")(JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopICD10CMInferenceJobResponse]
  }
}

