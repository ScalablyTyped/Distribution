package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopThingRegistrationTaskRequest extends js.Object {
  
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
  implicit class StopThingRegistrationTaskRequestOps[Self <: StopThingRegistrationTaskRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTaskId(value: TaskId): Self = this.set("taskId", value.asInstanceOf[js.Any])
  }
}
