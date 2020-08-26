package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobResult extends js.Object {
  /**
    * The ID for this job. Amazon S3 generates this ID automatically and returns it after a successful Create Job request.
    */
  var JobId: js.UndefOr[typings.awsSdk.s3controlMod.JobId] = js.native
}

object CreateJobResult {
  @scala.inline
  def apply(): CreateJobResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobResult]
  }
  @scala.inline
  implicit class CreateJobResultOps[Self <: CreateJobResult] (val x: Self) extends AnyVal {
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
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
  }
  
}

