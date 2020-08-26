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
  def apply(): StartSigningJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartSigningJobResponse]
  }
  @scala.inline
  implicit class StartSigningJobResponseOps[Self <: StartSigningJobResponse] (val x: Self) extends AnyVal {
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
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
  }
  
}

