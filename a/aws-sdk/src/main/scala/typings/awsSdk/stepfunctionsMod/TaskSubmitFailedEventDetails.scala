package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskSubmitFailedEventDetails extends js.Object {
  /**
    * A more detailed explanation of the cause of the failure.
    */
  var cause: js.UndefOr[SensitiveCause] = js.native
  /**
    * The error code of the failure.
    */
  var error: js.UndefOr[SensitiveError] = js.native
  /**
    * The service name of the resource in a task state.
    */
  var resource: Name = js.native
  /**
    * The action of the resource called by a task state.
    */
  var resourceType: Name = js.native
}

object TaskSubmitFailedEventDetails {
  @scala.inline
  def apply(resource: Name, resourceType: Name): TaskSubmitFailedEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskSubmitFailedEventDetails]
  }
  @scala.inline
  implicit class TaskSubmitFailedEventDetailsOps[Self <: TaskSubmitFailedEventDetails] (val x: Self) extends AnyVal {
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
    def setCause(value: SensitiveCause): Self = this.set("cause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCause: Self = this.set("cause", js.undefined)
    @scala.inline
    def setError(value: SensitiveError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
  
}

