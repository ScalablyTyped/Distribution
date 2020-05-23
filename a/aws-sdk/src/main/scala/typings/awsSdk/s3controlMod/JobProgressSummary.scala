package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobProgressSummary extends js.Object {
  /**
    * 
    */
  var NumberOfTasksFailed: js.UndefOr[JobNumberOfTasksFailed] = js.native
  /**
    * 
    */
  var NumberOfTasksSucceeded: js.UndefOr[JobNumberOfTasksSucceeded] = js.native
  /**
    * 
    */
  var TotalNumberOfTasks: js.UndefOr[JobTotalNumberOfTasks] = js.native
}

object JobProgressSummary {
  @scala.inline
  def apply(
    NumberOfTasksFailed: js.UndefOr[JobNumberOfTasksFailed] = js.undefined,
    NumberOfTasksSucceeded: js.UndefOr[JobNumberOfTasksSucceeded] = js.undefined,
    TotalNumberOfTasks: js.UndefOr[JobTotalNumberOfTasks] = js.undefined
  ): JobProgressSummary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(NumberOfTasksFailed)) __obj.updateDynamic("NumberOfTasksFailed")(NumberOfTasksFailed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(NumberOfTasksSucceeded)) __obj.updateDynamic("NumberOfTasksSucceeded")(NumberOfTasksSucceeded.get.asInstanceOf[js.Any])
    if (!js.isUndefined(TotalNumberOfTasks)) __obj.updateDynamic("TotalNumberOfTasks")(TotalNumberOfTasks.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobProgressSummary]
  }
}

