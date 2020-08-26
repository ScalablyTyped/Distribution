package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopDominantLanguageDetectionJobResponse extends js.Object {
  /**
    * The identifier of the dominant language detection job to stop.
    */
  var JobId: js.UndefOr[typings.awsSdk.comprehendMod.JobId] = js.native
  /**
    * Either STOP_REQUESTED if the job is currently running, or STOPPED if the job was previously stopped with the StopDominantLanguageDetectionJob operation.
    */
  var JobStatus: js.UndefOr[typings.awsSdk.comprehendMod.JobStatus] = js.native
}

object StopDominantLanguageDetectionJobResponse {
  @scala.inline
  def apply(): StopDominantLanguageDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopDominantLanguageDetectionJobResponse]
  }
  @scala.inline
  implicit class StopDominantLanguageDetectionJobResponseOps[Self <: StopDominantLanguageDetectionJobResponse] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setJobStatus(value: JobStatus): Self = this.set("JobStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobStatus: Self = this.set("JobStatus", js.undefined)
  }
  
}

