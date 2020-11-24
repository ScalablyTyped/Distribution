package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartThingRegistrationTaskResponse extends js.Object {
  
  /**
    * The bulk thing provisioning task ID.
    */
  var taskId: js.UndefOr[TaskId] = js.native
}
object StartThingRegistrationTaskResponse {
  
  @scala.inline
  def apply(): StartThingRegistrationTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartThingRegistrationTaskResponse]
  }
  
  @scala.inline
  implicit class StartThingRegistrationTaskResponseOps[Self <: StartThingRegistrationTaskResponse] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def deleteTaskId: Self = this.set("taskId", js.undefined)
  }
}
