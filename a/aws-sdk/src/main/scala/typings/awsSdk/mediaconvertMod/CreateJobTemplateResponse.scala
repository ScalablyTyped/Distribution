package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJobTemplateResponse extends js.Object {
  /**
    * A job template is a pre-made set of encoding instructions that you can use to quickly create a job.
    */
  var JobTemplate: js.UndefOr[typings.awsSdk.mediaconvertMod.JobTemplate] = js.native
}

object CreateJobTemplateResponse {
  @scala.inline
  def apply(): CreateJobTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobTemplateResponse]
  }
  @scala.inline
  implicit class CreateJobTemplateResponseOps[Self <: CreateJobTemplateResponse] (val x: Self) extends AnyVal {
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
    def setJobTemplate(value: JobTemplate): Self = this.set("JobTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobTemplate: Self = this.set("JobTemplate", js.undefined)
  }
  
}

