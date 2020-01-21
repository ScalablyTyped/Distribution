package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobExecutionsRolloutConfig extends js.Object {
  /**
    * The rate of increase for a job rollout. This parameter allows you to define an exponential rate for a job rollout.
    */
  var exponentialRate: js.UndefOr[ExponentialRolloutRate] = js.native
  /**
    * The maximum number of things that will be notified of a pending job, per minute. This parameter allows you to create a staged rollout.
    */
  var maximumPerMinute: js.UndefOr[MaxJobExecutionsPerMin] = js.native
}

object JobExecutionsRolloutConfig {
  @scala.inline
  def apply(exponentialRate: ExponentialRolloutRate = null, maximumPerMinute: Int | Double = null): JobExecutionsRolloutConfig = {
    val __obj = js.Dynamic.literal()
    if (exponentialRate != null) __obj.updateDynamic("exponentialRate")(exponentialRate.asInstanceOf[js.Any])
    if (maximumPerMinute != null) __obj.updateDynamic("maximumPerMinute")(maximumPerMinute.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobExecutionsRolloutConfig]
  }
}

