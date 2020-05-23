package typings.awsSdk.fsxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataRepositoryTaskStatus extends js.Object {
  /**
    * A running total of the number of files that the task failed to process.
    */
  var FailedCount: js.UndefOr[typings.awsSdk.fsxMod.FailedCount] = js.native
  /**
    * The time at which the task status was last updated.
    */
  var LastUpdatedTime: js.UndefOr[typings.awsSdk.fsxMod.LastUpdatedTime] = js.native
  /**
    * A running total of the number of files that the task has successfully processed.
    */
  var SucceededCount: js.UndefOr[typings.awsSdk.fsxMod.SucceededCount] = js.native
  /**
    * The total number of files that the task will process. While a task is executing, the sum of SucceededCount plus FailedCount may not equal TotalCount. When the task is complete, TotalCount equals the sum of SucceededCount plus FailedCount.
    */
  var TotalCount: js.UndefOr[typings.awsSdk.fsxMod.TotalCount] = js.native
}

object DataRepositoryTaskStatus {
  @scala.inline
  def apply(
    FailedCount: js.UndefOr[FailedCount] = js.undefined,
    LastUpdatedTime: LastUpdatedTime = null,
    SucceededCount: js.UndefOr[SucceededCount] = js.undefined,
    TotalCount: js.UndefOr[TotalCount] = js.undefined
  ): DataRepositoryTaskStatus = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(FailedCount)) __obj.updateDynamic("FailedCount")(FailedCount.get.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    if (!js.isUndefined(SucceededCount)) __obj.updateDynamic("SucceededCount")(SucceededCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalCount)) __obj.updateDynamic("TotalCount")(TotalCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRepositoryTaskStatus]
  }
}

