package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsJobExponentialRolloutRate extends StObject {
  
  /**
    * The minimum number of things that will be notified of a pending job, per minute, at the start of the job rollout. This is the initial rate of the rollout.
    */
  var baseRatePerMinute: AwsJobRolloutRatePerMinute
  
  /**
    * The rate of increase for a job rollout. The number of things notified is multiplied by this factor.
    */
  var incrementFactor: AwsJobRolloutIncrementFactor
  
  /**
    * The criteria to initiate the increase in rate of rollout for a job. AWS IoT supports up to one digit after the decimal (for example, 1.5, but not 1.55).
    */
  var rateIncreaseCriteria: AwsJobRateIncreaseCriteria
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
  implicit class AwsJobExponentialRolloutRateMutableBuilder[Self <: AwsJobExponentialRolloutRate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBaseRatePerMinute(value: AwsJobRolloutRatePerMinute): Self = StObject.set(x, "baseRatePerMinute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncrementFactor(value: AwsJobRolloutIncrementFactor): Self = StObject.set(x, "incrementFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRateIncreaseCriteria(value: AwsJobRateIncreaseCriteria): Self = StObject.set(x, "rateIncreaseCriteria", value.asInstanceOf[js.Any])
  }
}
