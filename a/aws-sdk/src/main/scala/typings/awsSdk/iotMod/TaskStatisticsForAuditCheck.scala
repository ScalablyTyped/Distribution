package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskStatisticsForAuditCheck extends js.Object {
  /**
    * The number of findings to which the mitigation action task was canceled when applied.
    */
  var canceledFindingsCount: js.UndefOr[CanceledFindingsCount] = js.native
  /**
    * The number of findings for which at least one of the actions failed when applied.
    */
  var failedFindingsCount: js.UndefOr[FailedFindingsCount] = js.native
  /**
    * The number of findings skipped because of filter conditions provided in the parameters to the command.
    */
  var skippedFindingsCount: js.UndefOr[SkippedFindingsCount] = js.native
  /**
    * The number of findings for which all mitigation actions succeeded when applied.
    */
  var succeededFindingsCount: js.UndefOr[SucceededFindingsCount] = js.native
  /**
    * The total number of findings to which a task is being applied.
    */
  var totalFindingsCount: js.UndefOr[TotalFindingsCount] = js.native
}

object TaskStatisticsForAuditCheck {
  @scala.inline
  def apply(): TaskStatisticsForAuditCheck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskStatisticsForAuditCheck]
  }
  @scala.inline
  implicit class TaskStatisticsForAuditCheckOps[Self <: TaskStatisticsForAuditCheck] (val x: Self) extends AnyVal {
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
    def setCanceledFindingsCount(value: CanceledFindingsCount): Self = this.set("canceledFindingsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanceledFindingsCount: Self = this.set("canceledFindingsCount", js.undefined)
    @scala.inline
    def setFailedFindingsCount(value: FailedFindingsCount): Self = this.set("failedFindingsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedFindingsCount: Self = this.set("failedFindingsCount", js.undefined)
    @scala.inline
    def setSkippedFindingsCount(value: SkippedFindingsCount): Self = this.set("skippedFindingsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkippedFindingsCount: Self = this.set("skippedFindingsCount", js.undefined)
    @scala.inline
    def setSucceededFindingsCount(value: SucceededFindingsCount): Self = this.set("succeededFindingsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSucceededFindingsCount: Self = this.set("succeededFindingsCount", js.undefined)
    @scala.inline
    def setTotalFindingsCount(value: TotalFindingsCount): Self = this.set("totalFindingsCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalFindingsCount: Self = this.set("totalFindingsCount", js.undefined)
  }
  
}

