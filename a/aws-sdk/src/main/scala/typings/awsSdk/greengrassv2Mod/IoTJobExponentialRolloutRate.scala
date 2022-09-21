package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IoTJobExponentialRolloutRate extends StObject {
  
  /**
    * The minimum number of devices that receive a pending job notification, per minute, when the job starts. This parameter defines the initial rollout rate of the job.
    */
  var baseRatePerMinute: IoTJobRolloutBaseRatePerMinute
  
  /**
    * The exponential factor to increase the rollout rate for the job. This parameter supports up to one digit after the decimal (for example, you can specify 1.5, but not 1.55).
    */
  var incrementFactor: IoTJobRolloutIncrementFactor
  
  /**
    * The criteria to increase the rollout rate for the job.
    */
  var rateIncreaseCriteria: IoTJobRateIncreaseCriteria
}
object IoTJobExponentialRolloutRate {
  
  inline def apply(
    baseRatePerMinute: IoTJobRolloutBaseRatePerMinute,
    incrementFactor: IoTJobRolloutIncrementFactor,
    rateIncreaseCriteria: IoTJobRateIncreaseCriteria
  ): IoTJobExponentialRolloutRate = {
    val __obj = js.Dynamic.literal(baseRatePerMinute = baseRatePerMinute.asInstanceOf[js.Any], incrementFactor = incrementFactor.asInstanceOf[js.Any], rateIncreaseCriteria = rateIncreaseCriteria.asInstanceOf[js.Any])
    __obj.asInstanceOf[IoTJobExponentialRolloutRate]
  }
  
  extension [Self <: IoTJobExponentialRolloutRate](x: Self) {
    
    inline def setBaseRatePerMinute(value: IoTJobRolloutBaseRatePerMinute): Self = StObject.set(x, "baseRatePerMinute", value.asInstanceOf[js.Any])
    
    inline def setIncrementFactor(value: IoTJobRolloutIncrementFactor): Self = StObject.set(x, "incrementFactor", value.asInstanceOf[js.Any])
    
    inline def setRateIncreaseCriteria(value: IoTJobRateIncreaseCriteria): Self = StObject.set(x, "rateIncreaseCriteria", value.asInstanceOf[js.Any])
  }
}
