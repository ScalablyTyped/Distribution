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
  
  inline def apply(): JobExecutionsRolloutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobExecutionsRolloutConfig]
  }
  
  extension [Self <: JobExecutionsRolloutConfig](x: Self) {
    
    inline def setExponentialRate(value: ExponentialRolloutRate): Self = StObject.set(x, "exponentialRate", value.asInstanceOf[js.Any])
    
    inline def setExponentialRateUndefined: Self = StObject.set(x, "exponentialRate", js.undefined)
    
    inline def setMaximumPerMinute(value: MaxJobExecutionsPerMin): Self = StObject.set(x, "maximumPerMinute", value.asInstanceOf[js.Any])
    
    inline def setMaximumPerMinuteUndefined: Self = StObject.set(x, "maximumPerMinute", js.undefined)
  }
}
