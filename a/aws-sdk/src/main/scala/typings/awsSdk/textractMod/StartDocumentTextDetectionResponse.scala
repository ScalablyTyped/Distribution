package typings.awsSdk.textractMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartDocumentTextDetectionResponse extends js.Object {
  /**
    * The identifier of the text detection job for the document. Use JobId to identify the job in a subsequent call to GetDocumentTextDetection. A JobId value is only valid for 7 days.
    */
  var JobId: js.UndefOr[typings.awsSdk.textractMod.JobId] = js.native
}

object StartDocumentTextDetectionResponse {
  @scala.inline
  def apply(): StartDocumentTextDetectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartDocumentTextDetectionResponse]
  }
  @scala.inline
  implicit class StartDocumentTextDetectionResponseOps[Self <: StartDocumentTextDetectionResponse] (val x: Self) extends AnyVal {
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

