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
  
  @scala.inline
  def apply(): DescribeAvailabilityZonesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAvailabilityZonesResult]
  }
  
  @scala.inline
  implicit class DescribeAvailabilityZonesResultMutableBuilder[Self <: DescribeAvailabilityZonesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZoneList): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
  }
}
