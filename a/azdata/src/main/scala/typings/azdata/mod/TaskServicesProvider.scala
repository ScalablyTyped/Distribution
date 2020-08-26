package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskServicesProvider extends DataProvider {
  def cancelTask(cancelTaskParams: CancelTaskParams): Thenable[Boolean] = js.native
  def getAllTasks(listTasksParams: ListTasksParams): Thenable[ListTasksResponse] = js.native
  def registerOnTaskCreated(handler: js.Function1[/* response */ TaskInfo, _]): Unit = js.native
  def registerOnTaskStatusChanged(handler: js.Function1[/* response */ TaskProgressInfo, _]): Unit = js.native
}

object TaskServicesProvider {
  @scala.inline
  def apply(
    cancelTask: CancelTaskParams => Thenable[Boolean],
    getAllTasks: ListTasksParams => Thenable[ListTasksResponse],
    providerId: String,
    registerOnTaskCreated: js.Function1[/* response */ TaskInfo, _] => Unit,
    registerOnTaskStatusChanged: js.Function1[/* response */ TaskProgressInfo, _] => Unit
  ): TaskServicesProvider = {
    val __obj = js.Dynamic.literal(cancelTask = js.Any.fromFunction1(cancelTask), getAllTasks = js.Any.fromFunction1(getAllTasks), providerId = providerId.asInstanceOf[js.Any], registerOnTaskCreated = js.Any.fromFunction1(registerOnTaskCreated), registerOnTaskStatusChanged = js.Any.fromFunction1(registerOnTaskStatusChanged))
    __obj.asInstanceOf[TaskServicesProvider]
  }
  @scala.inline
  implicit class TaskServicesProviderOps[Self <: TaskServicesProvider] (val x: Self) extends AnyVal {
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
    def setCancelTask(value: CancelTaskParams => Thenable[Boolean]): Self = this.set("cancelTask", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAllTasks(value: ListTasksParams => Thenable[ListTasksResponse]): Self = this.set("getAllTasks", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterOnTaskCreated(value: js.Function1[/* response */ TaskInfo, _] => Unit): Self = this.set("registerOnTaskCreated", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterOnTaskStatusChanged(value: js.Function1[/* response */ TaskProgressInfo, _] => Unit): Self = this.set("registerOnTaskStatusChanged", js.Any.fromFunction1(value))
  }
  
}

