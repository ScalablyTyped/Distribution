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
    heartbeatInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined,
    input: SensitiveData = null,
    timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
  ): ActivityScheduledEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    if (!js.isUndefined(heartbeatInSeconds)) __obj.updateDynamic("heartbeatInSeconds")(heartbeatInSeconds.get.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutInSeconds)) __obj.updateDynamic("timeoutInSeconds")(timeoutInSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityScheduledEventDetails]
  }
}

