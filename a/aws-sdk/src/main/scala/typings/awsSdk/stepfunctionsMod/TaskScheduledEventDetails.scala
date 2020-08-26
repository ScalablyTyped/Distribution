package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskScheduledEventDetails extends js.Object {
  /**
    * The JSON data passed to the resource referenced in a task state.
    */
  var parameters: ConnectorParameters = js.native
  /**
    * The region of the scheduled task
    */
  var region: Name = js.native
  /**
    * The service name of the resource in a task state.
    */
  var resource: Name = js.native
  /**
    * The action of the resource called by a task state.
    */
  var resourceType: Name = js.native
  /**
    * The maximum allowed duration of the task.
    */
  var timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.native
}

object TaskScheduledEventDetails {
  @scala.inline
  def apply(parameters: ConnectorParameters, region: Name, resource: Name, resourceType: Name): TaskScheduledEventDetails = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskScheduledEventDetails]
  }
  @scala.inline
  implicit class TaskScheduledEventDetailsOps[Self <: TaskScheduledEventDetails] (val x: Self) extends AnyVal {
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
    def setParameters(value: ConnectorParameters): Self = this.set("parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: Name): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: Name): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: Name): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeoutInSeconds(value: TimeoutInSeconds): Self = this.set("timeoutInSeconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutInSeconds: Self = this.set("timeoutInSeconds", js.undefined)
  }
  
}

