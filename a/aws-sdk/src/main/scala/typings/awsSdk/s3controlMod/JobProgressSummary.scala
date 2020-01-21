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
    NumberOfTasksFailed: Int | Double = null,
    NumberOfTasksSucceeded: Int | Double = null,
    TotalNumberOfTasks: Int | Double = null
  ): JobProgressSummary = {
    val __obj = js.Dynamic.literal()
    if (NumberOfTasksFailed != null) __obj.updateDynamic("NumberOfTasksFailed")(NumberOfTasksFailed.asInstanceOf[js.Any])
    if (NumberOfTasksSucceeded != null) __obj.updateDynamic("NumberOfTasksSucceeded")(NumberOfTasksSucceeded.asInstanceOf[js.Any])
    if (TotalNumberOfTasks != null) __obj.updateDynamic("TotalNumberOfTasks")(TotalNumberOfTasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobProgressSummary]
  }
}

