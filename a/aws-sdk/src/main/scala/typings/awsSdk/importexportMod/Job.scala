package typings.awsSdk.importexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Job extends js.Object {
  var CreationDate: js.UndefOr[typings.awsSdk.importexportMod.CreationDate] = js.native
  var IsCanceled: js.UndefOr[typings.awsSdk.importexportMod.IsCanceled] = js.native
  var JobId: js.UndefOr[typings.awsSdk.importexportMod.JobId] = js.native
  var JobType: js.UndefOr[typings.awsSdk.importexportMod.JobType] = js.native
}

object Job {
  @scala.inline
  def apply(): Job = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Job]
  }
  @scala.inline
  implicit class JobOps[Self <: Job] (val x: Self) extends AnyVal {
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
    def setCreationDate(value: CreationDate): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setIsCanceled(value: IsCanceled): Self = this.set("IsCanceled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsCanceled: Self = this.set("IsCanceled", js.undefined)
    @scala.inline
    def setJobId(value: JobId): Self = this.set("JobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("JobId", js.undefined)
    @scala.inline
    def setJobType(value: JobType): Self = this.set("JobType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobType: Self = this.set("JobType", js.undefined)
  }
  
}

