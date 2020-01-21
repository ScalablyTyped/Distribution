package typings.awsSdk.datasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTasksResponse extends js.Object {
  /**
    * An opaque string that indicates the position at which to begin returning the next list of tasks.
    */
  var NextToken: js.UndefOr[typings.awsSdk.datasyncMod.NextToken] = js.native
  /**
    * A list of all the tasks that are returned.
    */
  var Tasks: js.UndefOr[TaskList] = js.native
}

object ListTasksResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Tasks: TaskList = null): ListTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Tasks != null) __obj.updateDynamic("Tasks")(Tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTasksResponse]
  }
}

