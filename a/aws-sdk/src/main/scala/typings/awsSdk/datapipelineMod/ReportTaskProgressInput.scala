package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportTaskProgressInput extends StObject {
  
  /**
    * Key-value pairs that define the properties of the ReportTaskProgressInput object.
    */
  var fields: js.UndefOr[fieldList] = js.undefined
  
  /**
    * The ID of the task assigned to the task runner. This value is provided in the response for PollForTask.
    */
  var taskId: typings.awsSdk.datapipelineMod.taskId
}
object ReportTaskProgressInput {
  
  inline def apply(taskId: taskId): ReportTaskProgressInput = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportTaskProgressInput]
  }
  
  extension [Self <: ReportTaskProgressInput](x: Self) {
    
    inline def setFields(value: fieldList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setTaskId(value: taskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
