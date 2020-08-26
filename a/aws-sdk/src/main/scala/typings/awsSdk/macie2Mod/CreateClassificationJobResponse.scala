package typings.awsSdk.macie2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClassificationJobResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the job.
    */
  var jobArn: js.UndefOr[string] = js.native
  /**
    * The unique identifier for the job.
    */
  var jobId: js.UndefOr[string] = js.native
}

object CreateClassificationJobResponse {
  @scala.inline
  def apply(): CreateClassificationJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClassificationJobResponse]
  }
  @scala.inline
  implicit class CreateClassificationJobResponseOps[Self <: CreateClassificationJobResponse] (val x: Self) extends AnyVal {
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
    def setJobArn(value: string): Self = this.set("jobArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobArn: Self = this.set("jobArn", js.undefined)
    @scala.inline
    def setJobId(value: string): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
  }
  
}

