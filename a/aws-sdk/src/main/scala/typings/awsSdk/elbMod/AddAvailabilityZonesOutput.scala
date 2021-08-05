package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddAvailabilityZonesOutput extends StObject {
  
  /**
    * The updated list of Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.elbMod.AvailabilityZones] = js.undefined
}
object AddAvailabilityZonesOutput {
  
  inline def apply(): AddAvailabilityZonesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddAvailabilityZonesOutput]
  }
  
  extension [Self <: AddAvailabilityZonesOutput](x: Self) {
    
    inline def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
  }
}
