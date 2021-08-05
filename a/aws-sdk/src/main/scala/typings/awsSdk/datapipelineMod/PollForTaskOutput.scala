package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PollForTaskOutput extends StObject {
  
  /**
    * The information needed to complete the task that is being assigned to the task runner. One of the fields returned in this object is taskId, which contains an identifier for the task being assigned. The calling task runner uses taskId in subsequent calls to ReportTaskProgress and SetTaskStatus.
    */
  var taskObject: js.UndefOr[TaskObject] = js.undefined
}
object PollForTaskOutput {
  
  inline def apply(): PollForTaskOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollForTaskOutput]
  }
  
  extension [Self <: PollForTaskOutput](x: Self) {
    
    inline def setTaskObject(value: TaskObject): Self = StObject.set(x, "taskObject", value.asInstanceOf[js.Any])
    
    inline def setTaskObjectUndefined: Self = StObject.set(x, "taskObject", js.undefined)
  }
}
