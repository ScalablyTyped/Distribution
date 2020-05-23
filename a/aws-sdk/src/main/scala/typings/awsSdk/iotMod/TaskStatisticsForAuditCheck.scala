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
  def apply(
    canceledFindingsCount: js.UndefOr[CanceledFindingsCount] = js.undefined,
    failedFindingsCount: js.UndefOr[FailedFindingsCount] = js.undefined,
    skippedFindingsCount: js.UndefOr[SkippedFindingsCount] = js.undefined,
    succeededFindingsCount: js.UndefOr[SucceededFindingsCount] = js.undefined,
    totalFindingsCount: js.UndefOr[TotalFindingsCount] = js.undefined
  ): TaskStatisticsForAuditCheck = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canceledFindingsCount)) __obj.updateDynamic("canceledFindingsCount")(canceledFindingsCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failedFindingsCount)) __obj.updateDynamic("failedFindingsCount")(failedFindingsCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(skippedFindingsCount)) __obj.updateDynamic("skippedFindingsCount")(skippedFindingsCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(succeededFindingsCount)) __obj.updateDynamic("succeededFindingsCount")(succeededFindingsCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalFindingsCount)) __obj.updateDynamic("totalFindingsCount")(totalFindingsCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskStatisticsForAuditCheck]
  }
}

