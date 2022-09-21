package typings.awsSdk.m2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighAvailabilityConfig extends StObject {
  
  /**
    * The number of instances in a high availability configuration.
    */
  var desiredCapacity: CapacityValue
}
object HighAvailabilityConfig {
  
  inline def apply(desiredCapacity: CapacityValue): HighAvailabilityConfig = {
    val __obj = js.Dynamic.literal(desiredCapacity = desiredCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighAvailabilityConfig]
  }
  
  extension [Self <: HighAvailabilityConfig](x: Self) {
    
    inline def setDesiredCapacity(value: CapacityValue): Self = StObject.set(x, "desiredCapacity", value.asInstanceOf[js.Any])
  }
}
