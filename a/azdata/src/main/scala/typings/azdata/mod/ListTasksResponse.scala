package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTasksResponse extends js.Object {
  var tasks: js.Array[TaskInfo]
}

object ListTasksResponse {
  @scala.inline
  def apply(tasks: js.Array[TaskInfo]): ListTasksResponse = {
    val __obj = js.Dynamic.literal(tasks = tasks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTasksResponse]
  }
}

