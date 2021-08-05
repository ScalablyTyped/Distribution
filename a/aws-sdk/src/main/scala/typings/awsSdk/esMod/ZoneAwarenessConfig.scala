package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoneAwarenessConfig extends StObject {
  
  /**
    * An integer value to indicate the number of availability zones for a domain when zone awareness is enabled. This should be equal to number of subnets if VPC endpoints is enabled
    */
  var AvailabilityZoneCount: js.UndefOr[IntegerClass] = js.undefined
}
object ZoneAwarenessConfig {
  
  inline def apply(): ZoneAwarenessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneAwarenessConfig]
  }
  
  extension [Self <: ZoneAwarenessConfig](x: Self) {
    
    inline def setAvailabilityZoneCount(value: IntegerClass): Self = StObject.set(x, "AvailabilityZoneCount", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneCountUndefined: Self = StObject.set(x, "AvailabilityZoneCount", js.undefined)
  }
}
