package typings.azdata.mod

import typings.azdata.mod.connection.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskInfo extends StObject {
  
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
  implicit class TaskInfoMutableBuilder[Self <: TaskInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    @scala.inline
    def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCancelable(value: Boolean): Self = StObject.set(x, "isCancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerName(value: String): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: TaskStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskExecutionMode(value: TaskExecutionMode): Self = StObject.set(x, "taskExecutionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
