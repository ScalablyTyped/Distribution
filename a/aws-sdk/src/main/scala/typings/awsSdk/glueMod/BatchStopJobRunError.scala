package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchStopJobRunError extends js.Object {
  /**
    * Specifies details about the error that was encountered.
    */
  var ErrorDetail: js.UndefOr[typings.awsSdk.glueMod.ErrorDetail] = js.native
  /**
    * The name of the job definition that is used in the job run in question.
    */
  var JobName: js.UndefOr[NameString] = js.native
  /**
    * The JobRunId of the job run in question.
    */
  var JobRunId: js.UndefOr[IdString] = js.native
}

object BatchStopJobRunError {
  @scala.inline
  def apply(): BatchStopJobRunError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStopJobRunError]
  }
  @scala.inline
  implicit class BatchStopJobRunErrorOps[Self <: BatchStopJobRunError] (val x: Self) extends AnyVal {
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
    def setErrorDetail(value: ErrorDetail): Self = this.set("ErrorDetail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorDetail: Self = this.set("ErrorDetail", js.undefined)
    @scala.inline
    def setJobName(value: NameString): Self = this.set("JobName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobName: Self = this.set("JobName", js.undefined)
    @scala.inline
    def setJobRunId(value: IdString): Self = this.set("JobRunId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobRunId: Self = this.set("JobRunId", js.undefined)
  }
  
}

