package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsJobExecutionsRolloutConfig extends StObject {
  
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
  def apply(): AwsJobExecutionsRolloutConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsJobExecutionsRolloutConfig]
  }
  
  @scala.inline
  implicit class AwsJobExecutionsRolloutConfigMutableBuilder[Self <: AwsJobExecutionsRolloutConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExponentialRate(value: AwsJobExponentialRolloutRate): Self = StObject.set(x, "exponentialRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExponentialRateUndefined: Self = StObject.set(x, "exponentialRate", js.undefined)
    
    @scala.inline
    def setMaximumPerMinute(value: MaximumPerMinute): Self = StObject.set(x, "maximumPerMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumPerMinuteUndefined: Self = StObject.set(x, "maximumPerMinute", js.undefined)
  }
}
