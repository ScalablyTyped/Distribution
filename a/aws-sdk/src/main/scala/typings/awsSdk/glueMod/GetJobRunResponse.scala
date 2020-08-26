package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobRunResponse extends js.Object {
  /**
    * The requested job-run metadata.
    */
  var JobRun: js.UndefOr[typings.awsSdk.glueMod.JobRun] = js.native
}

object GetJobRunResponse {
  @scala.inline
  def apply(): GetJobRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobRunResponse]
  }
  @scala.inline
  implicit class GetJobRunResponseOps[Self <: GetJobRunResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setJobRun(value: JobRun): Self = this.set("JobRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobRun: Self = this.set("JobRun", js.undefined)
  }
  
}

