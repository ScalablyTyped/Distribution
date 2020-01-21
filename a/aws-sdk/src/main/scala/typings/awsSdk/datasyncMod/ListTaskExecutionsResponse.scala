package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTaskExecutionsResponse extends js.Object {
  /**
    * An opaque string that indicates the position at which to begin returning the next list of executed tasks.
    */
  var NextToken: js.UndefOr[typings.awsSdk.datasyncMod.NextToken] = js.native
  /**
    * A list of executed tasks.
    */
  var TaskExecutions: js.UndefOr[TaskExecutionList] = js.native
}

object ListTaskExecutionsResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, TaskExecutions: TaskExecutionList = null): ListTaskExecutionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (TaskExecutions != null) __obj.updateDynamic("TaskExecutions")(TaskExecutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTaskExecutionsResponse]
  }
}

