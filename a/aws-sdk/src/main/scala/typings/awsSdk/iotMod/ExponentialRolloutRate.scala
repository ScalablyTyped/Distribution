package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExponentialRolloutRate extends js.Object {
  
  /**
    * The minimum number of things that will be notified of a pending job, per minute at the start of job rollout. This parameter allows you to define the initial rate of rollout.
    */
  var baseRatePerMinute: RolloutRatePerMinute = js.native
  
  /**
    * The exponential factor to increase the rate of rollout for a job. AWS IoT supports up to one digit after the decimal (for example, 1.5, but not 1.55).
    */
  var incrementFactor: IncrementFactor = js.native
  
  /**
    * The criteria to initiate the increase in rate of rollout for a job.
    */
  var rateIncreaseCriteria: RateIncreaseCriteria = js.native
}
object ExponentialRolloutRate {
  
  @scala.inline
  def apply(
    baseRatePerMinute: RolloutRatePerMinute,
    incrementFactor: IncrementFactor,
    rateIncreaseCriteria: RateIncreaseCriteria
  ): ExponentialRolloutRate = {
    val __obj = js.Dynamic.literal(baseRatePerMinute = baseRatePerMinute.asInstanceOf[js.Any], incrementFactor = incrementFactor.asInstanceOf[js.Any], rateIncreaseCriteria = rateIncreaseCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExponentialRolloutRate]
  }
  
  @scala.inline
  implicit class ExponentialRolloutRateOps[Self <: ExponentialRolloutRate] (val x: Self) extends AnyVal {
    
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
    def setBaseRatePerMinute(value: RolloutRatePerMinute): Self = this.set("baseRatePerMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementFactor(value: IncrementFactor): Self = this.set("incrementFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateIncreaseCriteria(value: RateIncreaseCriteria): Self = this.set("rateIncreaseCriteria", value.asInstanceOf[js.Any])
  }
}
