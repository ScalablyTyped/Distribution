package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskSubmittedEventDetails extends js.Object {
  /**
    * The response from a resource when a task has started.
    */
  var output: js.UndefOr[SensitiveData] = js.native
  /**
    * The service name of the resource in a task state.
    */
  var resource: Name = js.native
  /**
    * The action of the resource called by a task state.
    */
  var resourceType: Name = js.native
}

object TaskSubmittedEventDetails {
  @scala.inline
  def apply(resource: Name, resourceType: Name): TaskSubmittedEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskSubmittedEventDetails]
  }
  @scala.inline
  implicit class TaskSubmittedEventDetailsOps[Self <: TaskSubmittedEventDetails] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setOutput(value: SensitiveData): Self = this.set("output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
  }
  
}

