package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IoTJobRateIncreaseCriteria extends StObject {
  
  /**
    * The number of devices to receive the job notification before the rollout rate increases.
    */
  var numberOfNotifiedThings: js.UndefOr[IoTJobNumberOfThings] = js.undefined
  
  /**
    * The number of devices to successfully run the configuration job before the rollout rate increases.
    */
  var numberOfSucceededThings: js.UndefOr[IoTJobNumberOfThings] = js.undefined
}
object IoTJobRateIncreaseCriteria {
  
  inline def apply(): IoTJobRateIncreaseCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IoTJobRateIncreaseCriteria]
  }
  
  extension [Self <: IoTJobRateIncreaseCriteria](x: Self) {
    
    inline def setNumberOfNotifiedThings(value: IoTJobNumberOfThings): Self = StObject.set(x, "numberOfNotifiedThings", value.asInstanceOf[js.Any])
    
    inline def setNumberOfNotifiedThingsUndefined: Self = StObject.set(x, "numberOfNotifiedThings", js.undefined)
    
    inline def setNumberOfSucceededThings(value: IoTJobNumberOfThings): Self = StObject.set(x, "numberOfSucceededThings", value.asInstanceOf[js.Any])
    
    inline def setNumberOfSucceededThingsUndefined: Self = StObject.set(x, "numberOfSucceededThings", js.undefined)
  }
}
