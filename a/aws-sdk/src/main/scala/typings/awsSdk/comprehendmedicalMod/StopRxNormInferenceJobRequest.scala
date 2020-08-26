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
  @scala.inline
  implicit class StopRxNormInferenceJobRequestOps[Self <: StopRxNormInferenceJobRequest] (val x: Self) extends AnyVal {
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
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
  }
  
}

