package typings.azdata.mod

import typings.azdata.mod.connection.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskInfo extends js.Object {
  var connection: js.UndefOr[Connection] = js.undefined
  var databaseName: String
  var description: String
  var isCancelable: Boolean
  var name: String
  var providerName: String
  var serverName: String
  var status: TaskStatus
  var taskExecutionMode: TaskExecutionMode
  var taskId: String
}

object TaskInfo {
  @scala.inline
  def apply(
    databaseName: String,
    description: String,
    isCancelable: Boolean,
    name: String,
    providerName: String,
    serverName: String,
    status: TaskStatus,
    taskExecutionMode: TaskExecutionMode,
    taskId: String,
    connection: Connection = null
  ): TaskInfo = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isCancelable = isCancelable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskExecutionMode = taskExecutionMode.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskInfo]
  }
}

