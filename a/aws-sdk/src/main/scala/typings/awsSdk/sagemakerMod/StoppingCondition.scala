package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoppingCondition extends js.Object {
  /**
    * The maximum length of time, in seconds, that the training or compilation job can run. If job does not complete during this time, Amazon SageMaker ends the job. If value is not specified, default value is 1 day. The maximum value is 28 days.
    */
  var MaxRuntimeInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.MaxRuntimeInSeconds] = js.native
  /**
    * The maximum length of time, in seconds, how long you are willing to wait for a managed spot training job to complete. It is the amount of time spent waiting for Spot capacity plus the amount of time the training job runs. It must be equal to or greater than MaxRuntimeInSeconds. 
    */
  var MaxWaitTimeInSeconds: js.UndefOr[typings.awsSdk.sagemakerMod.MaxWaitTimeInSeconds] = js.native
}

object StoppingCondition {
  @scala.inline
  def apply(
    MaxRuntimeInSeconds: js.UndefOr[MaxRuntimeInSeconds] = js.undefined,
    MaxWaitTimeInSeconds: js.UndefOr[MaxWaitTimeInSeconds] = js.undefined
  ): StoppingCondition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxRuntimeInSeconds)) __obj.updateDynamic("MaxRuntimeInSeconds")(MaxRuntimeInSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxWaitTimeInSeconds)) __obj.updateDynamic("MaxWaitTimeInSeconds")(MaxWaitTimeInSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoppingCondition]
  }
}

