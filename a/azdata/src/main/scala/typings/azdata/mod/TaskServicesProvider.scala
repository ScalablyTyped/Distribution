package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskServicesProvider extends DataProvider {
  def cancelTask(cancelTaskParams: CancelTaskParams): Thenable[Boolean]
  def getAllTasks(listTasksParams: ListTasksParams): Thenable[ListTasksResponse]
  def registerOnTaskCreated(handler: js.Function1[/* response */ TaskInfo, _]): Unit
  def registerOnTaskStatusChanged(handler: js.Function1[/* response */ TaskProgressInfo, _]): Unit
}

object TaskServicesProvider {
  @scala.inline
  def apply(
    cancelTask: CancelTaskParams => Thenable[Boolean],
    getAllTasks: ListTasksParams => Thenable[ListTasksResponse],
    providerId: String,
    registerOnTaskCreated: js.Function1[/* response */ TaskInfo, _] => Unit,
    registerOnTaskStatusChanged: js.Function1[/* response */ TaskProgressInfo, _] => Unit,
    handle: Int | Double = null
  ): TaskServicesProvider = {
    val __obj = js.Dynamic.literal(cancelTask = js.Any.fromFunction1(cancelTask), getAllTasks = js.Any.fromFunction1(getAllTasks), providerId = providerId.asInstanceOf[js.Any], registerOnTaskCreated = js.Any.fromFunction1(registerOnTaskCreated), registerOnTaskStatusChanged = js.Any.fromFunction1(registerOnTaskStatusChanged))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskServicesProvider]
  }
}

