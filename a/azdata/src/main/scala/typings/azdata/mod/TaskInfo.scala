package typings.azdata.mod

import typings.azdata.mod.connection.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskInfo extends js.Object {
  var connection: js.UndefOr[Connection] = js.native
  var databaseName: String = js.native
  var description: String = js.native
  var isCancelable: Boolean = js.native
  var name: String = js.native
  var providerName: String = js.native
  var serverName: String = js.native
  var status: TaskStatus = js.native
  var taskExecutionMode: TaskExecutionMode = js.native
  var taskId: String = js.native
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
    taskId: String
  ): TaskInfo = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], isCancelable = isCancelable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], providerName = providerName.asInstanceOf[js.Any], serverName = serverName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], taskExecutionMode = taskExecutionMode.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskInfo]
  }
  @scala.inline
  implicit class TaskInfoOps[Self <: TaskInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDatabaseName(value: String): Self = this.set("databaseName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsCancelable(value: Boolean): Self = this.set("isCancelable", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProviderName(value: String): Self = this.set("providerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerName(value: String): Self = this.set("serverName", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: TaskStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskExecutionMode(value: TaskExecutionMode): Self = this.set("taskExecutionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskId(value: String): Self = this.set("taskId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnection(value: Connection): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
  }
  
}

