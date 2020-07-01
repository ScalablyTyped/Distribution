package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsJobExecutionsRolloutConfig extends js.Object {
  /**
    * The rate of increase for a job rollout. This parameter allows you to define an exponential rate increase for a job rollout.
    */
  var exponentialRate: js.UndefOr[AwsJobExponentialRolloutRate] = js.native
  /**
    * The maximum number of OTA update job executions started per minute.
    */
  var maximumPerMinute: js.UndefOr[MaximumPerMinute] = js.native
}

object AwsJobExecutionsRolloutConfig {
  @scala.inline
  def apply(
    exponentialRate: AwsJobExponentialRolloutRate = null,
    maximumPerMinute: js.UndefOr[MaximumPerMinute] = js.undefined
  ): AwsJobExecutionsRolloutConfig = {
    val __obj = js.Dynamic.literal()
    if (exponentialRate != null) __obj.updateDynamic("exponentialRate")(exponentialRate.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumPerMinute)) __obj.updateDynamic("maximumPerMinute")(maximumPerMinute.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsJobExecutionsRolloutConfig]
  }
}

