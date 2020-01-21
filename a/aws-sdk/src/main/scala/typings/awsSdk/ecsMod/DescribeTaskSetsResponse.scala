package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTaskSetsResponse extends js.Object {
  /**
    * Any failures associated with the call.
    */
  var failures: js.UndefOr[Failures] = js.native
  /**
    * The list of task sets described.
    */
  var taskSets: js.UndefOr[TaskSets] = js.native
}

object DescribeTaskSetsResponse {
  @scala.inline
  def apply(failures: Failures = null, taskSets: TaskSets = null): DescribeTaskSetsResponse = {
    val __obj = js.Dynamic.literal()
    if (failures != null) __obj.updateDynamic("failures")(failures.asInstanceOf[js.Any])
    if (taskSets != null) __obj.updateDynamic("taskSets")(taskSets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTaskSetsResponse]
  }
}

