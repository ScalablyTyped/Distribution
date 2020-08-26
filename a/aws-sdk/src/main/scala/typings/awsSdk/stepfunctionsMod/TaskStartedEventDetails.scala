package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskStartedEventDetails extends js.Object {
  /**
    * The service name of the resource in a task state.
    */
  var resource: Name = js.native
  /**
    * The action of the resource called by a task state.
    */
  var resourceType: Name = js.native
}

object TaskStartedEventDetails {
  @scala.inline
  def apply(resource: Name, resourceType: Name): TaskStartedEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskStartedEventDetails]
  }
  @scala.inline
  implicit class TaskStartedEventDetailsOps[Self <: TaskStartedEventDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setResource(value: Name): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: Name): Self = this.set("resourceType", value.asInstanceOf[js.Any])
  }
  
}

