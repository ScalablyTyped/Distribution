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
  def apply(): JobExecutionsRolloutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionsRolloutConfig]
  }
  @scala.inline
  implicit class JobExecutionsRolloutConfigOps[Self <: JobExecutionsRolloutConfig] (val x: Self) extends AnyVal {
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
    def setExponentialRate(value: ExponentialRolloutRate): Self = this.set("exponentialRate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExponentialRate: Self = this.set("exponentialRate", js.undefined)
    @scala.inline
    def setMaximumPerMinute(value: MaxJobExecutionsPerMin): Self = this.set("maximumPerMinute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumPerMinute: Self = this.set("maximumPerMinute", js.undefined)
  }
  
}

