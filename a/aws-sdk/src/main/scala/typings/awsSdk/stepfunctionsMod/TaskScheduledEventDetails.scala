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
  def apply(
    parameters: ConnectorParameters,
    region: Name,
    resource: Name,
    resourceType: Name,
    timeoutInSeconds: Int | Double = null
  ): TaskScheduledEventDetails = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    if (timeoutInSeconds != null) __obj.updateDynamic("timeoutInSeconds")(timeoutInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskScheduledEventDetails]
  }
}

