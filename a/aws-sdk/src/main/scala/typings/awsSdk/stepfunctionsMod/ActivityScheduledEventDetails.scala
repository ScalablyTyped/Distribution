package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivityScheduledEventDetails extends js.Object {
  /**
    * The maximum allowed duration between two heartbeats for the activity task.
    */
  var heartbeatInSeconds: js.UndefOr[TimeoutInSeconds] = js.native
  /**
    * The JSON data input to the activity task.
    */
  var input: js.UndefOr[SensitiveData] = js.native
  /**
    * The Amazon Resource Name (ARN) of the scheduled activity.
    */
  var resource: Arn = js.native
  /**
    * The maximum allowed duration of the activity task.
    */
  var timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.native
}

object ActivityScheduledEventDetails {
  @scala.inline
  def apply(
    resource: Arn,
    heartbeatInSeconds: Int | Double = null,
    input: SensitiveData = null,
    timeoutInSeconds: Int | Double = null
  ): ActivityScheduledEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    if (heartbeatInSeconds != null) __obj.updateDynamic("heartbeatInSeconds")(heartbeatInSeconds.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (timeoutInSeconds != null) __obj.updateDynamic("timeoutInSeconds")(timeoutInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityScheduledEventDetails]
  }
}

