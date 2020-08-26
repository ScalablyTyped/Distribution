package typings.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelJobInput extends js.Object {
  var APIVersion: js.UndefOr[APIVersion_] = js.native
  var JobId: typings.awsSdk.importexportMod.JobId = js.native
}

object CancelJobInput {
  @scala.inline
  def apply(JobId: JobId): CancelJobInput = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobInput]
  }
  @scala.inline
  implicit class CancelJobInputOps[Self <: CancelJobInput] (val x: Self) extends AnyVal {
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
    def setAPIVersion(value: APIVersion_): Self = this.set("APIVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAPIVersion: Self = this.set("APIVersion", js.undefined)
  }
  
}

