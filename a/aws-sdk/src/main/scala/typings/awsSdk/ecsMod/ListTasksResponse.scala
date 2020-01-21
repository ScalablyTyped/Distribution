package typings.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTasksResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListTasks request. When the results of a ListTasks request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The list of task ARN entries for the ListTasks request.
    */
  var taskArns: js.UndefOr[StringList] = js.native
}

object ListTasksResponse {
  @scala.inline
  def apply(nextToken: String = null, taskArns: StringList = null): ListTasksResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (taskArns != null) __obj.updateDynamic("taskArns")(taskArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTasksResponse]
  }
}

