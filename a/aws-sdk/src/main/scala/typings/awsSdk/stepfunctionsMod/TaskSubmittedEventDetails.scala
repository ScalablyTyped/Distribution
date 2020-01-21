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
  def apply(resource: Name, resourceType: Name, output: SensitiveData = null): TaskSubmittedEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskSubmittedEventDetails]
  }
}

