package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobExecutionsRolloutConfig extends StObject {
  
  /**
    * The rate of increase for a job rollout. This parameter allows you to define an exponential rate for a job rollout.
    */
  var exponentialRate: js.UndefOr[ExponentialRolloutRate] = js.undefined
  
  /**
    * The maximum number of things that will be notified of a pending job, per minute. This parameter allows you to create a staged rollout.
    */
  var maximumPerMinute: js.UndefOr[MaxJobExecutionsPerMin] = js.undefined
}
object JobExecutionsRolloutConfig {
  
  @scala.inline
  def apply(): JobExecutionsRolloutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionsRolloutConfig]
  }
  
  @scala.inline
  implicit class JobExecutionsRolloutConfigMutableBuilder[Self <: JobExecutionsRolloutConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExponentialRate(value: ExponentialRolloutRate): Self = StObject.set(x, "exponentialRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponentialRateUndefined: Self = StObject.set(x, "exponentialRate", js.undefined)
    
    @scala.inline
    def setMaximumPerMinute(value: MaxJobExecutionsPerMin): Self = StObject.set(x, "maximumPerMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumPerMinuteUndefined: Self = StObject.set(x, "maximumPerMinute", js.undefined)
  }
}
