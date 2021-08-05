package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsJobExecutionsRolloutConfig extends StObject {
  
  /**
    * The rate of increase for a job rollout. This parameter allows you to define an exponential rate increase for a job rollout.
    */
  var exponentialRate: js.UndefOr[AwsJobExponentialRolloutRate] = js.undefined
  
  /**
    * The maximum number of OTA update job executions started per minute.
    */
  var maximumPerMinute: js.UndefOr[MaximumPerMinute] = js.undefined
}
object AwsJobExecutionsRolloutConfig {
  
  inline def apply(): AwsJobExecutionsRolloutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsJobExecutionsRolloutConfig]
  }
  
  extension [Self <: AwsJobExecutionsRolloutConfig](x: Self) {
    
    inline def setExponentialRate(value: AwsJobExponentialRolloutRate): Self = StObject.set(x, "exponentialRate", value.asInstanceOf[js.Any])
    
    inline def setExponentialRateUndefined: Self = StObject.set(x, "exponentialRate", js.undefined)
    
    inline def setMaximumPerMinute(value: MaximumPerMinute): Self = StObject.set(x, "maximumPerMinute", value.asInstanceOf[js.Any])
    
    inline def setMaximumPerMinuteUndefined: Self = StObject.set(x, "maximumPerMinute", js.undefined)
  }
}
