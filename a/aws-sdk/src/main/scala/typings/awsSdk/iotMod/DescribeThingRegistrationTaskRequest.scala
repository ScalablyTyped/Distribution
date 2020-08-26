package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeThingRegistrationTaskRequest extends js.Object {
  /**
    * The task ID.
    */
  var taskId: TaskId = js.native
}

object DescribeThingRegistrationTaskRequest {
  @scala.inline
  def apply(taskId: TaskId): DescribeThingRegistrationTaskRequest = {
    val __obj = js.Dynamic.literal(taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeThingRegistrationTaskRequest]
  }
  @scala.inline
  implicit class DescribeThingRegistrationTaskRequestOps[Self <: DescribeThingRegistrationTaskRequest] (val x: Self) extends AnyVal {
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

