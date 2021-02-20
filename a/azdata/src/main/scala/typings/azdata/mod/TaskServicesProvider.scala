package typings.azdata.mod

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class TaskServicesProviderMutableBuilder[Self <: TaskServicesProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelTask(value: CancelTaskParams => Thenable[Boolean]): Self = StObject.set(x, "cancelTask", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAllTasks(value: ListTasksParams => Thenable[ListTasksResponse]): Self = StObject.set(x, "getAllTasks", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterOnTaskCreated(value: js.Function1[/* response */ TaskInfo, _] => Unit): Self = StObject.set(x, "registerOnTaskCreated", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRegisterOnTaskStatusChanged(value: js.Function1[/* response */ TaskProgressInfo, _] => Unit): Self = StObject.set(x, "registerOnTaskStatusChanged", js.Any.fromFunction1(value))
  }
}
