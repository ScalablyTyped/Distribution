package typings.azdata.mod

import typings.azdata.mod.connection.Connection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskInfo extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: TaskInfo] (val x: Self) extends AnyVal {
    
    inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    
    inline def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
    
    inline def setDatabaseName(value: String): Self = StObject.set(x, "databaseName", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setIsCancelable(value: Boolean): Self = StObject.set(x, "isCancelable", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setProviderName(value: String): Self = StObject.set(x, "providerName", value.asInstanceOf[js.Any])
    
    inline def setServerName(value: String): Self = StObject.set(x, "serverName", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: TaskStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTaskExecutionMode(value: TaskExecutionMode): Self = StObject.set(x, "taskExecutionMode", value.asInstanceOf[js.Any])
    
    inline def setTaskId(value: String): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
