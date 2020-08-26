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
  def apply(): StopICD10CMInferenceJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopICD10CMInferenceJobResponse]
  }
  @scala.inline
  implicit class StopICD10CMInferenceJobResponseOps[Self <: StopICD10CMInferenceJobResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
  }
  
}

