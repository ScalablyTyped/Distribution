package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskProgressInfo extends js.Object {
  var message: String
  var script: js.UndefOr[String] = js.undefined
  var status: TaskStatus
  var taskId: String
}

object TaskProgressInfo {
  @scala.inline
  def apply(message: String, status: TaskStatus, taskId: String, script: String = null): TaskProgressInfo = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    if (script != null) __obj.updateDynamic("script")(script.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskProgressInfo]
  }
}

