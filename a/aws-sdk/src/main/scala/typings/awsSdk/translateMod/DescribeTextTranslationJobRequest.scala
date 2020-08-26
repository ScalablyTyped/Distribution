package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTextTranslationJobRequest extends js.Object {
  /**
    * The identifier that Amazon Translate generated for the job. The StartTextTranslationJob operation returns this identifier in its response.
    */
  var JobId: typings.awsSdk.translateMod.JobId = js.native
}

object DescribeTextTranslationJobRequest {
  @scala.inline
  def apply(JobId: JobId): DescribeTextTranslationJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTextTranslationJobRequest]
  }
  @scala.inline
  implicit class DescribeTextTranslationJobRequestOps[Self <: DescribeTextTranslationJobRequest] (val x: Self) extends AnyVal {
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

