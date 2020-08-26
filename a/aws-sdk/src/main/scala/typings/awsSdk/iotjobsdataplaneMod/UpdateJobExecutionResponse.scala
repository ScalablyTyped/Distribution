package typings.awsSdk.iotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJobExecutionResponse extends js.Object {
  /**
    * A JobExecutionState object.
    */
  var executionState: js.UndefOr[JobExecutionState] = js.native
  /**
    * The contents of the Job Documents.
    */
  var jobDocument: js.UndefOr[JobDocument] = js.native
}

object UpdateJobExecutionResponse {
  @scala.inline
  def apply(): UpdateJobExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateJobExecutionResponse]
  }
  @scala.inline
  implicit class UpdateJobExecutionResponseOps[Self <: UpdateJobExecutionResponse] (val x: Self) extends AnyVal {
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
    def setExecutionState(value: JobExecutionState): Self = this.set("executionState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionState: Self = this.set("executionState", js.undefined)
    @scala.inline
    def setJobDocument(value: JobDocument): Self = this.set("jobDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobDocument: Self = this.set("jobDocument", js.undefined)
  }
  
}

