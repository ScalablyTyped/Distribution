package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobDocumentRequest extends js.Object {
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId = js.native
}

object GetJobDocumentRequest {
  @scala.inline
  def apply(jobId: JobId): GetJobDocumentRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobDocumentRequest]
  }
  @scala.inline
  implicit class GetJobDocumentRequestOps[Self <: GetJobDocumentRequest] (val x: Self) extends AnyVal {
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
  }
  
}

