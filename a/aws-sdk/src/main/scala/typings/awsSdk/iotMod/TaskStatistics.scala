package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskStatistics extends js.Object {
  /**
    * The number of checks that did not run because the audit was canceled.
    */
  var canceledChecks: js.UndefOr[CanceledChecksCount] = js.native
  /**
    * The number of checks that found compliant resources.
    */
  var compliantChecks: js.UndefOr[CompliantChecksCount] = js.native
  /**
    * The number of checks.
    */
  var failedChecks: js.UndefOr[FailedChecksCount] = js.native
  /**
    * The number of checks in progress.
    */
  var inProgressChecks: js.UndefOr[InProgressChecksCount] = js.native
  /**
    * The number of checks that found noncompliant resources.
    */
  var nonCompliantChecks: js.UndefOr[NonCompliantChecksCount] = js.native
  /**
    * The number of checks in this audit.
    */
  var totalChecks: js.UndefOr[TotalChecksCount] = js.native
  /**
    * The number of checks waiting for data collection.
    */
  var waitingForDataCollectionChecks: js.UndefOr[WaitingForDataCollectionChecksCount] = js.native
}

object TaskStatistics {
  @scala.inline
  def apply(): TaskStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskStatistics]
  }
  @scala.inline
  implicit class TaskStatisticsOps[Self <: TaskStatistics] (val x: Self) extends AnyVal {
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
    def setCanceledChecks(value: CanceledChecksCount): Self = this.set("canceledChecks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanceledChecks: Self = this.set("canceledChecks", js.undefined)
    @scala.inline
    def setCompliantChecks(value: CompliantChecksCount): Self = this.set("compliantChecks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompliantChecks: Self = this.set("compliantChecks", js.undefined)
    @scala.inline
    def setFailedChecks(value: FailedChecksCount): Self = this.set("failedChecks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedChecks: Self = this.set("failedChecks", js.undefined)
    @scala.inline
    def setInProgressChecks(value: InProgressChecksCount): Self = this.set("inProgressChecks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInProgressChecks: Self = this.set("inProgressChecks", js.undefined)
    @scala.inline
    def setNonCompliantChecks(value: NonCompliantChecksCount): Self = this.set("nonCompliantChecks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonCompliantChecks: Self = this.set("nonCompliantChecks", js.undefined)
    @scala.inline
    def setTotalChecks(value: TotalChecksCount): Self = this.set("totalChecks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotalChecks: Self = this.set("totalChecks", js.undefined)
    @scala.inline
    def setWaitingForDataCollectionChecks(value: WaitingForDataCollectionChecksCount): Self = this.set("waitingForDataCollectionChecks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWaitingForDataCollectionChecks: Self = this.set("waitingForDataCollectionChecks", js.undefined)
  }
  
}

