package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartThingRegistrationTaskResponse extends StObject {
  
  /**
    * The bulk thing provisioning task ID.
    */
  var taskId: js.UndefOr[TaskId] = js.undefined
}
object StartThingRegistrationTaskResponse {
  
  @scala.inline
  def apply(): StartThingRegistrationTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartThingRegistrationTaskResponse]
  }
  
  @scala.inline
  implicit class StartThingRegistrationTaskResponseMutableBuilder[Self <: StartThingRegistrationTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskId(value: TaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
  }
}
