package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAvailabilityZonesResult extends StObject {
  
  /**
    * Information about the Availability Zones, Local Zones, and Wavelength Zones.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZoneList] = js.undefined
}
object DescribeAvailabilityZonesResult {
  
  inline def apply(): DescribeAvailabilityZonesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAvailabilityZonesResult]
  }
  
  extension [Self <: DescribeAvailabilityZonesResult](x: Self) {
    
    inline def setAvailabilityZones(value: AvailabilityZoneList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
  }
}
