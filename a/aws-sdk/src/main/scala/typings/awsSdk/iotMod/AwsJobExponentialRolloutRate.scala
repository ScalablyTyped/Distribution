package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsJobExponentialRolloutRate extends js.Object {
  /**
    * The minimum number of things that will be notified of a pending job, per minute, at the start of the job rollout. This is the initial rate of the rollout.
    */
  var baseRatePerMinute: AwsJobRolloutRatePerMinute = js.native
  /**
    * The rate of increase for a job rollout. The number of things notified is multiplied by this factor.
    */
  var incrementFactor: AwsJobRolloutIncrementFactor = js.native
  /**
    * The criteria to initiate the increase in rate of rollout for a job. AWS IoT supports up to one digit after the decimal (for example, 1.5, but not 1.55).
    */
  var rateIncreaseCriteria: AwsJobRateIncreaseCriteria = js.native
}

object AwsJobExponentialRolloutRate {
  @scala.inline
  def apply(
    baseRatePerMinute: AwsJobRolloutRatePerMinute,
    incrementFactor: AwsJobRolloutIncrementFactor,
    rateIncreaseCriteria: AwsJobRateIncreaseCriteria
  ): AwsJobExponentialRolloutRate = {
    val __obj = js.Dynamic.literal(baseRatePerMinute = baseRatePerMinute.asInstanceOf[js.Any], incrementFactor = incrementFactor.asInstanceOf[js.Any], rateIncreaseCriteria = rateIncreaseCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsJobExponentialRolloutRate]
  }
  @scala.inline
  implicit class AwsJobExponentialRolloutRateOps[Self <: AwsJobExponentialRolloutRate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBaseRatePerMinute(value: AwsJobRolloutRatePerMinute): Self = this.set("baseRatePerMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncrementFactor(value: AwsJobRolloutIncrementFactor): Self = this.set("incrementFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setRateIncreaseCriteria(value: AwsJobRateIncreaseCriteria): Self = this.set("rateIncreaseCriteria", value.asInstanceOf[js.Any])
  }
  
}

