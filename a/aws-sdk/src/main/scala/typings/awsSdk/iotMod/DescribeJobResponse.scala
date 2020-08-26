package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobResponse extends js.Object {
  /**
    * An S3 link to the job document.
    */
  var documentSource: js.UndefOr[JobDocumentSource] = js.native
  /**
    * Information about the job.
    */
  var job: js.UndefOr[Job] = js.native
}

object DescribeJobResponse {
  @scala.inline
  def apply(): DescribeJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeJobResponse]
  }
  @scala.inline
  implicit class DescribeJobResponseOps[Self <: DescribeJobResponse] (val x: Self) extends AnyVal {
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
    def setDocumentSource(value: JobDocumentSource): Self = this.set("documentSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentSource: Self = this.set("documentSource", js.undefined)
    @scala.inline
    def setJob(value: Job): Self = this.set("job", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJob: Self = this.set("job", js.undefined)
  }
  
}

