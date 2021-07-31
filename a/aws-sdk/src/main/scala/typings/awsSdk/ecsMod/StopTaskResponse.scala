package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopTaskResponse extends StObject {
  
  /**
    * The task that was stopped.
    */
  var task: js.UndefOr[Task] = js.undefined
}
object StopTaskResponse {
  
  @scala.inline
  def apply(): StopTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopTaskResponse]
  }
  
  @scala.inline
  implicit class StopTaskResponseMutableBuilder[Self <: StopTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTask(value: Task): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
  }
}
