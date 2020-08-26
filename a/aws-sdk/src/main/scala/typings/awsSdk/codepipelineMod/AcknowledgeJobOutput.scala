package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcknowledgeJobOutput extends js.Object {
  /**
    * Whether the job worker has received the specified job.
    */
  var status: js.UndefOr[JobStatus] = js.native
}

object AcknowledgeJobOutput {
  @scala.inline
  def apply(): AcknowledgeJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AcknowledgeJobOutput]
  }
  @scala.inline
  implicit class AcknowledgeJobOutputOps[Self <: AcknowledgeJobOutput] (val x: Self) extends AnyVal {
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
    def setStatus(value: JobStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
  
}

