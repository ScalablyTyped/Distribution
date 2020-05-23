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
  def apply(
    canceledChecks: js.UndefOr[CanceledChecksCount] = js.undefined,
    compliantChecks: js.UndefOr[CompliantChecksCount] = js.undefined,
    failedChecks: js.UndefOr[FailedChecksCount] = js.undefined,
    inProgressChecks: js.UndefOr[InProgressChecksCount] = js.undefined,
    nonCompliantChecks: js.UndefOr[NonCompliantChecksCount] = js.undefined,
    totalChecks: js.UndefOr[TotalChecksCount] = js.undefined,
    waitingForDataCollectionChecks: js.UndefOr[WaitingForDataCollectionChecksCount] = js.undefined
  ): TaskStatistics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canceledChecks)) __obj.updateDynamic("canceledChecks")(canceledChecks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compliantChecks)) __obj.updateDynamic("compliantChecks")(compliantChecks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(failedChecks)) __obj.updateDynamic("failedChecks")(failedChecks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inProgressChecks)) __obj.updateDynamic("inProgressChecks")(inProgressChecks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(nonCompliantChecks)) __obj.updateDynamic("nonCompliantChecks")(nonCompliantChecks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(totalChecks)) __obj.updateDynamic("totalChecks")(totalChecks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(waitingForDataCollectionChecks)) __obj.updateDynamic("waitingForDataCollectionChecks")(waitingForDataCollectionChecks.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskStatistics]
  }
}

