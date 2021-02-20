package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopThingRegistrationTaskRequest extends StObject {
  
  /**
    * The bulk thing provisioning task ID.
    */
  var taskId: TaskId = js.native
}
object StopThingRegistrationTaskRequest {
  
  @scala.inline
  def apply(taskId: TaskId): StopThingRegistrationTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopThingRegistrationTaskRequest]
  }
  
  @scala.inline
  implicit class StopThingRegistrationTaskRequestMutableBuilder[Self <: StopThingRegistrationTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskId(value: TaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
  }
}
