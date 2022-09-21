package typings.awsSdk.snowdevicemanagementMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTaskInput extends StObject {
  
  /**
    * The ID of the task to be described.
    */
  var taskId: TaskId
}
object DescribeTaskInput {
  
  inline def apply(taskId: TaskId): DescribeTaskInput = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTaskInput]
  }
  
  extension [Self <: DescribeTaskInput](x: Self) {
    
    inline def setTaskId(value: TaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
